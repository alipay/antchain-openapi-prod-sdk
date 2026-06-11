// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    public class PushOrderSettlementRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求流水号，由商家自定义。64个字符以内，仅可包含字母、数字、下划线。需保证在商户端不重复
        [NameInMap("out_request_no")]
        [Validation(Required=true)]
        public string OutRequestNo { get; set; }

        // 商家产品唯一编码，64个字符以内
        [NameInMap("out_product_id")]
        [Validation(Required=true)]
        public string OutProductId { get; set; }

        // 外部订单号，需保证在商家端不重复
        [NameInMap("out_order_no")]
        [Validation(Required=true)]
        public string OutOrderNo { get; set; }

        // 支付宝/微信/其他  平台订单号
        [NameInMap("trade_no")]
        [Validation(Required=true)]
        public string TradeNo { get; set; }

        // 支付渠道类型，枚举值：ALIPAY / WECHAT
        [NameInMap("order_type")]
        [Validation(Required=true)]
        public string OrderType { get; set; }

        // 订单金额，单位：分（如 990 表示 9.90元）
        [NameInMap("order_amount")]
        [Validation(Required=true)]
        public long? OrderAmount { get; set; }

        // 分账模式，目前有两种分账同步执行sync，分账异步执行async，不传默认同步执行
        // 同步执行: sync，异步执行: async
        [NameInMap("royalty_mode")]
        [Validation(Required=false)]
        public string RoyaltyMode { get; set; }

        // 扩展信息
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
