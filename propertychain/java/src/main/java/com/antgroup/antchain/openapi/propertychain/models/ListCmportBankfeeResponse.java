// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class ListCmportBankfeeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
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

    // 返回还款利息列表
    @NameInMap("bank_fee_list")
    public java.util.List<BankFee> bankFeeList;

    public static ListCmportBankfeeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCmportBankfeeResponse self = new ListCmportBankfeeResponse();
        return TeaModel.build(map, self);
    }

    public ListCmportBankfeeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListCmportBankfeeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListCmportBankfeeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListCmportBankfeeResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListCmportBankfeeResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCmportBankfeeResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public ListCmportBankfeeResponse setBankFeeList(java.util.List<BankFee> bankFeeList) {
        this.bankFeeList = bankFeeList;
        return this;
    }
    public java.util.List<BankFee> getBankFeeList() {
        return this.bankFeeList;
    }

}
