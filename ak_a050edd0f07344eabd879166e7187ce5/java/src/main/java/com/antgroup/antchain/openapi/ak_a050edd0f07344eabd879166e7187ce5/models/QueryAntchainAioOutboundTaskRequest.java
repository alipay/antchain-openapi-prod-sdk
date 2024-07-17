// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a050edd0f07344eabd879166e7187ce5.models;

import com.aliyun.tea.*;

public class QueryAntchainAioOutboundTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务名称
    @NameInMap("name")
    public String name;

    // 外呼流程id
    @NameInMap("flow_id")
    public Long flowId;

    // 环境区分
    @NameInMap("env")
    @Validation(required = true)
    public String env;

    // 与env对应
    @NameInMap("ldc_name")
    @Validation(required = true)
    public String ldcName;

    // 根据状态过滤数据
    @NameInMap("status")
    public String status;

    // 租户id
    @NameInMap("tnt_inst_id")
    @Validation(required = true)
    public String tntInstId;

    // 业务id
    @NameInMap("biz_code")
    @Validation(required = true)
    public String bizCode;

    // 当前页码
    @NameInMap("current_page")
    @Validation(required = true)
    public Long currentPage;

    // 每页数据个数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static QueryAntchainAioOutboundTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAioOutboundTaskRequest self = new QueryAntchainAioOutboundTaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAioOutboundTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAioOutboundTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAioOutboundTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryAntchainAioOutboundTaskRequest setFlowId(Long flowId) {
        this.flowId = flowId;
        return this;
    }
    public Long getFlowId() {
        return this.flowId;
    }

    public QueryAntchainAioOutboundTaskRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public QueryAntchainAioOutboundTaskRequest setLdcName(String ldcName) {
        this.ldcName = ldcName;
        return this;
    }
    public String getLdcName() {
        return this.ldcName;
    }

    public QueryAntchainAioOutboundTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAntchainAioOutboundTaskRequest setTntInstId(String tntInstId) {
        this.tntInstId = tntInstId;
        return this;
    }
    public String getTntInstId() {
        return this.tntInstId;
    }

    public QueryAntchainAioOutboundTaskRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public QueryAntchainAioOutboundTaskRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryAntchainAioOutboundTaskRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
