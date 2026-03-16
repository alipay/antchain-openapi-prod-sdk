// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class UploadAlipayAgentchatRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // fileId
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
    public String fileId;

    // 文件解析方式
    // deep：e2md深度解析，耗时较长 
    // simple：本地解析，解析快
    // 不传：使用默认配置
    @NameInMap("parse_type")
    public String parseType;

    public static UploadAlipayAgentchatRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadAlipayAgentchatRequest self = new UploadAlipayAgentchatRequest();
        return TeaModel.build(map, self);
    }

    public UploadAlipayAgentchatRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadAlipayAgentchatRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadAlipayAgentchatRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public UploadAlipayAgentchatRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public UploadAlipayAgentchatRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public UploadAlipayAgentchatRequest setParseType(String parseType) {
        this.parseType = parseType;
        return this;
    }
    public String getParseType() {
        return this.parseType;
    }

}
