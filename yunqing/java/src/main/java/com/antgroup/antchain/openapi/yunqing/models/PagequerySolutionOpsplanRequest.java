// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class PagequerySolutionOpsplanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 解决方案Id
    @NameInMap("solution_id")
    @Validation(required = true)
    public String solutionId;

    // 环境Id
    @NameInMap("env_id")
    @Validation(required = true)
    public String envId;

    // 当前页
    @NameInMap("current_page")
    @Validation(required = true)
    public String currentPage;

    // 分页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public String pageSize;

    // RELEASE
    @NameInMap("plan_type")
    @Validation(required = true)
    public String planType;

    // FAILED
    @NameInMap("ops_plan_status")
    @Validation(required = true)
    public String opsPlanStatus;

    public static PagequerySolutionOpsplanRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequerySolutionOpsplanRequest self = new PagequerySolutionOpsplanRequest();
        return TeaModel.build(map, self);
    }

    public PagequerySolutionOpsplanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequerySolutionOpsplanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequerySolutionOpsplanRequest setSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public String getSolutionId() {
        return this.solutionId;
    }

    public PagequerySolutionOpsplanRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public PagequerySolutionOpsplanRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public PagequerySolutionOpsplanRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public PagequerySolutionOpsplanRequest setPlanType(String planType) {
        this.planType = planType;
        return this;
    }
    public String getPlanType() {
        return this.planType;
    }

    public PagequerySolutionOpsplanRequest setOpsPlanStatus(String opsPlanStatus) {
        this.opsPlanStatus = opsPlanStatus;
        return this;
    }
    public String getOpsPlanStatus() {
        return this.opsPlanStatus;
    }

}
