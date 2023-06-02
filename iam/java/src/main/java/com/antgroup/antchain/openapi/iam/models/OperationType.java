// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class OperationType extends TeaModel {
    // 操作描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 展示名称
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // 是否启用
    @NameInMap("enabled")
    @Validation(required = true)
    public String enabled;

    // 操作名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 产品码
    @NameInMap("product")
    @Validation(required = true)
    public String product;

    // 操作来源
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // Onex接口额外信息
    @NameInMap("onex_extra_info")
    public OnexExtraInfo onexExtraInfo;

    // 资源类型
    @NameInMap("resource_type")
    public String resourceType;

    // 资源表达式
    @NameInMap("resource_exp")
    public String resourceExp;

    public static OperationType build(java.util.Map<String, ?> map) throws Exception {
        OperationType self = new OperationType();
        return TeaModel.build(map, self);
    }

    public OperationType setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OperationType setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public OperationType setEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }
    public String getEnabled() {
        return this.enabled;
    }

    public OperationType setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OperationType setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public OperationType setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public OperationType setOnexExtraInfo(OnexExtraInfo onexExtraInfo) {
        this.onexExtraInfo = onexExtraInfo;
        return this;
    }
    public OnexExtraInfo getOnexExtraInfo() {
        return this.onexExtraInfo;
    }

    public OperationType setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public OperationType setResourceExp(String resourceExp) {
        this.resourceExp = resourceExp;
        return this;
    }
    public String getResourceExp() {
        return this.resourceExp;
    }

}
