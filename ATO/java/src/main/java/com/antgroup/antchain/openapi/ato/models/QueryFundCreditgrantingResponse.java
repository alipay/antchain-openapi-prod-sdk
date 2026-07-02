// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryFundCreditgrantingResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授信id
    @NameInMap("granting_id")
    public String grantingId;

    // 授信授权id
    @NameInMap("auth_id")
    public String authId;

    // 资方社会信用代码
    @NameInMap("fund_id")
    public String fundId;

    // 商户社会信用代码
    @NameInMap("merchant_id")
    public String merchantId;

    // 商户租户id
    // 
    @NameInMap("tenant_id")
    public String tenantId;

    // 授信额度，单位为分
    @NameInMap("granting_line")
    public Long grantingLine;

    // 授信有效期开始时间(yyyy-MM-dd HH:mm:ss)
    @NameInMap("effect_start_time")
    public String effectStartTime;

    // 授信有效期结束时间(yyyy-MM-dd HH:mm:ss)
    @NameInMap("effect_end_time")
    public String effectEndTime;

    // 授信状态
    // CREDITED:已授信
    @NameInMap("status")
    public String status;

    // 授信业务
    @NameInMap("biz_type")
    public String bizType;

    // 授信额外数据
    @NameInMap("credit_extra_data")
    public String creditExtraData;

    // 相关文件列表
    @NameInMap("credit_info_list")
    public java.util.List<String> creditInfoList;

    public static QueryFundCreditgrantingResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFundCreditgrantingResponse self = new QueryFundCreditgrantingResponse();
        return TeaModel.build(map, self);
    }

    public QueryFundCreditgrantingResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryFundCreditgrantingResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryFundCreditgrantingResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryFundCreditgrantingResponse setGrantingId(String grantingId) {
        this.grantingId = grantingId;
        return this;
    }
    public String getGrantingId() {
        return this.grantingId;
    }

    public QueryFundCreditgrantingResponse setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public QueryFundCreditgrantingResponse setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public QueryFundCreditgrantingResponse setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryFundCreditgrantingResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryFundCreditgrantingResponse setGrantingLine(Long grantingLine) {
        this.grantingLine = grantingLine;
        return this;
    }
    public Long getGrantingLine() {
        return this.grantingLine;
    }

    public QueryFundCreditgrantingResponse setEffectStartTime(String effectStartTime) {
        this.effectStartTime = effectStartTime;
        return this;
    }
    public String getEffectStartTime() {
        return this.effectStartTime;
    }

    public QueryFundCreditgrantingResponse setEffectEndTime(String effectEndTime) {
        this.effectEndTime = effectEndTime;
        return this;
    }
    public String getEffectEndTime() {
        return this.effectEndTime;
    }

    public QueryFundCreditgrantingResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryFundCreditgrantingResponse setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryFundCreditgrantingResponse setCreditExtraData(String creditExtraData) {
        this.creditExtraData = creditExtraData;
        return this;
    }
    public String getCreditExtraData() {
        return this.creditExtraData;
    }

    public QueryFundCreditgrantingResponse setCreditInfoList(java.util.List<String> creditInfoList) {
        this.creditInfoList = creditInfoList;
        return this;
    }
    public java.util.List<String> getCreditInfoList() {
        return this.creditInfoList;
    }

}
