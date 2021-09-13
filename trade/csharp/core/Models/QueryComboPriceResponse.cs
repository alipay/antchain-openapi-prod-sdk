// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    public class QueryComboPriceResponse : TeaModel {
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

        // 套餐付款金额
        [NameInMap("combo_pay_amount")]
        [Validation(Required=false)]
        public string ComboPayAmount { get; set; }

        // 套餐优惠金额
        [NameInMap("combo_coupon_amount")]
        [Validation(Required=false)]
        public string ComboCouponAmount { get; set; }

        // 套餐折扣金额
        [NameInMap("combo_discount_amount")]
        [Validation(Required=false)]
        public string ComboDiscountAmount { get; set; }

        // 套餐原始金额
        [NameInMap("combo_original_amount")]
        [Validation(Required=false)]
        public string ComboOriginalAmount { get; set; }

        // 币种，元：CNY
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

        // 商品询价明细
        [NameInMap("commodity_enquiry_prices")]
        [Validation(Required=false)]
        public List<CommodityEnquiryPrice> CommodityEnquiryPrices { get; set; }

    }

}
