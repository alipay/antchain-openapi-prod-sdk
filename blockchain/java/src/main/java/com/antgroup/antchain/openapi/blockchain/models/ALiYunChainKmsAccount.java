// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChainKmsAccount extends TeaModel {
    // 账户公钥
    /**
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("pub_key")
    public String pubKey;

    // 托管秘钥ID
    /**
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("my_kms_key_id")
    public String myKmsKeyId;

    public static ALiYunChainKmsAccount build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainKmsAccount self = new ALiYunChainKmsAccount();
        return TeaModel.build(map, self);
    }

    public ALiYunChainKmsAccount setPubKey(String pubKey) {
        this.pubKey = pubKey;
        return this;
    }
    public String getPubKey() {
        return this.pubKey;
    }

    public ALiYunChainKmsAccount setMyKmsKeyId(String myKmsKeyId) {
        this.myKmsKeyId = myKmsKeyId;
        return this;
    }
    public String getMyKmsKeyId() {
        return this.myKmsKeyId;
    }

}
