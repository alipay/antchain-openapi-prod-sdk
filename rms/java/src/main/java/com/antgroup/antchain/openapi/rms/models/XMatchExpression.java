// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XMatchExpression extends TeaModel {
    // match expression type
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // metadata field expr
    @NameInMap("expr")
    public String expr;

    // left character
    @NameInMap("left")
    public String left;

    // left index
    @NameInMap("left_index")
    public Long leftIndex;

    //  
    @NameInMap("right")
    public String right;

    //  
    @NameInMap("value_type")
    public String valueType;

    public static XMatchExpression build(java.util.Map<String, ?> map) throws Exception {
        XMatchExpression self = new XMatchExpression();
        return TeaModel.build(map, self);
    }

    public XMatchExpression setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public XMatchExpression setExpr(String expr) {
        this.expr = expr;
        return this;
    }
    public String getExpr() {
        return this.expr;
    }

    public XMatchExpression setLeft(String left) {
        this.left = left;
        return this;
    }
    public String getLeft() {
        return this.left;
    }

    public XMatchExpression setLeftIndex(Long leftIndex) {
        this.leftIndex = leftIndex;
        return this;
    }
    public Long getLeftIndex() {
        return this.leftIndex;
    }

    public XMatchExpression setRight(String right) {
        this.right = right;
        return this;
    }
    public String getRight() {
        return this.right;
    }

    public XMatchExpression setValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }
    public String getValueType() {
        return this.valueType;
    }

}
