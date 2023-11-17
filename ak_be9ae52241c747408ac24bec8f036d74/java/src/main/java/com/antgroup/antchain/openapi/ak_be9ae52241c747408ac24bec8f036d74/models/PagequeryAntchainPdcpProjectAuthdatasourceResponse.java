// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class PagequeryAntchainPdcpProjectAuthdatasourceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回结果的总数量
    @NameInMap("total")
    public Long total;

    // 分页页数
    @NameInMap("page")
    public Long page;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 返回项目内已授权的数据集源信息的列表
    @NameInMap("data")
    public java.util.List<AuthDatasource> data;

    public static PagequeryAntchainPdcpProjectAuthdatasourceResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryAntchainPdcpProjectAuthdatasourceResponse self = new PagequeryAntchainPdcpProjectAuthdatasourceResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryAntchainPdcpProjectAuthdatasourceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryAntchainPdcpProjectAuthdatasourceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryAntchainPdcpProjectAuthdatasourceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryAntchainPdcpProjectAuthdatasourceResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PagequeryAntchainPdcpProjectAuthdatasourceResponse setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public PagequeryAntchainPdcpProjectAuthdatasourceResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryAntchainPdcpProjectAuthdatasourceResponse setData(java.util.List<AuthDatasource> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AuthDatasource> getData() {
        return this.data;
    }

}
