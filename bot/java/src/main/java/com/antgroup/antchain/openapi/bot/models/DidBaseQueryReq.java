// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DidBaseQueryReq extends TeaModel {
    // * "thingId"       原始ID
    // * "certText"      证书文本
    // * "certPublicKey"证书公钥
    // * "didPublicKey" DID公钥
    // * "didExtension"  DID扩展，设备/企业组织/仓库/空间的解析同thingsExtraParams
    // * "didUsername"   DID用户名
    // * "ownerDid"      所有者DID
    // * "userDid"       使用者DID
    // * "thingType"     实体类型，设备/企业组织/仓库/空间等
    // * "thingStatus"   实体状态
    // * "thingModelId" 实体物模型类型
    // * "thingAttribute"实体属性
    // * "thingVersion"  实体版本
    // * "spacesAttached"关联空间列表
    // * "thingsAttached"关联实体列表（例：库位关联设备）
    // * "authLevel"     授权等级
    // * "thingServiceEndpoint" 服务列表
    /**
     * <strong>example:</strong>
     * <p>[&quot;如下1&quot;,&quot;如下2&quot;]</p>
     */
    @NameInMap("data_filter")
    @Validation(required = true)
    public java.util.List<String> dataFilter;

    // 是否从链上查询，从链上查询将返回txHash值
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("on_chain")
    @Validation(required = true)
    public Boolean onChain;

    // 需要查询的实体Did列表，同一次查询的Did须为相同类型
    /**
     * <strong>example:</strong>
     * <p>[&quot;did:iot:xxxx&quot;,&quot;did:iot:yyyyy&quot;]</p>
     */
    @NameInMap("things_did_list")
    @Validation(required = true)
    public java.util.List<String> thingsDidList;

    public static DidBaseQueryReq build(java.util.Map<String, ?> map) throws Exception {
        DidBaseQueryReq self = new DidBaseQueryReq();
        return TeaModel.build(map, self);
    }

    public DidBaseQueryReq setDataFilter(java.util.List<String> dataFilter) {
        this.dataFilter = dataFilter;
        return this;
    }
    public java.util.List<String> getDataFilter() {
        return this.dataFilter;
    }

    public DidBaseQueryReq setOnChain(Boolean onChain) {
        this.onChain = onChain;
        return this;
    }
    public Boolean getOnChain() {
        return this.onChain;
    }

    public DidBaseQueryReq setThingsDidList(java.util.List<String> thingsDidList) {
        this.thingsDidList = thingsDidList;
        return this;
    }
    public java.util.List<String> getThingsDidList() {
        return this.thingsDidList;
    }

}
