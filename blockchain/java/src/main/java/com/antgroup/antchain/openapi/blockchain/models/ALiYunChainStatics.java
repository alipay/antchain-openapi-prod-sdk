// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChainStatics extends TeaModel {
    // alias
    /**
     * <strong>example:</strong>
     * <p>alias</p>
     */
    @NameInMap("alias")
    public String alias;

    // Dt
    /**
     * <strong>example:</strong>
     * <p>Dt</p>
     */
    @NameInMap("dt")
    public Long dt;

    // trans_count
    /**
     * <strong>example:</strong>
     * <p>21323</p>
     */
    @NameInMap("trans_count")
    public Long transCount;

    // last_sum_block_height
    /**
     * <strong>example:</strong>
     * <p>1231</p>
     */
    @NameInMap("last_sum_block_height")
    public Long lastSumBlockHeight;

    // creat_time
    /**
     * <strong>example:</strong>
     * <p>creat_time</p>
     */
    @NameInMap("creat_time")
    public Long creatTime;

    public static ALiYunChainStatics build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainStatics self = new ALiYunChainStatics();
        return TeaModel.build(map, self);
    }

    public ALiYunChainStatics setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public ALiYunChainStatics setDt(Long dt) {
        this.dt = dt;
        return this;
    }
    public Long getDt() {
        return this.dt;
    }

    public ALiYunChainStatics setTransCount(Long transCount) {
        this.transCount = transCount;
        return this;
    }
    public Long getTransCount() {
        return this.transCount;
    }

    public ALiYunChainStatics setLastSumBlockHeight(Long lastSumBlockHeight) {
        this.lastSumBlockHeight = lastSumBlockHeight;
        return this;
    }
    public Long getLastSumBlockHeight() {
        return this.lastSumBlockHeight;
    }

    public ALiYunChainStatics setCreatTime(Long creatTime) {
        this.creatTime = creatTime;
        return this;
    }
    public Long getCreatTime() {
        return this.creatTime;
    }

}
