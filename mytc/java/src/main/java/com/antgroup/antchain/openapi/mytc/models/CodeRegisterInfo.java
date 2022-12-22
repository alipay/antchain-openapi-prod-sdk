// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class CodeRegisterInfo extends TeaModel {
    // 溯源码，代表该账户的唯一资源标识
    @NameInMap("code")
    @Validation(required = true, maxLength = 160, minLength = 1)
    public String code;

    // 状态,客户自定义状态，用于过滤查询使用
    @NameInMap("status")
    @Validation(maxLength = 32, minLength = 2)
    public String status;

    // 关联溯源码列表，可以通过接口查询关联溯源码绑定的信息
    @NameInMap("relation_codes")
    public java.util.List<String> relationCodes;

    // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度128
    @NameInMap("biz_labels")
    public java.util.List<String> bizLabels;

    // 注册内容
    @NameInMap("content")
    public String content;

    // 区块链上交易哈希
    @NameInMap("tx_hash")
    public String txHash;

    // 注册溯源码记录唯一标识
    @NameInMap("unique_id")
    public String uniqueId;

    public static CodeRegisterInfo build(java.util.Map<String, ?> map) throws Exception {
        CodeRegisterInfo self = new CodeRegisterInfo();
        return TeaModel.build(map, self);
    }

    public CodeRegisterInfo setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CodeRegisterInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CodeRegisterInfo setRelationCodes(java.util.List<String> relationCodes) {
        this.relationCodes = relationCodes;
        return this;
    }
    public java.util.List<String> getRelationCodes() {
        return this.relationCodes;
    }

    public CodeRegisterInfo setBizLabels(java.util.List<String> bizLabels) {
        this.bizLabels = bizLabels;
        return this;
    }
    public java.util.List<String> getBizLabels() {
        return this.bizLabels;
    }

    public CodeRegisterInfo setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CodeRegisterInfo setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public CodeRegisterInfo setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

}
