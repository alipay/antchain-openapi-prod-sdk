// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sp.models;

import com.aliyun.tea.*;

public class CreateSpProductLogicinstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_access_code")
    public String productAccessCode;

    // 主产品实例唯一id
    @NameInMap("product_instance_unique_id")
    @Validation(required = true)
    public String productInstanceUniqueId;

    // 逻辑实例唯一id
    @NameInMap("unique_id")
    @Validation(required = true)
    public String uniqueId;

    // 幂等号
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    // 账号Id
    @NameInMap("provider_id")
    @Validation(required = true)
    public String providerId;

    // ACTIVE
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 逻辑实例描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 扩展属性
    @NameInMap("properties")
    @Validation(required = true)
    public String properties;

    public static CreateSpProductLogicinstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSpProductLogicinstanceRequest self = new CreateSpProductLogicinstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateSpProductLogicinstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSpProductLogicinstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSpProductLogicinstanceRequest setProductAccessCode(String productAccessCode) {
        this.productAccessCode = productAccessCode;
        return this;
    }
    public String getProductAccessCode() {
        return this.productAccessCode;
    }

    public CreateSpProductLogicinstanceRequest setProductInstanceUniqueId(String productInstanceUniqueId) {
        this.productInstanceUniqueId = productInstanceUniqueId;
        return this;
    }
    public String getProductInstanceUniqueId() {
        return this.productInstanceUniqueId;
    }

    public CreateSpProductLogicinstanceRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public CreateSpProductLogicinstanceRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public CreateSpProductLogicinstanceRequest setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public CreateSpProductLogicinstanceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateSpProductLogicinstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSpProductLogicinstanceRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}
