// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class KeyProjectInfo extends TeaModel {
    // 项目名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // key使用类型
    // MINT：发行密钥
    // BURN：赎回密钥
    // TRANSFER：转账密钥
    // MANAGER：管理密钥
    @NameInMap("key_type")
    @Validation(required = true)
    public String keyType;

    // 创建时间
    @NameInMap("gmt_created")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreated;

    public static KeyProjectInfo build(java.util.Map<String, ?> map) throws Exception {
        KeyProjectInfo self = new KeyProjectInfo();
        return TeaModel.build(map, self);
    }

    public KeyProjectInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public KeyProjectInfo setKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }
    public String getKeyType() {
        return this.keyType;
    }

    public KeyProjectInfo setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

}
