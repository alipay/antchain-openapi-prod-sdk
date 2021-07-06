// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryContentriskInternalResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 命中结果详情
    @NameInMap("hit_detect_items")
    public java.util.List<HitDetectItems> hitDetectItems;

    // PASSED("数据识别通过，可以在网站上正常显示") REJECTED("被拒绝的数据，比如内容出现违禁词；不能出现在我们网站上")
    @NameInMap("result_action")
    public String resultAction;

    public static QueryContentriskInternalResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContentriskInternalResponse self = new QueryContentriskInternalResponse();
        return TeaModel.build(map, self);
    }

    public QueryContentriskInternalResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContentriskInternalResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContentriskInternalResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContentriskInternalResponse setHitDetectItems(java.util.List<HitDetectItems> hitDetectItems) {
        this.hitDetectItems = hitDetectItems;
        return this;
    }
    public java.util.List<HitDetectItems> getHitDetectItems() {
        return this.hitDetectItems;
    }

    public QueryContentriskInternalResponse setResultAction(String resultAction) {
        this.resultAction = resultAction;
        return this;
    }
    public String getResultAction() {
        return this.resultAction;
    }

}
