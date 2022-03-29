// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XCalculationParameter extends TeaModel {
    // x
    @NameInMap("expression")
    public String expression;

    // x
    @NameInMap("constant")
    public Boolean constant;

    public static XCalculationParameter build(java.util.Map<String, ?> map) throws Exception {
        XCalculationParameter self = new XCalculationParameter();
        return TeaModel.build(map, self);
    }

    public XCalculationParameter setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public XCalculationParameter setConstant(Boolean constant) {
        this.constant = constant;
        return this;
    }
    public Boolean getConstant() {
        return this.constant;
    }

}
