// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarDeviceinfospageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // success
    @NameInMap("success")
    public Boolean success;

    // page_num
    @NameInMap("page_num")
    public Long pageNum;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // total_pages
    @NameInMap("total_pages")
    public Long totalPages;

    // total_size
    @NameInMap("total_size")
    public Long totalSize;

    // device_list
    @NameInMap("device_list")
    public java.util.List<DeviceInfos> deviceList;

    public static QueryElectrocarDeviceinfospageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarDeviceinfospageResponse self = new QueryElectrocarDeviceinfospageResponse();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarDeviceinfospageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryElectrocarDeviceinfospageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryElectrocarDeviceinfospageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryElectrocarDeviceinfospageResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryElectrocarDeviceinfospageResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryElectrocarDeviceinfospageResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryElectrocarDeviceinfospageResponse setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public QueryElectrocarDeviceinfospageResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryElectrocarDeviceinfospageResponse setDeviceList(java.util.List<DeviceInfos> deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public java.util.List<DeviceInfos> getDeviceList() {
        return this.deviceList;
    }

}
