// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateStubRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数字票根全流程存证内容
    @NameInMap("onestep_flow_notary_info")
    @Validation(required = true)
    public OnestepFlowNotaryInfo onestepFlowNotaryInfo;

    // 数字票根通用业务字段
    @NameInMap("stub_common_info")
    @Validation(required = true)
    public StubCommonInfo stubCommonInfo;

    // 数字票根扩展字段
    @NameInMap("stub_extra_info")
    public StubExtraInfo stubExtraInfo;

    // 数字票根计量字段
    @NameInMap("metric_info")
    public MetricInfo metricInfo;

    public static CreateStubRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStubRequest self = new CreateStubRequest();
        return TeaModel.build(map, self);
    }

    public CreateStubRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateStubRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateStubRequest setOnestepFlowNotaryInfo(OnestepFlowNotaryInfo onestepFlowNotaryInfo) {
        this.onestepFlowNotaryInfo = onestepFlowNotaryInfo;
        return this;
    }
    public OnestepFlowNotaryInfo getOnestepFlowNotaryInfo() {
        return this.onestepFlowNotaryInfo;
    }

    public CreateStubRequest setStubCommonInfo(StubCommonInfo stubCommonInfo) {
        this.stubCommonInfo = stubCommonInfo;
        return this;
    }
    public StubCommonInfo getStubCommonInfo() {
        return this.stubCommonInfo;
    }

    public CreateStubRequest setStubExtraInfo(StubExtraInfo stubExtraInfo) {
        this.stubExtraInfo = stubExtraInfo;
        return this;
    }
    public StubExtraInfo getStubExtraInfo() {
        return this.stubExtraInfo;
    }

    public CreateStubRequest setMetricInfo(MetricInfo metricInfo) {
        this.metricInfo = metricInfo;
        return this;
    }
    public MetricInfo getMetricInfo() {
        return this.metricInfo;
    }

}
