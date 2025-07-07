// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class Claim extends TeaModel {
    // 一个json的string，内容包含具体需要的声明，不同业务场景不同。
    /**
     * <strong>example:</strong>
     * <p>{&quot;issuerName&quot;:&quot;XX有限公司&quot;,&quot;userNo&quot;:&quot;12123434&quot;}</p>
     */
    @NameInMap("claim_content")
    @Validation(required = true)
    public String claimContent;

    // 如果在相同的biz_type下，还需要针对声明claim进行细化划分，可以使用此字段。
    /**
     * <strong>example:</strong>
     * <p>Level1</p>
     */
    @NameInMap("claim_type")
    public String claimType;

    // 申请声明颁发后的有效期，可选参数，如果不指定则默认申请永久有效。
    /**
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("expire")
    public Long expire;

    // 授权颁发可验证声明的目标did信息，通常为机构或组织的did
    /**
     * <strong>example:</strong>
     * <p>did:mychain:6d8f3ff4af91532eaa7fc477be6b68dea14ed3bcfd5755ccedced43f6c248214</p>
     */
    @NameInMap("did")
    public String did;

    // 目标待授权的名称，标定唯一性，与claim内容配合使用，如果不指定did可以考虑使用此字段。
    /**
     * <strong>example:</strong>
     * <p>XX有限公司</p>
     */
    @NameInMap("name")
    public String name;

    public static Claim build(java.util.Map<String, ?> map) throws Exception {
        Claim self = new Claim();
        return TeaModel.build(map, self);
    }

    public Claim setClaimContent(String claimContent) {
        this.claimContent = claimContent;
        return this;
    }
    public String getClaimContent() {
        return this.claimContent;
    }

    public Claim setClaimType(String claimType) {
        this.claimType = claimType;
        return this;
    }
    public String getClaimType() {
        return this.claimType;
    }

    public Claim setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public Claim setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public Claim setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
