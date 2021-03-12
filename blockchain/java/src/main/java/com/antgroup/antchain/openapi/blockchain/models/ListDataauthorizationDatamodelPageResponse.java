// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ListDataauthorizationDatamodelPageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 数据模型列表
    @NameInMap("data")
    public java.util.List<DataModel> data;

    // 是否有下一页
    @NameInMap("has_next_page")
    public Boolean hasNextPage;

    // 是否有上一页
    @NameInMap("has_previous_page")
    public Boolean hasPreviousPage;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 每页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 数据总量
    @NameInMap("total")
    public Long total;

    public static ListDataauthorizationDatamodelPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataauthorizationDatamodelPageResponse self = new ListDataauthorizationDatamodelPageResponse();
        return TeaModel.build(map, self);
    }

    public ListDataauthorizationDatamodelPageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListDataauthorizationDatamodelPageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDataauthorizationDatamodelPageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListDataauthorizationDatamodelPageResponse setData(java.util.List<DataModel> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DataModel> getData() {
        return this.data;
    }

    public ListDataauthorizationDatamodelPageResponse setHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
        return this;
    }
    public Boolean getHasNextPage() {
        return this.hasNextPage;
    }

    public ListDataauthorizationDatamodelPageResponse setHasPreviousPage(Boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
        return this;
    }
    public Boolean getHasPreviousPage() {
        return this.hasPreviousPage;
    }

    public ListDataauthorizationDatamodelPageResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListDataauthorizationDatamodelPageResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDataauthorizationDatamodelPageResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
