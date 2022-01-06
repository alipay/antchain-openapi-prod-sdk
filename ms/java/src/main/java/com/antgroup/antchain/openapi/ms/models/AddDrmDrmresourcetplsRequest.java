// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddDrmDrmresourcetplsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // app name
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 属性列表
    @NameInMap("attributes")
    public String attributes;

    // 描述
    @NameInMap("desc")
    public String desc;

    // 所有单元中是否存在有特殊推送过值的单元
    @NameInMap("has_instance")
    public Boolean hasInstance;

    // 资源id
    @NameInMap("id")
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

    public static AddDrmDrmresourcetplsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDrmDrmresourcetplsRequest self = new AddDrmDrmresourcetplsRequest();
        return TeaModel.build(map, self);
    }

    public AddDrmDrmresourcetplsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddDrmDrmresourcetplsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddDrmDrmresourcetplsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddDrmDrmresourcetplsRequest setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
        return this.attributes;
    }

    public AddDrmDrmresourcetplsRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public AddDrmDrmresourcetplsRequest setHasInstance(Boolean hasInstance) {
        this.hasInstance = hasInstance;
        return this;
    }
    public Boolean getHasInstance() {
        return this.hasInstance;
    }

    public AddDrmDrmresourcetplsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AddDrmDrmresourcetplsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddDrmDrmresourcetplsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AddDrmDrmresourcetplsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public AddDrmDrmresourcetplsRequest setTplId(Long tplId) {
        this.tplId = tplId;
        return this;
    }
    public Long getTplId() {
        return this.tplId;
    }

}
