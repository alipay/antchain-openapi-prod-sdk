// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class PagequeryTraasmetaWorkspacegroupResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // workspace_groups
    @NameInMap("workspace_groups")
    public java.util.List<TraasWorkspaceGroupDto> workspaceGroups;

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

    public static PagequeryTraasmetaWorkspacegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryTraasmetaWorkspacegroupResponse self = new PagequeryTraasmetaWorkspacegroupResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryTraasmetaWorkspacegroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryTraasmetaWorkspacegroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryTraasmetaWorkspacegroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryTraasmetaWorkspacegroupResponse setWorkspaceGroups(java.util.List<TraasWorkspaceGroupDto> workspaceGroups) {
        this.workspaceGroups = workspaceGroups;
        return this;
    }
    public java.util.List<TraasWorkspaceGroupDto> getWorkspaceGroups() {
        return this.workspaceGroups;
    }

    public PagequeryTraasmetaWorkspacegroupResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryTraasmetaWorkspacegroupResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public PagequeryTraasmetaWorkspacegroupResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
