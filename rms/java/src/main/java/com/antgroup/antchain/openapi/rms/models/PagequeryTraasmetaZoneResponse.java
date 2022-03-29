// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class PagequeryTraasmetaZoneResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // zones
    @NameInMap("zones")
    public java.util.List<TraasZoneDto> zones;

    // 每页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 总量
    @NameInMap("total_count")
    public Long totalCount;

    public static PagequeryTraasmetaZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryTraasmetaZoneResponse self = new PagequeryTraasmetaZoneResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryTraasmetaZoneResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryTraasmetaZoneResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryTraasmetaZoneResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryTraasmetaZoneResponse setZones(java.util.List<TraasZoneDto> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<TraasZoneDto> getZones() {
        return this.zones;
    }

    public PagequeryTraasmetaZoneResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryTraasmetaZoneResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public PagequeryTraasmetaZoneResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
