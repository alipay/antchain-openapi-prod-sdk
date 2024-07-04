// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryQmpRobotcallStatisticinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景策略id
    @NameInMap("scene_strategy_id")
    @Validation(required = true)
    public Long sceneStrategyId;

    // 客户透传字段
    @NameInMap("out_info")
    @Validation(required = true)
    public String outInfo;

    // 分流字段，行业标签区分哈啰流量归属于umkt或qmp
    @NameInMap("industry_tag")
    public String industryTag;

    public static QueryQmpRobotcallStatisticinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryQmpRobotcallStatisticinfoRequest self = new QueryQmpRobotcallStatisticinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryQmpRobotcallStatisticinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryQmpRobotcallStatisticinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryQmpRobotcallStatisticinfoRequest setSceneStrategyId(Long sceneStrategyId) {
        this.sceneStrategyId = sceneStrategyId;
        return this;
    }
    public Long getSceneStrategyId() {
        return this.sceneStrategyId;
    }

    public QueryQmpRobotcallStatisticinfoRequest setOutInfo(String outInfo) {
        this.outInfo = outInfo;
        return this;
    }
    public String getOutInfo() {
        return this.outInfo;
    }

    public QueryQmpRobotcallStatisticinfoRequest setIndustryTag(String industryTag) {
        this.industryTag = industryTag;
        return this;
    }
    public String getIndustryTag() {
        return this.industryTag;
    }

}
