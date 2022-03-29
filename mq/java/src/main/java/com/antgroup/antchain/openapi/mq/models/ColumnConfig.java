// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ColumnConfig extends TeaModel {
    // 别名
    @NameInMap("alias")
    public String alias;

    // 转化类型
    @NameInMap("cast_type")
    public String castType;

    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 列类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 当前字段 可转化成的类型选项
    @NameInMap("cast_type_options")
    public java.util.List<String> castTypeOptions;

    public static ColumnConfig build(java.util.Map<String, ?> map) throws Exception {
        ColumnConfig self = new ColumnConfig();
        return TeaModel.build(map, self);
    }

    public ColumnConfig setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public ColumnConfig setCastType(String castType) {
        this.castType = castType;
        return this;
    }
    public String getCastType() {
        return this.castType;
    }

    public ColumnConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ColumnConfig setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ColumnConfig setCastTypeOptions(java.util.List<String> castTypeOptions) {
        this.castTypeOptions = castTypeOptions;
        return this;
    }
    public java.util.List<String> getCastTypeOptions() {
        return this.castTypeOptions;
    }

}
