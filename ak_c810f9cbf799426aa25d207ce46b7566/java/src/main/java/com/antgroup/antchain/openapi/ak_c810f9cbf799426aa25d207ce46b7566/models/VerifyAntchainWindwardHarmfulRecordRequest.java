// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_c810f9cbf799426aa25d207ce46b7566.models;

import com.aliyun.tea.*;

public class VerifyAntchainWindwardHarmfulRecordRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务请求体
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    // 实际计量租户
    @NameInMap("metering_effect_invoker")
    public String meteringEffectInvoker;

    public static VerifyAntchainWindwardHarmfulRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyAntchainWindwardHarmfulRecordRequest self = new VerifyAntchainWindwardHarmfulRecordRequest();
        return TeaModel.build(map, self);
    }

    public VerifyAntchainWindwardHarmfulRecordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyAntchainWindwardHarmfulRecordRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyAntchainWindwardHarmfulRecordRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public VerifyAntchainWindwardHarmfulRecordRequest setMeteringEffectInvoker(String meteringEffectInvoker) {
        this.meteringEffectInvoker = meteringEffectInvoker;
        return this;
    }
    public String getMeteringEffectInvoker() {
        return this.meteringEffectInvoker;
    }

}
