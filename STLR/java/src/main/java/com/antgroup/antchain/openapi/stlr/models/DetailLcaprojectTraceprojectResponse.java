// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class DetailLcaprojectTraceprojectResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 原材料运输排放量
    @NameInMap("transport_emission_amount")
    public String transportEmissionAmount;

    // 碳足迹总排放量
    @NameInMap("emission_amount")
    public String emissionAmount;

    // 废弃物运输排放量
    @NameInMap("waste_transport_emission_amount")
    public String wasteTransportEmissionAmount;

    // 碳足迹排放单位
    @NameInMap("emission_unit")
    public String emissionUnit;

    // 废弃物处置排放量
    @NameInMap("waste_disposal_emission_amount")
    public String wasteDisposalEmissionAmount;

    // 原材料制造排放量
    @NameInMap("manufacture_emission_amount")
    public String manufactureEmissionAmount;

    // 能耗使用排放量
    @NameInMap("energy_emission_amount")
    public String energyEmissionAmount;

    // 环境排放排放量
    @NameInMap("environment_emission_amount")
    public String environmentEmissionAmount;

    public static DetailLcaprojectTraceprojectResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailLcaprojectTraceprojectResponse self = new DetailLcaprojectTraceprojectResponse();
        return TeaModel.build(map, self);
    }

    public DetailLcaprojectTraceprojectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailLcaprojectTraceprojectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailLcaprojectTraceprojectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailLcaprojectTraceprojectResponse setTransportEmissionAmount(String transportEmissionAmount) {
        this.transportEmissionAmount = transportEmissionAmount;
        return this;
    }
    public String getTransportEmissionAmount() {
        return this.transportEmissionAmount;
    }

    public DetailLcaprojectTraceprojectResponse setEmissionAmount(String emissionAmount) {
        this.emissionAmount = emissionAmount;
        return this;
    }
    public String getEmissionAmount() {
        return this.emissionAmount;
    }

    public DetailLcaprojectTraceprojectResponse setWasteTransportEmissionAmount(String wasteTransportEmissionAmount) {
        this.wasteTransportEmissionAmount = wasteTransportEmissionAmount;
        return this;
    }
    public String getWasteTransportEmissionAmount() {
        return this.wasteTransportEmissionAmount;
    }

    public DetailLcaprojectTraceprojectResponse setEmissionUnit(String emissionUnit) {
        this.emissionUnit = emissionUnit;
        return this;
    }
    public String getEmissionUnit() {
        return this.emissionUnit;
    }

    public DetailLcaprojectTraceprojectResponse setWasteDisposalEmissionAmount(String wasteDisposalEmissionAmount) {
        this.wasteDisposalEmissionAmount = wasteDisposalEmissionAmount;
        return this;
    }
    public String getWasteDisposalEmissionAmount() {
        return this.wasteDisposalEmissionAmount;
    }

    public DetailLcaprojectTraceprojectResponse setManufactureEmissionAmount(String manufactureEmissionAmount) {
        this.manufactureEmissionAmount = manufactureEmissionAmount;
        return this;
    }
    public String getManufactureEmissionAmount() {
        return this.manufactureEmissionAmount;
    }

    public DetailLcaprojectTraceprojectResponse setEnergyEmissionAmount(String energyEmissionAmount) {
        this.energyEmissionAmount = energyEmissionAmount;
        return this;
    }
    public String getEnergyEmissionAmount() {
        return this.energyEmissionAmount;
    }

    public DetailLcaprojectTraceprojectResponse setEnvironmentEmissionAmount(String environmentEmissionAmount) {
        this.environmentEmissionAmount = environmentEmissionAmount;
        return this;
    }
    public String getEnvironmentEmissionAmount() {
        return this.environmentEmissionAmount;
    }

}
