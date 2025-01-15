// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class UpdateInnerTenantindirectmainclassRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 开通类目
    @NameInMap("indirect_main_class_list")
    @Validation(required = true)
    public java.util.List<String> indirectMainClassList;

    // 开通说明
    // 
    @NameInMap("desc")
    public String desc;

    public static UpdateInnerTenantindirectmainclassRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInnerTenantindirectmainclassRequest self = new UpdateInnerTenantindirectmainclassRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInnerTenantindirectmainclassRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateInnerTenantindirectmainclassRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateInnerTenantindirectmainclassRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateInnerTenantindirectmainclassRequest setIndirectMainClassList(java.util.List<String> indirectMainClassList) {
        this.indirectMainClassList = indirectMainClassList;
        return this;
    }
    public java.util.List<String> getIndirectMainClassList() {
        return this.indirectMainClassList;
    }

    public UpdateInnerTenantindirectmainclassRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
