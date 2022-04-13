// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class BindAppserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用名称
    @NameInMap("application_name")
    @Validation(required = true)
    public String applicationName;

    // 应用服务名称
    @NameInMap("app_service_name")
    @Validation(required = true)
    public String appServiceName;

    // 部署单元名称列表。 n代表第n个应用的名称，n从1开始，最大100。每个部署单元名称最大60个UTF-8字符。如果要输入多个部署单元，使用如下形式：cell_ids.1=RZ01A&cell_ids.2=RZ02B
    @NameInMap("cell_ids")
    @Validation(required = true)
    public java.util.List<String> cellIds;

    // 工作空间名称
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static BindAppserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAppserviceRequest self = new BindAppserviceRequest();
        return TeaModel.build(map, self);
    }

    public BindAppserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindAppserviceRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public BindAppserviceRequest setAppServiceName(String appServiceName) {
        this.appServiceName = appServiceName;
        return this;
    }
    public String getAppServiceName() {
        return this.appServiceName;
    }

    public BindAppserviceRequest setCellIds(java.util.List<String> cellIds) {
        this.cellIds = cellIds;
        return this;
    }
    public java.util.List<String> getCellIds() {
        return this.cellIds;
    }

    public BindAppserviceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
