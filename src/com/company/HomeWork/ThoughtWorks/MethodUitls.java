package com.company.HomeWork.ThoughtWorks;

public class MethodUitls {

    public static String deal(String[] inputInfo) {
        if (inputInfo.length < 4 || inputInfo.length > 5) {
            System.out.println("输入错误");
        } else if (inputInfo.length == 4) {
            //调用计算价格的方法，与在库数据比较，查看场馆是否被预定，给出反馈，若成功则预定信息入库
            String userName = inputInfo[0];
            String preDay = inputInfo[1];
            String preTime = inputInfo[2];
            String place = inputInfo[3];
//            Boolean preResultFlag = judgePreInfo(preDay, preTime, place);

        } else {
            //调用取消场馆的方法
            String userName = inputInfo[0];
            String preDay = inputInfo[1];
            String preTime = inputInfo[2];
            String place = inputInfo[3];
            String preFlag = inputInfo[4];
        }
        return null;
    }

    public static String formatOutPut(String result) {
        return null;
    }

    public static String calculateTotal() {
        return null;
    }


    //如果是测试题的类型，着重刷基础，面向对象相关基础知识，数据结构相关基础知识，如果是homework，是否可以查资料找援助
}
