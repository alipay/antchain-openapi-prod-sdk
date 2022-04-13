// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListDeploymentTemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总数
    @NameInMap("total_count")
    public Long totalCount;

    // 模板列表
    @NameInMap("data")
    public java.util.List<DeploymentTemplate> data;

    public static ListDeploymentTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentTemplateResponse self = new ListDeploymentTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListDeploymentTemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListDeploymentTemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDeploymentTemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListDeploymentTemplateResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListDeploymentTemplateResponse setData(java.util.List<DeploymentTemplate> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DeploymentTemplate> getData() {
        return this.data;
    }

}
