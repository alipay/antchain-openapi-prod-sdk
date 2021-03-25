// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryConfigTemplateResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 符合条件的参数配置模板
    @NameInMap("data")
    public java.util.List<AppConfigTemplate> data;

    // 当前页
    @NameInMap("page_num")
    public Long pageNum;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 记录总数
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryConfigTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConfigTemplateResponse self = new QueryConfigTemplateResponse();
        return TeaModel.build(map, self);
    }

    public QueryConfigTemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryConfigTemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryConfigTemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryConfigTemplateResponse setData(java.util.List<AppConfigTemplate> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AppConfigTemplate> getData() {
        return this.data;
    }

    public QueryConfigTemplateResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryConfigTemplateResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryConfigTemplateResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
