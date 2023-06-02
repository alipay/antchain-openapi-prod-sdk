// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class Department extends TeaModel {
    // 部门唯一代码
    @NameInMap("code")
    public String code;

    // 部门名称
    @NameInMap("name")
    public String name;

    // 部门描述信息
    @NameInMap("description")
    public String description;

    // 父部门 code
    @NameInMap("parent_code")
    public String parentCode;

    // 父部门一直到根节点的路径，例如：DP0000000001/DP0000000002
    @NameInMap("parent_path")
    public String parentPath;

    // 企业 id
    @NameInMap("customer_id")
    public String customerId;

    // 是否为叶子结点
    @NameInMap("is_leaf")
    public Boolean isLeaf;

    // 创建时间，ISO8601格式
    @NameInMap("creation_time")
    public String creationTime;

    // 更新时间，ISO8601格式
    @NameInMap("update_time")
    public String updateTime;

    public static Department build(java.util.Map<String, ?> map) throws Exception {
        Department self = new Department();
        return TeaModel.build(map, self);
    }

    public Department setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Department setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Department setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Department setParentCode(String parentCode) {
        this.parentCode = parentCode;
        return this;
    }
    public String getParentCode() {
        return this.parentCode;
    }

    public Department setParentPath(String parentPath) {
        this.parentPath = parentPath;
        return this;
    }
    public String getParentPath() {
        return this.parentPath;
    }

    public Department setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public Department setIsLeaf(Boolean isLeaf) {
        this.isLeaf = isLeaf;
        return this;
    }
    public Boolean getIsLeaf() {
        return this.isLeaf;
    }

    public Department setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public Department setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
