// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class VariableDetail extends TeaModel {
    // 产品码
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 变量名称
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("variable_name")
    @Validation(required = true)
    public String variableName;

    // 变量值
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("variable_value")
    @Validation(required = true)
    public String variableValue;

    // 变量类型
    /**
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("variable_type")
    @Validation(required = true)
    public String variableType;

    public static VariableDetail build(java.util.Map<String, ?> map) throws Exception {
        VariableDetail self = new VariableDetail();
        return TeaModel.build(map, self);
    }

    public VariableDetail setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public VariableDetail setVariableName(String variableName) {
        this.variableName = variableName;
        return this;
    }
    public String getVariableName() {
        return this.variableName;
    }

    public VariableDetail setVariableValue(String variableValue) {
        this.variableValue = variableValue;
        return this;
    }
    public String getVariableValue() {
        return this.variableValue;
    }

    public VariableDetail setVariableType(String variableType) {
        this.variableType = variableType;
        return this;
    }
    public String getVariableType() {
        return this.variableType;
    }

}
