// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdiaiwork.models;

import com.aliyun.tea.*;

public class BestModelReport extends TeaModel {
    // ks信息
    /**
     * <strong>example:</strong>
     * <p>0.52</p>
     */
    @NameInMap("ks")
    public String ks;

    // auc指标
    /**
     * <strong>example:</strong>
     * <p>0.8</p>
     */
    @NameInMap("auc")
    public String auc;

    // lift指标
    /**
     * <strong>example:</strong>
     * <p>3.2</p>
     */
    @NameInMap("lift")
    public String lift;

    public static BestModelReport build(java.util.Map<String, ?> map) throws Exception {
        BestModelReport self = new BestModelReport();
        return TeaModel.build(map, self);
    }

    public BestModelReport setKs(String ks) {
        this.ks = ks;
        return this;
    }
    public String getKs() {
        return this.ks;
    }

    public BestModelReport setAuc(String auc) {
        this.auc = auc;
        return this;
    }
    public String getAuc() {
        return this.auc;
    }

    public BestModelReport setLift(String lift) {
        this.lift = lift;
        return this;
    }
    public String getLift() {
        return this.lift;
    }

}
