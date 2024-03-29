// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class QueryStagesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分期详情
    @NameInMap("open_stages_detail_vo")
    public StagesDetailVO openStagesDetailVo;

    public static QueryStagesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStagesResponse self = new QueryStagesResponse();
        return TeaModel.build(map, self);
    }

    public QueryStagesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryStagesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryStagesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryStagesResponse setOpenStagesDetailVo(StagesDetailVO openStagesDetailVo) {
        this.openStagesDetailVo = openStagesDetailVo;
        return this;
    }
    public StagesDetailVO getOpenStagesDetailVo() {
        return this.openStagesDetailVo;
    }

}
