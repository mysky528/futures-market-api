package com.uma.model;

import javax.xml.crypto.Data;

/**
 * Created by zhaolu on 2018/3/6.
 */
public class Market {

    private String symbolCode; //品种代码

    private int cycle; //行情周期

    private String symbolName; //品种名称

    private double open; //开盘价

    private double high; //最高价

    private double yesterdayCP; //昨日收盘价

    private Data dtime;//报价时间

    private double low;//最低价

    private double close;//收盘价

    private double vol;//成交量


    public String getSymbolCode() {
        return symbolCode;
    }

    public void setSymbolCode(String symbolCode) {
        this.symbolCode = symbolCode;
    }

    public int getCycle() {
        return cycle;
    }

    public void setCycle(int cycle) {
        this.cycle = cycle;
    }

    public String getSymbolName() {
        return symbolName;
    }

    public void setSymbolName(String symbolName) {
        this.symbolName = symbolName;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getYesterdayCP() {
        return yesterdayCP;
    }

    public void setYesterdayCP(double yesterdayCP) {
        this.yesterdayCP = yesterdayCP;
    }

    public Data getDtime() {
        return dtime;
    }

    public void setDtime(Data dtime) {
        this.dtime = dtime;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public double getVol() {
        return vol;
    }

    public void setVol(double vol) {
        this.vol = vol;
    }
}
