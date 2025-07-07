// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class VcShareStruct extends TeaModel {
    // 分享的目标VC的id
    /**
     * <strong>example:</strong>
     * <p>未定义</p>
     */
    @NameInMap("vc_id")
    @Validation(required = true)
    public String vcId;

    // 目标的VC持有者的did
    /**
     * <strong>example:</strong>
     * <p>did:mychain:6d8f3ff4af91532eaa7fc477be6b68dea14ed3bcfd5755ccedced43f6c248214</p>
     */
    @NameInMap("owner_did")
    @Validation(required = true)
    public String ownerDid;

    // 在支持声明的claim字段级别分享能力时使用，可以指定哪些字段隐藏，哪些字段分享。示例中标记为”1“的是隐藏，”0“的是分享明文。
    /**
     * <strong>example:</strong>
     * <p>{ &quot;Item1&quot;: &quot;1&quot;, &quot;学历信息&quot;: [ { &quot;学历&quot;: &quot;0&quot;, &quot;毕业院校&quot;: &quot;0&quot;, &quot;专业&quot;: &quot;0&quot;, &quot;Item2&quot;:&quot;1&quot;, }, &quot;1&quot;, ], &quot;Item3&quot;:&quot;1&quot; }</p>
     */
    @NameInMap("index")
    public String index;

    // 非托管模式下owner_did的签名，作为授权凭证
    /**
     * <strong>example:</strong>
     * <p>jN1LVH5YhbTvgrdeBqlImPJBWDzVdNyyHZ1n9A0pSOQKnt11jWM5Qn707+wEa7bc8TOd1WvRItTe
     * mx4xYCqX0gE=
     *  </p>
     */
    @NameInMap("signature")
    public String signature;

    public static VcShareStruct build(java.util.Map<String, ?> map) throws Exception {
        VcShareStruct self = new VcShareStruct();
        return TeaModel.build(map, self);
    }

    public VcShareStruct setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

    public VcShareStruct setOwnerDid(String ownerDid) {
        this.ownerDid = ownerDid;
        return this;
    }
    public String getOwnerDid() {
        return this.ownerDid;
    }

    public VcShareStruct setIndex(String index) {
        this.index = index;
        return this;
    }
    public String getIndex() {
        return this.index;
    }

    public VcShareStruct setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
