// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class PagequeryAntchainPdcpDatasourceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回结果的总数
    @NameInMap("total")
    public Long total;

    // 分页页数
    @NameInMap("page")
    public String page;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 返回的数据源元信息列表
    @NameInMap("data")
    public java.util.List<LocalDatasource> data;

    public static PagequeryAntchainPdcpDatasourceResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryAntchainPdcpDatasourceResponse self = new PagequeryAntchainPdcpDatasourceResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryAntchainPdcpDatasourceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryAntchainPdcpDatasourceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryAntchainPdcpDatasourceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryAntchainPdcpDatasourceResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PagequeryAntchainPdcpDatasourceResponse setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public PagequeryAntchainPdcpDatasourceResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryAntchainPdcpDatasourceResponse setData(java.util.List<LocalDatasource> data) {
        this.data = data;
        return this;
    }
    public java.util.List<LocalDatasource> getData() {
        return this.data;
    }

}
