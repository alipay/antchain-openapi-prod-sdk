// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ActionParamInfo extends TeaModel {
    // 触达媒介类型
    @NameInMap("content_type")
    @Validation(required = true)
    public String contentType;

    // 触达媒介参数列表
    @NameInMap("action_param")
    @Validation(required = true)
    public java.util.List<String> actionParam;

    public static ActionParamInfo build(java.util.Map<String, ?> map) throws Exception {
        ActionParamInfo self = new ActionParamInfo();
        return TeaModel.build(map, self);
    }

    public ActionParamInfo setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public ActionParamInfo setActionParam(java.util.List<String> actionParam) {
        this.actionParam = actionParam;
        return this;
    }
    public java.util.List<String> getActionParam() {
        return this.actionParam;
    }

}
