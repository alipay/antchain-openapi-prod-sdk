// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class MonitoryAggregationVO extends TeaModel {
    // invoke_num
    @NameInMap("invoke_num")
    public java.util.List<MonitorData> invokeNum;

    // qps
    @NameInMap("qps")
    public java.util.List<MonitorData> qps;

    // rt
    @NameInMap("rt")
    public java.util.List<MonitorData> rt;

    // 错误码
    @NameInMap("err_code")
    public java.util.List<MonitorData> errCode;

    // 错误率
    @NameInMap("err_rate")
    public java.util.List<MonitorData> errRate;

    // byte_in
    @NameInMap("byte_in")
    public java.util.List<MonitorData> byteIn;

    // byte_out
    @NameInMap("byte_out")
    public java.util.List<MonitorData> byteOut;

    public static MonitoryAggregationVO build(java.util.Map<String, ?> map) throws Exception {
        MonitoryAggregationVO self = new MonitoryAggregationVO();
        return TeaModel.build(map, self);
    }

    public MonitoryAggregationVO setInvokeNum(java.util.List<MonitorData> invokeNum) {
        this.invokeNum = invokeNum;
        return this;
    }
    public java.util.List<MonitorData> getInvokeNum() {
        return this.invokeNum;
    }

    public MonitoryAggregationVO setQps(java.util.List<MonitorData> qps) {
        this.qps = qps;
        return this;
    }
    public java.util.List<MonitorData> getQps() {
        return this.qps;
    }

    public MonitoryAggregationVO setRt(java.util.List<MonitorData> rt) {
        this.rt = rt;
        return this;
    }
    public java.util.List<MonitorData> getRt() {
        return this.rt;
    }

    public MonitoryAggregationVO setErrCode(java.util.List<MonitorData> errCode) {
        this.errCode = errCode;
        return this;
    }
    public java.util.List<MonitorData> getErrCode() {
        return this.errCode;
    }

    public MonitoryAggregationVO setErrRate(java.util.List<MonitorData> errRate) {
        this.errRate = errRate;
        return this;
    }
    public java.util.List<MonitorData> getErrRate() {
        return this.errRate;
    }

    public MonitoryAggregationVO setByteIn(java.util.List<MonitorData> byteIn) {
        this.byteIn = byteIn;
        return this;
    }
    public java.util.List<MonitorData> getByteIn() {
        return this.byteIn;
    }

    public MonitoryAggregationVO setByteOut(java.util.List<MonitorData> byteOut) {
        this.byteOut = byteOut;
        return this;
    }
    public java.util.List<MonitorData> getByteOut() {
        return this.byteOut;
    }

}
