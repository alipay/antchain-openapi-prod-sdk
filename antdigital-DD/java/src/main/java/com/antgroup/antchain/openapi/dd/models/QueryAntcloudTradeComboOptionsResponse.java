// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class QueryAntcloudTradeComboOptionsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 套餐基本信息
    @NameInMap("combo_dto")
    public ComboDTO comboDto;

    // 套餐内商品信息列表（仅包含当前 OU 下上架的商品）
    @NameInMap("combo_item_dtos")
    public java.util.List<ComboItemDTO> comboItemDtos;

    // 售卖规则校验是否通过
    @NameInMap("rule_check_success")
    public Boolean ruleCheckSuccess;

    // 售卖规则校验失败时的错误码
    @NameInMap("rule_check_error_code")
    public String ruleCheckErrorCode;

    // 该商品当前不可购买：未完成实名认证
    @NameInMap("rule_check_error_message")
    public String ruleCheckErrorMessage;

    public static QueryAntcloudTradeComboOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudTradeComboOptionsResponse self = new QueryAntcloudTradeComboOptionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudTradeComboOptionsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntcloudTradeComboOptionsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntcloudTradeComboOptionsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntcloudTradeComboOptionsResponse setComboDto(ComboDTO comboDto) {
        this.comboDto = comboDto;
        return this;
    }
    public ComboDTO getComboDto() {
        return this.comboDto;
    }

    public QueryAntcloudTradeComboOptionsResponse setComboItemDtos(java.util.List<ComboItemDTO> comboItemDtos) {
        this.comboItemDtos = comboItemDtos;
        return this;
    }
    public java.util.List<ComboItemDTO> getComboItemDtos() {
        return this.comboItemDtos;
    }

    public QueryAntcloudTradeComboOptionsResponse setRuleCheckSuccess(Boolean ruleCheckSuccess) {
        this.ruleCheckSuccess = ruleCheckSuccess;
        return this;
    }
    public Boolean getRuleCheckSuccess() {
        return this.ruleCheckSuccess;
    }

    public QueryAntcloudTradeComboOptionsResponse setRuleCheckErrorCode(String ruleCheckErrorCode) {
        this.ruleCheckErrorCode = ruleCheckErrorCode;
        return this;
    }
    public String getRuleCheckErrorCode() {
        return this.ruleCheckErrorCode;
    }

    public QueryAntcloudTradeComboOptionsResponse setRuleCheckErrorMessage(String ruleCheckErrorMessage) {
        this.ruleCheckErrorMessage = ruleCheckErrorMessage;
        return this;
    }
    public String getRuleCheckErrorMessage() {
        return this.ruleCheckErrorMessage;
    }

}
