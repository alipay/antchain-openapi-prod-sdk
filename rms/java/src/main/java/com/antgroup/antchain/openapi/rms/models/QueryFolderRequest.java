// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryFolderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 父目录 ID
    @NameInMap("parent_folder_id")
    @Validation(required = true)
    public Long parentFolderId;

    public static QueryFolderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFolderRequest self = new QueryFolderRequest();
        return TeaModel.build(map, self);
    }

    public QueryFolderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFolderRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryFolderRequest setParentFolderId(Long parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public Long getParentFolderId() {
        return this.parentFolderId;
    }

}
