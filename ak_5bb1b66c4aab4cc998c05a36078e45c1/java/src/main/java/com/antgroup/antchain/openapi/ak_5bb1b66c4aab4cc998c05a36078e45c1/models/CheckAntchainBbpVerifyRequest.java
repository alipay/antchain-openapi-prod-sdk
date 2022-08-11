// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5bb1b66c4aab4cc998c05a36078e45c1.models;

import com.aliyun.tea.*;

public class CheckAntchainBbpVerifyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 核身上下文id
    @NameInMap("verify_id")
    @Validation(required = true)
    public String verifyId;

    // 核身模块分组
    @NameInMap("group")
    @Validation(required = true)
    public String group;

    // 核身动作：view-渲染，verify-校验，repeat-重新发送
    @NameInMap("product_action")
    @Validation(required = true)
    public String productAction;

    // 业务id
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 核身产品码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    public static CheckAntchainBbpVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAntchainBbpVerifyRequest self = new CheckAntchainBbpVerifyRequest();
        return TeaModel.build(map, self);
    }

    public CheckAntchainBbpVerifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckAntchainBbpVerifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckAntchainBbpVerifyRequest setVerifyId(String verifyId) {
        this.verifyId = verifyId;
        return this;
    }
    public String getVerifyId() {
        return this.verifyId;
    }

    public CheckAntchainBbpVerifyRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public CheckAntchainBbpVerifyRequest setProductAction(String productAction) {
        this.productAction = productAction;
        return this;
    }
    public String getProductAction() {
        return this.productAction;
    }

    public CheckAntchainBbpVerifyRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CheckAntchainBbpVerifyRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
