// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class EvidenceStorageReq extends TeaModel {
    // 业务数据，原文上链，或者加密（label若为CRYPTO）上链，上链后的业务数据，通过授权可被区块链其他业务方查询
    @NameInMap("biz_data")
    public String bizData;

    // 不同上链方式
    // 空/"": 默认
    // "TTTS": 溯源
    // "IOTPAY": 支付
    // "CZ": 存证
    // "RAW":文本
    @NameInMap("category")
    @Validation(required = true)
    public String category;

    // 上链实体id(设备/空间)
    // 不可和project_uid同时为空
    @NameInMap("iot_did")
    public String iotDid;

    // 需要上链的证据的哈希值
    @NameInMap("hash")
    public String hash;

    // 上链的附属信息
    @NameInMap("meta_json")
    public String metaJson;

    // 上链的项目id,
    // 不可和iot_did同时为空
    @NameInMap("project_uid")
    public String projectUid;

    public static EvidenceStorageReq build(java.util.Map<String, ?> map) throws Exception {
        EvidenceStorageReq self = new EvidenceStorageReq();
        return TeaModel.build(map, self);
    }

    public EvidenceStorageReq setBizData(String bizData) {
        this.bizData = bizData;
        return this;
    }
    public String getBizData() {
        return this.bizData;
    }

    public EvidenceStorageReq setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public EvidenceStorageReq setIotDid(String iotDid) {
        this.iotDid = iotDid;
        return this;
    }
    public String getIotDid() {
        return this.iotDid;
    }

    public EvidenceStorageReq setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public EvidenceStorageReq setMetaJson(String metaJson) {
        this.metaJson = metaJson;
        return this;
    }
    public String getMetaJson() {
        return this.metaJson;
    }

    public EvidenceStorageReq setProjectUid(String projectUid) {
        this.projectUid = projectUid;
        return this;
    }
    public String getProjectUid() {
        return this.projectUid;
    }

}
