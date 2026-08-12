// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class CreateAntcloudAcmAntchainTenantResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 租户id
    @NameInMap("tenant_id")
    public String tenantId;

    // 客户id
    @NameInMap("customer_id")
    public String customerId;

    public static CreateAntcloudAcmAntchainTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAntcloudAcmAntchainTenantResponse self = new CreateAntcloudAcmAntchainTenantResponse();
        return TeaModel.build(map, self);
    }

    public CreateAntcloudAcmAntchainTenantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateAntcloudAcmAntchainTenantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAntcloudAcmAntchainTenantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateAntcloudAcmAntchainTenantResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateAntcloudAcmAntchainTenantResponse setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

}
