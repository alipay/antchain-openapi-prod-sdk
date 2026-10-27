// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryTrustiotMiniappResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 一次性跳转链接：`{渠道登录页地址}?redirectToken=访问令牌`。链接整体 24 小时有效（见 valid_to），令牌一次性消费、用后即失效
    @NameInMap("redirect_url")
    public String redirectUrl;

    // 链接生效时间，秒级时间戳
    @NameInMap("valid_from")
    public Long validFrom;

    // 链接过期时间，秒级时间戳，valid_from 起 24 小时。过期后链接不可用
    @NameInMap("valid_to")
    public Long validTo;

    // 清单访问中未命中登记的访问目标回显，结构与 access_scope 条目相同（scene + 设备清单）。部分无效不影响签发，全部无效返回 422（NO_VALID_DEVICE）。主体访问（类型0）恒为空数组
    @NameInMap("invalid_targets")
    public java.util.List<AccessScopeItem> invalidTargets;

    // 链接实际生效的目标数：范围解析含直接子设备并集、按场景与目标去重后的总数。清单访问与主体访问均返回该口径
    @NameInMap("valid_target_count")
    public Long validTargetCount;

    public static QueryTrustiotMiniappResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTrustiotMiniappResponse self = new QueryTrustiotMiniappResponse();
        return TeaModel.build(map, self);
    }

    public QueryTrustiotMiniappResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTrustiotMiniappResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTrustiotMiniappResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTrustiotMiniappResponse setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public QueryTrustiotMiniappResponse setValidFrom(Long validFrom) {
        this.validFrom = validFrom;
        return this;
    }
    public Long getValidFrom() {
        return this.validFrom;
    }

    public QueryTrustiotMiniappResponse setValidTo(Long validTo) {
        this.validTo = validTo;
        return this;
    }
    public Long getValidTo() {
        return this.validTo;
    }

    public QueryTrustiotMiniappResponse setInvalidTargets(java.util.List<AccessScopeItem> invalidTargets) {
        this.invalidTargets = invalidTargets;
        return this;
    }
    public java.util.List<AccessScopeItem> getInvalidTargets() {
        return this.invalidTargets;
    }

    public QueryTrustiotMiniappResponse setValidTargetCount(Long validTargetCount) {
        this.validTargetCount = validTargetCount;
        return this;
    }
    public Long getValidTargetCount() {
        return this.validTargetCount;
    }

}
