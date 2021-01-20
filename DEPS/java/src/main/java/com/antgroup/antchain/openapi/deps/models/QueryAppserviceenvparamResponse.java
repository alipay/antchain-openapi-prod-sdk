// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryAppserviceenvparamResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // app_service_env_params
    @NameInMap("app_service_env_params")
    public java.util.List<AppServiceEnvParam> appServiceEnvParams;

    // current_page
    @NameInMap("current_page")
    public Long currentPage;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // total_count
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryAppserviceenvparamResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppserviceenvparamResponse self = new QueryAppserviceenvparamResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppserviceenvparamResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAppserviceenvparamResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAppserviceenvparamResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAppserviceenvparamResponse setAppServiceEnvParams(java.util.List<AppServiceEnvParam> appServiceEnvParams) {
        this.appServiceEnvParams = appServiceEnvParams;
        return this;
    }
    public java.util.List<AppServiceEnvParam> getAppServiceEnvParams() {
        return this.appServiceEnvParams;
    }

    public QueryAppserviceenvparamResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryAppserviceenvparamResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAppserviceenvparamResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
