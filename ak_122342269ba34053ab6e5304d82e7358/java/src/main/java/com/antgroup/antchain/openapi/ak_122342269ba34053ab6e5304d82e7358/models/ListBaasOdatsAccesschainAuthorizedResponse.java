// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class ListBaasOdatsAccesschainAuthorizedResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 访问链权限信息列表
    @NameInMap("data")
    public java.util.List<AccessChainInfo> data;

    // 分页页码。
    @NameInMap("page_num")
    public Long pageNum;

    // 当前页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 总行数
    @NameInMap("total")
    public Long total;

    public static ListBaasOdatsAccesschainAuthorizedResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBaasOdatsAccesschainAuthorizedResponse self = new ListBaasOdatsAccesschainAuthorizedResponse();
        return TeaModel.build(map, self);
    }

    public ListBaasOdatsAccesschainAuthorizedResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListBaasOdatsAccesschainAuthorizedResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListBaasOdatsAccesschainAuthorizedResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListBaasOdatsAccesschainAuthorizedResponse setData(java.util.List<AccessChainInfo> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AccessChainInfo> getData() {
        return this.data;
    }

    public ListBaasOdatsAccesschainAuthorizedResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListBaasOdatsAccesschainAuthorizedResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListBaasOdatsAccesschainAuthorizedResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
