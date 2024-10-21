// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sp.models;

import com.aliyun.tea.*;

public class ApiChange extends TeaModel {
    // 变更类型，ADD-新增，DELETE-删除
    @NameInMap("change_type")
    @Validation(required = true)
    public String changeType;

    // API名称列表
    @NameInMap("api_names")
    @Validation(required = true)
    public java.util.List<String> apiNames;

    public static ApiChange build(java.util.Map<String, ?> map) throws Exception {
        ApiChange self = new ApiChange();
        return TeaModel.build(map, self);
    }

    public ApiChange setChangeType(String changeType) {
        this.changeType = changeType;
        return this;
    }
    public String getChangeType() {
        return this.changeType;
    }

    public ApiChange setApiNames(java.util.List<String> apiNames) {
        this.apiNames = apiNames;
        return this;
    }
    public java.util.List<String> getApiNames() {
        return this.apiNames;
    }

}
