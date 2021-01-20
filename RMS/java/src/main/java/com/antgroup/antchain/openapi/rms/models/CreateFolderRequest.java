// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CreateFolderRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    public String workspaceName;

    // 文件夹名称
    @NameInMap("name")
    public String name;

    // 父级文件夹id
    @NameInMap("parent_folder_id")
    public Long parentFolderId;

    public static CreateFolderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFolderRequest self = new CreateFolderRequest();
        return TeaModel.build(map, self);
    }

    public CreateFolderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateFolderRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public CreateFolderRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFolderRequest setParentFolderId(Long parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public Long getParentFolderId() {
        return this.parentFolderId;
    }

}
