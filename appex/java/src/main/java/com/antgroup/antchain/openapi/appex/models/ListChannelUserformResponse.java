// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class ListChannelUserformResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 总页数
    @NameInMap("total_page")
    public Long totalPage;

    // 表单列表
    @NameInMap("form_list")
    public java.util.List<FormIndexDTO> formList;

    public static ListChannelUserformResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChannelUserformResponse self = new ListChannelUserformResponse();
        return TeaModel.build(map, self);
    }

    public ListChannelUserformResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListChannelUserformResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListChannelUserformResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListChannelUserformResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListChannelUserformResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListChannelUserformResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public ListChannelUserformResponse setFormList(java.util.List<FormIndexDTO> formList) {
        this.formList = formList;
        return this;
    }
    public java.util.List<FormIndexDTO> getFormList() {
        return this.formList;
    }

}
