// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class UpdateDrmDrmresourcetplsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // app name
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 资源属性列表
    @NameInMap("attributes")
    public String attributes;

    // 描述
    @NameInMap("desc")
    public String desc;

    // 所有单元中是否存在有特殊推送过值的单元
    @NameInMap("has_instance")
    public Boolean hasInstance;

    // drm资源id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 资源域
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 资源类路径
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    // tpl_id
    @NameInMap("tpl_id")
    public Long tplId;

    public static UpdateDrmDrmresourcetplsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDrmDrmresourcetplsRequest self = new UpdateDrmDrmresourcetplsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDrmDrmresourcetplsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDrmDrmresourcetplsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDrmDrmresourcetplsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateDrmDrmresourcetplsRequest setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
        return this.attributes;
    }

    public UpdateDrmDrmresourcetplsRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateDrmDrmresourcetplsRequest setHasInstance(Boolean hasInstance) {
        this.hasInstance = hasInstance;
        return this;
    }
    public Boolean getHasInstance() {
        return this.hasInstance;
    }

    public UpdateDrmDrmresourcetplsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateDrmDrmresourcetplsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDrmDrmresourcetplsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateDrmDrmresourcetplsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public UpdateDrmDrmresourcetplsRequest setTplId(Long tplId) {
        this.tplId = tplId;
        return this;
    }
    public Long getTplId() {
        return this.tplId;
    }

}
