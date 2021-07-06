// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class InitContentriskInternalResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 内容ID，用于查询异步识别结果时作为查询ID
    @NameInMap("app_scene_data_id")
    public String appSceneDataId;

    // 内容安全同步检测返回的事件id，用于异步获取检测结果
    @NameInMap("event_id")
    public String eventId;

    // 命中结果详情
    @NameInMap("hit_detect_items")
    public java.util.List<HitDetectItems> hitDetectItems;

    // 是否需要进行异步查询的标志位 need: 需要等待60秒之后进行异步查询 no_need: 不需要，已经同步返回结果
    @NameInMap("need_query")
    public String needQuery;

    // PASSED("数据识别通过，可以在网站上正常显示")
    // 
    // REJECTED("被拒绝的数据，比如内容出现违禁词；不能出现在我们网站上")
    // 
    // CC("CC表示用户发表数据后，提示成功，自己能看到这条消息，但其它人接收不到本条消息或看不见这条消息。")
    // 
    // DELETE("删除数据, 为了不扩大化数据的传播，删除历史已经发出去的数据。")
    // 
    // REPLACE("替换部分词为 ***")
    // 
    // WARNING("提示数据，表示内容存在可疑，提示用户操作")
    // 
    // RECOVER("恢复数据，将误判断的内容，恢复回来")
    @NameInMap("result_action")
    public String resultAction;

    public static InitContentriskInternalResponse build(java.util.Map<String, ?> map) throws Exception {
        InitContentriskInternalResponse self = new InitContentriskInternalResponse();
        return TeaModel.build(map, self);
    }

    public InitContentriskInternalResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitContentriskInternalResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitContentriskInternalResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitContentriskInternalResponse setAppSceneDataId(String appSceneDataId) {
        this.appSceneDataId = appSceneDataId;
        return this;
    }
    public String getAppSceneDataId() {
        return this.appSceneDataId;
    }

    public InitContentriskInternalResponse setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public InitContentriskInternalResponse setHitDetectItems(java.util.List<HitDetectItems> hitDetectItems) {
        this.hitDetectItems = hitDetectItems;
        return this;
    }
    public java.util.List<HitDetectItems> getHitDetectItems() {
        return this.hitDetectItems;
    }

    public InitContentriskInternalResponse setNeedQuery(String needQuery) {
        this.needQuery = needQuery;
        return this;
    }
    public String getNeedQuery() {
        return this.needQuery;
    }

    public InitContentriskInternalResponse setResultAction(String resultAction) {
        this.resultAction = resultAction;
        return this;
    }
    public String getResultAction() {
        return this.resultAction;
    }

}
