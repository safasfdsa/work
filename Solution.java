package run;

import bean.BookLost;
import bean.CardLost;
import bean.Lost;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {
    //定义存储失物的容器，最多存储100个失物
    public static final Lost[] lostArray = new Lost[100];
    private static final Scanner SYS_SC = new Scanner(System.in);
    public static int Number = 0;
    public static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
    //测试方法:用静态代码块提前存入失物对象信息
    static {
        CardLost c1 = new CardLost();
        c1.setName("张三");
        c1.setSex('男');
        c1.setStudentId("2021212164");
        c1.setMajor("计算机科学与技术");
        c1.setLostLocation("2号教学楼");
        c1.setNowLocation("2教失物招领中心");
        c1.setLostDate("2022年9月14日 11:11:11");
        lostArray[Number++] = c1;

        CardLost c2 = new CardLost();
        c2.setName("李四");
        c2.setSex('男');
        c2.setStudentId("2021212165");
        c2.setMajor("人工智能");
        c2.setLostLocation("4号教学楼");
        c2.setNowLocation("4教失物招领中心");
        c2.setLostDate("2022年6月20日 10:10:10");
        lostArray[Number++] = c2;

        BookLost b1 = new BookLost("2022年6月29日 11:11:11","老图书馆","老图失物招领处","《第一行代码Java》");
        lostArray[Number++] = b1;

        BookLost b2 = new BookLost("2022年7月1日 12:12:12","数字图书馆","数图失物招领处","《疯狂Java讲义》");
        lostArray[Number++] = b2;
    }

    public static void main(String[] args) throws Exception {
        sortLost(lostArray);
        String keyword = SYS_SC.next();
        System.out.println(findByKeyword(lostArray,keyword));
    }
    /**
     * 失物排序方法:冒泡排序  晚的在前
     * @param lostArray 待排序的失物数组
     */
    public static void sortLost(Lost[] lostArray) throws Exception {
        if (lostArray == null || Number < 2){
            return;
        }
        for (int i = Number - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (compare(lostArray[j],lostArray[j+1]));{   //后者时间比前者晚，交换
                    swap(lostArray,j,j+1);
                }
            }
        }
    }

    private static void swap(Lost[] lostArray, int j, int i) {
        Lost swap = lostArray[i];
        lostArray[i] = lostArray[j];
        lostArray[j] = swap;
    }


    /**
     * 将对象的时间解析
     * @param l1
     * @param l2
     * @return
     * @throws ParseException
     */
    public static boolean compare(Lost l1,Lost l2) throws Exception {
        Date d1 = sdf.parse(l1.getLostDate());
        System.out.println(d1);
        long time1 = d1.getTime();
        System.out.println(time1);
        Date d2 = sdf.parse(l2.getLostDate());
        long time2 = d2.getTime();
        System.out.println(time2);
        if (time1 < time2){
            return true;
        }
        return false;
    }
    public static Lost findByKeyword(Lost[] lostArray,String keyword){
        for (int i = 0; i < Number; i++) {
            if (lostArray[i].getName().contains(keyword)){
                return lostArray[i];
            }
        }
        return null;
    }
}
