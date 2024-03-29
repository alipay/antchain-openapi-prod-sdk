// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INDUSTRY.Models
{
    public class PayTradePageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 来源场景码,IP版权默认传IP_COPYRIGHT
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 渠道 自营平台、第三方平台等
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // 支付成功后returl地址
        [NameInMap("return_url")]
        [Validation(Required=true)]
        public string ReturnUrl { get; set; }

        // 外部单据号。32 个字符以内的大小，仅支持字母、数字。需保证该参数在业务侧不重复。
        [NameInMap("merchant_order_no")]
        [Validation(Required=true)]
        public string MerchantOrderNo { get; set; }

        // 收单金额，"10.11"代表10.11元,最小粒度到分,小数点后2位，不支持高精度和负数
        [NameInMap("total_amount")]
        [Validation(Required=true)]
        public string TotalAmount { get; set; }

        // 交易标题等。注意：不可使用特殊字符，如 /，=，& 等。不超过256
        [NameInMap("subject")]
        [Validation(Required=true)]
        public string Subject { get; set; }

        // 支付渠道产品码；
        // 目前只支持直付通，code= ZFT;
        [NameInMap("pay_product_code")]
        [Validation(Required=true)]
        public string PayProductCode { get; set; }

        // 默认：人民币（156）
        [NameInMap("trans_currency")]
        [Validation(Required=false)]
        public string TransCurrency { get; set; }

        // 平台方下的用户id (即商家id)
        [NameInMap("merchant_user_id")]
        [Validation(Required=true)]
        public string MerchantUserId { get; set; }

        // 订单描述。不超过128长度
        [NameInMap("body")]
        [Validation(Required=false)]
        public string Body { get; set; }

        // 扩展字段
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

    }

}
