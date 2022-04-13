// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryContainerserviceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 容器应用服务列表。
    @NameInMap("container_service_list")
    public java.util.List<ContainerServiceBasicInfo> containerServiceList;

    // 实例列表的页码。
    @NameInMap("page_number")
    public Long pageNumber;

    // 输入时设置的每页行数。
    @NameInMap("page_size")
    public Long pageSize;

    // 查询到的容器应用服务总数。
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryContainerserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContainerserviceResponse self = new QueryContainerserviceResponse();
        return TeaModel.build(map, self);
    }

    public QueryContainerserviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContainerserviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContainerserviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContainerserviceResponse setContainerServiceList(java.util.List<ContainerServiceBasicInfo> containerServiceList) {
        this.containerServiceList = containerServiceList;
        return this;
    }
    public java.util.List<ContainerServiceBasicInfo> getContainerServiceList() {
        return this.containerServiceList;
    }

    public QueryContainerserviceResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryContainerserviceResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryContainerserviceResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
