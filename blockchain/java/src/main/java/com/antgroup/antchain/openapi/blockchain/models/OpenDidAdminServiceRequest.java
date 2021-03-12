// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class OpenDidAdminServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    // 账户接入公钥
    @NameInMap("dis_access_key")
    public String disAccessKey;

    // 扩展字段
    @NameInMap("specification")
    public String specification;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static OpenDidAdminServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenDidAdminServiceRequest self = new OpenDidAdminServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenDidAdminServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OpenDidAdminServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OpenDidAdminServiceRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public OpenDidAdminServiceRequest setDisAccessKey(String disAccessKey) {
        this.disAccessKey = disAccessKey;
        return this;
    }
    public String getDisAccessKey() {
        return this.disAccessKey;
    }

    public OpenDidAdminServiceRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public OpenDidAdminServiceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
