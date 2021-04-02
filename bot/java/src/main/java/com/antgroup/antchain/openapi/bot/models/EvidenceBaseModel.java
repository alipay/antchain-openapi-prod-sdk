// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class EvidenceBaseModel extends TeaModel {
    // 业务数据
    @NameInMap("biz_data")
    public String bizData;

    // 证据哈希值
    @NameInMap("hash")
    public String hash;

    // 证据附属信息字段
    @NameInMap("meta_json")
    public String metaJson;

    public static EvidenceBaseModel build(java.util.Map<String, ?> map) throws Exception {
        EvidenceBaseModel self = new EvidenceBaseModel();
        return TeaModel.build(map, self);
    }

    public EvidenceBaseModel setBizData(String bizData) {
        this.bizData = bizData;
        return this;
    }
    public String getBizData() {
        return this.bizData;
    }

    public EvidenceBaseModel setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public EvidenceBaseModel setMetaJson(String metaJson) {
        this.metaJson = metaJson;
        return this;
    }
    public String getMetaJson() {
        return this.metaJson;
    }

}
