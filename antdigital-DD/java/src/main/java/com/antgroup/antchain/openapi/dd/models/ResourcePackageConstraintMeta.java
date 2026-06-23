// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class ResourcePackageConstraintMeta extends TeaModel {
    // 模板code
    /**
     * <strong>example:</strong>
     * <p>test_deadline</p>
     */
    @NameInMap("template_name")
    @Validation(required = true)
    public String templateName;

    // 约束码
    /**
     * <strong>example:</strong>
     * <p>productCode</p>
     */
    @NameInMap("constraint_code")
    @Validation(required = true)
    public String constraintCode;

    // 约束名称
    /**
     * <strong>example:</strong>
     * <p>抵扣约束</p>
     */
    @NameInMap("constraint_name")
    @Validation(required = true)
    public String constraintName;

    // 约束表达式
    /**
     * <strong>example:</strong>
     * <p>ql表达式</p>
     */
    @NameInMap("constraint_expression")
    @Validation(required = true)
    public String constraintExpression;

    // 约束类型
    /**
     * <strong>example:</strong>
     * <p>DEDUCT</p>
     */
    @NameInMap("constraint_type")
    @Validation(required = true)
    public String constraintType;

    public static ResourcePackageConstraintMeta build(java.util.Map<String, ?> map) throws Exception {
        ResourcePackageConstraintMeta self = new ResourcePackageConstraintMeta();
        return TeaModel.build(map, self);
    }

    public ResourcePackageConstraintMeta setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ResourcePackageConstraintMeta setConstraintCode(String constraintCode) {
        this.constraintCode = constraintCode;
        return this;
    }
    public String getConstraintCode() {
        return this.constraintCode;
    }

    public ResourcePackageConstraintMeta setConstraintName(String constraintName) {
        this.constraintName = constraintName;
        return this;
    }
    public String getConstraintName() {
        return this.constraintName;
    }

    public ResourcePackageConstraintMeta setConstraintExpression(String constraintExpression) {
        this.constraintExpression = constraintExpression;
        return this;
    }
    public String getConstraintExpression() {
        return this.constraintExpression;
    }

    public ResourcePackageConstraintMeta setConstraintType(String constraintType) {
        this.constraintType = constraintType;
        return this;
    }
    public String getConstraintType() {
        return this.constraintType;
    }

}
