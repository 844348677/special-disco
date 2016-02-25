package com.hdd.util;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by liuh on 2016/2/16.
 */
public class GroupUtil {

    public static List<List> toGroup(List valueList){
        //为了方便计算，先设置32个点
        List resultList = new LinkedList();
        int valueSize = valueList.size();
        if (valueSize % 2 == 1){
            Double value = Double.parseDouble(""+valueList.get((valueSize-1)/2));
            Double beforeValue = Double.parseDouble(""+valueList.get((valueSize-1)/2-1));
            Double afterValue = Double.parseDouble(""+valueList.get((valueSize-1)/2+1));
            if((value-beforeValue)<(afterValue-value)){

                //第一种情况 放在放在前面
                resultList.add(valueList.subList(0,(valueSize+1)/2));
                resultList.add(valueList.subList((valueSize+1)/2,valueSize));
            }else {
                //第二种情况  放在后面
                resultList.add(valueList.subList(0,(valueSize-1)/2));
                resultList.add(valueList.subList((valueSize-1)/2,valueSize));
            }
        }else {
           //第三种情况  是偶数
            resultList.add(valueList.subList(0,valueSize/2));
            resultList.add(valueList.subList(valueSize/2,valueSize));
        }

        return resultList;
    }

    /*
        Collections.sort(continueInfo);
        int bins = 32;//设置32个便于计算
        int listSize = continueInfo.size();
        System.out.println(continueInfo);

        List<List> resultList = new LinkedList<List>();
        List<List> x1 = toGroup(continueInfo);
        for(List rList : x1) {
            List<List> x2 = toGroup(rList);
            for(List rrList : x2){
                List<List> x3 = toGroup(rrList);
                for(List rrrList : x3){
                    List<List> x4 = toGroup(rrrList);
                    for(List rrrrList : x4){
                        List<List> x5 = toGroup(rrrrList);
                        for(List finelList : x5){
                            resultList.add(finelList);


                        }
                    }
                }
            }

        }
        System.out.println("size:"+resultList.size()+"  value： "+resultList);*/
}
