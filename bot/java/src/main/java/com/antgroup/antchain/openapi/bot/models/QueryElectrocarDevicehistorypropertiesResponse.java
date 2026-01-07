// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarDevicehistorypropertiesResponse extends TeaModel {
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

    // 行程统计信息属性
    @NameInMap("trip_properties")
    public java.util.List<DeviceTripProperties> tripProperties;

    // 1
    @NameInMap("page_num")
    public Long pageNum;

    // 1
    @NameInMap("page_size")
    public Long pageSize;

    // 1
    @NameInMap("total_pages")
    public Long totalPages;

    // 记录总数
    @NameInMap("total_size")
    public Long totalSize;

    public static QueryElectrocarDevicehistorypropertiesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarDevicehistorypropertiesResponse self = new QueryElectrocarDevicehistorypropertiesResponse();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarDevicehistorypropertiesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryElectrocarDevicehistorypropertiesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryElectrocarDevicehistorypropertiesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryElectrocarDevicehistorypropertiesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryElectrocarDevicehistorypropertiesResponse setTripProperties(java.util.List<DeviceTripProperties> tripProperties) {
        this.tripProperties = tripProperties;
        return this;
    }
    public java.util.List<DeviceTripProperties> getTripProperties() {
        return this.tripProperties;
    }

    public QueryElectrocarDevicehistorypropertiesResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryElectrocarDevicehistorypropertiesResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryElectrocarDevicehistorypropertiesResponse setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public QueryElectrocarDevicehistorypropertiesResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
