package com.hdd.util;

import com.hdd.Entity.Customers;
import com.hdd.Entity.Risk;
import com.hdd.Entity.SingletonSave;
import com.hdd.dao.CustomersDao;
import com.hdd.dao.RiskDao;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by liuh on 2016/2/17.
 */
public class SaveUtil {

    public static void saveRisk(RiskDao riskDao){
        List riskList = new ArrayList();
        Map<String,List> valueMap = new TreeMap<String,List>();
        try {
            riskList = riskDao.queryAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        List loanamoutList = new ArrayList();
        List creditgradeList = new ArrayList();
        List x1List = new ArrayList();
        List x2List = new ArrayList();
        List x3List = new ArrayList();
        List x4List = new ArrayList();
        List x5List = new ArrayList();
        List x6List = new ArrayList();
        List x7List = new ArrayList();
        List x8List = new ArrayList();
        List x9List = new ArrayList();
        List y1List = new ArrayList();
        List y2List = new ArrayList();
        List y3List = new ArrayList();
        List y4List = new ArrayList();
        List y5List = new ArrayList();
        List y6List = new ArrayList();
        List y7List = new ArrayList();
        List y8List = new ArrayList();
        List<Integer> y9List = new ArrayList<Integer>();

        for(int i = 0 ; i<riskList.size() ; i++) {
            // Customers customer = (Customers) customerList.get(i);
            Risk risk = (Risk) riskList.get(i);
/*            String loanamout = customer.getAdviseloan();
            if(loanamout != null && !"".equals(loanamout) && !"null".equals(loanamout) && !"NaN".equals(loanamout))
                loanamoutList.add(Double.parseDouble(loanamout));
            valueMap.put("loanamout",loanamoutList);
            String creditgrade = customer.getBadratio();
            if(creditgrade != null && !"".equals(creditgrade) && !"null".equals(creditgrade) && !"NaN".equals(creditgrade))
                creditgradeList.add(creditgrade);
            valueMap.put("creditgrade",creditgradeList);*/
/*            String x1 = risk.getA11();
            if(x1 != null && !"".equals(x1) && !"null".equals(x1))
                x1List.add(x1);
            valueMap.put("x1",x1List);*/
            String x1 = risk.getA11();
            if (x1 != null && !"".equals(x1) && !"null".equals(x1) && !"NaN".equals(x1))
                x1List.add(x1);
            valueMap.put("x1", x1List);
            String x2 = risk.getA12();
            if (x2 != null && !"".equals(x2) && !"null".equals(x2) && !"NaN".equals(x2))
                x2List.add(x2);
            valueMap.put("x2", x2List);
            String x3 = risk.getA13();
            if (x3 != null && !"".equals(x3) && !"null".equals(x3) && !"NaN".equals(x3))
                x3List.add(x3);
            valueMap.put("x3", x3List);
            String x4 = risk.getA14();
            if (x4 != null && !"".equals(x4) && !"null".equals(x4) && !"NaN".equals(x4))
                x4List.add(x4);
            valueMap.put("x4", x4List);
            String x5 = risk.getA15();
            if (x5 != null && !"".equals(x5) && !"null".equals(x5) && !"NaN".equals(x5))
                x5List.add(x5);
            valueMap.put("x5", x5List);
            String x6 = risk.getA16();
            if (x6 != null && !"".equals(x6) && !"null".equals(x6) && !"NaN".equals(x6))
                x6List.add(x6);
            valueMap.put("x6", x6List);
            String x7 = risk.getA17();
            if (x7 != null && !"".equals(x7) && !"null".equals(x7) && !"NaN".equals(x7))
                x7List.add(x7);
            valueMap.put("x7", x7List);
            String x8 = risk.getA18();
            if (x8 != null && !"".equals(x8) && !"null".equals(x8) && !"NaN".equals(x8))
                x8List.add(x8);
            valueMap.put("x8", x8List);
            String x9 = risk.getA19();
            if (x9 != null && !"".equals(x9) && !"null".equals(x9) && !"NaN".equals(x9))
                x9List.add(x9);
            valueMap.put("x9", x9List);

            String y1 = risk.getB11();
            if (y1 != null && !"".equals(y1) && !"null".equals(y1) && !"NaN".equals(y1))
                y1List.add(y1);
            valueMap.put("y1", y1List);
            String y2 = risk.getB12();
/*            if(y2 != null && !"".equals(y2) && !"null".equals(y2) && !"NaN".equals(y2))
                y2List.add(y2);
            valueMap.put("y2",y2List);*/
            String y3 = risk.getB13();
            if (y3 != null && !"".equals(y3) && !"null".equals(y3) && !"NaN".equals(y3))
                y3List.add(y3);
            valueMap.put("y3", y3List);
            String y4 = risk.getB14();
/*            if(y4 != null && !"".equals(y4) && !"null".equals(y4) && !"NaN".equals(y4))
                y4List.add(y4);
            valueMap.put("y4",y4List);
            String y5 = risk.getB15();
            if(y5 != null && !"".equals(y5) && !"null".equals(y5) && !"NaN".equals(y5))
                y5List.add(y5);
            valueMap.put("y5",y5List);*/
            String y6 = risk.getB16();
            if (y6 != null && !"".equals(y6) && !"null".equals(y6) && !"NaN".equals(y6))
                y6List.add(y6);
            valueMap.put("y6", y6List);
            String y7 = risk.getB17();
            if (y7 != null && !"".equals(y7) && !"null".equals(y7) && !"NaN".equals(y7))
                y7List.add(y7);
            valueMap.put("y7", y7List);
            String y8 = risk.getB18();
            if (y8 != null && !"".equals(y8) && !"null".equals(y8) && !"NaN".equals(y8))
                y8List.add(y8);
            valueMap.put("y8", y8List);
            String y9 = risk.getB19();
            if (y9 != null && !"".equals(y9) && !"null".equals(y9) && !"NaN".equals(y9))
                y9List.add(Integer.parseInt(y9));
            valueMap.put("y9", y9List);
        }

        System.out.println("valueMap::"+valueMap);
        SingletonSave saveScore = SingletonSave.getInstance();
        Collections.sort(valueMap.get("y9"));
        saveScore.getScoreList().addAll(valueMap.get("y9"));

        //System.out.println(saveScore.getScoreList().size()+"::::::"+saveScore.getScoreList());


        for (Map.Entry entry : valueMap.entrySet()) {
            String key = entry.getKey().toString();
            List valuelistOld = (List)entry.getValue();

            List valueList = new LinkedList();
            for(int i = 0;i<valuelistOld.size();i++){
                valueList.add((Double) Double.parseDouble(valuelistOld.get(i)+""));

            }

            Collections.sort(valueList);
            String value = valueList.toString();

            //System.out.println("key=" + key +"  size:" + valueList.size()+"  value=" + value);
            List riskValueList = new LinkedList();
            List riskPointList = new LinkedList();

            Set uniqueSet = new TreeSet(valueList);
            //System.out.println("name:"+key+"  unique.size："+uniqueSet.size());
            if(uniqueSet.size() <= 30){
                for (Object temp : uniqueSet) {
                    //System.out.print(temp + ": " + Collections.frequency(valueList, temp)+",");
                    riskPointList.add(temp);
                    riskValueList.add(Collections.frequency(valueList, temp)+"");


                }
                saveRiskDiscretePoint(key,riskValueList,riskPointList);
//                System.out.println();
            }else{
 //               System.out.println(key);
                saveRiskContinuousPoint(key,valueList);
            }

            if("y1".equals(key) || "y2".equals(key) || "y3".equals(key) || "y4".equals(key) || "y5".equals(key) || "y6".equals(key) || "y7".equals(key) || "y8".equals(key) || "y9".equals(key)){
                System.out.println("should save loan_amout avg!");
                System.out.println("list:"+valueList);
                Double total = 0.0;
                for(int i=0;i<valueList.size();i++){
                    total = total + Double.parseDouble(valueList.get(i)+"");
                }
                Double avg = total/valueList.size();


                SingletonSave ss = SingletonSave.getInstance();
                Map avgMap = ss.getAvgMap();


                BigDecimal bd = new BigDecimal(avg);
                Double doubleValue = bd.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
                System.out.println(key+" :ave: "+doubleValue);
                avgMap.put(key,doubleValue);

            }


        }


    }

    public static void saveRiskContinuousPoint(String key,List doubleList){

        List<Double> continueInfo = new LinkedList<Double>();
        for(int i=0;i<doubleList.size();i++){
            Double doubleValue = Double.parseDouble(""+doubleList.get(i));
            continueInfo.add(doubleValue);
        }
        Map result = new TreeMap();

        Collections.sort(continueInfo);
        int bins = 30;  //设置多少点，前后两个点是最小和最大
        Double minValue = continueInfo.get(0);
        Double maxValue =continueInfo.get(continueInfo.size()-1);
        Double binRular = (maxValue - minValue)/(bins-1);
        List<Double> pointValue = new LinkedList<Double>();
        List pointNum = new LinkedList();
        pointValue.add(minValue);
        for(int i = 0;i<(bins-2);i++){
            //pointValue.add(minValue+binRular*(i+1));
            BigDecimal bd   =   new   BigDecimal(minValue+binRular*(i+1));
            pointValue.add(bd.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());
        }
        pointValue.add(maxValue);


        //Set uniqueSet = new HashSet(continueInfo);
        pointNum.add(Collections.frequency(continueInfo, continueInfo.get(0)));
        pointNum.add(Collections.frequency(continueInfo, continueInfo.get(continueInfo.size()-1)));

        int count = 0 ;
        int testCout = 0;
        Double minNum ; ;
        Double maxNum ;
        int pointValueCount = 0 ;
        int[] newCountInt = new int[bins];
        for(int i = 0 ; i < continueInfo.size() ; i++){

/*          //  System.out.println("1:"+pointValue);
           // System.out.println("2:"+continueInfo);
            // System.out.println(Double.parseDouble(""+continueInfo.get(i)));
            minNum = pointValue.get(pointValueCount);
            maxNum = pointValue.get(pointValueCount+1);
            // maxNum = Double.parseDouble(""+pointNum.get(pointValueCount+1));
            Double everyPointValue =continueInfo.get(i);

*//*            if(minNum <= everyPointValue && everyPointValue <= maxNum ){
                count++;
            }*//*
            if(minNum <= everyPointValue && everyPointValue < maxNum){
                count++;
            }else{
                pointNum.add(count);
                if(min)
                    count = 0;
                pointValueCount++;

            }

            if(0.041379310344827586 <= everyPointValue && everyPointValue<0.12413793103448276){
                testCout++;
            }*/
            Double everyPointValue =continueInfo.get(i);
            for(int j=0;j<pointValue.size();j++){
                if(j==0){
                    if(pointValue.get(0) >= everyPointValue){
                        newCountInt[j]++;
                    }
                }
                if(j>0) {
                    if (pointValue.get(j-1) < everyPointValue && everyPointValue <= pointValue.get(j)) {
                        newCountInt[j]++;
                    }
                }

            }
        }
        List point = new LinkedList();
        for(int i =0;i<newCountInt.length;i++){
            // System.out.print(newCountInt[i]+",");
            point.add(newCountInt[i]);
        }
        //     System.out.println();
        //     System.out.println(point.size()+"  "+point);
        //     System.out.println(pointValue.size()+"  "+pointValue);
/*      pointNum.add(count);
        System.out.println("testCount:"+testCout);
        System.out.println("sortList:"+continueInfo);
        System.out.println("pointValue:"+pointValue);
        System.out.println("allSize: "+doubleList.size()+"maxNum and minNum :"+pointNum.toString());
        System.out.println("list："+continueInfo);
        System.out.println("pointValue："+pointValue.size());
        System.out.println("maxValue:"+maxValue);
        System.out.println("calMaxValue"+minValue+binRular*29);*/
        SingletonSave ss = SingletonSave.getInstance();
        Map ssrmp = ss.getRiskPoint();
        Map ssrmv = ss.getRiskValue();
        ssrmp.put(key,point);
        ssrmv.put(key,pointValue);

        Map allPoint = ss.getAllPoint();
        Map allValue = ss.getAllValue();

        allPoint.put(key,point);
        allValue.put(key,pointValue);


    }

    public static  void saveRiskDiscretePoint(String key,List point,List value){
        //       System.out.println(key);
        //     System.out.println(point);
        //     System.out.println(value);
        SingletonSave ss = SingletonSave.getInstance();
        Map ssrmp = ss.getRiskPoint();
        Map ssrmv = ss.getRiskValue();
        ssrmp.put(key,point);
        ssrmv.put(key,value);

        Map allPoint = ss.getAllPoint();
        Map allValue = ss.getAllValue();

        allPoint.put(key,point);
        allValue.put(key,value);
    }

    public static void saveCustomer(CustomersDao ctd){
        List customerList = new ArrayList();
        Map<String,List> valueMap = new TreeMap<String,List>();
        try {
            customerList = ctd.queryAllInCity("6");
        } catch (Exception e) {
            e.printStackTrace();
        }
        List loanamoutList = new ArrayList();
        List adviseamoutList = new ArrayList();
        List creditgradeList = new ArrayList();

        List zaaList = new ArrayList();
        List zabList = new ArrayList();
        List zacList = new ArrayList();
        List zadList = new ArrayList();
        List zaeList = new ArrayList();
        List zafList = new ArrayList();
        List zagList = new ArrayList();
        List zahList = new ArrayList();
        List zaiList = new ArrayList();
        List zajList = new ArrayList();
        List zakList = new ArrayList();
        List zalList = new ArrayList();
        List zamList = new ArrayList();
        List zanList = new ArrayList();
        List zaoList = new ArrayList();
        List zapList = new ArrayList();
        List zaqList = new ArrayList();
        List zarList = new ArrayList();
        List zasList = new ArrayList();
        List zatList = new ArrayList();
        List zauList = new ArrayList();
        List zavList = new ArrayList();
        List zawList = new ArrayList();
        List zaxList = new ArrayList();
        List zayList = new ArrayList();
        List zazList = new ArrayList();
        List zbaList = new ArrayList();
        List zbbList = new ArrayList();
        List zbcList = new ArrayList();
        List zbdList = new ArrayList();
        List zbeList = new ArrayList();
        List zbfList = new ArrayList();
        List zbgList = new ArrayList();
        List zbhList = new ArrayList();
        List zbiList = new ArrayList();
        List zbjList = new ArrayList();
        List zbkList = new ArrayList();
        List zblList = new ArrayList();
        List zbmList = new ArrayList();
        List zbnList = new ArrayList();
        List zboList = new ArrayList();
        List zbpList = new ArrayList();
        List zbqList = new ArrayList();
        List zbrList = new ArrayList();
        List zbsList = new ArrayList();
        List zbtList = new ArrayList();
        List zbuList = new ArrayList();
        List zbvList = new ArrayList();
        List zbwList = new ArrayList();
        List zbxList = new ArrayList();
        List zbyList = new ArrayList();
        List zbzList = new ArrayList();
        List zcaList = new ArrayList();
        List zcbList = new ArrayList();
        List zccList = new ArrayList();
        List zcdList = new ArrayList();
        List zceList = new ArrayList();
        List zcfList = new ArrayList();
        List zcgList = new ArrayList();
        List zchList = new ArrayList();
        List zciList = new ArrayList();
        List zcjList = new ArrayList();
        List zckList = new ArrayList();
        List zclList = new ArrayList();
        List zcmList = new ArrayList();
        List zcnList = new ArrayList();
        List zcoList = new ArrayList();
        List zcpList = new ArrayList();
        List zcqList = new ArrayList();
        List zcrList = new ArrayList();
        List zcsList = new ArrayList();
        List zctList = new ArrayList();
        List zcuList = new ArrayList();
        List zcvList = new ArrayList();
        List zcwList = new ArrayList();
        List zcxList = new ArrayList();
        List zcyList = new ArrayList();
        List zczList = new ArrayList();
        List zdaList = new ArrayList();
        List zdbList = new ArrayList();
        List zdcList = new ArrayList();
        List zddList = new ArrayList();
        List zdeList = new ArrayList();
        List zdfList = new ArrayList();
        List zdgList = new ArrayList();
        List zdhList = new ArrayList();
        List zdiList = new ArrayList();
        List zdjList = new ArrayList();
        List zdkList = new ArrayList();
        List zdlList = new ArrayList();
        List zdmList = new ArrayList();
        List zdnList = new ArrayList();
        List zdoList = new ArrayList();
        List zdpList = new ArrayList();
        List zdqList = new ArrayList();
        List zdrList = new ArrayList();
        List zdsList = new ArrayList();
        List zdtList = new ArrayList();
        List zduList = new ArrayList();
        List zdvList = new ArrayList();
        List zdwList = new ArrayList();
        List zdxList = new ArrayList();
        List zdyList = new ArrayList();
        List zdzList = new ArrayList();
        List zeaList = new ArrayList();
        List zebList = new ArrayList();
        List zecList = new ArrayList();
        List zedList = new ArrayList();
        List zeeList = new ArrayList();
        List zefList = new ArrayList();
        List zegList = new ArrayList();
        List zehList = new ArrayList();
        List zeiList = new ArrayList();
        List zejList = new ArrayList();
        List zekList = new ArrayList();
        List zelList = new ArrayList();
        List zemList = new ArrayList();
        List zenList = new ArrayList();
        List zeoList = new ArrayList();
        List zepList = new ArrayList();


        for(int i = 0 ; i<customerList.size() ; i++) {
            // Customers customer = (Customers) customerList.get(i);
            Customers customer = (Customers) customerList.get(i);
/*            String loanamout = customer.getAdviseloan();
            if(loanamout != null && !"".equals(loanamout) && !"null".equals(loanamout) && !"NaN".equals(loanamout))
                loanamoutList.add(Double.parseDouble(loanamout));
            valueMap.put("loanamout",loanamoutList);
            String creditgrade = customer.getBadratio();
            if(creditgrade != null && !"".equals(creditgrade) && !"null".equals(creditgrade) && !"NaN".equals(creditgrade))
                creditgradeList.add(creditgrade);
            valueMap.put("creditgrade",creditgradeList);*/
/*            String x1 = risk.getA11();
            if(x1 != null && !"".equals(x1) && !"null".equals(x1))
                x1List.add(x1);
            valueMap.put("x1",x1List);*/
            String loanamout = customer.getZaf();
            if(loanamout != null && !"".equals(loanamout) && !"null".equals(loanamout) && !"NaN".equals(loanamout))
                loanamoutList.add(Double.parseDouble(loanamout));
            valueMap.put("loan_amout",loanamoutList);

            String adviseamout = customer.getAdviseloan();
            if(adviseamout != null && !"".equals(adviseamout) && !"null".equals(adviseamout) && !"NaN".equals(adviseamout))
                adviseamoutList.add(Double.parseDouble(adviseamout));
            valueMap.put("advise_amout",adviseamoutList);

            String creditgrade = customer.getBadratio();
            if(creditgrade != null && !"".equals(creditgrade) && !"null".equals(creditgrade) && !"NaN".equals(creditgrade))
                creditgradeList.add(creditgrade);
            valueMap.put("credit_grade",creditgradeList);

            String zaa = customer.getZaa();
            if(zaa != null && !"".equals(zaa) && !"null".equals(zaa) && !"NaN".equals(zaa))
                zaaList.add(zaa);
            valueMap.put("zaa",zaaList);
            String zab = customer.getZab();
            if(zab != null && !"".equals(zab) && !"null".equals(zab) && !"NaN".equals(zab))
                zabList.add(zab);
            valueMap.put("zab",zabList);
            String zac = customer.getZac();
            if(zac != null && !"".equals(zac) && !"null".equals(zac) && !"NaN".equals(zac))
                zacList.add(zac);
            valueMap.put("zac",zacList);
            String zad = customer.getZad();
            if(zad != null && !"".equals(zad) && !"null".equals(zad) && !"NaN".equals(zad))
                zadList.add(zad);
            valueMap.put("zad",zadList);
            String zae = customer.getZae();
            if(zae != null && !"".equals(zae) && !"null".equals(zae) && !"NaN".equals(zae))
                zaeList.add(zae);
            valueMap.put("zae",zaeList);
            String zaf = customer.getZaf();
            if(zaf != null && !"".equals(zaf) && !"null".equals(zaf) && !"NaN".equals(zaf))
                zafList.add(zaf);
            valueMap.put("zaf",zafList);
            String zag = customer.getZag();
            if(zag != null && !"".equals(zag) && !"null".equals(zag) && !"NaN".equals(zag))
                zagList.add(zag);
            valueMap.put("zag",zagList);
            String zah = customer.getZah();
            if(zah != null && !"".equals(zah) && !"null".equals(zah) && !"NaN".equals(zah))
                zahList.add(zah);
            valueMap.put("zah",zahList);
            String zai = customer.getZai();
            if(zai != null && !"".equals(zai) && !"null".equals(zai) && !"NaN".equals(zai))
                zaiList.add(zai);
            valueMap.put("zai",zaiList);
            String zaj = customer.getZaj();
            if(zaj != null && !"".equals(zaj) && !"null".equals(zaj) && !"NaN".equals(zaj))
                zajList.add(zaj);
            valueMap.put("zaj",zajList);
            String zak = customer.getZak();
            if(zak != null && !"".equals(zak) && !"null".equals(zak) && !"NaN".equals(zak))
                zakList.add(zak);
            valueMap.put("zak",zakList);
            String zal = customer.getZal();
            if(zal != null && !"".equals(zal) && !"null".equals(zal) && !"NaN".equals(zal))
                zalList.add(zal);
            valueMap.put("zal",zalList);
            String zam = customer.getZam();
            if(zam != null && !"".equals(zam) && !"null".equals(zam) && !"NaN".equals(zam))
                zamList.add(zam);
            valueMap.put("zam",zamList);
            String zan = customer.getZan();
            if(zan != null && !"".equals(zan) && !"null".equals(zan) && !"NaN".equals(zan))
                zanList.add(zan);
            valueMap.put("zan",zanList);
            String zao = customer.getZao();
            if(zao != null && !"".equals(zao) && !"null".equals(zao) && !"NaN".equals(zao))
                zaoList.add(zao);
            valueMap.put("zao",zaoList);
            String zap = customer.getZap();
            if(zap != null && !"".equals(zap) && !"null".equals(zap) && !"NaN".equals(zap))
                zapList.add(zap);
            valueMap.put("zap",zapList);
            String zaq = customer.getZaq();
            if(zaq != null && !"".equals(zaq) && !"null".equals(zaq) && !"NaN".equals(zaq))
                zaqList.add(zaq);
            valueMap.put("zaq",zaqList);
/*            String zar = customer.getZar();
            if(zar != null && !"".equals(zar) && !"null".equals(zar) && !"NaN".equals(zar))
                zarList.add(zar);
            valueMap.put("zar",zarList);*/
            String zas = customer.getZas();
            if(zas != null && !"".equals(zas) && !"null".equals(zas) && !"NaN".equals(zas))
                zasList.add(zas);
            valueMap.put("zas",zasList);
            String zat = customer.getZat();
            if(zat != null && !"".equals(zat) && !"null".equals(zat) && !"NaN".equals(zat))
                zatList.add(zat);
            valueMap.put("zat",zatList);
            String zau = customer.getZau();
            if(zau != null && !"".equals(zau) && !"null".equals(zau) && !"NaN".equals(zau))
                zauList.add(zau);
            valueMap.put("zau",zauList);
            String zav = customer.getZav();
            if(zav != null && !"".equals(zav) && !"null".equals(zav) && !"NaN".equals(zav))
                zavList.add(zav);
            valueMap.put("zav",zavList);
            String zaw = customer.getZaw();
            if(zaw != null && !"".equals(zaw) && !"null".equals(zaw) && !"NaN".equals(zaw))
                zawList.add(zaw);
            valueMap.put("zaw",zawList);
            String zax = customer.getZax();
            if(zax != null && !"".equals(zax) && !"null".equals(zax) && !"NaN".equals(zax))
                zaxList.add(zax);
            valueMap.put("zax",zaxList);
            String zay = customer.getZay();
            if(zay != null && !"".equals(zay) && !"null".equals(zay) && !"NaN".equals(zay))
                zayList.add(zay);
            valueMap.put("zay",zayList);
            String zaz = customer.getZaz();
            if(zaz != null && !"".equals(zaz) && !"null".equals(zaz) && !"NaN".equals(zaz))
                zazList.add(zaz);
            valueMap.put("zaz",zazList);
            String zba = customer.getZba();
            if(zba != null && !"".equals(zba) && !"null".equals(zba) && !"NaN".equals(zba))
                zbaList.add(zba);
            valueMap.put("zba",zbaList);
            String zbb = customer.getZbb();
            if(zbb != null && !"".equals(zbb) && !"null".equals(zbb) && !"NaN".equals(zbb))
                zbbList.add(zbb);
            valueMap.put("zbb",zbbList);
            String zbc = customer.getZbc();
            if(zbc != null && !"".equals(zbc) && !"null".equals(zbc) && !"NaN".equals(zbc))
                zbcList.add(zbc);
            valueMap.put("zbc",zbcList);
            String zbd = customer.getZbd();
            if(zbd != null && !"".equals(zbd) && !"null".equals(zbd) && !"NaN".equals(zbd))
                zbdList.add(zbd);
            valueMap.put("zbd",zbdList);
            String zbe = customer.getZbe();
            if(zbe != null && !"".equals(zbe) && !"null".equals(zbe) && !"NaN".equals(zbe))
                zbeList.add(zbe);
            valueMap.put("zbe",zbeList);
            String zbf = customer.getZbf();
            if(zbf != null && !"".equals(zbf) && !"null".equals(zbf) && !"NaN".equals(zbf))
                zbfList.add(zbf);
            valueMap.put("zbf",zbfList);
            String zbg = customer.getZbg();
            if(zbg != null && !"".equals(zbg) && !"null".equals(zbg) && !"NaN".equals(zbg))
                zbgList.add(zbg);
            valueMap.put("zbg",zbgList);
            String zbh = customer.getZbh();
            if(zbh != null && !"".equals(zbh) && !"null".equals(zbh) && !"NaN".equals(zbh))
                zbhList.add(zbh);
            valueMap.put("zbh",zbhList);
            String zbi = customer.getZbi();
            if(zbi != null && !"".equals(zbi) && !"null".equals(zbi) && !"NaN".equals(zbi))
                zbiList.add(zbi);
            valueMap.put("zbi",zbiList);
            String zbj = customer.getZbj();
            if(zbj != null && !"".equals(zbj) && !"null".equals(zbj) && !"NaN".equals(zbj))
                zbjList.add(zbj);
            valueMap.put("zbj",zbjList);
            String zbk = customer.getZbk();
            if(zbk != null && !"".equals(zbk) && !"null".equals(zbk) && !"NaN".equals(zbk))
                zbkList.add(zbk);
            valueMap.put("zbk",zbkList);
/*            String zbl = customer.getZbl();
            if(zbl != null && !"".equals(zbl) && !"null".equals(zbl) && !"NaN".equals(zbl))
                zblList.add(zbl);
            valueMap.put("zbl",zblList);*/
            String zbm = customer.getZbm();
            if(zbm != null && !"".equals(zbm) && !"null".equals(zbm) && !"NaN".equals(zbm))
                zbmList.add(zbm);
            valueMap.put("zbm",zbmList);
            String zbn = customer.getZbn();
            if(zbn != null && !"".equals(zbn) && !"null".equals(zbn) && !"NaN".equals(zbn))
                zbnList.add(zbn);
            valueMap.put("zbn",zbnList);
/*             String zbo = customer.getZbo();
            if(zbo != null && !"".equals(zbo) && !"null".equals(zbo) && !"NaN".equals(zbo))
                zboList.add(zbo);
            valueMap.put("zbo",zboList);*/
/*            String zbp = customer.getZbp();
            if(zbp != null && !"".equals(zbp) && !"null".equals(zbp) && !"NaN".equals(zbp))
                zbpList.add(zbp);
            valueMap.put("zbp",zbpList);*/
            String zbq = customer.getZbq();
            if(zbq != null && !"".equals(zbq) && !"null".equals(zbq) && !"NaN".equals(zbq))
                zbqList.add(zbq);
            valueMap.put("zbq",zbqList);
            String zbr = customer.getZbr();
            if(zbr != null && !"".equals(zbr) && !"null".equals(zbr) && !"NaN".equals(zbr))
                zbrList.add(zbr);
            valueMap.put("zbr",zbrList);
            String zbs = customer.getZbs();
            if(zbs != null && !"".equals(zbs) && !"null".equals(zbs) && !"NaN".equals(zbs))
                zbsList.add(zbs);
            valueMap.put("zbs",zbsList);
/*            String zbt = customer.getZbt();
            if(zbt != null && !"".equals(zbt) && !"null".equals(zbt) && !"NaN".equals(zbt))
                zbtList.add(zbt);
            valueMap.put("zbt",zbtList);*/
            String zbu = customer.getZbu();
            if(zbu != null && !"".equals(zbu) && !"null".equals(zbu) && !"NaN".equals(zbu))
                zbuList.add(zbu);
            valueMap.put("zbu",zbuList);
            String zbv = customer.getZbv();
            if(zbv != null && !"".equals(zbv) && !"null".equals(zbv) && !"NaN".equals(zbv))
                zbvList.add(zbv);
            valueMap.put("zbv",zbvList);
            String zbw = customer.getZbw();
            if(zbw != null && !"".equals(zbw) && !"null".equals(zbw) && !"NaN".equals(zbw))
                zbwList.add(zbw);
            valueMap.put("zbw",zbwList);
            String zbx = customer.getZbx();
            if(zbx != null && !"".equals(zbx) && !"null".equals(zbx) && !"NaN".equals(zbx))
                zbxList.add(zbx);
            valueMap.put("zbx",zbxList);
            String zby = customer.getZby();
            if(zby != null && !"".equals(zby) && !"null".equals(zby) && !"NaN".equals(zby) && !"999999".equals(zby))
                zbyList.add(zby);
            valueMap.put("zby",zbyList);
            String zbz = customer.getZbz();
            if(zbz != null && !"".equals(zbz) && !"null".equals(zbz) && !"NaN".equals(zbz))
                zbzList.add(zbz);
            valueMap.put("zbz",zbzList);
            String zca = customer.getZca();
            if(zca != null && !"".equals(zca) && !"null".equals(zca) && !"NaN".equals(zca) && !"999999".equals(zca))
                zcaList.add(zca);
            valueMap.put("zca",zcaList);
            String zcb = customer.getZcb();
            if(zcb != null && !"".equals(zcb) && !"null".equals(zcb) && !"NaN".equals(zcb))
                zcbList.add(zcb);
            valueMap.put("zcb",zcbList);
            String zcc = customer.getZcc();
            if(zcc != null && !"".equals(zcc) && !"null".equals(zcc) && !"NaN".equals(zcc) && !"999999".equals(zcc))
                zccList.add(zcc);
            valueMap.put("zcc",zccList);
            String zcd = customer.getZcd();
            if(zcd != null && !"".equals(zcd) && !"null".equals(zcd) && !"NaN".equals(zcd))
                zcdList.add(zcd);
            valueMap.put("zcd",zcdList);
            String zce = customer.getZce();
            if(zce != null && !"".equals(zce) && !"null".equals(zce) && !"NaN".equals(zce))
                zceList.add(zce);
            valueMap.put("zce",zceList);
            String zcf = customer.getZcf();
            if(zcf != null && !"".equals(zcf) && !"null".equals(zcf) && !"NaN".equals(zcf))
                zcfList.add(zcf);
            valueMap.put("zcf",zcfList);
            String zcg = customer.getZcg();
            if(zcg != null && !"".equals(zcg) && !"null".equals(zcg) && !"NaN".equals(zcg))
                zcgList.add(zcg);
            valueMap.put("zcg",zcgList);
            String zch = customer.getZch();
            if(zch != null && !"".equals(zch) && !"null".equals(zch) && !"NaN".equals(zch))
                zchList.add(zch);
            valueMap.put("zch",zchList);
            String zci = customer.getZci();
            if(zci != null && !"".equals(zci) && !"null".equals(zci) && !"NaN".equals(zci))
                zciList.add(zci);
            valueMap.put("zci",zciList);
            String zcj = customer.getZcj();
            if(zcj != null && !"".equals(zcj) && !"null".equals(zcj) && !"NaN".equals(zcj))
                zcjList.add(zcj);
            valueMap.put("zcj",zcjList);
            String zck = customer.getZck();
            if(zck != null && !"".equals(zck) && !"null".equals(zck) && !"NaN".equals(zck))
                zckList.add(zck);
            valueMap.put("zck",zckList);
            String zcl = customer.getZcl();
            if(zcl != null && !"".equals(zcl) && !"null".equals(zcl) && !"NaN".equals(zcl))
                zclList.add(zcl);
            valueMap.put("zcl",zclList);
            String zcm = customer.getZcm();
            if(zcm != null && !"".equals(zcm) && !"null".equals(zcm) && !"NaN".equals(zcm))
                zcmList.add(zcm);
            valueMap.put("zcm",zcmList);
            String zcn = customer.getZcn();
            if(zcn != null && !"".equals(zcn) && !"null".equals(zcn) && !"NaN".equals(zcn))
                zcnList.add(zcn);
            valueMap.put("zcn",zcnList);
            String zco = customer.getZco();
            if(zco != null && !"".equals(zco) && !"null".equals(zco) && !"NaN".equals(zco))
                zcoList.add(zco);
            valueMap.put("zco",zcoList);
            String zcp = customer.getZcp();
            if(zcp != null && !"".equals(zcp) && !"null".equals(zcp) && !"NaN".equals(zcp))
                zcpList.add(zcp);
            valueMap.put("zcp",zcpList);
            String zcq = customer.getZcq();
            if(zcq != null && !"".equals(zcq) && !"null".equals(zcq) && !"NaN".equals(zcq))
                zcqList.add(zcq);
            valueMap.put("zcq",zcqList);
            String zcr = customer.getZcr();
            if(zcr != null && !"".equals(zcr) && !"null".equals(zcr) && !"NaN".equals(zcr))
                zcrList.add(zcr);
            valueMap.put("zcr",zcrList);
            String zcs = customer.getZcs();
            if(zcs != null && !"".equals(zcs) && !"null".equals(zcs) && !"NaN".equals(zcs))
                zcsList.add(zcs);
            valueMap.put("zcs",zcsList);
            String zct = customer.getZct();
            if(zct != null && !"".equals(zct) && !"null".equals(zct) && !"NaN".equals(zct))
                zctList.add(zct);
            valueMap.put("zct",zctList);
            String zcu = customer.getZcu();
            if(zcu != null && !"".equals(zcu) && !"null".equals(zcu) && !"NaN".equals(zcu))
                zcuList.add(zcu);
            valueMap.put("zcu",zcuList);
            String zcv = customer.getZcv();
            if(zcv != null && !"".equals(zcv) && !"null".equals(zcv) && !"NaN".equals(zcv))
                zcvList.add(zcv);
            valueMap.put("zcv",zcvList);
            String zcw = customer.getZcw();
            if(zcw != null && !"".equals(zcw) && !"null".equals(zcw) && !"NaN".equals(zcw))
                zcwList.add(zcw);
            valueMap.put("zcw",zcwList);
            String zcx = customer.getZcx();
            if(zcx != null && !"".equals(zcx) && !"null".equals(zcx) && !"NaN".equals(zcx))
                zcxList.add(zcx);
            valueMap.put("zcx",zcxList);
            String zcy = customer.getZcy();
            if(zcy != null && !"".equals(zcy) && !"null".equals(zcy) && !"NaN".equals(zcy))
                zcyList.add(zcy);
            valueMap.put("zcy",zcyList);
            String zcz = customer.getZcz();
            if(zcz != null && !"".equals(zcz) && !"null".equals(zcz) && !"NaN".equals(zcz))
                zczList.add(zcz);
            valueMap.put("zcz",zczList);
            String zda = customer.getZda();
            if(zda != null && !"".equals(zda) && !"null".equals(zda) && !"NaN".equals(zda))
                zdaList.add(zda);
            valueMap.put("zda",zdaList);
            String zdb = customer.getZdb();
            if(zdb != null && !"".equals(zdb) && !"null".equals(zdb) && !"NaN".equals(zdb))
                zdbList.add(zdb);
            valueMap.put("zdb",zdbList);
            String zdc = customer.getZdc();
            if(zdc != null && !"".equals(zdc) && !"null".equals(zdc) && !"NaN".equals(zdc))
                zdcList.add(zdc);
            valueMap.put("zdc",zdcList);
            String zdd = customer.getZdd();
            if(zdd != null && !"".equals(zdd) && !"null".equals(zdd) && !"NaN".equals(zdd))
                zddList.add(zdd);
            valueMap.put("zdd",zddList);
            String zde = customer.getZde();
            if(zde != null && !"".equals(zde) && !"null".equals(zde) && !"NaN".equals(zde))
                zdeList.add(zde);
            valueMap.put("zde",zdeList);
            String zdf = customer.getZdf();
            if(zdf != null && !"".equals(zdf) && !"null".equals(zdf) && !"NaN".equals(zdf))
                zdfList.add(zdf);
            valueMap.put("zdf",zdfList);
            String zdg = customer.getZdg();
            if(zdg != null && !"".equals(zdg) && !"null".equals(zdg) && !"NaN".equals(zdg))
                zdgList.add(zdg);
            valueMap.put("zdg",zdgList);
            String zdh = customer.getZdh();
            if(zdh != null && !"".equals(zdh) && !"null".equals(zdh) && !"NaN".equals(zdh))
                zdhList.add(zdh);
            valueMap.put("zdh",zdhList);
            String zdi = customer.getZdi();
            if(zdi != null && !"".equals(zdi) && !"null".equals(zdi) && !"NaN".equals(zdi))
                zdiList.add(zdi);
            valueMap.put("zdi",zdiList);
            String zdj = customer.getZdj();
            if(zdj != null && !"".equals(zdj) && !"null".equals(zdj) && !"NaN".equals(zdj))
                zdjList.add(zdj);
            valueMap.put("zdj",zdjList);
            String zdk = customer.getZdk();
            if(zdk != null && !"".equals(zdk) && !"null".equals(zdk) && !"NaN".equals(zdk))
                zdkList.add(zdk);
            valueMap.put("zdk",zdkList);
            String zdl = customer.getZdl();
            if(zdl != null && !"".equals(zdl) && !"null".equals(zdl) && !"NaN".equals(zdl))
                zdlList.add(zdl);
            valueMap.put("zdl",zdlList);
            String zdm = customer.getZdm();
            if(zdm != null && !"".equals(zdm) && !"null".equals(zdm) && !"NaN".equals(zdm))
                zdmList.add(zdm);
            valueMap.put("zdm",zdmList);
            String zdn = customer.getZdn();
            if(zdn != null && !"".equals(zdn) && !"null".equals(zdn) && !"NaN".equals(zdn))
                zdnList.add(zdn);
            valueMap.put("zdn",zdnList);
/*            String zdo = customer.getZdo();
            if(zdo != null && !"".equals(zdo) && !"null".equals(zdo) && !"NaN".equals(zdo))
                zdoList.add(zdo);
            valueMap.put("zdo",zdoList);*/
            String zdp = customer.getZdp();
            if(zdp != null && !"".equals(zdp) && !"null".equals(zdp) && !"NaN".equals(zdp) && !"2936547".equals(zdp) && !"-21914".equals(zdp))
                zdpList.add(zdp);
            valueMap.put("zdp",zdpList);
            String zdq = customer.getZdq();
            if(zdq != null && !"".equals(zdq) && !"null".equals(zdq) && !"NaN".equals(zdq) && !"999999".equals(zdq))
                zdqList.add(zdq);
            valueMap.put("zdq",zdqList);
            String zdr = customer.getZdr();
            if(zdr != null && !"".equals(zdr) && !"null".equals(zdr) && !"NaN".equals(zdr) && !"999999".equals(zdr))
                zdrList.add(zdr);
            valueMap.put("zdr",zdrList);
            String zds = customer.getZds();
            if(zds != null && !"".equals(zds) && !"null".equals(zds) && !"NaN".equals(zds))
                zdsList.add(zds);
            valueMap.put("zds",zdsList);
            String zdt = customer.getZdt();
            if(zdt != null && !"".equals(zdt) && !"null".equals(zdt) && !"NaN".equals(zdt))
                zdtList.add(zdt);
            valueMap.put("zdt",zdtList);
            String zdu = customer.getZdu();
            if(zdu != null && !"".equals(zdu) && !"null".equals(zdu) && !"NaN".equals(zdu))
                zduList.add(zdu);
            valueMap.put("zdu",zduList);
            String zdv = customer.getZdv();
            if(zdv != null && !"".equals(zdv) && !"null".equals(zdv) && !"NaN".equals(zdv))
                zdvList.add(zdv);
            valueMap.put("zdv",zdvList);
            String zdw = customer.getZdw();
            if(zdw != null && !"".equals(zdw) && !"null".equals(zdw) && !"NaN".equals(zdw) && !"2936547".equals(zdw))
                zdwList.add(zdw);
            valueMap.put("zdw",zdwList);
/*            String zdx = customer.getZdx();
            if(zdx != null && !"".equals(zdx) && !"null".equals(zdx) && !"NaN".equals(zdx))
                zdxList.add(zdx);
            valueMap.put("zdx",zdxList);*/
            String zdy = customer.getZdy();
            if(zdy != null && !"".equals(zdy) && !"null".equals(zdy) && !"NaN".equals(zdy) && !"2936547".equals(zdy))
                zdyList.add(zdy);
            valueMap.put("zdy",zdyList);
            String zdz = customer.getZdz();
            if(zdz != null && !"".equals(zdz) && !"null".equals(zdz) && !"NaN".equals(zdz))
                zdzList.add(zdz);
            valueMap.put("zdz",zdzList);
            String zea = customer.getZea();
            if(zea != null && !"".equals(zea) && !"null".equals(zea) && !"NaN".equals(zea) && !"999999".equals(zea))
                zeaList.add(zea);
            valueMap.put("zea",zeaList);
            String zeb = customer.getZeb();
            if(zeb != null && !"".equals(zeb) && !"null".equals(zeb) && !"NaN".equals(zeb))
                zebList.add(zeb);
            valueMap.put("zeb",zebList);
            String zec = customer.getZec();
            if(zec != null && !"".equals(zec) && !"null".equals(zec) && !"NaN".equals(zec))
                zecList.add(zec);
            valueMap.put("zec",zecList);
            String zed = customer.getZed();
            if(zed != null && !"".equals(zed) && !"null".equals(zed) && !"NaN".equals(zed))
                zedList.add(zed);
            valueMap.put("zed",zedList);
            String zee = customer.getZee();
            if(zee != null && !"".equals(zee) && !"null".equals(zee) && !"NaN".equals(zee) && !"999999".equals(zee))
                zeeList.add(zee);
            valueMap.put("zee",zeeList);
            String zef = customer.getZef();
            if(zef != null && !"".equals(zef) && !"null".equals(zef) && !"NaN".equals(zef))
                zefList.add(zef);
            valueMap.put("zef",zefList);
            String zeg = customer.getZeg();
            if(zeg != null && !"".equals(zeg) && !"null".equals(zeg) && !"NaN".equals(zeg))
                zegList.add(zeg);
            valueMap.put("zeg",zegList);
            String zeh = customer.getZeh();
            if(zeh != null && !"".equals(zeh) && !"null".equals(zeh) && !"NaN".equals(zeh))
                zehList.add(zeh);
            valueMap.put("zeh",zehList);
            String zei = customer.getZei();
            if(zei != null && !"".equals(zei) && !"null".equals(zei) && !"NaN".equals(zei))
                zeiList.add(zei);
            valueMap.put("zei",zeiList);
            String zej = customer.getZej();
            if(zej != null && !"".equals(zej) && !"null".equals(zej) && !"NaN".equals(zej))
                zejList.add(zej);
            valueMap.put("zej",zejList);
            String zek = customer.getZek();
            if(zek != null && !"".equals(zek) && !"null".equals(zek) && !"NaN".equals(zek))
                zekList.add(zek);
            valueMap.put("zek",zekList);
            String zel = customer.getZel();
            if(zel != null && !"".equals(zel) && !"null".equals(zel) && !"NaN".equals(zel))
                zelList.add(zel);
            valueMap.put("zel",zelList);
            String zem = customer.getZem();
            if(zem != null && !"".equals(zem) && !"null".equals(zem) && !"NaN".equals(zem))
                zemList.add(zem);
            valueMap.put("zem",zemList);
            String zen = customer.getZen();
            if(zen != null && !"".equals(zen) && !"null".equals(zen) && !"NaN".equals(zen))
                zenList.add(zen);
            valueMap.put("zen",zenList);
            String zeo = customer.getZeo();
            if(zeo != null && !"".equals(zeo) && !"null".equals(zeo) && !"NaN".equals(zeo))
                zeoList.add(zeo);
            valueMap.put("zeo",zeoList);
        }


        for (Map.Entry entry : valueMap.entrySet()) {
            String key = entry.getKey().toString();
            List valuelistOld = (List)entry.getValue();

            List valueList = new LinkedList();
            if(!"credit_grade".equals(key) && !"zaj".equals(key) && !"zbf".equals(key) && !"zau".equals(key) && !"zbq".equals(key)){

                for(int i = 0;i<valuelistOld.size();i++){
                    valueList.add((Double) Double.parseDouble(valuelistOld.get(i)+""));

                }
            }else{
                for(int i = 0;i<valuelistOld.size();i++){
                    valueList.add(valuelistOld.get(i));

                }
            }


            Collections.sort(valueList);
            String value = valueList.toString();

            //System.out.println("key=" + key +"  size:" + valueList.size()+"  value=" + value);
            List customerValueList = new LinkedList();
            List customerPointList = new LinkedList();

            Set uniqueSet = new TreeSet(valueList);
            //System.out.println("name:"+key+"  unique.size："+uniqueSet.size());
            if(uniqueSet.size() <= 30 || "zau".equals(key)){  //
                for (Object temp : uniqueSet) {
                    //System.out.print(temp + ": " + Collections.frequency(valueList, temp)+",");
                    customerPointList.add(temp);
                    customerValueList.add(Collections.frequency(valueList, temp));


                }
                saveCustomerDiscretePoint(key,customerValueList,customerPointList);
//                System.out.println();
            }else{
 //               System.out.println(key);
                saveCustomerContinuousPoint(key,valueList);
            }

            if("loan_amout".equals(key)){
                System.out.println("should save loan_amout avg!");
                System.out.println("list:"+valueList);
                Double total = 0.0;
                for(int i=0;i<valueList.size();i++){
                    total = total + Double.parseDouble(valueList.get(i)+"");
                }
                Double avg = total/valueList.size();
                System.out.println("ave:"+avg);
            }



        }


    }





    public static  void saveCustomerContinuousPoint(String key,List doubleList){


        List<Double> continueInfo = new LinkedList<Double>();
        for(int i=0;i<doubleList.size();i++){
            Double doubleValue = Double.parseDouble(""+doubleList.get(i));
            continueInfo.add(doubleValue);
        }
        Map result = new TreeMap();

        Collections.sort(continueInfo);
        int bins = 30;  //设置多少点，前后两个点是最小和最大
        Double minValue = continueInfo.get(0);
        Double maxValue =continueInfo.get(continueInfo.size()-1);
        Double binRular = (maxValue - minValue)/(bins-1);
        List<Double> pointValue = new LinkedList<Double>();
        List pointNum = new LinkedList();
        pointValue.add(minValue);
        for(int i = 0;i<(bins-2);i++){
            //pointValue.add(minValue+binRular*(i+1));
            BigDecimal bd   =   new   BigDecimal(minValue+binRular*(i+1));
            pointValue.add(bd.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());
            //System.out.print(bd.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue()+",");
        }
        pointValue.add(maxValue);


        //Set uniqueSet = new HashSet(continueInfo);
        pointNum.add(Collections.frequency(continueInfo, continueInfo.get(0)));
        pointNum.add(Collections.frequency(continueInfo, continueInfo.get(continueInfo.size()-1)));

        int count = 0 ;
        int testCout = 0;
        Double minNum ; ;
        Double maxNum ;
        int pointValueCount = 0 ;
        int[] newCountInt = new int[bins];
        for(int i = 0 ; i < continueInfo.size() ; i++){

/*          //  System.out.println("1:"+pointValue);
           // System.out.println("2:"+continueInfo);
            // System.out.println(Double.parseDouble(""+continueInfo.get(i)));
            minNum = pointValue.get(pointValueCount);
            maxNum = pointValue.get(pointValueCount+1);
            // maxNum = Double.parseDouble(""+pointNum.get(pointValueCount+1));
            Double everyPointValue =continueInfo.get(i);

*//*            if(minNum <= everyPointValue && everyPointValue <= maxNum ){
                count++;
            }*//*
            if(minNum <= everyPointValue && everyPointValue < maxNum){
                count++;
            }else{
                pointNum.add(count);
                if(min)
                    count = 0;
                pointValueCount++;

            }

            if(0.041379310344827586 <= everyPointValue && everyPointValue<0.12413793103448276){
                testCout++;
            }*/
            Double everyPointValue =continueInfo.get(i);
            for(int j=0;j<pointValue.size();j++){
                if(j==0){
                    if(pointValue.get(0) >= everyPointValue){
                        newCountInt[j]++;
                    }
                }
                if(j>0) {
                    if (pointValue.get(j-1) < everyPointValue && everyPointValue <= pointValue.get(j)) {
                        newCountInt[j]++;
                    }
                }

            }
        }
        List point = new LinkedList();
        for(int i =0;i<newCountInt.length;i++){
            // System.out.print(newCountInt[i]+",");
            point.add(newCountInt[i]);
        }
        //   System.out.println();
        //    System.out.println(point.size()+"  "+point);
        //    System.out.println(pointValue.size()+"  "+pointValue);
/*      pointNum.add(count);
        System.out.println("testCount:"+testCout);
        System.out.println("sortList:"+continueInfo);
        System.out.println("pointValue:"+pointValue);
        System.out.println("allSize: "+doubleList.size()+"maxNum and minNum :"+pointNum.toString());
        System.out.println("list："+continueInfo);
        System.out.println("pointValue："+pointValue.size());
        System.out.println("maxValue:"+maxValue);
        System.out.println("calMaxValue"+minValue+binRular*29);*/
        SingletonSave ss = SingletonSave.getInstance();
        Map sscmp = ss.getCustomerPoint();
        Map sscmv = ss.getCustomerValue();
        sscmp.put(key,point);
        sscmv.put(key,pointValue);

        Map allPoint = ss.getAllPoint();
        Map allValue = ss.getAllValue();

        allPoint.put(key,point);
        allValue.put(key,pointValue);
    }

    public static  void saveCustomerDiscretePoint(String key,List point,List value){

        //  System.out.println(key);
        //   System.out.println(point);
        //  System.out.println(value);
        SingletonSave ss = SingletonSave.getInstance();
        Map sscmp = ss.getCustomerPoint();
        Map sscmv = ss.getCustomerValue();
        sscmp.put(key,point);
        sscmv.put(key,value);


        Map allPoint = ss.getAllPoint();
        Map allValue = ss.getAllValue();

        allPoint.put(key,point);
        allValue.put(key,value);

    }

    public static void saveAmountAndGrade(CustomersDao ctd){
        List customerList1 = new ArrayList();
        List customerList2 = new ArrayList();
        List customerList3 = new ArrayList();
        Map<String,List> valueMap = new TreeMap<String,List>();
        try {

            customerList1 = ctd.queryNoneInCity("6");
            customerList2 = ctd.queryAbidedInCity("6");
            customerList3 = ctd.queryBrokenInCity("6");
            System.out.println("1:"+customerList1.size());
            System.out.println("2:"+customerList2.size());
            System.out.println("3:"+customerList3.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        List loanAmountNone = new ArrayList();
        List loanAmountAbided = new ArrayList();
        List loanAmountBroken = new ArrayList();
        List creditGradeNone = new ArrayList();
        List creditGradeAbided = new ArrayList();
        List creditGradeBroken = new ArrayList();

        for(int i=0;i<customerList1.size();i++){
            Customers customer = (Customers) customerList1.get(i);
            String loanamout = customer.getAdviseloan();
            if(loanamout != null && !"".equals(loanamout) && !"null".equals(loanamout) && !"NaN".equals(loanamout))
                loanAmountNone.add(Double.parseDouble(loanamout));


            String creditgrade = customer.getBadratio();
            if(creditgrade != null && !"".equals(creditgrade) && !"null".equals(creditgrade) && !"NaN".equals(creditgrade))
                creditGradeNone.add(creditgrade);


        }
//        System.out.println(loanAmountNone);
//        System.out.println(creditGradeNone);
        valueMap.put("loan_amount_none",loanAmountNone);
        valueMap.put("credit_grade_none",creditGradeNone);
        for(int i=0;i<customerList2.size();i++){
            Customers customer = (Customers) customerList2.get(i);
            String loanamout = customer.getZaf();
            if(loanamout != null && !"".equals(loanamout) && !"null".equals(loanamout) && !"NaN".equals(loanamout))
                loanAmountAbided.add(Double.parseDouble(loanamout));


            String creditgrade = customer.getBadratio();
            if(creditgrade != null && !"".equals(creditgrade) && !"null".equals(creditgrade) && !"NaN".equals(creditgrade))
                creditGradeAbided.add(creditgrade);


        }
//        System.out.println(loanAmountAbided);
//        System.out.println(creditGradeAbided);
        valueMap.put("loan_amount_abided",loanAmountAbided);
        valueMap.put("credit_grade_abided",creditGradeAbided);

        for(int i=0;i<customerList3.size();i++){
            Customers customer = (Customers) customerList3.get(i);
            String loanamout = customer.getZaf();
            if(loanamout != null && !"".equals(loanamout) && !"null".equals(loanamout) && !"NaN".equals(loanamout))
                loanAmountBroken.add(Double.parseDouble(loanamout));
            valueMap.put("loan_amount_broken",loanAmountBroken);

            String creditgrade = customer.getBadratio();
            if(creditgrade != null && !"".equals(creditgrade) && !"null".equals(creditgrade) && !"NaN".equals(creditgrade))
                creditGradeBroken.add(creditgrade);
            valueMap.put("credit_grade_broken",creditGradeBroken);

        }
//        System.out.println(loanAmountBroken);
 //       System.out.println(creditGradeBroken);

        for (Map.Entry entry : valueMap.entrySet()) {
            String key = entry.getKey().toString();
            List valuelistOld = (List)entry.getValue();

            List valueList = new LinkedList();
            if(!"credit_grade_none".equals(key) && !"credit_grade_broken".equals(key) && !"credit_grade_abided".equals(key) ){

                for(int i = 0;i<valuelistOld.size();i++){
                    valueList.add((Double) Double.parseDouble(valuelistOld.get(i)+""));

                }
            }else{
                for(int i = 0;i<valuelistOld.size();i++){
                    valueList.add(valuelistOld.get(i));

                }
            }


            Collections.sort(valueList);
            String value = valueList.toString();

            //System.out.println("key=" + key +"  size:" + valueList.size()+"  value=" + value);
            List customerValueList = new LinkedList();
            List customerPointList = new LinkedList();

            Set uniqueSet = new TreeSet(valueList);
            //System.out.println("name:"+key+"  unique.size："+uniqueSet.size());
            if("credit_grade_none".equals(key) || "credit_grade_broken".equals(key) || "credit_grade_abided".equals(key)){  //
                for (Object temp : uniqueSet) {
                    //System.out.print(temp + ": " + Collections.frequency(valueList, temp)+",");
                    customerPointList.add(temp);
                    customerValueList.add(Collections.frequency(valueList, temp));


                }
                saveCustomerDiscretePoint(key,customerValueList,customerPointList);
//                System.out.println();
            }else{
//                System.out.println(key);
                saveCustomerContinuousPoint(key,valueList);
            }

            if("loan_amount_none".equals(key) || "loan_amount_abided".equals(key) || "loan_amount_broken".equals(key)){
                System.out.println("should save loan_amout avg!");
                System.out.println("list:"+valueList);
                Double total = 0.0;
                for(int i=0;i<valueList.size();i++){
                    total = total + Double.parseDouble(valueList.get(i)+"");
                }
                Double avg = total/valueList.size();
                System.out.println(key+" :ave: "+avg);

                SingletonSave ss = SingletonSave.getInstance();
                Map avgMap = ss.getAvgMap();

                avgMap.put(key,avg);

            }

        }

    }


}