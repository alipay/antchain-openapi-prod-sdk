// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class ExecMaasPriceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 模型名称
    @NameInMap("model_name")
    @Validation(required = true)
    public String modelName;

    // 请求级定价维度
    @NameInMap("request_dimensions")
    public String requestDimensions;

    // 请求级计量指标
    @NameInMap("request_metrics")
    public String requestMetrics;

    // 输出单元列表
    @NameInMap("units")
    public java.util.List<PriceUnits> units;

    public static ExecMaasPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecMaasPriceRequest self = new ExecMaasPriceRequest();
        return TeaModel.build(map, self);
    }

    public ExecMaasPriceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecMaasPriceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecMaasPriceRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ExecMaasPriceRequest setRequestDimensions(String requestDimensions) {
        this.requestDimensions = requestDimensions;
        return this;
    }
    public String getRequestDimensions() {
        return this.requestDimensions;
    }

    public ExecMaasPriceRequest setRequestMetrics(String requestMetrics) {
        this.requestMetrics = requestMetrics;
        return this;
    }
    public String getRequestMetrics() {
        return this.requestMetrics;
    }

    public ExecMaasPriceRequest setUnits(java.util.List<PriceUnits> units) {
        this.units = units;
        return this;
    }
    public java.util.List<PriceUnits> getUnits() {
        return this.units;
    }

}
