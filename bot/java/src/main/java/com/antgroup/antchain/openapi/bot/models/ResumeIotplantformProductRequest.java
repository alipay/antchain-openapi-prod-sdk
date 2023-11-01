// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ResumeIotplantformProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 8位租户ID	
    // 
    @NameInMap("biz_tenant")
    @Validation(required = true)
    public String bizTenant;

    // 商品码	
    // 
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 实例ID	
    // 
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static ResumeIotplantformProductRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeIotplantformProductRequest self = new ResumeIotplantformProductRequest();
        return TeaModel.build(map, self);
    }

    public ResumeIotplantformProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ResumeIotplantformProductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ResumeIotplantformProductRequest setBizTenant(String bizTenant) {
        this.bizTenant = bizTenant;
        return this;
    }
    public String getBizTenant() {
        return this.bizTenant;
    }

    public ResumeIotplantformProductRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ResumeIotplantformProductRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
