// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class PostbackLeadReceiveRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

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

    // 请求id，每一次请求保持唯一，若重复，则报错；
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 通知类型：固定 LEAD_PUSH_NOTIFY（既往症线索推送通知）
    @NameInMap("notify_type")
    @Validation(required = true)
    public String notifyType;

    // 动作类型：首次-FULL_PUSH，周期-TRIGGER_PUSH
    @NameInMap("action_type")
    @Validation(required = true)
    public String actionType;

    // json格式数据updateCycle等字段
    @NameInMap("notify_info")
    public String notifyInfo;

    // 客户「既往症线索周期变更」受理号透传，供给方回传结果文件时随请求带回
    @NameInMap("accept_no")
    @Validation(required = true)
    public String acceptNo;

    public static PostbackLeadReceiveRequest build(java.util.Map<String, ?> map) throws Exception {
        PostbackLeadReceiveRequest self = new PostbackLeadReceiveRequest();
        return TeaModel.build(map, self);
    }

    public PostbackLeadReceiveRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PostbackLeadReceiveRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public PostbackLeadReceiveRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public PostbackLeadReceiveRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public PostbackLeadReceiveRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PostbackLeadReceiveRequest setNotifyType(String notifyType) {
        this.notifyType = notifyType;
        return this;
    }
    public String getNotifyType() {
        return this.notifyType;
    }

    public PostbackLeadReceiveRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public PostbackLeadReceiveRequest setNotifyInfo(String notifyInfo) {
        this.notifyInfo = notifyInfo;
        return this;
    }
    public String getNotifyInfo() {
        return this.notifyInfo;
    }

    public PostbackLeadReceiveRequest setAcceptNo(String acceptNo) {
        this.acceptNo = acceptNo;
        return this;
    }
    public String getAcceptNo() {
        return this.acceptNo;
    }

}
