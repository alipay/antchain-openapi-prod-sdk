// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class AccessKey extends TeaModel {
    // AccessKey创建时间，ISO8601格式
    @NameInMap("create_time")
    public String createTime;

    // AccessKey唯一标识
    @NameInMap("id")
    public String id;

    // AccessKey的秘钥，加密传输，网关返回后，使用调用方的AccesSecret进行解密
    @NameInMap("secret")
    public String secret;

    // 状态
    @NameInMap("status")
    public String status;

    // AccessKey最近一次修改时间，ISO8601格式
    @NameInMap("update_time")
    public String updateTime;

    public static AccessKey build(java.util.Map<String, ?> map) throws Exception {
        AccessKey self = new AccessKey();
        return TeaModel.build(map, self);
    }

    public AccessKey setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public AccessKey setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AccessKey setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

    public AccessKey setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AccessKey setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
