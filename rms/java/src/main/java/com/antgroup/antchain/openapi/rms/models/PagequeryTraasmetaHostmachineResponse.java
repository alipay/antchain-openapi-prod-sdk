// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class PagequeryTraasmetaHostmachineResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // host_machines
    @NameInMap("host_machines")
    public java.util.List<TraasHostMachineDto> hostMachines;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // current_page
    @NameInMap("current_page")
    public Long currentPage;

    // total_count
    @NameInMap("total_count")
    public Long totalCount;

    public static PagequeryTraasmetaHostmachineResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryTraasmetaHostmachineResponse self = new PagequeryTraasmetaHostmachineResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryTraasmetaHostmachineResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryTraasmetaHostmachineResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryTraasmetaHostmachineResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryTraasmetaHostmachineResponse setHostMachines(java.util.List<TraasHostMachineDto> hostMachines) {
        this.hostMachines = hostMachines;
        return this;
    }
    public java.util.List<TraasHostMachineDto> getHostMachines() {
        return this.hostMachines;
    }

    public PagequeryTraasmetaHostmachineResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryTraasmetaHostmachineResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public PagequeryTraasmetaHostmachineResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
