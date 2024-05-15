// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryPdcpDataassetResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总量
    @NameInMap("total")
    public Long total;

    // 当前页面
    @NameInMap("page_number")
    public Long pageNumber;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    // 数据资产信息
    @NameInMap("data_asset_list")
    public java.util.List<DataAssetInfo> dataAssetList;

    public static QueryPdcpDataassetResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPdcpDataassetResponse self = new QueryPdcpDataassetResponse();
        return TeaModel.build(map, self);
    }

    public QueryPdcpDataassetResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPdcpDataassetResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPdcpDataassetResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPdcpDataassetResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryPdcpDataassetResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryPdcpDataassetResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryPdcpDataassetResponse setDataAssetList(java.util.List<DataAssetInfo> dataAssetList) {
        this.dataAssetList = dataAssetList;
        return this;
    }
    public java.util.List<DataAssetInfo> getDataAssetList() {
        return this.dataAssetList;
    }

}
