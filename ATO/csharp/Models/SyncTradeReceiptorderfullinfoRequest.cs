// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SyncTradeReceiptorderfullinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=49)]
        public string OrderId { get; set; }

        // 商户社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true, MaxLength=63)]
        public string MerchantId { get; set; }

        // 商户公司名字
        [NameInMap("merchant_name")]
        [Validation(Required=true, MaxLength=199)]
        public string MerchantName { get; set; }

        // 场景码
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

        // 业务类型
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 主订单信息，资产订单定义
        [NameInMap("receipt_order_info")]
        [Validation(Required=true)]
        public string ReceiptOrderInfo { get; set; }

        // 订单包含的商品信息
        [NameInMap("product_info")]
        [Validation(Required=true)]
        public string ProductInfo { get; set; }

    }

}
