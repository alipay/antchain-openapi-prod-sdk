// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class Upload extends TeaModel {
    //  
    @NameInMap("endpoint")
    @Validation(required = true)
    public String endpoint;

    //  
    @NameInMap("file_unique_id")
    @Validation(required = true)
    public String fileUniqueId;

    //  
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    //  
    @NameInMap("form_param")
    @Validation(required = true)
    public FormParam formParam;

    public static Upload build(java.util.Map<String, ?> map) throws Exception {
        Upload self = new Upload();
        return TeaModel.build(map, self);
    }

    public Upload setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public Upload setFileUniqueId(String fileUniqueId) {
        this.fileUniqueId = fileUniqueId;
        return this;
    }
    public String getFileUniqueId() {
        return this.fileUniqueId;
    }

    public Upload setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public Upload setFormParam(FormParam formParam) {
        this.formParam = formParam;
        return this;
    }
    public FormParam getFormParam() {
        return this.formParam;
    }

}
