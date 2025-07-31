// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SyncTradePromoorderinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true, MaxLength=63)]
        public string MerchantId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=49)]
        public string OrderId { get; set; }

        // 营销id
        [NameInMap("promotion_id")]
        [Validation(Required=true, MaxLength=63)]
        public string PromotionId { get; set; }

        // 订单创建时间
        [NameInMap("order_create_time")]
        [Validation(Required=true, MaxLength=20)]
        public string OrderCreateTime { get; set; }

        // 买断价，单位为分
        [NameInMap("buy_out_price")]
        [Validation(Required=true)]
        public long? BuyOutPrice { get; set; }

        // 代扣履约总金额，单位为分
        [NameInMap("order_promise_total_money")]
        [Validation(Required=true)]
        public long? OrderPromiseTotalMoney { get; set; }

        // 商户公司的名字
        [NameInMap("merchant_name")]
        [Validation(Required=true, MaxLength=199)]
        public string MerchantName { get; set; }

    }

}
