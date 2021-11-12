// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class QuerySolutionPreviewtaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 产品预览任务查询
    @NameInMap("prod_preview_tasks")
    public java.util.List<ProdPreviewTasks> prodPreviewTasks;

    public static QuerySolutionPreviewtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySolutionPreviewtaskResponse self = new QuerySolutionPreviewtaskResponse();
        return TeaModel.build(map, self);
    }

    public QuerySolutionPreviewtaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySolutionPreviewtaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySolutionPreviewtaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySolutionPreviewtaskResponse setProdPreviewTasks(java.util.List<ProdPreviewTasks> prodPreviewTasks) {
        this.prodPreviewTasks = prodPreviewTasks;
        return this;
    }
    public java.util.List<ProdPreviewTasks> getProdPreviewTasks() {
        return this.prodPreviewTasks;
    }

}
