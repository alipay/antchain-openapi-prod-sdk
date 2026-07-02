// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryIotbasicDeviceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页号。
    // 
    // 
    @NameInMap("current_page")
    public Long currentPage;

    // 总页数
    @NameInMap("page_count")
    public Long pageCount;

    // 每页显示条数
    @NameInMap("page_size")
    public Long pageSize;

    // 总记录数
    @NameInMap("total")
    public Long total;

    // 设备列表
    @NameInMap("device_list")
    public java.util.List<IotBasicDeviceQueryResponse> deviceList;

    public static QueryIotbasicDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIotbasicDeviceResponse self = new QueryIotbasicDeviceResponse();
        return TeaModel.build(map, self);
    }

    public QueryIotbasicDeviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIotbasicDeviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIotbasicDeviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIotbasicDeviceResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryIotbasicDeviceResponse setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public QueryIotbasicDeviceResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryIotbasicDeviceResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryIotbasicDeviceResponse setDeviceList(java.util.List<IotBasicDeviceQueryResponse> deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public java.util.List<IotBasicDeviceQueryResponse> getDeviceList() {
        return this.deviceList;
    }

}
