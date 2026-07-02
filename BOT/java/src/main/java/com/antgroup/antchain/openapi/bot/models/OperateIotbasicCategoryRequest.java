// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OperateIotbasicCategoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 品类名称
    @NameInMap("category_name")
    @Validation(required = true)
    public String categoryName;

    // 行业
    @NameInMap("industry")
    @Validation(required = true)
    public String industry;

    // 场景
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 品类类型：标准 | 自定义
    @NameInMap("category_type")
    @Validation(required = true)
    public String categoryType;

    // 描述内容
    @NameInMap("remark")
    public String remark;

    // 操作类型
    @NameInMap("action")
    @Validation(required = true)
    public String action;

    // 操作人id
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 参数签名校验
    @NameInMap("param_sign")
    @Validation(required = true)
    public String paramSign;

    // 品类code
    @NameInMap("category_code")
    public String categoryCode;

    public static OperateIotbasicCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateIotbasicCategoryRequest self = new OperateIotbasicCategoryRequest();
        return TeaModel.build(map, self);
    }

    public OperateIotbasicCategoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateIotbasicCategoryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateIotbasicCategoryRequest setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public OperateIotbasicCategoryRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public OperateIotbasicCategoryRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public OperateIotbasicCategoryRequest setCategoryType(String categoryType) {
        this.categoryType = categoryType;
        return this;
    }
    public String getCategoryType() {
        return this.categoryType;
    }

    public OperateIotbasicCategoryRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public OperateIotbasicCategoryRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public OperateIotbasicCategoryRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public OperateIotbasicCategoryRequest setParamSign(String paramSign) {
        this.paramSign = paramSign;
        return this;
    }
    public String getParamSign() {
        return this.paramSign;
    }

    public OperateIotbasicCategoryRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

}
