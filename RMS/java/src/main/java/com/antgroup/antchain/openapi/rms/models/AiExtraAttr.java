// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AiExtraAttr extends TeaModel {
    // time_range_thres
    @NameInMap("time_range_thres")
    public String timeRangeThres;

    // abnormal_value_thres
    @NameInMap("abnormal_value_thres")
    public String abnormalValueThres;

    // value_range_thres
    @NameInMap("value_range_thres")
    public String valueRangeThres;

    // algo_score_thres
    @NameInMap("algo_score_thres")
    public String algoScoreThres;

    public static AiExtraAttr build(java.util.Map<String, ?> map) throws Exception {
        AiExtraAttr self = new AiExtraAttr();
        return TeaModel.build(map, self);
    }

    public AiExtraAttr setTimeRangeThres(String timeRangeThres) {
        this.timeRangeThres = timeRangeThres;
        return this;
    }
    public String getTimeRangeThres() {
        return this.timeRangeThres;
    }

    public AiExtraAttr setAbnormalValueThres(String abnormalValueThres) {
        this.abnormalValueThres = abnormalValueThres;
        return this;
    }
    public String getAbnormalValueThres() {
        return this.abnormalValueThres;
    }

    public AiExtraAttr setValueRangeThres(String valueRangeThres) {
        this.valueRangeThres = valueRangeThres;
        return this;
    }
    public String getValueRangeThres() {
        return this.valueRangeThres;
    }

    public AiExtraAttr setAlgoScoreThres(String algoScoreThres) {
        this.algoScoreThres = algoScoreThres;
        return this;
    }
    public String getAlgoScoreThres() {
        return this.algoScoreThres;
    }

}
