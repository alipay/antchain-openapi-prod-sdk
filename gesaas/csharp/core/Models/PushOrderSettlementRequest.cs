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

        // 商家产品唯一编码，64个字符以内
        [NameInMap("out_product_id")]
        [Validation(Required=true)]
        public string OutProductId { get; set; }

        // 外部订单号，需保证在商家端不重复，64个字符以内，每次发起需定义唯一的outOrderNo(包括重试)
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

        // 扩展参数，JSONString格式
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

        // true：是最终分账，分账完成后资金自动解冻
        // false：非最终分账，资金保持冻结
        // 默认值：true
        [NameInMap("is_final_split")]
        [Validation(Required=false)]
        public bool? IsFinalSplit { get; set; }

        // 订单产生时间，格式为yyyy-MM-dd HH:mm:ss
        [NameInMap("out_order_time")]
        [Validation(Required=true)]
        public string OutOrderTime { get; set; }

    }

}
