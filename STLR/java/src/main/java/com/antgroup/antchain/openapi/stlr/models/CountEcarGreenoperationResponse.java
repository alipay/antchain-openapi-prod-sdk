// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class CountEcarGreenoperationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 绿色行为产生的绿色能量总量
    @NameInMap("green_energy_total")
    public Long greenEnergyTotal;

    // 绿色能量单位，默认为g
    @NameInMap("green_energy_unit")
    public String greenEnergyUnit;

    // 绿色行为记录数据
    @NameInMap("green_operation_records")
    public Long greenOperationRecords;

    // 按频率统计的绿色行为数据列表
    @NameInMap("statistics_by_frequence_list")
    public java.util.List<GreenOperationStatisticsByFrequence> statisticsByFrequenceList;

    // 按绿色行为类型统计的绿色行为数据列表
    @NameInMap("statistics_by_type_list")
    public java.util.List<GreenOperationStatisticsByType> statisticsByTypeList;

    public static CountEcarGreenoperationResponse build(java.util.Map<String, ?> map) throws Exception {
        CountEcarGreenoperationResponse self = new CountEcarGreenoperationResponse();
        return TeaModel.build(map, self);
    }

    public CountEcarGreenoperationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CountEcarGreenoperationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CountEcarGreenoperationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CountEcarGreenoperationResponse setGreenEnergyTotal(Long greenEnergyTotal) {
        this.greenEnergyTotal = greenEnergyTotal;
        return this;
    }
    public Long getGreenEnergyTotal() {
        return this.greenEnergyTotal;
    }

    public CountEcarGreenoperationResponse setGreenEnergyUnit(String greenEnergyUnit) {
        this.greenEnergyUnit = greenEnergyUnit;
        return this;
    }
    public String getGreenEnergyUnit() {
        return this.greenEnergyUnit;
    }

    public CountEcarGreenoperationResponse setGreenOperationRecords(Long greenOperationRecords) {
        this.greenOperationRecords = greenOperationRecords;
        return this;
    }
    public Long getGreenOperationRecords() {
        return this.greenOperationRecords;
    }

    public CountEcarGreenoperationResponse setStatisticsByFrequenceList(java.util.List<GreenOperationStatisticsByFrequence> statisticsByFrequenceList) {
        this.statisticsByFrequenceList = statisticsByFrequenceList;
        return this;
    }
    public java.util.List<GreenOperationStatisticsByFrequence> getStatisticsByFrequenceList() {
        return this.statisticsByFrequenceList;
    }

    public CountEcarGreenoperationResponse setStatisticsByTypeList(java.util.List<GreenOperationStatisticsByType> statisticsByTypeList) {
        this.statisticsByTypeList = statisticsByTypeList;
        return this;
    }
    public java.util.List<GreenOperationStatisticsByType> getStatisticsByTypeList() {
        return this.statisticsByTypeList;
    }

}
