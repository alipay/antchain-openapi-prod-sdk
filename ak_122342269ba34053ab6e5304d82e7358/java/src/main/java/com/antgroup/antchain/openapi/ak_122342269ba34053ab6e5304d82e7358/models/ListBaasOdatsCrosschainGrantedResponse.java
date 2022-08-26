// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class ListBaasOdatsCrosschainGrantedResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 跨链调用授权列表
    @NameInMap("data")
    public java.util.List<CrossChainInfo> data;

    // 当前页码
    @NameInMap("page_num")
    public Long pageNum;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 总行数
    @NameInMap("total")
    public Long total;

    public static ListBaasOdatsCrosschainGrantedResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBaasOdatsCrosschainGrantedResponse self = new ListBaasOdatsCrosschainGrantedResponse();
        return TeaModel.build(map, self);
    }

    public ListBaasOdatsCrosschainGrantedResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListBaasOdatsCrosschainGrantedResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListBaasOdatsCrosschainGrantedResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListBaasOdatsCrosschainGrantedResponse setData(java.util.List<CrossChainInfo> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CrossChainInfo> getData() {
        return this.data;
    }

    public ListBaasOdatsCrosschainGrantedResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListBaasOdatsCrosschainGrantedResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListBaasOdatsCrosschainGrantedResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
