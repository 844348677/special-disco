package com.hdd.util;

/**
 * Created by liuh on 2016/2/23.
 */
public class DataDictionariesUtil {

    public static String loanPurpose(String value){
        String zajValue = "";
        if(value !=null && !"".equals(value) && !"null".equals(value)) {
            Double doubleValue = Double.parseDouble(value);

            String zaj1 = "大额耐用消费品";
            String zaj2 = "房屋装修";
            String zaj3 = "购买原材料";
            String zaj4 = "购置机器设备";
            String zaj5 = "结婚";
            String zaj6 = "扩大经营场所";
            String zaj7 = "流动资金周转";
            String zaj8 = "其它";
            String zaj9 = "项目开发";
            String zaj10 = "自主创业";
            //System.out.println(doubleValue.intValue());
            switch (doubleValue.intValue()) {
                case 1:
                    zajValue = zaj1;
                    break;
                case 2:
                    zajValue = zaj2;
                    break;
                case 3:
                    zajValue = zaj3;
                    break;
                case 4:
                    zajValue = zaj4;
                    break;
                case 5:
                    zajValue = zaj5;
                    break;
                case 6:
                    zajValue = zaj6;
                    break;
                case 7:
                    zajValue = zaj7;
                    break;
                case 8:
                    zajValue = zaj8;
                    break;
                case 9:
                    zajValue = zaj9;
                    break;
                case 10:
                    zajValue = zaj10;
                    break;
                default:
                    zajValue = null;
            }
            //System.out.println(zajValue);
        }
        return zajValue;
    }

    public static String maritalStatus(String value){
        String resultValue = "";
        if(value !=null && !"".equals(value) && !"null".equals(value)) {
            Double doubleValue = Double.parseDouble(value);

            String string1 = "分居";
            String string2 = "离婚";
            String string3 = "其它";
            String string4 = "丧偶";
            String string5 = "未婚";
            String string6 = "已婚";

            //System.out.println(doubleValue.intValue());
            switch (doubleValue.intValue()) {
                case 1:
                    resultValue = string1;
                    break;
                case 2:
                    resultValue = string2;
                    break;
                case 3:
                    resultValue = string3;
                    break;
                case 4:
                    resultValue = string4;
                    break;
                case 5:
                    resultValue = string5;
                    break;
                case 6:
                    resultValue = string6;
                    break;
                default:
                    resultValue = null;
            }
            //System.out.println(zajValue);
        }
        return resultValue;
    }

    public static String education(String value){
        String resultValue = "";
        if(value !=null && !"".equals(value) && !"null".equals(value)) {
            Double doubleValue = Double.parseDouble(value);
            String string1 = "本科或以上";
            String string2 = "初中或以下";
            String string3 = "大专";
            String string4 = "高中或中专";


            //System.out.println(doubleValue.intValue());
            switch (doubleValue.intValue()) {
                case 1:
                    resultValue = string1;
                    break;
                case 2:
                    resultValue = string2;
                    break;
                case 3:
                    resultValue = string3;
                    break;
                case 4:
                    resultValue = string4;
                    break;

                default:
                    resultValue = null;
            }
            //System.out.println(zajValue);
        }
        return resultValue;
    }
    public static String chInSZ(String value){
        String resultValue = "";
        if(value !=null && !"".equals(value) && !"null".equals(value)) {
            Double doubleValue = Double.parseDouble(value);

            String string1 = "否";
            String string2 = "是";

            //System.out.println(doubleValue.intValue());
            switch (doubleValue.intValue()) {
                case 1:
                    resultValue = string1;
                    break;
                case 2:
                    resultValue = string2;
                    break;

                default:
                    resultValue = null;
            }
            //System.out.println(zajValue);
        }
        return resultValue;
    }

    public static String incomeType(String value){
        String resultValue = "";
        if(value !=null && !"".equals(value) && !"null".equals(value)) {
            Double doubleValue = Double.parseDouble(value);

            String string1 = "部分代发";
            String string2 = "现金";
            String string3 = "银行代发";


            //System.out.println(doubleValue.intValue());
            switch (doubleValue.intValue()) {
                case 1:
                    resultValue = string1;
                    break;
                case 2:
                    resultValue = string2;
                    break;
                case 3:
                    resultValue = string3;
                    break;


                default:
                    resultValue = null;
            }
            //System.out.println(zajValue);
        }
        return resultValue;
    }

    public static String houseType(String value){
        String resultValue = "";
        if(value !=null && !"".equals(value) && !"null".equals(value)) {
            Double doubleValue = Double.parseDouble(value);

            String string1 = "家族拥有";
            String string2 = "朋友拥有";
            String string3 = "宿舍";
            String string4 = "自购";
            String string5 = "租用";


            //System.out.println(doubleValue.intValue());
            switch (doubleValue.intValue()) {
                case 1:
                    resultValue = string1;
                    break;
                case 2:
                    resultValue = string2;
                    break;
                case 3:
                    resultValue = string3;
                    break;
                case 4:
                    resultValue = string4;
                    break;
                case 5:
                    resultValue = string5;
                    break;

                default:
                    resultValue = null;
            }
            //System.out.println(zajValue);
        }
        return resultValue;
    }

    public static String manageOwnType(String value){
        String resultValue = "";
        if(value !=null && !"".equals(value) && !"null".equals(value)) {
            Double doubleValue = Double.parseDouble(value);

            String string1 = "OWN";
            String string2 = "RENT";



            //System.out.println(doubleValue.intValue());
            switch (doubleValue.intValue()) {
                case 1:
                    resultValue = string1;
                    break;
                case 2:
                    resultValue = string2;
                    break;

                default:
                    resultValue = null;
            }
            //System.out.println(zajValue);
        }
        return resultValue;
    }
    public static String maritalStatus2(String value){
        String resultValue = "";
        if(value !=null && !"".equals(value) && !"null".equals(value)) {
            Double doubleValue = Double.parseDouble(value);

            String string1 = "离婚";
            String string2 = "丧偶";
            String string3 = "未婚";
            String string4 = "已婚";

            //System.out.println(doubleValue.intValue());
            switch (doubleValue.intValue()) {
                case 1:
                    resultValue = string1;
                    break;
                case 2:
                    resultValue = string2;
                    break;
                case 3:
                    resultValue = string3;
                    break;
                case 4:
                    resultValue = string4;
                    break;

                default:
                    resultValue = null;
            }
            //System.out.println(zajValue);
        }
        return resultValue;
    }


    public static String education2(String value){
        String resultValue = "";
        if(value !=null && !"".equals(value) && !"null".equals(value)) {
            Double doubleValue = Double.parseDouble(value);

            String string1 = "初中";
            String string2 = "大学本科（简称\"大学\"）";
            String string3 = "大学专科和专科学校（简称\"大专\"）";
            String string4 = "高中";
            String string5 = "技术学校";
            String string6 = "文盲或半文盲";
            String string7 = "小学";
            String string8 = "研究生";
            String string9 = "中等专业学校或中等技术学校";

            //System.out.println(doubleValue.intValue());
            switch (doubleValue.intValue()) {
                case 1:
                    resultValue = string1;
                    break;
                case 2:
                    resultValue = string2;
                    break;
                case 3:
                    resultValue = string3;
                    break;
                case 4:
                    resultValue = string4;
                    break;
                case 5:
                    resultValue = string5;
                    break;
                case 6:
                    resultValue = string6;
                    break;
                case 7:
                    resultValue = string7;
                    break;
                case 8:
                    resultValue = string8;
                    break;
                case 9:
                    resultValue = string9;
                    break;

                default:
                    resultValue = null;
            }
            //System.out.println(zajValue);
        }
        return resultValue;
    }

    public static String degree(String value){
        String resultValue = "";
        if(value !=null && !"".equals(value) && !"null".equals(value)) {
            Double doubleValue = Double.parseDouble(value);

            String string1 = "博士";
            String string2 = "名誉博士";
            String string3 = "其他";
            String string4 = "硕士";
            String string5 = "学士";


            //System.out.println(doubleValue.intValue());
            switch (doubleValue.intValue()) {
                case 1:
                    resultValue = string1;
                    break;
                case 2:
                    resultValue = string2;
                    break;
                case 3:
                    resultValue = string3;
                    break;
                case 4:
                    resultValue = string4;
                    break;
                case 5:
                    resultValue = string5;
                    break;

                default:
                    resultValue = null;
            }
            //System.out.println(zajValue);
        }
        return resultValue;
    }

    public static String houseFundStatus(String value){
        String resultValue = "";
        if(value !=null && !"".equals(value) && !"null".equals(value)) {
            Double doubleValue = Double.parseDouble(value);

            String string1 = "封存";
            String string2 = "缴交";
            String string3 = "销户";
            String string4 = "硕士";
            String string5 = "学士";


            //System.out.println(doubleValue.intValue());
            switch (doubleValue.intValue()) {
                case 1:
                    resultValue = string1;
                    break;
                case 2:
                    resultValue = string2;
                    break;
                case 3:
                    resultValue = string3;
                    break;
                case 4:
                    resultValue = string4;
                    break;
                case 5:
                    resultValue = string5;
                    break;

                default:
                    resultValue = null;
            }
            //System.out.println(zajValue);
        }
        return resultValue;
    }

    public static String pensionInsStatus(String value){
        String resultValue = "";
        if(value !=null && !"".equals(value) && !"null".equals(value)) {
            Double doubleValue = Double.parseDouble(value);

            String string1 = "参保缴费";
            String string2 = "暂停缴费(中断)";



            //System.out.println(doubleValue.intValue());
            switch (doubleValue.intValue()) {
                case 1:
                    resultValue = string1;
                    break;
                case 2:
                    resultValue = string2;
                    break;

                default:
                    resultValue = null;
            }
            //System.out.println(zajValue);
        }
        return resultValue;
    }

    public static String pensionInsStopReason(String value){
        String resultValue = "";
        if(value !=null && !"".equals(value) && !"null".equals(value)) {
            Double doubleValue = Double.parseDouble(value);

            String string1 = "其他原因中断缴费";
            String string2 = "在职人员解除劳动合同";


            //System.out.println(doubleValue.intValue());
            switch (doubleValue.intValue()) {
                case 1:
                    resultValue = string1;
                    break;
                case 2:
                    resultValue = string2;
                    break;

                default:
                    resultValue = null;
            }
            //System.out.println(zajValue);
        }
        return resultValue;
    }
    public static String indhighrflag(String value){
        String resultValue = "";
        if(value !=null && !"".equals(value) && !"null".equals(value)) {
            Double doubleValue = Double.parseDouble(value);

            String string1 = "否";
            String string2 = "是";

            //System.out.println(doubleValue.intValue());
            switch (doubleValue.intValue()) {
                case 1:
                    resultValue = string1;
                    break;
                case 2:
                    resultValue = string2;
                    break;

                default:
                    resultValue = null;
            }
            //System.out.println(zajValue);
        }
        return resultValue;
    }

    public static String conflag(String value){
        String resultValue = "";
        if(value !=null && !"".equals(value) && !"null".equals(value)) {
            Double doubleValue = Double.parseDouble(value);

            String string1 = "否";
            String string2 = "是";

            //System.out.println(doubleValue.intValue());
            switch (doubleValue.intValue()) {
                case 1:
                    resultValue = string1;
                    break;
                case 2:
                    resultValue = string2;
                    break;

                default:
                    resultValue = null;
            }
            //System.out.println(zajValue);
        }
        return resultValue;
    }

    public static String autotype(String value){
        String resultValue = "";
        if(value !=null && !"".equals(value) && !"null".equals(value)) {
            Double doubleValue = Double.parseDouble(value);

            String string1 = "按揭购买";
            String string2 = "一次性支付";

            //System.out.println(doubleValue.intValue());
            switch (doubleValue.intValue()) {
                case 1:
                    resultValue = string1;
                    break;
                case 2:
                    resultValue = string2;
                    break;

                default:
                    resultValue = null;
            }
            //System.out.println(zajValue);
        }
        return resultValue;
    }

}
