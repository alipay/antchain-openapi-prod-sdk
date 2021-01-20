// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryApplicationServiceResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页码
    @NameInMap("page_num")
    public Integer pageNum;

    // 分页大小
    @NameInMap("page_size")
    public Integer pageSize;

    // 服务实例列表
    @NameInMap("services")
    public java.util.List<AppService> services;

    // 应用总数
    @NameInMap("total_count")
    public Integer totalCount;

    public static QueryApplicationServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationServiceResponse self = new QueryApplicationServiceResponse();
        return TeaModel.build(map, self);
    }

    public QueryApplicationServiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryApplicationServiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryApplicationServiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryApplicationServiceResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryApplicationServiceResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryApplicationServiceResponse setServices(java.util.List<AppService> services) {
        this.services = services;
        return this;
    }
    public java.util.List<AppService> getServices() {
        return this.services;
    }

    public QueryApplicationServiceResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
