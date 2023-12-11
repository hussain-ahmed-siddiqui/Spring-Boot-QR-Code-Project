package com.cloudassest.intern.qr_code_decoder;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TagParserP2P {
    Map<Integer, String> dictionary;
    public Map<Integer, String> foundTags;

    public TagParserP2P(){
        this.dictionary = new HashMap<>();
        this.foundTags = new LinkedHashMap<>();
        initializeTagInfoMap();
    }

    private void initializeTagInfoMap() {
        dictionary.put(0,"Payload Format Indicator");
        dictionary.put(1,"Point of Initiation Method");
        dictionary.put(2,"Scheme Identifier");
        dictionary.put(3,"FI Name");
        dictionary.put(4,"IBAN");
        dictionary.put(5,"Amount");
        dictionary.put(6,"Particulars");
        dictionary.put(7,"Reserved for Future Use");
        dictionary.put(8,"Reserved for Future Use");
        dictionary.put(9,"Reserved for Future Use");
        dictionary.put(10,"CRC");
    }

    public void parse(String input ) {
        TagParserP2P template = new TagParserP2P();
        boolean []tag_ids = new boolean[11];
        int [] mandatory_ids={0,1,2,4,10};
        int startIndex = 0;
        int endIndex =2;
        int length;
        int key;
        try{
            for(int i=0;endIndex<input.length();i++){
                key = Integer.parseInt(input.substring(startIndex,endIndex));
                tag_ids[key]=true;
                startIndex=endIndex;
                endIndex+=2;
                length=Integer.parseInt(input.substring(startIndex,endIndex));
                startIndex=endIndex;
                foundTags.put(key,input.substring(startIndex,endIndex+length));
                startIndex=endIndex+length;
                endIndex=startIndex+2;
            }
        }catch (StringIndexOutOfBoundsException e){

            System.out.println("\nQR code is corrupted or incomplete!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        boolean flag = true;
        for(int i=0;i<mandatory_ids.length;i++){
            if(!tag_ids[mandatory_ids[i]]){
                flag=false;
                System.out.println("\nQR code is corrupted or incomplete!");
                break;
            }
        }

    }
}
