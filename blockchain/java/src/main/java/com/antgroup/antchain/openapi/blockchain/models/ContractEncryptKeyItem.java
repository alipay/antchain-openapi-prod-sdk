// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContractEncryptKeyItem extends TeaModel {
    // 字段对应的id
    /**
     * <strong>example:</strong>
     * <p>keyId</p>
     */
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 0:encrypt_text,
    // 1:encrypt_array_text,
    // 2:encrypt_int
    // 3:encrypt_array_int
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    // 字段对应的数据
    /**
     * <strong>example:</strong>
     * <p>&quot;value_1&quot;</p>
     */
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static ContractEncryptKeyItem build(java.util.Map<String, ?> map) throws Exception {
        ContractEncryptKeyItem self = new ContractEncryptKeyItem();
        return TeaModel.build(map, self);
    }

    public ContractEncryptKeyItem setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ContractEncryptKeyItem setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public ContractEncryptKeyItem setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
