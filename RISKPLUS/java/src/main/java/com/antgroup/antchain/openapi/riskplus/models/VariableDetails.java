// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class VariableDetails extends TeaModel {
    // 输出变量名称
    /**
     * <strong>example:</strong>
     * <p>yidun_aft_v3</p>
     */
    @NameInMap("variable_name")
    @Validation(required = true)
    public String variableName;

    // 输出变量值
    /**
     * <strong>example:</strong>
     * <p>66.6</p>
     */
    @NameInMap("variable_value")
    @Validation(required = true)
    public String variableValue;

    // 输出变量值类型
    /**
     * <strong>example:</strong>
     * <p>Double</p>
     */
    @NameInMap("variable_type")
    @Validation(required = true)
    public String variableType;

    public static VariableDetails build(java.util.Map<String, ?> map) throws Exception {
        VariableDetails self = new VariableDetails();
        return TeaModel.build(map, self);
    }

    public VariableDetails setVariableName(String variableName) {
        this.variableName = variableName;
        return this;
    }
    public String getVariableName() {
        return this.variableName;
    }

    public VariableDetails setVariableValue(String variableValue) {
        this.variableValue = variableValue;
        return this;
    }
    public String getVariableValue() {
        return this.variableValue;
    }

    public VariableDetails setVariableType(String variableType) {
        this.variableType = variableType;
        return this;
    }
    public String getVariableType() {
        return this.variableType;
    }

}
