// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PublicKeyRelation extends TeaModel {
    // 公钥颁发者ID
    /**
     * <strong>example:</strong>
     * <p>did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2</p>
     */
    @NameInMap("issuer_id")
    @Validation(required = true)
    public String issuerId;

    // 公钥接受者ID
    /**
     * <strong>example:</strong>
     * <p>did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2</p>
     */
    @NameInMap("recipient_id")
    @Validation(required = true)
    public String recipientId;

    public static PublicKeyRelation build(java.util.Map<String, ?> map) throws Exception {
        PublicKeyRelation self = new PublicKeyRelation();
        return TeaModel.build(map, self);
    }

    public PublicKeyRelation setIssuerId(String issuerId) {
        this.issuerId = issuerId;
        return this;
    }
    public String getIssuerId() {
        return this.issuerId;
    }

    public PublicKeyRelation setRecipientId(String recipientId) {
        this.recipientId = recipientId;
        return this;
    }
    public String getRecipientId() {
        return this.recipientId;
    }

}
