// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class StackState extends TeaModel {
    // state
    @NameInMap("state")
    public String state;

    // values
    @NameInMap("values")
    public java.util.List<String> values;

    // is_black
    @NameInMap("is_black")
    public Boolean isBlack;

    public static StackState build(java.util.Map<String, ?> map) throws Exception {
        StackState self = new StackState();
        return TeaModel.build(map, self);
    }

    public StackState setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public StackState setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

    public StackState setIsBlack(Boolean isBlack) {
        this.isBlack = isBlack;
        return this;
    }
    public Boolean getIsBlack() {
        return this.isBlack;
    }

}
