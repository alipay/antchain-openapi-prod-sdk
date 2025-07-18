// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RpspInfoModel extends TeaModel {
    // 流量分层计划code
    /**
     * <strong>example:</strong>
     * <p>planCode1</p>
     */
    @NameInMap("plan_code")
    @Validation(required = true)
    public String planCode;

    // 场景策略Id
    /**
     * <strong>example:</strong>
     * <p>15000</p>
     */
    @NameInMap("scene_strategy_id")
    @Validation(required = true)
    public Long sceneStrategyId;

    // 客群分层结果
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("rpsp_result")
    @Validation(required = true)
    public String rpspResult;

    // 	
    // json 结构的营销额外输出信息
    /**
     * <strong>example:</strong>
     * <p>{&quot;f_01&quot;:&quot;95.0&quot;}</p>
     */
    @NameInMap("rpsp_out_put_info")
    @Validation(required = true)
    public String rpspOutPutInfo;

    public static RpspInfoModel build(java.util.Map<String, ?> map) throws Exception {
        RpspInfoModel self = new RpspInfoModel();
        return TeaModel.build(map, self);
    }

    public RpspInfoModel setPlanCode(String planCode) {
        this.planCode = planCode;
        return this;
    }
    public String getPlanCode() {
        return this.planCode;
    }

    public RpspInfoModel setSceneStrategyId(Long sceneStrategyId) {
        this.sceneStrategyId = sceneStrategyId;
        return this;
    }
    public Long getSceneStrategyId() {
        return this.sceneStrategyId;
    }

    public RpspInfoModel setRpspResult(String rpspResult) {
        this.rpspResult = rpspResult;
        return this;
    }
    public String getRpspResult() {
        return this.rpspResult;
    }

    public RpspInfoModel setRpspOutPutInfo(String rpspOutPutInfo) {
        this.rpspOutPutInfo = rpspOutPutInfo;
        return this;
    }
    public String getRpspOutPutInfo() {
        return this.rpspOutPutInfo;
    }

}
