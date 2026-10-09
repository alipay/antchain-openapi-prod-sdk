// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class ListfilesBlockchainBotIotagentSessionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 空间id
    @NameInMap("workspace_id")
    public String workspaceId;

    // 文件列表
    @NameInMap("data")
    public java.util.List<FileInfo> data;

    // 总记录
    @NameInMap("total")
    public Long total;

    // 10
    @NameInMap("pages")
    public Long pages;

    // 当前页面
    @NameInMap("page_index")
    public Long pageIndex;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    public static ListfilesBlockchainBotIotagentSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListfilesBlockchainBotIotagentSessionResponse self = new ListfilesBlockchainBotIotagentSessionResponse();
        return TeaModel.build(map, self);
    }

    public ListfilesBlockchainBotIotagentSessionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListfilesBlockchainBotIotagentSessionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListfilesBlockchainBotIotagentSessionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListfilesBlockchainBotIotagentSessionResponse setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ListfilesBlockchainBotIotagentSessionResponse setData(java.util.List<FileInfo> data) {
        this.data = data;
        return this;
    }
    public java.util.List<FileInfo> getData() {
        return this.data;
    }

    public ListfilesBlockchainBotIotagentSessionResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListfilesBlockchainBotIotagentSessionResponse setPages(Long pages) {
        this.pages = pages;
        return this;
    }
    public Long getPages() {
        return this.pages;
    }

    public ListfilesBlockchainBotIotagentSessionResponse setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public ListfilesBlockchainBotIotagentSessionResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
