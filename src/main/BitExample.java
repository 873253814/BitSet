package main;

public class BitExample {
    public static int getTimes(int result){
        int times = 0;
        int tempResult = result >> 1;
        while((tempResult & 1) == 1){
            times++;
            tempResult = tempResult >> 2;
        }
        return times;
    }


    public static int win(int result){
        int times = getTimes(result);
        int offset = times * 2;
        int win = 3 << offset;
        result = result + win;
        return result;
    }

    public static int lose(int result){
        int times = getTimes(result);
        int offset = times * 2;
        int lose = 2 << offset;
        result  = result + lose;
        return result;
    }

    public static int winTimes(int result){
        int winTimes = 0;
        while ((result & 1)==1){
            winTimes++;
            result = result >> 2;
        }
        return winTimes;
    }
}
