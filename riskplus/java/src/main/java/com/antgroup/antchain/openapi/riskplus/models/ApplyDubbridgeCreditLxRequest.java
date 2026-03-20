// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyDubbridgeCreditLxRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合作方代码
    @NameInMap("partner_code")
    @Validation(required = true)
    public String partnerCode;

    // 授信申请，json格式字符串
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    // 请求发送时间
    @NameInMap("timestamp")
    @Validation(required = true)
    public String timestamp;

    public static ApplyDubbridgeCreditLxRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDubbridgeCreditLxRequest self = new ApplyDubbridgeCreditLxRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDubbridgeCreditLxRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyDubbridgeCreditLxRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyDubbridgeCreditLxRequest setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }
    public String getPartnerCode() {
        return this.partnerCode;
    }

    public ApplyDubbridgeCreditLxRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public ApplyDubbridgeCreditLxRequest setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

}
