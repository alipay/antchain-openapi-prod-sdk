// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class Customer extends TeaModel {
    // 企业创建时间，ISO8601格式
    @NameInMap("create_time")
    public String createTime;

    // 企业ID
    @NameInMap("id")
    public String id;

    // 企业名称
    @NameInMap("name")
    public String name;

    // 企业最近一次修改时间，ISO8601格式
    @NameInMap("update_time")
    public String updateTime;

    public static Customer build(java.util.Map<String, ?> map) throws Exception {
        Customer self = new Customer();
        return TeaModel.build(map, self);
    }

    public Customer setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Customer setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Customer setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
