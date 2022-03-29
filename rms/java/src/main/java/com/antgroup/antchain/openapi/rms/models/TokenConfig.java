// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TokenConfig extends TeaModel {
    // token
    @NameInMap("token")
    public String token;

    // 创建时间
    @NameInMap("gmt_create")
    public String gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    public String gmtModified;

    // last_editor
    @NameInMap("last_editor")
    public String lastEditor;

    public static TokenConfig build(java.util.Map<String, ?> map) throws Exception {
        TokenConfig self = new TokenConfig();
        return TeaModel.build(map, self);
    }

    public TokenConfig setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public TokenConfig setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public TokenConfig setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public TokenConfig setLastEditor(String lastEditor) {
        this.lastEditor = lastEditor;
        return this;
    }
    public String getLastEditor() {
        return this.lastEditor;
    }

}
