// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DetailAppMetainfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间组的label：SIT, DEV, ...
    @NameInMap("workspace_group_label")
    public String workspaceGroupLabel;

    // 应用名字
    // app:appService在此场景下为1:1，否则会报错
    @NameInMap("app_name")
    public String appName;

    public static DetailAppMetainfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailAppMetainfoRequest self = new DetailAppMetainfoRequest();
        return TeaModel.build(map, self);
    }

    public DetailAppMetainfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailAppMetainfoRequest setWorkspaceGroupLabel(String workspaceGroupLabel) {
        this.workspaceGroupLabel = workspaceGroupLabel;
        return this;
    }
    public String getWorkspaceGroupLabel() {
        return this.workspaceGroupLabel;
    }

    public DetailAppMetainfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
