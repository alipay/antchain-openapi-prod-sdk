// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class ReceiveLeadOpportunitiesRequest extends TeaModel {
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

    // 产品编码，蚂蚁分配
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 业务入参json格式字符串action_type:场景类型:FULL_PUSH-首次下发，携带底包文件,TRIGGER_PUSH-圈客周期变更触发，不携带文件；不传按 FULL_PUSH 处理;accept_no:首次 FULL_PUSH 受理回执返回的受理号，蚂蚁校验存在对应首次下发记录（查无记录受理失败）；FULL_PUSH 由蚂蚁生成并随受理回执返回;update_cycle{"cycleType":"WEEKLY","cycleValue":3,"time":"10:00"}	圈客周期,每周示例：{"cycleType":"WEEKLY","cycleValue":3,"time":"10:00"}，每月示例：每月10号 {"cycleType":"MONTHLY","cycleValue":10,"time":"10:00"}
    @NameInMap("biz_content")
    public String bizContent;

    // 固定值：PAST_MED（既往症人群评分）业务场景
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    public static ReceiveLeadOpportunitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ReceiveLeadOpportunitiesRequest self = new ReceiveLeadOpportunitiesRequest();
        return TeaModel.build(map, self);
    }

    public ReceiveLeadOpportunitiesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReceiveLeadOpportunitiesRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public ReceiveLeadOpportunitiesRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public ReceiveLeadOpportunitiesRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ReceiveLeadOpportunitiesRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReceiveLeadOpportunitiesRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ReceiveLeadOpportunitiesRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public ReceiveLeadOpportunitiesRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
