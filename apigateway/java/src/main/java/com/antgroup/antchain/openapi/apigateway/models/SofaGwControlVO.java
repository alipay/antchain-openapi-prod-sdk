// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class SofaGwControlVO extends TeaModel {
    // 要添加的授权的app_name列表
    @NameInMap("add_items")
    public java.util.List<String> addItems;

    // 实例标识
    @NameInMap("instance_id")
    public String instanceId;

    // 授权的app_name列表
    @NameInMap("items")
    public java.util.List<String> items;

    // 固定值：app
    @NameInMap("match")
    public String match;

    // 要删除的授权的app_name列表
    @NameInMap("remove_items")
    public java.util.List<String> removeItems;

    // service name
    @NameInMap("service_name")
    public String serviceName;

    // 子类型，固定值：whitelist
    @NameInMap("sub_type")
    public String subType;

    // 控制类型，固定值：access-control
    @NameInMap("type")
    public String type;

    public static SofaGwControlVO build(java.util.Map<String, ?> map) throws Exception {
        SofaGwControlVO self = new SofaGwControlVO();
        return TeaModel.build(map, self);
    }

    public SofaGwControlVO setAddItems(java.util.List<String> addItems) {
        this.addItems = addItems;
        return this;
    }
    public java.util.List<String> getAddItems() {
        return this.addItems;
    }

    public SofaGwControlVO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SofaGwControlVO setItems(java.util.List<String> items) {
        this.items = items;
        return this;
    }
    public java.util.List<String> getItems() {
        return this.items;
    }

    public SofaGwControlVO setMatch(String match) {
        this.match = match;
        return this;
    }
    public String getMatch() {
        return this.match;
    }

    public SofaGwControlVO setRemoveItems(java.util.List<String> removeItems) {
        this.removeItems = removeItems;
        return this;
    }
    public java.util.List<String> getRemoveItems() {
        return this.removeItems;
    }

    public SofaGwControlVO setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public SofaGwControlVO setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public SofaGwControlVO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
