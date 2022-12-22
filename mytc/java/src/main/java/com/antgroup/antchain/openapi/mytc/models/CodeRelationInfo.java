// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class CodeRelationInfo extends TeaModel {
    // 溯源码，代表该账户的唯一资源标识
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 状态,客户自定义状态，用于过滤查询使用，仅支持字母数字构成
    // 
    @NameInMap("status")
    public String status;

    // 关联内容
    @NameInMap("content")
    public String content;

    // 区块链上交易哈希
    @NameInMap("tx_hash")
    public String txHash;

    // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度128
    @NameInMap("biz_labels")
    public java.util.List<String> bizLabels;

    // 溯源码信息关联记录唯一标识
    @NameInMap("unique_id")
    public String uniqueId;

    public static CodeRelationInfo build(java.util.Map<String, ?> map) throws Exception {
        CodeRelationInfo self = new CodeRelationInfo();
        return TeaModel.build(map, self);
    }

    public CodeRelationInfo setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CodeRelationInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CodeRelationInfo setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CodeRelationInfo setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public CodeRelationInfo setBizLabels(java.util.List<String> bizLabels) {
        this.bizLabels = bizLabels;
        return this;
    }
    public java.util.List<String> getBizLabels() {
        return this.bizLabels;
    }

    public CodeRelationInfo setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

}
