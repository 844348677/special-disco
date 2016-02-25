package com.hdd.service.impl;

import com.hdd.Entity.Customers;
import com.hdd.Entity.Lgd;
import com.hdd.Entity.Risk;
import com.hdd.dao.CustomersDao;
import com.hdd.dao.LgdDao;
import com.hdd.dao.RiskDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;

/**
 * Created by liuhang on 2016/2/14.
 */
@Service("insertServiceBase")
public class InsertServiceImpl implements com.hdd.service.InsertService {
    @Autowired
    protected CustomersDao crd;
    @Autowired
    protected RiskDao riskDao;
    @Autowired
    protected LgdDao lgdDao;


    @Override
    public void saveCustomer(String customer) {

        //System.out.println("customerString:"+customer);

        try {

            Customers ct  =  createCustomer(customer);
            crd.insertCustomer(ct);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void saveRisk(String risk) {

        //System.out.println("customerString:"+customer);

        try {

            Risk rs  = createRisk(risk);
            riskDao.insertRisk(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    @Override
    public void saveLgd(String lgd) {

        //System.out.println("customerString:"+customer);

        try {

            Lgd lg  =  createLgd(lgd);
            lgdDao.insertLgd(lg);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private Risk createRisk(String risk) throws Exception{
        String a[] = split(risk,'|');
        Risk thirdpage = new Risk();
        thirdpage.setId(Integer.parseInt(a[0]));
        thirdpage.setApplid(a[1]);
        thirdpage.setA11(a[2]);
        thirdpage.setA12(a[3]);
        thirdpage.setA13(a[4]);
        thirdpage.setA14(a[5]);
        thirdpage.setA15(a[6]);
        thirdpage.setA16(a[7]);
        thirdpage.setA17(a[8]);
        thirdpage.setA18(a[9]);
        thirdpage.setA19(a[10]);

        thirdpage.setB11(a[11]);
        thirdpage.setB12(a[12]);
        thirdpage.setB13(a[13]);
        thirdpage.setB14(a[14]);
        thirdpage.setB15(a[15]);

        thirdpage.setB16(a[16]);
        thirdpage.setB17(a[17]);
        thirdpage.setB18(a[18]);
        thirdpage.setB19(a[19]);
        return thirdpage;
    }
    private Lgd createLgd(String lgd) throws Exception{
        String a[] = split(lgd,'|');
        Lgd idi = new Lgd();
        idi.setId(Integer.parseInt(a[0]));
        idi.setApplid(a[1]);
        idi.setAmout10000(a[2]);
        idi.setAmout20000(a[3]);
        idi.setAmout30000(a[4]);
        idi.setAmout40000(a[5]);
        idi.setAmout50000(a[6]);
        idi.setAmout60000(a[7]);
        idi.setAmout70000(a[8]);
        idi.setAmout80000(a[9]);
        idi.setAmout90000(a[10]);
        idi.setAmout100000(a[11]);
        idi.setAmout110000(a[12]);
        idi.setAmout120000(a[13]);
        idi.setAmout130000(a[14]);
        idi.setAmout140000(a[15]);
        idi.setAmout150000(a[16]);
        idi.setAmout160000(a[17]);
        idi.setAmout170000(a[18]);
        idi.setAmout180000(a[19]);
        idi.setAmout190000(a[20]);
        idi.setAmout200000(a[21]);
        idi.setAmout210000(a[22]);
        idi.setAmout220000(a[23]);
        idi.setAmout230000(a[24]);
        idi.setAmout240000(a[25]);
        idi.setAmout250000(a[26]);
        idi.setAmout260000(a[27]);
        idi.setAmout270000(a[28]);
        idi.setAmout280000(a[29]);
        idi.setAmout290000(a[30]);
        idi.setAmout300000(a[31]);
        idi.setAmout310000(a[32]);
        idi.setAmout320000(a[33]);
        idi.setAmout330000(a[34]);
        idi.setAmout340000(a[35]);
        idi.setAmout350000(a[36]);
        idi.setAmout360000(a[37]);
        idi.setAmout370000(a[38]);
        idi.setAmout380000(a[39]);
        idi.setAmout390000(a[40]);
        idi.setAmout400000(a[41]);
        idi.setAmout410000(a[42]);
        idi.setAmout420000(a[43]);
        idi.setAmout430000(a[44]);
        idi.setAmout440000(a[45]);
        idi.setAmout450000(a[46]);
        idi.setAmout460000(a[47]);
        idi.setAmout470000(a[48]);
        idi.setAmout480000(a[49]);
        idi.setAmout490000(a[50]);
        return idi;
    }

    /*    private String[] readLine(String line){
            String datas[] = line.split("|");
        }*/
    private Customers createCustomer(String customer) throws Exception {
        String a[] = split(customer,'|');
        Customers idi = new Customers();
        idi.setId(Integer.parseInt(a[0]));
        idi.setZaa(a[1]);
        idi.setZab(a[2]);
        if(!"null".equals(a[3])){
            idi.setZac(a[3]);
        }
        idi.setZad(a[4]);
        idi.setZae(a[5]);
        idi.setZaf(a[6]);
        idi.setZag(a[7]);
        idi.setZah(a[8]);
        idi.setZai(a[9]);
        idi.setZaj(a[10]);
        idi.setZak(a[11]);
        idi.setZal(a[12]);
        idi.setZam(a[13]);
        idi.setZan(a[14]);
        idi.setZao(a[15]);
        idi.setZap(a[16]);
        idi.setZaq(a[17]);
        idi.setZar(a[18]);
        idi.setZas(a[19]);
        idi.setZat(a[20]);
        idi.setZau(a[21]);
        idi.setZav(a[22]);
        idi.setZaw(a[23]);
        idi.setZax(a[24]);
        idi.setZay(a[25]);
        idi.setZaz(a[26]);
        idi.setZba(a[27]);
        idi.setZbb(a[28]);
        idi.setZbc(a[29]);
        idi.setZbd(a[30]);
        idi.setZbe(a[31]);
        idi.setZbf(a[32]);
        idi.setZbg(a[33]);
        idi.setZbh(a[34]);
        idi.setZbi(a[35]);
        idi.setZbj(a[36]);
        idi.setZbk(a[37]);
        idi.setZbl(a[38]);
        idi.setZbm(a[39]);
        idi.setZbn(a[40]);
        idi.setZbo(a[41]);
        idi.setZbp(a[42]);
        idi.setZbq(a[43]);
        idi.setZbr(a[44]);
        idi.setZbs(a[45]);
        idi.setZbt(a[46]);
        idi.setZbu(a[47]);
        idi.setZbv(a[48]);
        idi.setZbw(a[49]);
        idi.setZbx(a[50]);
        idi.setZby(a[51]);
        idi.setZbz(a[52]);
        idi.setZca(a[53]);
        idi.setZcb(a[54]);
        idi.setZcc(a[55]);
        idi.setZcd(a[56]);
        idi.setZce(a[57]);
        idi.setZcf(a[58]);
        idi.setZcg(a[59]);
        idi.setZch(a[60]);
        idi.setZci(a[61]);
        idi.setZcj(a[62]);
        idi.setZck(a[63]);
        idi.setZcl(a[64]);
        idi.setZcm(a[65]);
        idi.setZcn(a[66]);
        idi.setZco(a[67]);
        idi.setZcp(a[68]);
        idi.setZcq(a[69]);
        idi.setZcr(a[70]);
        idi.setZcs(a[71]);
        idi.setZct(a[72]);
        idi.setZcu(a[73]);
        idi.setZcv(a[74]);
        idi.setZcw(a[75]);
        idi.setZcx(a[76]);
        idi.setZcy(a[77]);
        idi.setZcz(a[78]);
        idi.setZda(a[79]);
        idi.setZdb(a[80]);
        idi.setZdc(a[81]);
        idi.setZdd(a[82]);
        idi.setZde(a[83]);
        idi.setZdf(a[84]);
        idi.setZdg(a[85]);
        idi.setZdh(a[86]);
        idi.setZdi(a[87]);
        idi.setZdj(a[88]);
        idi.setZdk(a[89]);
        idi.setZdl(a[90]);
        idi.setZdm(a[91]);
        idi.setZdn(a[92]);
        idi.setZdo(a[93]);
        idi.setZdp(a[94]);
        idi.setZdq(a[95]);
        idi.setZdr(a[96]);
        idi.setZds(a[97]);
        idi.setZdt(a[98]);
        idi.setZdu(a[99]);
        idi.setZdv(a[100]);
        idi.setZdw(a[101]);
        idi.setZdx(a[102]);
        idi.setZdy(a[103]);
        idi.setZdz(a[104]);
        idi.setZea(a[105]);
        idi.setZeb(a[106]);
        idi.setZec(a[107]);
        idi.setZed(a[108]);
        idi.setZee(a[109]);
        idi.setZef(a[110]);
        idi.setZeg(a[111]);
        idi.setZeh(a[112]);
        idi.setZei(a[113]);
        idi.setZej(a[114]);
        idi.setZek(a[115]);
        idi.setZel(a[116]);
        idi.setZem(a[117]);
        idi.setZen(a[118]);
        idi.setZeo(a[119]);
        if(!"null".equals(a[120])){
            idi.setAdviseloan(a[120]);
        }
        if(!"null".equals(a[121])){
            idi.setAdviseratio(a[121]);
        }
        if(!"null".equals(a[122])){
            idi.setBadratio(a[122]);
        }
        if(!"null".equals(a[123])){
            idi.setCreditgrade(a[123]);
        }

        return idi;
    }


    final static int Ready_For_Next = 0;
    final static int Reading_With_Quote = 1;
    final static int Reading_Without_Quote = 2;

    private static String[] split(String lineTxt, char sep) throws Exception {

        char[] cs = lineTxt.toCharArray();
        boolean inQuote = false;
        boolean bFirst = true;
        int from = 0;
        int to = 0;
        LinkedList<String> ret = new LinkedList<String>();
        int k = 0;
        int status = 0;
        while (k < cs.length) {
            char c = cs[k];
            switch (status) {
                case Ready_For_Next:
                    if (isQuoteChar(c)) {
                        status = Reading_With_Quote;
                        k++;
                        from = k;
                    } else if (c == sep) {
                        status = Ready_For_Next;
                        k++;
                        ret.add("");
                    } else {
                        status = Reading_Without_Quote;
                        from = k++;
                    }

                    break;

                case Reading_With_Quote:
                    if (isQuoteChar(c) && (k == cs.length - 1 || cs[k + 1] == sep)) {
                        to = k;
                        k = k + 2;
                        status = Ready_For_Next;
                        ret.add(lineTxt.substring(from, to).trim());
                    } else {
                        k++;
                    }

                    break;

                case Reading_Without_Quote:
                    if (c == sep) {
                        to = k++;
                        ret.add(lineTxt.substring(from, to).trim());
                        status = Ready_For_Next;
                    } else {
                        k++;
                    }
                    break;
            }
        }
        // fix the tail when ends up with seperator
        String lastField;
        if (status==Ready_For_Next)
            lastField = "";
        else if (status==Reading_With_Quote)
            if (isQuoteChar(cs[cs.length-1]))
                lastField = lineTxt.substring(from, cs.length-1);
            else
                throw new Exception("Reading with Quote, last char must be \"");
        else if (status==Reading_Without_Quote)
            lastField = lineTxt.substring(from);
        else
            throw new Exception("Unknown status "+status);
        ret.add(lastField);
        String[] arr = new String[ret.size()];
        ret.toArray(arr);
        return arr;
    }

    static final char quote = '\"';

    static boolean isQuoteChar(char c) {
        return c == quote;
    }
}
