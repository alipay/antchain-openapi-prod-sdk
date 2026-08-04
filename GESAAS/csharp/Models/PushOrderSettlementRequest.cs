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

        // 外部订单号(同一个outProductId保证唯一性)，需保证在商家端不重复，64个字符以内
        [NameInMap("out_order_no")]
        [Validation(Required=true)]
        public string OutOrderNo { get; set; }

        // 订单支付金额(同分账金额)，单位：分（如 990 表示 9.90元）
        [NameInMap("total_amount")]
        [Validation(Required=true)]
        public long? TotalAmount { get; set; }

        // 支付产品，默认：JSAPI
        [NameInMap("pay_product")]
        [Validation(Required=false)]
        public string PayProduct { get; set; }

        // 扩展参数，JSONString格式
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

        // 订单创建时间，格式为yyyy-MM-dd HH:mm:ss
        [NameInMap("order_create_time")]
        [Validation(Required=true)]
        public string OrderCreateTime { get; set; }

        // 订单支付标题， 150个字符以内
        [NameInMap("pay_subject")]
        [Validation(Required=true)]
        public string PaySubject { get; set; }

        // 支付渠道，默认：ALIPAY
        [NameInMap("pay_channel")]
        [Validation(Required=false)]
        public string PayChannel { get; set; }

        // 支付渠道是ALIPAY场景下传入支付宝用户2088xxxx
        [NameInMap("pay_channel_user_id")]
        [Validation(Required=true)]
        public string PayChannelUserId { get; set; }

    }

}
