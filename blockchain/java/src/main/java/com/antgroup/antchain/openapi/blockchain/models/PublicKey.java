// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PublicKey extends TeaModel {
    // 公钥颁发者ID
    /**
     * <strong>example:</strong>
     * <p>did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2</p>
     */
    @NameInMap("issuer_id")
    @Validation(required = true, maxLength = 100)
    public String issuerId;

    // 公钥内容
    /**
     * <strong>example:</strong>
     * <p>AQEETAAAAEEAAAAETbYFwqfIiyqFWt2Tasr2f4+wjKcEXsFupLxM6WZohB702fTTsuw88bp7LKBskdWhDiZvpeIShOzZopg95psaFw==</p>
     */
    @NameInMap("public_key_content")
    @Validation(required = true)
    public String publicKeyContent;

    // 公钥接受者ID
    /**
     * <strong>example:</strong>
     * <p>did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2</p>
     */
    @NameInMap("recipient_id")
    @Validation(required = true, maxLength = 100)
    public String recipientId;

    public static PublicKey build(java.util.Map<String, ?> map) throws Exception {
        PublicKey self = new PublicKey();
        return TeaModel.build(map, self);
    }

    public PublicKey setIssuerId(String issuerId) {
        this.issuerId = issuerId;
        return this;
    }
    public String getIssuerId() {
        return this.issuerId;
    }

    public PublicKey setPublicKeyContent(String publicKeyContent) {
        this.publicKeyContent = publicKeyContent;
        return this;
    }
    public String getPublicKeyContent() {
        return this.publicKeyContent;
    }

    public PublicKey setRecipientId(String recipientId) {
        this.recipientId = recipientId;
        return this;
    }
    public String getRecipientId() {
        return this.recipientId;
    }

}
