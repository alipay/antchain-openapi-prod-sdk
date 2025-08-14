// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class KeyInfo extends TeaModel {
    // 密钥ID
    /**
     * <strong>example:</strong>
     * <p>1826615104029319169</p>
     */
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    // 密钥名称
    /**
     * <strong>example:</strong>
     * <p>manager_key</p>
     */
    @NameInMap("key_name")
    @Validation(required = true)
    public String keyName;

    // 密钥地址
    /**
     * <strong>example:</strong>
     * <p>0x9168f016a64df83d7de267fa5588674377a15be7</p>
     */
    @NameInMap("key_address")
    @Validation(required = true)
    public String keyAddress;

    // 密钥类型(MINT：发行密钥；BURN：赎回密钥；TRANSFER：转账密钥；MANAGER：管理密钥)
    /**
     * <strong>example:</strong>
     * <p>MINT</p>
     */
    @NameInMap("key_type")
    @Validation(required = true)
    public String keyType;

    public static KeyInfo build(java.util.Map<String, ?> map) throws Exception {
        KeyInfo self = new KeyInfo();
        return TeaModel.build(map, self);
    }

    public KeyInfo setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public KeyInfo setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

    public KeyInfo setKeyAddress(String keyAddress) {
        this.keyAddress = keyAddress;
        return this;
    }
    public String getKeyAddress() {
        return this.keyAddress;
    }

    public KeyInfo setKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }
    public String getKeyType() {
        return this.keyType;
    }

}
