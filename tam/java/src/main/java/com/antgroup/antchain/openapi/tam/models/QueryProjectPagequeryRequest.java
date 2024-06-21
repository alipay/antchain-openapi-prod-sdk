// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class QueryProjectPagequeryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 兼容BD待客下单对外暴露项目Id查询
    @NameInMap("id")
    public String id;

    // 项目唯一编码
    @NameInMap("project_code")
    public String projectCode;

    // 项目名称，支持模糊
    @NameInMap("title")
    public String title;

    // 客户id
    @NameInMap("customer_id")
    public String customerId;

    // 客户名称
    @NameInMap("customer_name")
    public String customerName;

    // 项目阶段，支持多个过滤
    @NameInMap("status")
    public java.util.List<String> status;

    // 项目阶段，支持多个过滤
    @NameInMap("stages")
    public java.util.List<String> stages;

    // 项目BD工号列表
    @NameInMap("bd_work_nos")
    public java.util.List<String> bdWorkNos;

    // 交付项目经理工号列表
    @NameInMap("pm_work_nos")
    public java.util.List<String> pmWorkNos;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    // 当前页面
    @NameInMap("current_page")
    public Long currentPage;

    public static QueryProjectPagequeryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectPagequeryRequest self = new QueryProjectPagequeryRequest();
        return TeaModel.build(map, self);
    }

    public QueryProjectPagequeryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryProjectPagequeryRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryProjectPagequeryRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public QueryProjectPagequeryRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public QueryProjectPagequeryRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public QueryProjectPagequeryRequest setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public QueryProjectPagequeryRequest setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

    public QueryProjectPagequeryRequest setStages(java.util.List<String> stages) {
        this.stages = stages;
        return this;
    }
    public java.util.List<String> getStages() {
        return this.stages;
    }

    public QueryProjectPagequeryRequest setBdWorkNos(java.util.List<String> bdWorkNos) {
        this.bdWorkNos = bdWorkNos;
        return this;
    }
    public java.util.List<String> getBdWorkNos() {
        return this.bdWorkNos;
    }

    public QueryProjectPagequeryRequest setPmWorkNos(java.util.List<String> pmWorkNos) {
        this.pmWorkNos = pmWorkNos;
        return this;
    }
    public java.util.List<String> getPmWorkNos() {
        return this.pmWorkNos;
    }

    public QueryProjectPagequeryRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryProjectPagequeryRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

}
