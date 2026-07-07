// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class AddEcarOffsetacquisitionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 活动数据采集单号
    @NameInMap("acquisition_item_no")
    public String acquisitionItemNo;

    // 减碳量，最多4位小数
    @NameInMap("carbon_emission_amount")
    public String carbonEmissionAmount;

    public static AddEcarOffsetacquisitionResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEcarOffsetacquisitionResponse self = new AddEcarOffsetacquisitionResponse();
        return TeaModel.build(map, self);
    }

    public AddEcarOffsetacquisitionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AddEcarOffsetacquisitionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddEcarOffsetacquisitionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AddEcarOffsetacquisitionResponse setAcquisitionItemNo(String acquisitionItemNo) {
        this.acquisitionItemNo = acquisitionItemNo;
        return this;
    }
    public String getAcquisitionItemNo() {
        return this.acquisitionItemNo;
    }

    public AddEcarOffsetacquisitionResponse setCarbonEmissionAmount(String carbonEmissionAmount) {
        this.carbonEmissionAmount = carbonEmissionAmount;
        return this;
    }
    public String getCarbonEmissionAmount() {
        return this.carbonEmissionAmount;
    }

}
