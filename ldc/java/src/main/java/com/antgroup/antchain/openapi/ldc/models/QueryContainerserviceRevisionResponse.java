// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryContainerserviceRevisionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 版本列表的页码。
    @NameInMap("page_number")
    public Long pageNumber;

    // 输入时设置的每页行数。
    @NameInMap("page_size")
    public Long pageSize;

    // 容器服务版本列表。
    @NameInMap("revision_list")
    public java.util.List<ContainerServiceRevision> revisionList;

    // 查询到的容器应用版本总数。
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryContainerserviceRevisionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContainerserviceRevisionResponse self = new QueryContainerserviceRevisionResponse();
        return TeaModel.build(map, self);
    }

    public QueryContainerserviceRevisionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContainerserviceRevisionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContainerserviceRevisionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContainerserviceRevisionResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryContainerserviceRevisionResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryContainerserviceRevisionResponse setRevisionList(java.util.List<ContainerServiceRevision> revisionList) {
        this.revisionList = revisionList;
        return this;
    }
    public java.util.List<ContainerServiceRevision> getRevisionList() {
        return this.revisionList;
    }

    public QueryContainerserviceRevisionResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
