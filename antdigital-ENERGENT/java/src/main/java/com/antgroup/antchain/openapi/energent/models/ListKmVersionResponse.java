// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class ListKmVersionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 版本总数
    @NameInMap("total_records")
    public Long totalRecords;

    // 版本JSON数组(KbVersionItem字段定义见文档)
    @NameInMap("versions")
    public String versions;

    public static ListKmVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKmVersionResponse self = new ListKmVersionResponse();
        return TeaModel.build(map, self);
    }

    public ListKmVersionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListKmVersionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListKmVersionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListKmVersionResponse setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }
    public Long getTotalRecords() {
        return this.totalRecords;
    }

    public ListKmVersionResponse setVersions(String versions) {
        this.versions = versions;
        return this;
    }
    public String getVersions() {
        return this.versions;
    }

}
