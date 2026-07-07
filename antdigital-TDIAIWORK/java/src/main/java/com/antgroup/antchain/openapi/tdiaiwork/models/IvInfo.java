// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdiaiwork.models;

import com.aliyun.tea.*;

public class IvInfo extends TeaModel {
    // 轮次
    /**
     * <strong>example:</strong>
     * <p>基线</p>
     */
    @NameInMap("round")
    @Validation(required = true)
    public String round;

    // oss下载链接
    /**
     * <strong>example:</strong>
     * <p><a href="https://antchain-joint-modeling-poc-sh.oss-cn-shanghai.aliyuncs.com/poc">https://antchain-joint-modeling-poc-sh.oss-cn-shanghai.aliyuncs.com/poc</a></p>
     */
    @NameInMap("feature_report")
    @Validation(required = true)
    public String featureReport;

    public static IvInfo build(java.util.Map<String, ?> map) throws Exception {
        IvInfo self = new IvInfo();
        return TeaModel.build(map, self);
    }

    public IvInfo setRound(String round) {
        this.round = round;
        return this;
    }
    public String getRound() {
        return this.round;
    }

    public IvInfo setFeatureReport(String featureReport) {
        this.featureReport = featureReport;
        return this;
    }
    public String getFeatureReport() {
        return this.featureReport;
    }

}
