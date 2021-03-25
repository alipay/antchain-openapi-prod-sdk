// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class Accessor extends TeaModel {
    // Accessor关联的AccessKey
    @NameInMap("access_key")
    public String accessKey;

    // Accessor关联的AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
    @NameInMap("access_secret")
    public String accessSecret;

    // AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
    @NameInMap("account")
    public String account;

    // AccessKey创建时间，ISO8601格式
    @NameInMap("create_time")
    public String createTime;

    // Accessor唯一标识
    @NameInMap("id")
    public String id;

    // Accessor类型(RAM/ACCOUNT)
    @NameInMap("type")
    public String type;

    public static Accessor build(java.util.Map<String, ?> map) throws Exception {
        Accessor self = new Accessor();
        return TeaModel.build(map, self);
    }

    public Accessor setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public Accessor setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }
    public String getAccessSecret() {
        return this.accessSecret;
    }

    public Accessor setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public Accessor setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Accessor setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Accessor setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
