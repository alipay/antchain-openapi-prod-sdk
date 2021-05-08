// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class ListCpfCertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 端ID
    @NameInMap("terminal_identity")
    @Validation(required = true)
    public String terminalIdentity;

    // 身份证ID
    @NameInMap("data_owner_identity")
    @Validation(required = true)
    public String dataOwnerIdentity;

    // 证明类型
    @NameInMap("issue_cert_type")
    @Validation(required = true)
    public String issueCertType;

    // 当前页码，默认1
    @NameInMap("current_page")
    public Long currentPage;

    // 每页展示数量，默认10
    @NameInMap("page_size")
    public Long pageSize;

    // 时间筛选枚举类型，默认全部
    @NameInMap("option_time")
    public String optionTime;

    public static ListCpfCertRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCpfCertRequest self = new ListCpfCertRequest();
        return TeaModel.build(map, self);
    }

    public ListCpfCertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListCpfCertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListCpfCertRequest setTerminalIdentity(String terminalIdentity) {
        this.terminalIdentity = terminalIdentity;
        return this;
    }
    public String getTerminalIdentity() {
        return this.terminalIdentity;
    }

    public ListCpfCertRequest setDataOwnerIdentity(String dataOwnerIdentity) {
        this.dataOwnerIdentity = dataOwnerIdentity;
        return this;
    }
    public String getDataOwnerIdentity() {
        return this.dataOwnerIdentity;
    }

    public ListCpfCertRequest setIssueCertType(String issueCertType) {
        this.issueCertType = issueCertType;
        return this;
    }
    public String getIssueCertType() {
        return this.issueCertType;
    }

    public ListCpfCertRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListCpfCertRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCpfCertRequest setOptionTime(String optionTime) {
        this.optionTime = optionTime;
        return this;
    }
    public String getOptionTime() {
        return this.optionTime;
    }

}
