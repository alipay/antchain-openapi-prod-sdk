// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class RiskFactorDetail extends TeaModel {
    // 风险评估因子类型
    /**
     * <strong>example:</strong>
     * <p>BLACKLIST</p>
     */
    @NameInMap("factor_type")
    public String factorType;

    // 分数
    /**
     * <strong>example:</strong>
     * <p>85</p>
     */
    @NameInMap("score")
    public Long score;

    // 风险事件
    /**
     * <strong>example:</strong>
     * <p>[&quot;关联账户被冻结&quot;, &quot;高频异常交易&quot;]</p>
     */
    @NameInMap("evidence")
    public java.util.List<String> evidence;

    public static RiskFactorDetail build(java.util.Map<String, ?> map) throws Exception {
        RiskFactorDetail self = new RiskFactorDetail();
        return TeaModel.build(map, self);
    }

    public RiskFactorDetail setFactorType(String factorType) {
        this.factorType = factorType;
        return this;
    }
    public String getFactorType() {
        return this.factorType;
    }

    public RiskFactorDetail setScore(Long score) {
        this.score = score;
        return this;
    }
    public Long getScore() {
        return this.score;
    }

    public RiskFactorDetail setEvidence(java.util.List<String> evidence) {
        this.evidence = evidence;
        return this;
    }
    public java.util.List<String> getEvidence() {
        return this.evidence;
    }

}
