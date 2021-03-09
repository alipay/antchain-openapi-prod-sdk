// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteApplicationRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 欲删除的应用 id
    @NameInMap("application_ids")
    public java.util.List<String> applicationIds;

    // 是否删除绑定的代码库。默认为 false
    @NameInMap("delete_code_repo")
    public Boolean deleteCodeRepo;

    public static DeleteApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationRequest self = new DeleteApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteApplicationRequest setApplicationIds(java.util.List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

    public DeleteApplicationRequest setDeleteCodeRepo(Boolean deleteCodeRepo) {
        this.deleteCodeRepo = deleteCodeRepo;
        return this;
    }
    public Boolean getDeleteCodeRepo() {
        return this.deleteCodeRepo;
    }

}
