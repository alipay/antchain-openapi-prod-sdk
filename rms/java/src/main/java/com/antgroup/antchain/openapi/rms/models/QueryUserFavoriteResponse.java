// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryUserFavoriteResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户收藏的资源列表
    @NameInMap("favorites")
    public java.util.List<UserFavoriteVO> favorites;

    public static QueryUserFavoriteResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserFavoriteResponse self = new QueryUserFavoriteResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserFavoriteResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUserFavoriteResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUserFavoriteResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUserFavoriteResponse setFavorites(java.util.List<UserFavoriteVO> favorites) {
        this.favorites = favorites;
        return this;
    }
    public java.util.List<UserFavoriteVO> getFavorites() {
        return this.favorites;
    }

}
