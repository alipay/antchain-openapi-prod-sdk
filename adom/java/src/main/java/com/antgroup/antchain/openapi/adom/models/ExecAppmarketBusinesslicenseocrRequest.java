// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.adom.models;

import com.aliyun.tea.*;

public class ExecAppmarketBusinesslicenseocrRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 商品实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 文件key
    @NameInMap("file_key")
    public String fileKey;

    // 文件url
    @NameInMap("file_url")
    public String fileUrl;

    // 扩展信息
    @NameInMap("ext")
    public String ext;

    public static ExecAppmarketBusinesslicenseocrRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAppmarketBusinesslicenseocrRequest self = new ExecAppmarketBusinesslicenseocrRequest();
        return TeaModel.build(map, self);
    }

    public ExecAppmarketBusinesslicenseocrRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAppmarketBusinesslicenseocrRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExecAppmarketBusinesslicenseocrRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public ExecAppmarketBusinesslicenseocrRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public ExecAppmarketBusinesslicenseocrRequest setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

}
