// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class DrmAttribute extends TeaModel {
    // 属性名，与代码中的成员变量名一致
    @NameInMap("attribute_name")
    public String attributeName;

    // 资源id
    // 
    @NameInMap("data_id")
    public String dataId;

    // 属性id
    @NameInMap("id")
    public Long id;

    // 实例id
    @NameInMap("instance_id")
    public String instanceId;

    // 节点名称，显示在树形菜单上用的
    @NameInMap("name")
    public String name;

    // 属性所属的资源
    @NameInMap("parent")
    public DrmResourceWithoutAttributes parent;

    // 父节点ID，冗余字段
    @NameInMap("parent_id")
    public Long parentId;

    public static DrmAttribute build(java.util.Map<String, ?> map) throws Exception {
        DrmAttribute self = new DrmAttribute();
        return TeaModel.build(map, self);
    }

    public DrmAttribute setAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    public String getAttributeName() {
        return this.attributeName;
    }

    public DrmAttribute setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public DrmAttribute setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DrmAttribute setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DrmAttribute setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DrmAttribute setParent(DrmResourceWithoutAttributes parent) {
        this.parent = parent;
        return this;
    }
    public DrmResourceWithoutAttributes getParent() {
        return this.parent;
    }

    public DrmAttribute setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

}
