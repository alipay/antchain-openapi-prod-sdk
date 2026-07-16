// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class DetailInnerOrderResponse : TeaModel {
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

        // 支付宝代扣协议号
        [NameInMap("agreement_no")]
        [Validation(Required=false)]
        public string AgreementNo { get; set; }

        // 商品总数量
        [NameInMap("product_total_count")]
        [Validation(Required=false)]
        public long? ProductTotalCount { get; set; }

        // 订单基础信息
        [NameInMap("order_info")]
        [Validation(Required=false)]
        public OrderInfo OrderInfo { get; set; }

        // 用户信息
        [NameInMap("order_user_info")]
        [Validation(Required=false)]
        public OrderUserInfo OrderUserInfo { get; set; }

        // 订单履约
        [NameInMap("order_fulfillment_info_list")]
        [Validation(Required=false)]
        public List<OrderFulfillmentInfo> OrderFulfillmentInfoList { get; set; }

        // 订单还款承诺
        [NameInMap("order_promise_info")]
        [Validation(Required=false)]
        public OrderPromiseInfo OrderPromiseInfo { get; set; }

        // 订单商品信息
        [NameInMap("order_product_info_list")]
        [Validation(Required=false)]
        public List<OrderProductInfo> OrderProductInfoList { get; set; }

        // 经营分账信息
        [NameInMap("operate_divide_info_list")]
        [Validation(Required=false)]
        public List<OperateDivideInfo> OperateDivideInfoList { get; set; }

        // 订单合同信息
        [NameInMap("order_contract_info_list")]
        [Validation(Required=false)]
        public List<OrderContractInfo> OrderContractInfoList { get; set; }

    }

}
