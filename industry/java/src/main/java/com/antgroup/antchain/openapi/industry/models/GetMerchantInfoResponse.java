// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class GetMerchantInfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // source, 由中台为业务方分配, 标识业务来源
    @NameInMap("source")
    public String source;

    // 商户支付宝uid
    @NameInMap("merchant_user_id")
    public String merchantUserId;

    // 行业商户租户名称
    @NameInMap("merchant_tenant_name")
    public String merchantTenantName;

    // 二级商户id, smid, 进件成功才有
    @NameInMap("smid")
    public String smid;

    public static GetMerchantInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMerchantInfoResponse self = new GetMerchantInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetMerchantInfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetMerchantInfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMerchantInfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetMerchantInfoResponse setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetMerchantInfoResponse setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public GetMerchantInfoResponse setMerchantTenantName(String merchantTenantName) {
        this.merchantTenantName = merchantTenantName;
        return this;
    }
    public String getMerchantTenantName() {
        return this.merchantTenantName;
    }

    public GetMerchantInfoResponse setSmid(String smid) {
        this.smid = smid;
        return this;
    }
    public String getSmid() {
        return this.smid;
    }

}
