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

    // 筛选时间，按月份筛选，默认当前月份
    @NameInMap("option_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String optionTime;

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

    public ListCpfDatauseRequest setOptionTime(String optionTime) {
        this.optionTime = optionTime;
        return this;
    }
    public String getOptionTime() {
        return this.optionTime;
    }

}
