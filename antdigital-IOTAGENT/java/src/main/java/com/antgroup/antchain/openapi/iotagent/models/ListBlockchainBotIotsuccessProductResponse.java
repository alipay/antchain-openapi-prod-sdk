// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class ListBlockchainBotIotsuccessProductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("items")
    @Validation(required = true)
    public java.util.List<OpenApiProductItem> items;

    public static ListBlockchainBotIotsuccessProductResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBlockchainBotIotsuccessProductResponse self = new ListBlockchainBotIotsuccessProductResponse();
        return TeaModel.build(map, self);
    }

    public ListBlockchainBotIotsuccessProductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListBlockchainBotIotsuccessProductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListBlockchainBotIotsuccessProductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListBlockchainBotIotsuccessProductResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListBlockchainBotIotsuccessProductResponse setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public ListBlockchainBotIotsuccessProductResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListBlockchainBotIotsuccessProductResponse setItems(java.util.List<OpenApiProductItem> items) {
        this.items = items;
        return this;
    }
    public java.util.List<OpenApiProductItem> getItems() {
        return this.items;
    }

}
