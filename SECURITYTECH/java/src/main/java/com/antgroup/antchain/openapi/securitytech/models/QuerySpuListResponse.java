// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QuerySpuListResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // SPU信息
    @NameInMap("spu_info_list")
    public java.util.List<SimSpuInfo> spuInfoList;

    // 分页参数
    @NameInMap("paginator")
    public Paginator paginator;

    public static QuerySpuListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySpuListResponse self = new QuerySpuListResponse();
        return TeaModel.build(map, self);
    }

    public QuerySpuListResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySpuListResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySpuListResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySpuListResponse setSpuInfoList(java.util.List<SimSpuInfo> spuInfoList) {
        this.spuInfoList = spuInfoList;
        return this;
    }
    public java.util.List<SimSpuInfo> getSpuInfoList() {
        return this.spuInfoList;
    }

    public QuerySpuListResponse setPaginator(Paginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public Paginator getPaginator() {
        return this.paginator;
    }

}
