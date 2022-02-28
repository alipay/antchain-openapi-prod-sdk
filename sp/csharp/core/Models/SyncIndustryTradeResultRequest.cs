// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SP.Models
{
    public class SyncIndustryTradeResultRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("product_access_code")]
        [Validation(Required=false)]
        public string ProductAccessCode { get; set; }

        // 外部商户订单号，不超过32位
        [NameInMap("merchant_order_no")]
        [Validation(Required=true)]
        public string MerchantOrderNo { get; set; }

        // 原支付请求的商户订单号
        [NameInMap("out_trade_no")]
        [Validation(Required=true)]
        public string OutTradeNo { get; set; }

        // 支付宝交易号
        [NameInMap("trade_no")]
        [Validation(Required=true)]
        public string TradeNo { get; set; }

        // 交易状态。
        // WAIT_BUYER_PAY	交易创建，等待买家付款。
        // TRADE_CLOSED	未付款交易超时关闭，或支付完成后全额退款。
        // TRADE_SUCCESS	交易支付成功。
        [NameInMap("trade_status")]
        [Validation(Required=true)]
        public string TradeStatus { get; set; }

        // 错误码。
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 错误原因
        [NameInMap("error_msg")]
        [Validation(Required=false)]
        public string ErrorMsg { get; set; }

        // 渠道 自营平台、第三方平台等
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

    }

}
