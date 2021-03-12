// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PublicKey extends TeaModel {
    // 公钥颁发者ID
    @NameInMap("issuer_id")
    @Validation(required = true, maxLength = 100)
    public String issuerId;

    // 公钥内容
    @NameInMap("public_key_content")
    @Validation(required = true)
    public String publicKeyContent;

    // 公钥接受者ID
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
