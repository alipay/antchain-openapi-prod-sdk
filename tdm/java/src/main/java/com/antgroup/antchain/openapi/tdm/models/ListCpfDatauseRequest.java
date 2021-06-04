// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class ListCpfDatauseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 端ID
    @NameInMap("terminal_identity")
    @Validation(required = true)
    public String terminalIdentity;

    // 使用方ID
    @NameInMap("data_user_identity")
    @Validation(required = true)
    public String dataUserIdentity;

    // 用户身份证ID
    @NameInMap("data_owner_identity")
    public String dataOwnerIdentity;

    // 筛选时间，按月份筛选，默认当前月份
    @NameInMap("option_time")
    public String optionTime;

    // 数据类型
    @NameInMap("type")
    public String type;

    // 数据类型
    @NameInMap("data_code")
    public String dataCode;

    public static ListCpfDatauseRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCpfDatauseRequest self = new ListCpfDatauseRequest();
        return TeaModel.build(map, self);
    }

    public ListCpfDatauseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListCpfDatauseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListCpfDatauseRequest setTerminalIdentity(String terminalIdentity) {
        this.terminalIdentity = terminalIdentity;
        return this;
    }
    public String getTerminalIdentity() {
        return this.terminalIdentity;
    }

    public ListCpfDatauseRequest setDataUserIdentity(String dataUserIdentity) {
        this.dataUserIdentity = dataUserIdentity;
        return this;
    }
    public String getDataUserIdentity() {
        return this.dataUserIdentity;
    }

    public ListCpfDatauseRequest setDataOwnerIdentity(String dataOwnerIdentity) {
        this.dataOwnerIdentity = dataOwnerIdentity;
        return this;
    }
    public String getDataOwnerIdentity() {
        return this.dataOwnerIdentity;
    }

    public ListCpfDatauseRequest setOptionTime(String optionTime) {
        this.optionTime = optionTime;
        return this;
    }
    public String getOptionTime() {
        return this.optionTime;
    }

    public ListCpfDatauseRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListCpfDatauseRequest setDataCode(String dataCode) {
        this.dataCode = dataCode;
        return this;
    }
    public String getDataCode() {
        return this.dataCode;
    }

}
