// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class PreviewFileInfo extends TeaModel {
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    @NameInMap("type")
    @Validation(required = true)
    public String type;

    @NameInMap("url")
    @Validation(required = true)
    public String url;

    @NameInMap("expire_at")
    @Validation(required = true)
    public Long expireAt;

    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static PreviewFileInfo build(java.util.Map<String, ?> map) throws Exception {
        PreviewFileInfo self = new PreviewFileInfo();
        return TeaModel.build(map, self);
    }

    public PreviewFileInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PreviewFileInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PreviewFileInfo setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public PreviewFileInfo setExpireAt(Long expireAt) {
        this.expireAt = expireAt;
        return this;
    }
    public Long getExpireAt() {
        return this.expireAt;
    }

    public PreviewFileInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
