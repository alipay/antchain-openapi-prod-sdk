// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class StackExpression extends TeaModel {
    // states
    @NameInMap("states")
    public java.util.List<StackState> states;

    // andor
    @NameInMap("andor")
    public Boolean andor;

    public static StackExpression build(java.util.Map<String, ?> map) throws Exception {
        StackExpression self = new StackExpression();
        return TeaModel.build(map, self);
    }

    public StackExpression setStates(java.util.List<StackState> states) {
        this.states = states;
        return this;
    }
    public java.util.List<StackState> getStates() {
        return this.states;
    }

    public StackExpression setAndor(Boolean andor) {
        this.andor = andor;
        return this;
    }
    public Boolean getAndor() {
        return this.andor;
    }

}
