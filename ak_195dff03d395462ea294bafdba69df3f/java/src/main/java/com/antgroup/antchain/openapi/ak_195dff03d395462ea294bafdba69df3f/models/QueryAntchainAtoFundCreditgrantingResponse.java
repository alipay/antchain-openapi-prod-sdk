// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoFundCreditgrantingResponse extends TeaModel {
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

    public static QueryAntchainAtoFundCreditgrantingResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoFundCreditgrantingResponse self = new QueryAntchainAtoFundCreditgrantingResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoFundCreditgrantingResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainAtoFundCreditgrantingResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainAtoFundCreditgrantingResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainAtoFundCreditgrantingResponse setGrantingId(String grantingId) {
        this.grantingId = grantingId;
        return this;
    }
    public String getGrantingId() {
        return this.grantingId;
    }

    public QueryAntchainAtoFundCreditgrantingResponse setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public QueryAntchainAtoFundCreditgrantingResponse setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public QueryAntchainAtoFundCreditgrantingResponse setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryAntchainAtoFundCreditgrantingResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAntchainAtoFundCreditgrantingResponse setGrantingLine(Long grantingLine) {
        this.grantingLine = grantingLine;
        return this;
    }
    public Long getGrantingLine() {
        return this.grantingLine;
    }

    public QueryAntchainAtoFundCreditgrantingResponse setEffectStartTime(String effectStartTime) {
        this.effectStartTime = effectStartTime;
        return this;
    }
    public String getEffectStartTime() {
        return this.effectStartTime;
    }

    public QueryAntchainAtoFundCreditgrantingResponse setEffectEndTime(String effectEndTime) {
        this.effectEndTime = effectEndTime;
        return this;
    }
    public String getEffectEndTime() {
        return this.effectEndTime;
    }

    public QueryAntchainAtoFundCreditgrantingResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAntchainAtoFundCreditgrantingResponse setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryAntchainAtoFundCreditgrantingResponse setCreditExtraData(String creditExtraData) {
        this.creditExtraData = creditExtraData;
        return this;
    }
    public String getCreditExtraData() {
        return this.creditExtraData;
    }

    public QueryAntchainAtoFundCreditgrantingResponse setCreditInfoList(java.util.List<String> creditInfoList) {
        this.creditInfoList = creditInfoList;
        return this;
    }
    public java.util.List<String> getCreditInfoList() {
        return this.creditInfoList;
    }

}
