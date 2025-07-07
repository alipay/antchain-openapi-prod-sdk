// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChainRest extends TeaModel {
    // access_id
    /**
     * <strong>example:</strong>
     * <p>access_id</p>
     */
    @NameInMap("access_id")
    public String accessId;

    // create_time
    /**
     * <strong>example:</strong>
     * <p>123123123</p>
     */
    @NameInMap("create_time")
    public Long createTime;

    // rest
    /**
     * <strong>example:</strong>
     * <p>rest</p>
     */
    @NameInMap("rest")
    public String rest;

    // update_time
    /**
     * <strong>example:</strong>
     * <p>123123123</p>
     */
    @NameInMap("update_time")
    public Long updateTime;

    // REST开通结果
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("result")
    public String result;

    public static ALiYunChainRest build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainRest self = new ALiYunChainRest();
        return TeaModel.build(map, self);
    }

    public ALiYunChainRest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public ALiYunChainRest setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ALiYunChainRest setRest(String rest) {
        this.rest = rest;
        return this;
    }
    public String getRest() {
        return this.rest;
    }

    public ALiYunChainRest setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public ALiYunChainRest setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
