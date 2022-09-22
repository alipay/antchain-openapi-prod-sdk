// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class QueryHealthInfoExtendedArg extends TeaModel {
    // 参数名
    @NameInMap("arg_key")
    public String argKey;

    // 参数值
    @NameInMap("arg_value")
    public String argValue;

    public static QueryHealthInfoExtendedArg build(java.util.Map<String, ?> map) throws Exception {
        QueryHealthInfoExtendedArg self = new QueryHealthInfoExtendedArg();
        return TeaModel.build(map, self);
    }

    public QueryHealthInfoExtendedArg setArgKey(String argKey) {
        this.argKey = argKey;
        return this;
    }
    public String getArgKey() {
        return this.argKey;
    }

    public QueryHealthInfoExtendedArg setArgValue(String argValue) {
        this.argValue = argValue;
        return this;
    }
    public String getArgValue() {
        return this.argValue;
    }

}
