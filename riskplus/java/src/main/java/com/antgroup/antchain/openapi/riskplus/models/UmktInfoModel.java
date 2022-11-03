// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class UmktInfoModel extends TeaModel {
    // 场景策略id
    @NameInMap("scene_strategy_id")
    @Validation(required = true)
    public Long sceneStrategyId;

    // 实时营销结果
    @NameInMap("umkt_result")
    @Validation(required = true)
    public Long umktResult;

    // json 结构的营销额外输出信息
    @NameInMap("umkt_out_put_info")
    @Validation(required = true)
    public String umktOutPutInfo;

    public static UmktInfoModel build(java.util.Map<String, ?> map) throws Exception {
        UmktInfoModel self = new UmktInfoModel();
        return TeaModel.build(map, self);
    }

    public UmktInfoModel setSceneStrategyId(Long sceneStrategyId) {
        this.sceneStrategyId = sceneStrategyId;
        return this;
    }
    public Long getSceneStrategyId() {
        return this.sceneStrategyId;
    }

    public UmktInfoModel setUmktResult(Long umktResult) {
        this.umktResult = umktResult;
        return this;
    }
    public Long getUmktResult() {
        return this.umktResult;
    }

    public UmktInfoModel setUmktOutPutInfo(String umktOutPutInfo) {
        this.umktOutPutInfo = umktOutPutInfo;
        return this;
    }
    public String getUmktOutPutInfo() {
        return this.umktOutPutInfo;
    }

}
