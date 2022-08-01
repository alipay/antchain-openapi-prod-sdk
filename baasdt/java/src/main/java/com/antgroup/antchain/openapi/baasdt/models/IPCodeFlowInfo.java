// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPCodeFlowInfo extends TeaModel {
    // 拥有用户名称，收藏人
    @NameInMap("code_owner_name")
    public String codeOwnerName;

    // 收藏时间
    @NameInMap("code_collect_time")
    public Long codeCollectTime;

    // 收藏交易哈希
    @NameInMap("code_trans_hash")
    public String codeTransHash;

    // 收藏交易块高
    @NameInMap("code_trans_block_number")
    public Long codeTransBlockNumber;

    // 流转信息jsonstring
    @NameInMap("ext_info")
    public String extInfo;

    public static IPCodeFlowInfo build(java.util.Map<String, ?> map) throws Exception {
        IPCodeFlowInfo self = new IPCodeFlowInfo();
        return TeaModel.build(map, self);
    }

    public IPCodeFlowInfo setCodeOwnerName(String codeOwnerName) {
        this.codeOwnerName = codeOwnerName;
        return this;
    }
    public String getCodeOwnerName() {
        return this.codeOwnerName;
    }

    public IPCodeFlowInfo setCodeCollectTime(Long codeCollectTime) {
        this.codeCollectTime = codeCollectTime;
        return this;
    }
    public Long getCodeCollectTime() {
        return this.codeCollectTime;
    }

    public IPCodeFlowInfo setCodeTransHash(String codeTransHash) {
        this.codeTransHash = codeTransHash;
        return this;
    }
    public String getCodeTransHash() {
        return this.codeTransHash;
    }

    public IPCodeFlowInfo setCodeTransBlockNumber(Long codeTransBlockNumber) {
        this.codeTransBlockNumber = codeTransBlockNumber;
        return this;
    }
    public Long getCodeTransBlockNumber() {
        return this.codeTransBlockNumber;
    }

    public IPCodeFlowInfo setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
