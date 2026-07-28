// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.billing.models;

import com.aliyun.tea.*;

public class PagequeryAcrespackagecoreInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 资源包实例ID
    @NameInMap("instance_id")
    public String instanceId;

    // 查询多个资源包实例ID
    @NameInMap("instance_id_list")
    public java.util.List<String> instanceIdList;

    public static PagequeryAcrespackagecoreInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryAcrespackagecoreInstanceRequest self = new PagequeryAcrespackagecoreInstanceRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryAcrespackagecoreInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryAcrespackagecoreInstanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PagequeryAcrespackagecoreInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PagequeryAcrespackagecoreInstanceRequest setInstanceIdList(java.util.List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

}
