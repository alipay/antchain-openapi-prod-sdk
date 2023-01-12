// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryApplicationComputerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 资源列表
    @NameInMap("computers")
    @Validation(required = true)
    public java.util.List<Computer> computers;

    // 当前页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 分页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 资源总数
    @NameInMap("total_count")
    @Validation(required = true)
    public Long totalCount;

    public static QueryApplicationComputerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationComputerResponse self = new QueryApplicationComputerResponse();
        return TeaModel.build(map, self);
    }

    public QueryApplicationComputerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryApplicationComputerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryApplicationComputerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryApplicationComputerResponse setComputers(java.util.List<Computer> computers) {
        this.computers = computers;
        return this;
    }
    public java.util.List<Computer> getComputers() {
        return this.computers;
    }

    public QueryApplicationComputerResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryApplicationComputerResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryApplicationComputerResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
