// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ydindustry.models;

import com.aliyun.tea.*;

public class QueryRetailScoreResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 行业分数
    @NameInMap("score")
    public String score;

    // 流水号
    @NameInMap("trans_no")
    public String transNo;

    // 返回行业分其他数据，里面是key-value形式，标识返回的额外参数数据
    @NameInMap("ext_param")
    public String extParam;

    public static QueryRetailScoreResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRetailScoreResponse self = new QueryRetailScoreResponse();
        return TeaModel.build(map, self);
    }

    public QueryRetailScoreResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRetailScoreResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRetailScoreResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRetailScoreResponse setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

    public QueryRetailScoreResponse setTransNo(String transNo) {
        this.transNo = transNo;
        return this;
    }
    public String getTransNo() {
        return this.transNo;
    }

    public QueryRetailScoreResponse setExtParam(String extParam) {
        this.extParam = extParam;
        return this;
    }
    public String getExtParam() {
        return this.extParam;
    }

}
