// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class Strategy extends TeaModel {
    // 策略id
    @NameInMap("strategy_id")
    @Validation(required = true)
    public String strategyId;

    // 策略名
    @NameInMap("strategy_name")
    public String strategyName;

    // 镜像相关策略内容
    @NameInMap("image")
    public ImageStrategy image;

    // 基线相关策略
    @NameInMap("baseline")
    public BaselineStrategy baseline;

    // 运行时策略
    @NameInMap("runtime")
    public RuntimeStrategy runtime;

    public static Strategy build(java.util.Map<String, ?> map) throws Exception {
        Strategy self = new Strategy();
        return TeaModel.build(map, self);
    }

    public Strategy setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

    public Strategy setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public Strategy setImage(ImageStrategy image) {
        this.image = image;
        return this;
    }
    public ImageStrategy getImage() {
        return this.image;
    }

    public Strategy setBaseline(BaselineStrategy baseline) {
        this.baseline = baseline;
        return this;
    }
    public BaselineStrategy getBaseline() {
        return this.baseline;
    }

    public Strategy setRuntime(RuntimeStrategy runtime) {
        this.runtime = runtime;
        return this;
    }
    public RuntimeStrategy getRuntime() {
        return this.runtime;
    }

}
