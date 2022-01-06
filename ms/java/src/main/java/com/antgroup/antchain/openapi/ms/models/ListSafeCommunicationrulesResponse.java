// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListSafeCommunicationrulesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 起始索引
    @NameInMap("start_index")
    public Long startIndex;

    // 总rule个数
    @NameInMap("total_size")
    public Long totalSize;

    // {"id":1,"instance_id":"000001","name":"rule1","direction":1,"mode":1,"strategy":"1","enabled":0,"scope":1,"operator":"aaa","operate_time":"2020-10-22 11:33:22"}
    @NameInMap("models")
    public java.util.List<CommunicationPageModel> models;

    public static ListSafeCommunicationrulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSafeCommunicationrulesResponse self = new ListSafeCommunicationrulesResponse();
        return TeaModel.build(map, self);
    }

    public ListSafeCommunicationrulesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSafeCommunicationrulesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSafeCommunicationrulesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSafeCommunicationrulesResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListSafeCommunicationrulesResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSafeCommunicationrulesResponse setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public ListSafeCommunicationrulesResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public ListSafeCommunicationrulesResponse setModels(java.util.List<CommunicationPageModel> models) {
        this.models = models;
        return this;
    }
    public java.util.List<CommunicationPageModel> getModels() {
        return this.models;
    }

}
