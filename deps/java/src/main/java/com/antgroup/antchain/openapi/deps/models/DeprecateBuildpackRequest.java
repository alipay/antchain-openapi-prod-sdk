// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DeprecateBuildpackRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // depracationNoteMap
    @NameInMap("depracation_note_map")
    public DepracationNotePayload depracationNoteMap;

    // ids
    @NameInMap("id")
    public java.util.List<String> id;

    public static DeprecateBuildpackRequest build(java.util.Map<String, ?> map) throws Exception {
        DeprecateBuildpackRequest self = new DeprecateBuildpackRequest();
        return TeaModel.build(map, self);
    }

    public DeprecateBuildpackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeprecateBuildpackRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public DeprecateBuildpackRequest setDepracationNoteMap(DepracationNotePayload depracationNoteMap) {
        this.depracationNoteMap = depracationNoteMap;
        return this;
    }
    public DepracationNotePayload getDepracationNoteMap() {
        return this.depracationNoteMap;
    }

    public DeprecateBuildpackRequest setId(java.util.List<String> id) {
        this.id = id;
        return this;
    }
    public java.util.List<String> getId() {
        return this.id;
    }

}
