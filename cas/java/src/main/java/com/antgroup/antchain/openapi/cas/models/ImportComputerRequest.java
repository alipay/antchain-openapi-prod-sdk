// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ImportComputerRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // computer iaas ids
    @NameInMap("computer_ids")
    @Validation(required = true)
    public java.util.List<String> computerIds;

    // workspace 名称
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // computer 所在的 zone identity。可不填。
    @NameInMap("zone")
    public String zone;

    public static ImportComputerRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportComputerRequest self = new ImportComputerRequest();
        return TeaModel.build(map, self);
    }

    public ImportComputerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportComputerRequest setComputerIds(java.util.List<String> computerIds) {
        this.computerIds = computerIds;
        return this;
    }
    public java.util.List<String> getComputerIds() {
        return this.computerIds;
    }

    public ImportComputerRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public ImportComputerRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
