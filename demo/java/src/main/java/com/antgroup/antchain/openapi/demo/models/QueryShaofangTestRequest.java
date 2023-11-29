// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryShaofangTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 姓名
    @NameInMap("name")
    @Validation(required = true, maxLength = 20, minLength = 1)
    public String name;

    // 日期
    @NameInMap("birth")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String birth;

    // 文件
    // 待上传文件
    @NameInMap("fileObject")
    public java.io.InputStream fileObject;

    // 待上传文件名
    @NameInMap("fileObjectName")
    public String fileObjectName;

    @NameInMap("file_id")
    @Validation(maxLength = 20, minLength = 1)
    public String fileId;

    public static QueryShaofangTestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryShaofangTestRequest self = new QueryShaofangTestRequest();
        return TeaModel.build(map, self);
    }

    public QueryShaofangTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryShaofangTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryShaofangTestRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryShaofangTestRequest setBirth(String birth) {
        this.birth = birth;
        return this;
    }
    public String getBirth() {
        return this.birth;
    }

    public QueryShaofangTestRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public QueryShaofangTestRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public QueryShaofangTestRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
