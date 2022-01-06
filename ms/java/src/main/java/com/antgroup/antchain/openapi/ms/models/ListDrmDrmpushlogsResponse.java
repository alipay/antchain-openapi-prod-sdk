// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListDrmDrmpushlogsResponse extends TeaModel {
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

    // drm日志列表
    @NameInMap("drm_logs")
    public java.util.List<DrmLog> drmLogs;

    // 每页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 起始索引
    @NameInMap("start_index")
    public Long startIndex;

    // 总条数
    @NameInMap("total_size")
    public Long totalSize;

    public static ListDrmDrmpushlogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDrmDrmpushlogsResponse self = new ListDrmDrmpushlogsResponse();
        return TeaModel.build(map, self);
    }

    public ListDrmDrmpushlogsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListDrmDrmpushlogsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDrmDrmpushlogsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListDrmDrmpushlogsResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListDrmDrmpushlogsResponse setDrmLogs(java.util.List<DrmLog> drmLogs) {
        this.drmLogs = drmLogs;
        return this;
    }
    public java.util.List<DrmLog> getDrmLogs() {
        return this.drmLogs;
    }

    public ListDrmDrmpushlogsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDrmDrmpushlogsResponse setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public ListDrmDrmpushlogsResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
