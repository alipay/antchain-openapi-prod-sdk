// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryDciContentsecurityResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 作品类型
    @NameInMap("work_type")
    public String workType;

    // 审查结果
    @NameInMap("review_data")
    public ReviewData reviewData;

    public static QueryDciContentsecurityResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDciContentsecurityResponse self = new QueryDciContentsecurityResponse();
        return TeaModel.build(map, self);
    }

    public QueryDciContentsecurityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDciContentsecurityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDciContentsecurityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDciContentsecurityResponse setWorkType(String workType) {
        this.workType = workType;
        return this;
    }
    public String getWorkType() {
        return this.workType;
    }

    public QueryDciContentsecurityResponse setReviewData(ReviewData reviewData) {
        this.reviewData = reviewData;
        return this;
    }
    public ReviewData getReviewData() {
        return this.reviewData;
    }

}
