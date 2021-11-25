// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class SwitchSwitchFirmfinancialRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业id
    @NameInMap("firm_id")
    @Validation(required = true)
    public Long firmId;

    // 租户类型
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 操作类型（新增：add，删除：delete)
    @NameInMap("operation_type")
    @Validation(required = true)
    public String operationType;

    // 业务id
    @NameInMap("biz_id")
    public String bizId;

    // 财报信息
    @NameInMap("file_info")
    public FileInfo fileInfo;

    public static SwitchSwitchFirmfinancialRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchSwitchFirmfinancialRequest self = new SwitchSwitchFirmfinancialRequest();
        return TeaModel.build(map, self);
    }

    public SwitchSwitchFirmfinancialRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SwitchSwitchFirmfinancialRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SwitchSwitchFirmfinancialRequest setFirmId(Long firmId) {
        this.firmId = firmId;
        return this;
    }
    public Long getFirmId() {
        return this.firmId;
    }

    public SwitchSwitchFirmfinancialRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SwitchSwitchFirmfinancialRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public SwitchSwitchFirmfinancialRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SwitchSwitchFirmfinancialRequest setFileInfo(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }
    public FileInfo getFileInfo() {
        return this.fileInfo;
    }

}
