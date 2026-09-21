// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.medisaas.models;

import com.aliyun.tea.*;

public class QueryAntdigitalIntellidoctorKnowledgeOcrRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件id，多文件以,分割
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

    // 用户id
    @NameInMap("user_id")
    public String userId;

    // 会话id
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 当前轮次消息id
    @NameInMap("msg_id")
    @Validation(required = true)
    public String msgId;

    // 问题
    @NameInMap("query")
    public String query;

    // 客户侧租户Code
    @NameInMap("custom_code")
    @Validation(required = true)
    public String customCode;

    // 设备ID
    @NameInMap("device_id")
    public String deviceId;

    // 文件类型，对应服务场景
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    public static QueryAntdigitalIntellidoctorKnowledgeOcrRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalIntellidoctorKnowledgeOcrRequest self = new QueryAntdigitalIntellidoctorKnowledgeOcrRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalIntellidoctorKnowledgeOcrRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntdigitalIntellidoctorKnowledgeOcrRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntdigitalIntellidoctorKnowledgeOcrRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public QueryAntdigitalIntellidoctorKnowledgeOcrRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public QueryAntdigitalIntellidoctorKnowledgeOcrRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public QueryAntdigitalIntellidoctorKnowledgeOcrRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryAntdigitalIntellidoctorKnowledgeOcrRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public QueryAntdigitalIntellidoctorKnowledgeOcrRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public QueryAntdigitalIntellidoctorKnowledgeOcrRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public QueryAntdigitalIntellidoctorKnowledgeOcrRequest setCustomCode(String customCode) {
        this.customCode = customCode;
        return this;
    }
    public String getCustomCode() {
        return this.customCode;
    }

    public QueryAntdigitalIntellidoctorKnowledgeOcrRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public QueryAntdigitalIntellidoctorKnowledgeOcrRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
