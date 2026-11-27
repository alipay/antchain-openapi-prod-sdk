// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QuerySilentauthCaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 企业统一社会信用代码
    @NameInMap("merchant_id")
    public String merchantId;

    // 企业名称
    @NameInMap("merchant_name")
    public String merchantName;

    // CA证书有效期开始时间
    @NameInMap("cert_start_time")
    public String certStartTime;

    // CA证书有效期结束时间
    @NameInMap("cert_end_time")
    public String certEndTime;

    // 证书等级：BASIC 基础级、ADVANCED 高等级
    @NameInMap("cert_level")
    public String certLevel;

    public static QuerySilentauthCaResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySilentauthCaResponse self = new QuerySilentauthCaResponse();
        return TeaModel.build(map, self);
    }

    public QuerySilentauthCaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySilentauthCaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySilentauthCaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySilentauthCaResponse setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QuerySilentauthCaResponse setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public QuerySilentauthCaResponse setCertStartTime(String certStartTime) {
        this.certStartTime = certStartTime;
        return this;
    }
    public String getCertStartTime() {
        return this.certStartTime;
    }

    public QuerySilentauthCaResponse setCertEndTime(String certEndTime) {
        this.certEndTime = certEndTime;
        return this;
    }
    public String getCertEndTime() {
        return this.certEndTime;
    }

    public QuerySilentauthCaResponse setCertLevel(String certLevel) {
        this.certLevel = certLevel;
        return this;
    }
    public String getCertLevel() {
        return this.certLevel;
    }

}
