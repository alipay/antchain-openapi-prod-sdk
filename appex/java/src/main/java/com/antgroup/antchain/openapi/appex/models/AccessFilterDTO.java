// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class AccessFilterDTO extends TeaModel {
    // 过滤器名称
    @NameInMap("filter_name")
    @Validation(required = true)
    public String filterName;

    // 要过滤的字段路径
    @NameInMap("path")
    @Validation(required = true)
    public String path;

    // 路径字段的取值范围
    @NameInMap("target")
    @Validation(required = true)
    public java.util.List<String> target;

    public static AccessFilterDTO build(java.util.Map<String, ?> map) throws Exception {
        AccessFilterDTO self = new AccessFilterDTO();
        return TeaModel.build(map, self);
    }

    public AccessFilterDTO setFilterName(String filterName) {
        this.filterName = filterName;
        return this;
    }
    public String getFilterName() {
        return this.filterName;
    }

    public AccessFilterDTO setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public AccessFilterDTO setTarget(java.util.List<String> target) {
        this.target = target;
        return this;
    }
    public java.util.List<String> getTarget() {
        return this.target;
    }

}
