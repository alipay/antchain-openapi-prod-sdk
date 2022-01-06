// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddDrmDrmattributesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 属性名称
    @NameInMap("attribute_name")
    @Validation(required = true)
    public String attributeName;

    // 服务id
    @NameInMap("data_id")
    public String dataId;

    // 资源属性id
    @NameInMap("id")
    public Long id;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 描述字段
    @NameInMap("name")
    public String name;

    // 父节点数据
    @NameInMap("parent")
    public String parent;

    // 父节点ID，冗余字段
    @NameInMap("parent_id")
    @Validation(required = true)
    public Long parentId;

    public static AddDrmDrmattributesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDrmDrmattributesRequest self = new AddDrmDrmattributesRequest();
        return TeaModel.build(map, self);
    }

    public AddDrmDrmattributesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddDrmDrmattributesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddDrmDrmattributesRequest setAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    public String getAttributeName() {
        return this.attributeName;
    }

    public AddDrmDrmattributesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public AddDrmDrmattributesRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AddDrmDrmattributesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddDrmDrmattributesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddDrmDrmattributesRequest setParent(String parent) {
        this.parent = parent;
        return this;
    }
    public String getParent() {
        return this.parent;
    }

    public AddDrmDrmattributesRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

}
