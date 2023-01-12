// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AllCmdtemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总条数
    @NameInMap("total_size")
    public Long totalSize;

    // 页码
    @NameInMap("page_no")
    public Long pageNo;

    // 页容量
    @NameInMap("page_size")
    public Long pageSize;

    // 结果返回列表
    @NameInMap("list")
    public java.util.List<String> list;

    public static AllCmdtemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        AllCmdtemplateResponse self = new AllCmdtemplateResponse();
        return TeaModel.build(map, self);
    }

    public AllCmdtemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AllCmdtemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AllCmdtemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AllCmdtemplateResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public AllCmdtemplateResponse setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public AllCmdtemplateResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public AllCmdtemplateResponse setList(java.util.List<String> list) {
        this.list = list;
        return this;
    }
    public java.util.List<String> getList() {
        return this.list;
    }

}
