// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryAppServiceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前应用关联的容器服务列表
    @NameInMap("container_service_list")
    public java.util.List<ContainerServiceBasicInfo> containerServiceList;

    // 当前页码，从1开始，默认为1
    @NameInMap("current_page")
    public Long currentPage;

    // 分页大小，默认为10
    @NameInMap("page_size")
    public Long pageSize;

    // 总数
    @NameInMap("total_size")
    public Long totalSize;

    public static QueryAppServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppServiceResponse self = new QueryAppServiceResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppServiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAppServiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAppServiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAppServiceResponse setContainerServiceList(java.util.List<ContainerServiceBasicInfo> containerServiceList) {
        this.containerServiceList = containerServiceList;
        return this;
    }
    public java.util.List<ContainerServiceBasicInfo> getContainerServiceList() {
        return this.containerServiceList;
    }

    public QueryAppServiceResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryAppServiceResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAppServiceResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
