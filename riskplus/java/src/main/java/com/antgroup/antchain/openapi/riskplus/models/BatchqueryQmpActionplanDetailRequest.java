// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BatchqueryQmpActionplanDetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景策略id
    @NameInMap("scene_strategy_id")
    @Validation(required = true)
    public java.util.List<Long> sceneStrategyId;

    // 分流字段，行业标签区分哈啰流量归属于umkt或qmp
    @NameInMap("industry_tag")
    public String industryTag;

    public static BatchqueryQmpActionplanDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryQmpActionplanDetailRequest self = new BatchqueryQmpActionplanDetailRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryQmpActionplanDetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryQmpActionplanDetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryQmpActionplanDetailRequest setSceneStrategyId(java.util.List<Long> sceneStrategyId) {
        this.sceneStrategyId = sceneStrategyId;
        return this;
    }
    public java.util.List<Long> getSceneStrategyId() {
        return this.sceneStrategyId;
    }

    public BatchqueryQmpActionplanDetailRequest setIndustryTag(String industryTag) {
        this.industryTag = industryTag;
        return this;
    }
    public String getIndustryTag() {
        return this.industryTag;
    }

}
