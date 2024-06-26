// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class EntityChainData extends TeaModel {
    // 实体ID
    @NameInMap("entity_id")
    @Validation(required = true)
    public String entityId;

    // 数据原文
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 数据原文对应的签名
    @NameInMap("sign")
    @Validation(required = true)
    public String sign;

    // 数据原文上链哈希
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    public static EntityChainData build(java.util.Map<String, ?> map) throws Exception {
        EntityChainData self = new EntityChainData();
        return TeaModel.build(map, self);
    }

    public EntityChainData setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public EntityChainData setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public EntityChainData setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

    public EntityChainData setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
