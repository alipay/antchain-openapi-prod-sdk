// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class UpdateIssuerPriceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 项目ID
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 项目净值
    @NameInMap("net_value")
    @Validation(required = true)
    public String netValue;

    // 要修改的价格类型（必须与项目创建时设定的类型一致）
    @NameInMap("price_type")
    @Validation(required = true)
    public String priceType;

    // 修改说明或备注
    @NameInMap("remark")
    public String remark;

    public static UpdateIssuerPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIssuerPriceRequest self = new UpdateIssuerPriceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIssuerPriceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateIssuerPriceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateIssuerPriceRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateIssuerPriceRequest setNetValue(String netValue) {
        this.netValue = netValue;
        return this;
    }
    public String getNetValue() {
        return this.netValue;
    }

    public UpdateIssuerPriceRequest setPriceType(String priceType) {
        this.priceType = priceType;
        return this;
    }
    public String getPriceType() {
        return this.priceType;
    }

    public UpdateIssuerPriceRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
