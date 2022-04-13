// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ResourceOverride extends TeaModel {
    // 部署单元名称，ALL 代表所有部署单元
    @NameInMap("cell")
    @Validation(required = true)
    public String cell;

    // fed 资源路径
    @NameInMap("path")
    @Validation(required = true)
    public String path;

    // 值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // 值的字段类型，支持 string、number、boolean
    @NameInMap("type")
    public String type;

    public static ResourceOverride build(java.util.Map<String, ?> map) throws Exception {
        ResourceOverride self = new ResourceOverride();
        return TeaModel.build(map, self);
    }

    public ResourceOverride setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public ResourceOverride setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ResourceOverride setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public ResourceOverride setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
