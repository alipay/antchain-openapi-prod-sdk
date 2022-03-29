// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class PagequeryTraasmetaAppgroupResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // app_groups
    @NameInMap("app_groups")
    public java.util.List<TraasAppGroupDto> appGroups;

    // 每页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 	
    // 总量
    @NameInMap("total_count")
    public Long totalCount;

    public static PagequeryTraasmetaAppgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryTraasmetaAppgroupResponse self = new PagequeryTraasmetaAppgroupResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryTraasmetaAppgroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryTraasmetaAppgroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryTraasmetaAppgroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryTraasmetaAppgroupResponse setAppGroups(java.util.List<TraasAppGroupDto> appGroups) {
        this.appGroups = appGroups;
        return this;
    }
    public java.util.List<TraasAppGroupDto> getAppGroups() {
        return this.appGroups;
    }

    public PagequeryTraasmetaAppgroupResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryTraasmetaAppgroupResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public PagequeryTraasmetaAppgroupResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
