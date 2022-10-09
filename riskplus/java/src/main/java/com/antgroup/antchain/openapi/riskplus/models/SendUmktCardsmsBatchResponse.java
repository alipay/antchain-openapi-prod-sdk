// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SendUmktCardsmsBatchResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 卡片短信回执id
    @NameInMap("biz_card_id")
    public String bizCardId;

    // 支持的手机号
    @NameInMap("media_mobiles")
    public String mediaMobiles;

    // 不支持的手机号
    @NameInMap("not_media_mobiles")
    public String notMediaMobiles;

    // 回落文本短信回执id
    @NameInMap("biz_id")
    public String bizId;

    // 回落数字短信回执id
    @NameInMap("biz_digital_id")
    public String bizDigitalId;

    public static SendUmktCardsmsBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        SendUmktCardsmsBatchResponse self = new SendUmktCardsmsBatchResponse();
        return TeaModel.build(map, self);
    }

    public SendUmktCardsmsBatchResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SendUmktCardsmsBatchResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SendUmktCardsmsBatchResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SendUmktCardsmsBatchResponse setBizCardId(String bizCardId) {
        this.bizCardId = bizCardId;
        return this;
    }
    public String getBizCardId() {
        return this.bizCardId;
    }

    public SendUmktCardsmsBatchResponse setMediaMobiles(String mediaMobiles) {
        this.mediaMobiles = mediaMobiles;
        return this;
    }
    public String getMediaMobiles() {
        return this.mediaMobiles;
    }

    public SendUmktCardsmsBatchResponse setNotMediaMobiles(String notMediaMobiles) {
        this.notMediaMobiles = notMediaMobiles;
        return this;
    }
    public String getNotMediaMobiles() {
        return this.notMediaMobiles;
    }

    public SendUmktCardsmsBatchResponse setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SendUmktCardsmsBatchResponse setBizDigitalId(String bizDigitalId) {
        this.bizDigitalId = bizDigitalId;
        return this;
    }
    public String getBizDigitalId() {
        return this.bizDigitalId;
    }

}
