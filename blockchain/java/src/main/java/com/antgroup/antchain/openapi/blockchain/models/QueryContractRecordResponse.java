// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryContractRecordResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页元素列表
    @NameInMap("content")
    public java.util.List<ContractRecord> content;

    // 当前页号
    @NameInMap("number")
    public String number;

    // 当前页大小
    @NameInMap("size")
    public String size;

    // 元素总个数
    @NameInMap("total_elements")
    public Long totalElements;

    // 总页数
    @NameInMap("total_pages")
    public Long totalPages;

    public static QueryContractRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContractRecordResponse self = new QueryContractRecordResponse();
        return TeaModel.build(map, self);
    }

    public QueryContractRecordResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContractRecordResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContractRecordResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContractRecordResponse setContent(java.util.List<ContractRecord> content) {
        this.content = content;
        return this;
    }
    public java.util.List<ContractRecord> getContent() {
        return this.content;
    }

    public QueryContractRecordResponse setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public QueryContractRecordResponse setSize(String size) {
        this.size = size;
        return this;
    }
    public String getSize() {
        return this.size;
    }

    public QueryContractRecordResponse setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    public Long getTotalElements() {
        return this.totalElements;
    }

    public QueryContractRecordResponse setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

}
