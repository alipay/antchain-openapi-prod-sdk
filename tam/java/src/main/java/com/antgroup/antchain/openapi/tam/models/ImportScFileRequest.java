// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class ImportScFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    //  
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    //  
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    //  
    @NameInMap("business_name")
    @Validation(required = true)
    public String businessName;

    public static ImportScFileRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportScFileRequest self = new ImportScFileRequest();
        return TeaModel.build(map, self);
    }

    public ImportScFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportScFileRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ImportScFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ImportScFileRequest setBusinessName(String businessName) {
        this.businessName = businessName;
        return this;
    }
    public String getBusinessName() {
        return this.businessName;
    }

}
