// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class GetMarketingInsureurlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求 id
    @NameInMap("request_id")
    public String requestId;

    // 一级渠道编码
    @NameInMap("first_channel")
    public String firstChannel;

    // 二级渠道编码
    @NameInMap("second_channel")
    public String secondChannel;

    // 三级渠道/广告版位
    @NameInMap("advertising_position")
    public String advertisingPosition;

    // 订单号
    @NameInMap("scene_order_no")
    public String sceneOrderNo;

    // 特征编码
    @NameInMap("click_id")
    public String clickId;

    // 投保页面URL
    @NameInMap("insure_url")
    public String insureUrl;

    public static GetMarketingInsureurlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMarketingInsureurlResponse self = new GetMarketingInsureurlResponse();
        return TeaModel.build(map, self);
    }

    public GetMarketingInsureurlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetMarketingInsureurlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMarketingInsureurlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetMarketingInsureurlResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMarketingInsureurlResponse setFirstChannel(String firstChannel) {
        this.firstChannel = firstChannel;
        return this;
    }
    public String getFirstChannel() {
        return this.firstChannel;
    }

    public GetMarketingInsureurlResponse setSecondChannel(String secondChannel) {
        this.secondChannel = secondChannel;
        return this;
    }
    public String getSecondChannel() {
        return this.secondChannel;
    }

    public GetMarketingInsureurlResponse setAdvertisingPosition(String advertisingPosition) {
        this.advertisingPosition = advertisingPosition;
        return this;
    }
    public String getAdvertisingPosition() {
        return this.advertisingPosition;
    }

    public GetMarketingInsureurlResponse setSceneOrderNo(String sceneOrderNo) {
        this.sceneOrderNo = sceneOrderNo;
        return this;
    }
    public String getSceneOrderNo() {
        return this.sceneOrderNo;
    }

    public GetMarketingInsureurlResponse setClickId(String clickId) {
        this.clickId = clickId;
        return this;
    }
    public String getClickId() {
        return this.clickId;
    }

    public GetMarketingInsureurlResponse setInsureUrl(String insureUrl) {
        this.insureUrl = insureUrl;
        return this;
    }
    public String getInsureUrl() {
        return this.insureUrl;
    }

}
