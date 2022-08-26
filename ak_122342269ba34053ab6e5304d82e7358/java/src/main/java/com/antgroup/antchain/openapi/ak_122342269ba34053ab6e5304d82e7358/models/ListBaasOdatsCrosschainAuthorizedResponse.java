// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class ListBaasOdatsCrosschainAuthorizedResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 跨链信息列表
    @NameInMap("data")
    public java.util.List<CrossChainInfo> data;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 总行数
    @NameInMap("total")
    public Long total;

    public static ListBaasOdatsCrosschainAuthorizedResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBaasOdatsCrosschainAuthorizedResponse self = new ListBaasOdatsCrosschainAuthorizedResponse();
        return TeaModel.build(map, self);
    }

    public ListBaasOdatsCrosschainAuthorizedResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListBaasOdatsCrosschainAuthorizedResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListBaasOdatsCrosschainAuthorizedResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListBaasOdatsCrosschainAuthorizedResponse setData(java.util.List<CrossChainInfo> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CrossChainInfo> getData() {
        return this.data;
    }

    public ListBaasOdatsCrosschainAuthorizedResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListBaasOdatsCrosschainAuthorizedResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListBaasOdatsCrosschainAuthorizedResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
