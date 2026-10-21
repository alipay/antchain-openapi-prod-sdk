// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryCimTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // string
    /**
     * <p>待上传文件</p>
     */
    @NameInMap("fileObject")
    public java.io.InputStream fileObject;

    /**
     * <p>待上传文件名</p>
     */
    @NameInMap("fileObjectName")
    public String fileObjectName;

    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 1231
    @NameInMap("idcard")
    public GroupAClass idcard;

    // 222
    @NameInMap("text")
    public AbcdEfgh text;

    // 23
    @NameInMap("name")
    public NameBean name;

    public static QueryCimTestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCimTestRequest self = new QueryCimTestRequest();
        return TeaModel.build(map, self);
    }

    public QueryCimTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCimTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCimTestRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public QueryCimTestRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public QueryCimTestRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public QueryCimTestRequest setIdcard(GroupAClass idcard) {
        this.idcard = idcard;
        return this;
    }
    public GroupAClass getIdcard() {
        return this.idcard;
    }

    public QueryCimTestRequest setText(AbcdEfgh text) {
        this.text = text;
        return this;
    }
    public AbcdEfgh getText() {
        return this.text;
    }

    public QueryCimTestRequest setName(NameBean name) {
        this.name = name;
        return this;
    }
    public NameBean getName() {
        return this.name;
    }

}
