// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightNodeInfo extends TeaModel {
    // 链ID
    @NameInMap("biz_id")
    public String bizId;

    // 节点名称
    @NameInMap("name")
    public String name;

    // 节点IP
    @NameInMap("ip")
    public String ip;

    // 节点当前区块高度
    @NameInMap("height")
    public Long height;

    // 节点状态，ok, fail
    @NameInMap("status")
    public String status;

    public static ChainInsightNodeInfo build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightNodeInfo self = new ChainInsightNodeInfo();
        return TeaModel.build(map, self);
    }

    public ChainInsightNodeInfo setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ChainInsightNodeInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ChainInsightNodeInfo setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ChainInsightNodeInfo setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public ChainInsightNodeInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
