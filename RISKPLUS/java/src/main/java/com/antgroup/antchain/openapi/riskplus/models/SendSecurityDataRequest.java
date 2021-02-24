// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SendSecurityDataRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 安全累计属性列表字段，安全属性列表
    @NameInMap("security_content")
    @Validation(required = true)
    public String securityContent;

    // 代码发送给安全核心的事件编码
    @NameInMap("security_sign")
    @Validation(required = true)
    public String securitySign;

    public static SendSecurityDataRequest build(java.util.Map<String, ?> map) throws Exception {
        SendSecurityDataRequest self = new SendSecurityDataRequest();
        return TeaModel.build(map, self);
    }

    public SendSecurityDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendSecurityDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendSecurityDataRequest setSecurityContent(String securityContent) {
        this.securityContent = securityContent;
        return this;
    }
    public String getSecurityContent() {
        return this.securityContent;
    }

    public SendSecurityDataRequest setSecuritySign(String securitySign) {
        this.securitySign = securitySign;
        return this;
    }
    public String getSecuritySign() {
        return this.securitySign;
    }

}
