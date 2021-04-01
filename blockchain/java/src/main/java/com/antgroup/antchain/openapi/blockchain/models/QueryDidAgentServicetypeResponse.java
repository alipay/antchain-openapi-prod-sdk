// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDidAgentServicetypeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 服务类型定义列表
    @NameInMap("service_types")
    public java.util.List<String> serviceTypes;

    // 总共有几项
    @NameInMap("total_number")
    public Long totalNumber;

    // 总共有几页
    @NameInMap("total_page")
    public Long totalPage;

    public static QueryDidAgentServicetypeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDidAgentServicetypeResponse self = new QueryDidAgentServicetypeResponse();
        return TeaModel.build(map, self);
    }

    public QueryDidAgentServicetypeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDidAgentServicetypeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDidAgentServicetypeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDidAgentServicetypeResponse setServiceTypes(java.util.List<String> serviceTypes) {
        this.serviceTypes = serviceTypes;
        return this;
    }
    public java.util.List<String> getServiceTypes() {
        return this.serviceTypes;
    }

    public QueryDidAgentServicetypeResponse setTotalNumber(Long totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }
    public Long getTotalNumber() {
        return this.totalNumber;
    }

    public QueryDidAgentServicetypeResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

}
