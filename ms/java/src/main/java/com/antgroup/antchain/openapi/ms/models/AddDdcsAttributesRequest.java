// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddDdcsAttributesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 属性名称
    @NameInMap("attribute_name")
    @Validation(required = true)
    public String attributeName;

    // 属性描述信息
    @NameInMap("desc")
    public String desc;

    // 环境实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 所属的资源自增长 ID
    @NameInMap("resource_id")
    @Validation(required = true)
    public Long resourceId;

    public static AddDdcsAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDdcsAttributesRequest self = new AddDdcsAttributesRequest();
        return TeaModel.build(map, self);
    }

    public AddDdcsAttributesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddDdcsAttributesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddDdcsAttributesRequest setAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    public String getAttributeName() {
        return this.attributeName;
    }

    public AddDdcsAttributesRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public AddDdcsAttributesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddDdcsAttributesRequest setResourceId(Long resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public Long getResourceId() {
        return this.resourceId;
    }

}
