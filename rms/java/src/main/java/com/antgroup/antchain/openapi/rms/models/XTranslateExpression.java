// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XTranslateExpression extends TeaModel {
    // expression type
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    //  from
    @NameInMap("from")
    @Validation(required = true)
    public String from;

    // to
    @NameInMap("to")
    @Validation(required = true)
    public String to;

    public static XTranslateExpression build(java.util.Map<String, ?> map) throws Exception {
        XTranslateExpression self = new XTranslateExpression();
        return TeaModel.build(map, self);
    }

    public XTranslateExpression setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public XTranslateExpression setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public XTranslateExpression setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

}
