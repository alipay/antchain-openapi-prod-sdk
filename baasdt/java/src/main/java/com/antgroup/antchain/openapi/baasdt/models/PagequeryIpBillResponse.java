// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class PagequeryIpBillResponse extends TeaModel {
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
    @NameInMap("page_number")
    public Long pageNumber;

    // 页面数据量大小
    @NameInMap("page_size")
    public Long pageSize;

    // 筛选条件下账单总数
    @NameInMap("select_bill_count")
    public Long selectBillCount;

    // 账单信息列表
    @NameInMap("bill_list")
    public java.util.List<IPBill> billList;

    public static PagequeryIpBillResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryIpBillResponse self = new PagequeryIpBillResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryIpBillResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryIpBillResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryIpBillResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryIpBillResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public PagequeryIpBillResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryIpBillResponse setSelectBillCount(Long selectBillCount) {
        this.selectBillCount = selectBillCount;
        return this;
    }
    public Long getSelectBillCount() {
        return this.selectBillCount;
    }

    public PagequeryIpBillResponse setBillList(java.util.List<IPBill> billList) {
        this.billList = billList;
        return this;
    }
    public java.util.List<IPBill> getBillList() {
        return this.billList;
    }

}
