// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UpdateFolderRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 文件夹id
    @NameInMap("id")
    public Long id;

    // 文件夹新名称
    @NameInMap("name")
    public String name;

    // 工作空间
    @NameInMap("workspace_name")
    public String workspaceName;

    public static UpdateFolderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFolderRequest self = new UpdateFolderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFolderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateFolderRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateFolderRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateFolderRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
