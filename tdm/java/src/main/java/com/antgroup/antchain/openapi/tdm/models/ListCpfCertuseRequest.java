// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class ListCpfCertuseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 端ID
    @NameInMap("terminal_identity")
    @Validation(required = true)
    public String terminalIdentity;

    // 证明ID
    @NameInMap("issue_id")
    @Validation(required = true)
    public String issueId;

    // 筛选时间 按月份筛选
    @NameInMap("option_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String optionTime;

    public static ListCpfCertuseRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCpfCertuseRequest self = new ListCpfCertuseRequest();
        return TeaModel.build(map, self);
    }

    public ListCpfCertuseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListCpfCertuseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListCpfCertuseRequest setTerminalIdentity(String terminalIdentity) {
        this.terminalIdentity = terminalIdentity;
        return this;
    }
    public String getTerminalIdentity() {
        return this.terminalIdentity;
    }

    public ListCpfCertuseRequest setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public ListCpfCertuseRequest setOptionTime(String optionTime) {
        this.optionTime = optionTime;
        return this;
    }
    public String getOptionTime() {
        return this.optionTime;
    }

}
