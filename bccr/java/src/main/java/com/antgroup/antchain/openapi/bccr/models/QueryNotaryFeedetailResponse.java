// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryNotaryFeedetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 本次公证出证需支付的总费用
    @NameInMap("total_price_rmb_fen")
    public Long totalPriceRmbFen;

    // 本次申请中每一类证据的数量明细列表
    @NameInMap("notary_fee_evid_type_data_list")
    public java.util.List<NotaryFeeEvidTypeData> notaryFeeEvidTypeDataList;

    // 本次需支付费用的分项明细列表
    @NameInMap("notary_fee_item_list")
    public java.util.List<NotaryFeeItem> notaryFeeItemList;

    // 收费规则描述
    @NameInMap("notary_fee_rule_list")
    public java.util.List<String> notaryFeeRuleList;

    public static QueryNotaryFeedetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNotaryFeedetailResponse self = new QueryNotaryFeedetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryNotaryFeedetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryNotaryFeedetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryNotaryFeedetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryNotaryFeedetailResponse setTotalPriceRmbFen(Long totalPriceRmbFen) {
        this.totalPriceRmbFen = totalPriceRmbFen;
        return this;
    }
    public Long getTotalPriceRmbFen() {
        return this.totalPriceRmbFen;
    }

    public QueryNotaryFeedetailResponse setNotaryFeeEvidTypeDataList(java.util.List<NotaryFeeEvidTypeData> notaryFeeEvidTypeDataList) {
        this.notaryFeeEvidTypeDataList = notaryFeeEvidTypeDataList;
        return this;
    }
    public java.util.List<NotaryFeeEvidTypeData> getNotaryFeeEvidTypeDataList() {
        return this.notaryFeeEvidTypeDataList;
    }

    public QueryNotaryFeedetailResponse setNotaryFeeItemList(java.util.List<NotaryFeeItem> notaryFeeItemList) {
        this.notaryFeeItemList = notaryFeeItemList;
        return this;
    }
    public java.util.List<NotaryFeeItem> getNotaryFeeItemList() {
        return this.notaryFeeItemList;
    }

    public QueryNotaryFeedetailResponse setNotaryFeeRuleList(java.util.List<String> notaryFeeRuleList) {
        this.notaryFeeRuleList = notaryFeeRuleList;
        return this;
    }
    public java.util.List<String> getNotaryFeeRuleList() {
        return this.notaryFeeRuleList;
    }

}
