// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class SaveCpfCertuseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务流水号
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 身份证ID
    @NameInMap("data_owner_identity")
    @Validation(required = true)
    public String dataOwnerIdentity;

    // 姓名
    @NameInMap("data_owner_name")
    @Validation(required = true)
    public String dataOwnerName;

    // 用数机构ID
    @NameInMap("data_user_identity")
    @Validation(required = true)
    public String dataUserIdentity;

    // 用数机构名称
    @NameInMap("data_user_name")
    @Validation(required = true)
    public String dataUserName;

    // 用数端ID
    @NameInMap("terminal_identity")
    @Validation(required = true)
    public String terminalIdentity;

    // 用数目的
    @NameInMap("purpose")
    @Validation(required = true)
    public String purpose;

    // 用数时间
    @NameInMap("operate_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String operateTime;

    // 扩展字段
    @NameInMap("extend_params")
    public String extendParams;

    public static SaveCpfCertuseRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveCpfCertuseRequest self = new SaveCpfCertuseRequest();
        return TeaModel.build(map, self);
    }

    public SaveCpfCertuseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveCpfCertuseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveCpfCertuseRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SaveCpfCertuseRequest setDataOwnerIdentity(String dataOwnerIdentity) {
        this.dataOwnerIdentity = dataOwnerIdentity;
        return this;
    }
    public String getDataOwnerIdentity() {
        return this.dataOwnerIdentity;
    }

    public SaveCpfCertuseRequest setDataOwnerName(String dataOwnerName) {
        this.dataOwnerName = dataOwnerName;
        return this;
    }
    public String getDataOwnerName() {
        return this.dataOwnerName;
    }

    public SaveCpfCertuseRequest setDataUserIdentity(String dataUserIdentity) {
        this.dataUserIdentity = dataUserIdentity;
        return this;
    }
    public String getDataUserIdentity() {
        return this.dataUserIdentity;
    }

    public SaveCpfCertuseRequest setDataUserName(String dataUserName) {
        this.dataUserName = dataUserName;
        return this;
    }
    public String getDataUserName() {
        return this.dataUserName;
    }

    public SaveCpfCertuseRequest setTerminalIdentity(String terminalIdentity) {
        this.terminalIdentity = terminalIdentity;
        return this;
    }
    public String getTerminalIdentity() {
        return this.terminalIdentity;
    }

    public SaveCpfCertuseRequest setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }
    public String getPurpose() {
        return this.purpose;
    }

    public SaveCpfCertuseRequest setOperateTime(String operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public String getOperateTime() {
        return this.operateTime;
    }

    public SaveCpfCertuseRequest setExtendParams(String extendParams) {
        this.extendParams = extendParams;
        return this;
    }
    public String getExtendParams() {
        return this.extendParams;
    }

}
