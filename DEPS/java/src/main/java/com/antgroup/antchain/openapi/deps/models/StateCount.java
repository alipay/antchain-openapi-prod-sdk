// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class StateCount extends TeaModel {
    // state
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // count
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    public static StateCount build(java.util.Map<String, ?> map) throws Exception {
        StateCount self = new StateCount();
        return TeaModel.build(map, self);
    }

    public StateCount setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public StateCount setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

}
