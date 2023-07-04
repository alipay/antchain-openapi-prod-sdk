// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ProductMeta extends TeaModel {
    // 产品code
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 产品名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 产品标签
    @NameInMap("labels")
    public java.util.List<String> labels;

    // 产品版本
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    // 所属产品集
    @NameInMap("group")
    public String group;

    public static ProductMeta build(java.util.Map<String, ?> map) throws Exception {
        ProductMeta self = new ProductMeta();
        return TeaModel.build(map, self);
    }

    public ProductMeta setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ProductMeta setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ProductMeta setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    public ProductMeta setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ProductMeta setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

}
