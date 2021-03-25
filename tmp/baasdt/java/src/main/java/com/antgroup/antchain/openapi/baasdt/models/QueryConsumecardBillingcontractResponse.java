// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryConsumecardBillingcontractResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 基础响应对象
    @NameInMap("base_response")
    public BaseResponseData baseResponse;

    // 商家名称
    @NameInMap("name")
    public String name;

    // 商家链上账户ID
    @NameInMap("account_id")
    public String accountId;

    // 认证平台ID 例如：支付宝用户ID
    @NameInMap("certification_id")
    public String certificationId;

    // 场景码(需要申请)
    @NameInMap("product_code")
    public String productCode;

    // 签约时间
    @NameInMap("sign_time")
    public String signTime;

    // 解约时间
    @NameInMap("invalid_time")
    public String invalidTime;

    // 签约链接
    @NameInMap("arrangement_url")
    public String arrangementUrl;

    // 签约状态
    @NameInMap("status")
    public Long status;

    public static QueryConsumecardBillingcontractResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumecardBillingcontractResponse self = new QueryConsumecardBillingcontractResponse();
        return TeaModel.build(map, self);
    }

    public QueryConsumecardBillingcontractResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryConsumecardBillingcontractResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryConsumecardBillingcontractResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryConsumecardBillingcontractResponse setBaseResponse(BaseResponseData baseResponse) {
        this.baseResponse = baseResponse;
        return this;
    }
    public BaseResponseData getBaseResponse() {
        return this.baseResponse;
    }

    public QueryConsumecardBillingcontractResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryConsumecardBillingcontractResponse setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public QueryConsumecardBillingcontractResponse setCertificationId(String certificationId) {
        this.certificationId = certificationId;
        return this;
    }
    public String getCertificationId() {
        return this.certificationId;
    }

    public QueryConsumecardBillingcontractResponse setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryConsumecardBillingcontractResponse setSignTime(String signTime) {
        this.signTime = signTime;
        return this;
    }
    public String getSignTime() {
        return this.signTime;
    }

    public QueryConsumecardBillingcontractResponse setInvalidTime(String invalidTime) {
        this.invalidTime = invalidTime;
        return this;
    }
    public String getInvalidTime() {
        return this.invalidTime;
    }

    public QueryConsumecardBillingcontractResponse setArrangementUrl(String arrangementUrl) {
        this.arrangementUrl = arrangementUrl;
        return this;
    }
    public String getArrangementUrl() {
        return this.arrangementUrl;
    }

    public QueryConsumecardBillingcontractResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
