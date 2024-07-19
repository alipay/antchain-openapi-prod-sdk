// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryTechintegrationSkugrantstockinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品型号
    @NameInMap("product_model")
    public String productModel;

    // 产品形式，取值范围：
    // SOFTWARE_HARDWARE：软硬一体（SE方案）,
    // SOFTWARE：纯软（非SE方案）
    @NameInMap("product_form")
    public String productForm;

    // 凭证种类列表，取值范围：
    // ["PAYMENT"]：支付码，
    // ["PAYMENT","TRANSIT"]：支付码+乘车码
    @NameInMap("features")
    public java.util.List<String> features;

    public static QueryTechintegrationSkugrantstockinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTechintegrationSkugrantstockinfoRequest self = new QueryTechintegrationSkugrantstockinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryTechintegrationSkugrantstockinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTechintegrationSkugrantstockinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTechintegrationSkugrantstockinfoRequest setProductModel(String productModel) {
        this.productModel = productModel;
        return this;
    }
    public String getProductModel() {
        return this.productModel;
    }

    public QueryTechintegrationSkugrantstockinfoRequest setProductForm(String productForm) {
        this.productForm = productForm;
        return this;
    }
    public String getProductForm() {
        return this.productForm;
    }

    public QueryTechintegrationSkugrantstockinfoRequest setFeatures(java.util.List<String> features) {
        this.features = features;
        return this;
    }
    public java.util.List<String> getFeatures() {
        return this.features;
    }

}
