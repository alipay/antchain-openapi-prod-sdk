// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class UpdateDatabaseSpecRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // db paas id
    @NameInMap("database_sequences")
    @Validation(required = true)
    public java.util.List<String> databaseSequences;

    // 实例规格 id
    @NameInMap("spec_id")
    @Validation(required = true)
    public String specId;

    // 存储空间大小
    @NameInMap("storage_size")
    @Validation(required = true)
    public Long storageSize;

    public static UpdateDatabaseSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatabaseSpecRequest self = new UpdateDatabaseSpecRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDatabaseSpecRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDatabaseSpecRequest setDatabaseSequences(java.util.List<String> databaseSequences) {
        this.databaseSequences = databaseSequences;
        return this;
    }
    public java.util.List<String> getDatabaseSequences() {
        return this.databaseSequences;
    }

    public UpdateDatabaseSpecRequest setSpecId(String specId) {
        this.specId = specId;
        return this;
    }
    public String getSpecId() {
        return this.specId;
    }

    public UpdateDatabaseSpecRequest setStorageSize(Long storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public Long getStorageSize() {
        return this.storageSize;
    }

}
