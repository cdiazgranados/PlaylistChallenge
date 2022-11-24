package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {

        ArrayList<String> doubleArray = new ArrayList<String>();
        doubleArray.addAll(Arrays.asList(playList));
        doubleArray.addAll(Arrays.asList(playList));
        System.out.println(doubleArray);


        int backwardCount = 0;

        //find backward
        for(int i = (startIndex + playList.length); i > 0; i--) {
            if (doubleArray.get(i).equals(selection)) {
                System.out.println("does this work?");
                break;
            }
            backwardCount++;
        }

        int forwardCount = 0;
        for(int i = startIndex; i < doubleArray.size(); i++) {

            if (doubleArray.get(i).equals(selection)) {
                break;
            }
            forwardCount++;
        }

        if (backwardCount < forwardCount) {
            return backwardCount;
        }
        return forwardCount;
    }


//public Integer selection(Integer startIndex, String selection) {
//        int selectionIndex = 0; //3
//
//
//        for (int i = 0; i < playList.length; i++) {
//            if (playList[i].equals(selection)) {
//                selectionIndex = i;
//            }
//        }
//
//        int forward = selectionIndex - startIndex;
//        int backward = (startIndex + playList.length) - selectionIndex;
//
//        if (forward < backward) {
//            return forward;
//        }
//
//        return backward;
//
//}

}