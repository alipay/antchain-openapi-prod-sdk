// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas_security.models;

import com.aliyun.tea.*;

public class SecurityRiskContentAnalyzeResponse extends TeaModel {
    // 场景id
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("app_scene_data_id")
    public String appSceneDataId;

    // 返回事件码，用于异步查询
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("event_id")
    public String eventId;

    // 是否需要异步查询
    /**
     * <strong>example:</strong>
     * <p>need</p>
     */
    @NameInMap("need_query")
    public String needQuery;

    // 返回结果
    /**
     * <strong>example:</strong>
     * <p>PASSED</p>
     */
    @NameInMap("result_action")
    public String resultAction;

    // 命中场景
    @NameInMap("hit_detect_items")
    public java.util.List<InfoSecHitDetectItem> hitDetectItems;

    // 描述被命中的风险标签
    /**
     * <strong>example:</strong>
     * <p>risk,risk</p>
     */
    @NameInMap("risk_labels")
    @Validation(required = true)
    public String riskLabels;

    public static SecurityRiskContentAnalyzeResponse build(java.util.Map<String, ?> map) throws Exception {
        SecurityRiskContentAnalyzeResponse self = new SecurityRiskContentAnalyzeResponse();
        return TeaModel.build(map, self);
    }

    public SecurityRiskContentAnalyzeResponse setAppSceneDataId(String appSceneDataId) {
        this.appSceneDataId = appSceneDataId;
        return this;
    }
    public String getAppSceneDataId() {
        return this.appSceneDataId;
    }

    public SecurityRiskContentAnalyzeResponse setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public SecurityRiskContentAnalyzeResponse setNeedQuery(String needQuery) {
        this.needQuery = needQuery;
        return this;
    }
    public String getNeedQuery() {
        return this.needQuery;
    }

    public SecurityRiskContentAnalyzeResponse setResultAction(String resultAction) {
        this.resultAction = resultAction;
        return this;
    }
    public String getResultAction() {
        return this.resultAction;
    }

    public SecurityRiskContentAnalyzeResponse setHitDetectItems(java.util.List<InfoSecHitDetectItem> hitDetectItems) {
        this.hitDetectItems = hitDetectItems;
        return this;
    }
    public java.util.List<InfoSecHitDetectItem> getHitDetectItems() {
        return this.hitDetectItems;
    }

    public SecurityRiskContentAnalyzeResponse setRiskLabels(String riskLabels) {
        this.riskLabels = riskLabels;
        return this;
    }
    public String getRiskLabels() {
        return this.riskLabels;
    }

}
