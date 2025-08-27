// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class DetailInnerFundmngorderResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 订单基础信息
        [NameInMap("order_info")]
        [Validation(Required=false)]
        public OrderInfo OrderInfo { get; set; }

        // 订单物流信息列表
        [NameInMap("order_logistic_info_list")]
        [Validation(Required=false)]
        public List<OrderLogisticInfo> OrderLogisticInfoList { get; set; }

        // 订单用户信息
        [NameInMap("order_user_info")]
        [Validation(Required=false)]
        public OrderUserInfo OrderUserInfo { get; set; }

        // 订单融资信息
        [NameInMap("order_finance_info")]
        [Validation(Required=false)]
        public OrderFinanceInfo OrderFinanceInfo { get; set; }

        // 订单履约信息
        [NameInMap("order_fulfillment_info_list")]
        [Validation(Required=false)]
        public List<OrderFulfillmentInfo> OrderFulfillmentInfoList { get; set; }

        // 订单履约计划
        [NameInMap("order_promise_info")]
        [Validation(Required=false)]
        public List<OrderRepayStrategy> OrderPromiseInfo { get; set; }

        // 订单商品信息
        [NameInMap("order_product_info_list")]
        [Validation(Required=false)]
        public List<OrderProductInfo> OrderProductInfoList { get; set; }

        // 订单合同文件信息
        [NameInMap("order_contract_info_list")]
        [Validation(Required=false)]
        public List<OrderContractInfo> OrderContractInfoList { get; set; }

        // 订单代扣协议信息
        [NameInMap("order_withhold_contract_info")]
        [Validation(Required=false)]
        public OrderWithholdContractInfo OrderWithholdContractInfo { get; set; }

        // 订单资产凭证信息
        [NameInMap("order_credit_info")]
        [Validation(Required=false)]
        public List<InnerCreditInfo> OrderCreditInfo { get; set; }

        // 商家履约计划
        [NameInMap("merchant_order_repay_strategy")]
        [Validation(Required=false)]
        public List<MerchantOrderRepayStrategy> MerchantOrderRepayStrategy { get; set; }

        // 商户履约记录信息
        [NameInMap("merchant_order_fulfillment_info")]
        [Validation(Required=false)]
        public List<MerchantOrderFulfillmentInfo> MerchantOrderFulfillmentInfo { get; set; }

        // 资方后台融资申请结果
        [NameInMap("fund_mng_loan_applay_result")]
        [Validation(Required=false)]
        public FundMngLoanApplyResult FundMngLoanApplayResult { get; set; }

    }

}
