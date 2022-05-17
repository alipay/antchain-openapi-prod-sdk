// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class AccessKey extends TeaModel {
    // AK
    @NameInMap("accesskey")
    @Validation(required = true)
    public String accesskey;

    // 实体创建者
    @NameInMap("creator")
    @Validation(required = true)
    public String creator;

    // 创建时间
    @NameInMap("gmtcreate")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtcreate;

    // 实体Id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 实例Id
    @NameInMap("instanceid")
    @Validation(required = true)
    public String instanceid;

    // 是否加密
    @NameInMap("isencrypted")
    @Validation(required = true)
    public Boolean isencrypted;

    // 实体名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // SK
    @NameInMap("secretkey")
    @Validation(required = true)
    public String secretkey;

    public static AccessKey build(java.util.Map<String, ?> map) throws Exception {
        AccessKey self = new AccessKey();
        return TeaModel.build(map, self);
    }

    public AccessKey setAccesskey(String accesskey) {
        this.accesskey = accesskey;
        return this;
    }
    public String getAccesskey() {
        return this.accesskey;
    }

    public AccessKey setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public AccessKey setGmtcreate(String gmtcreate) {
        this.gmtcreate = gmtcreate;
        return this;
    }
    public String getGmtcreate() {
        return this.gmtcreate;
    }

    public AccessKey setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AccessKey setInstanceid(String instanceid) {
        this.instanceid = instanceid;
        return this;
    }
    public String getInstanceid() {
        return this.instanceid;
    }

    public AccessKey setIsencrypted(Boolean isencrypted) {
        this.isencrypted = isencrypted;
        return this;
    }
    public Boolean getIsencrypted() {
        return this.isencrypted;
    }

    public AccessKey setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AccessKey setSecretkey(String secretkey) {
        this.secretkey = secretkey;
        return this;
    }
    public String getSecretkey() {
        return this.secretkey;
    }

}
