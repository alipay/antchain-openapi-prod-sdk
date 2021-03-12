// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryDistributionOrderPromoterResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 佣金
        [NameInMap("commission")]
        [Validation(Required=false)]
        public string Commission { get; set; }

        // 佣金比例 10表示 10%
        [NameInMap("commission_rate")]
        [Validation(Required=false)]
        public string CommissionRate { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 订单金额
        [NameInMap("order_price")]
        [Validation(Required=false)]
        public string OrderPrice { get; set; }

        // 推广人上级ID
        [NameInMap("prev_promoter_id")]
        [Validation(Required=false)]
        public string PrevPromoterId { get; set; }

        // 推广人上级分佣金额
        [NameInMap("prev_promoter_price")]
        [Validation(Required=false)]
        public string PrevPromoterPrice { get; set; }

        // 商品id
        [NameInMap("product_id")]
        [Validation(Required=false)]
        public string ProductId { get; set; }

        // 推广人id
        [NameInMap("promoter_id")]
        [Validation(Required=false)]
        public string PromoterId { get; set; }

        // 链上地址
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

    }

}
