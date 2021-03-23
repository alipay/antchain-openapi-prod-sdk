// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class ResultFilterDTO extends TeaModel {
    // 过滤器名称
    @NameInMap("filter_name")
    @Validation(required = true)
    public String filterName;

    // 要返回的字段路径列表
    @NameInMap("path_list")
    @Validation(required = true)
    public java.util.List<String> pathList;

    public static ResultFilterDTO build(java.util.Map<String, ?> map) throws Exception {
        ResultFilterDTO self = new ResultFilterDTO();
        return TeaModel.build(map, self);
    }

    public ResultFilterDTO setFilterName(String filterName) {
        this.filterName = filterName;
        return this;
    }
    public String getFilterName() {
        return this.filterName;
    }

    public ResultFilterDTO setPathList(java.util.List<String> pathList) {
        this.pathList = pathList;
        return this;
    }
    public java.util.List<String> getPathList() {
        return this.pathList;
    }

}
