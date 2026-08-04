// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    public class QueryOrderSettlementResponse : TeaModel {
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

        // 商家产品唯一编码，64个字符以内
        [NameInMap("out_product_id")]
        [Validation(Required=false)]
        public string OutProductId { get; set; }

        // 订单金额，单位：分（如 990 表示 9.90元）
        [NameInMap("total_amount")]
        [Validation(Required=false)]
        public long? TotalAmount { get; set; }

        // 订单创建时间，格式为yyyy-MM-dd HH:mm:ss
        [NameInMap("order_create_time")]
        [Validation(Required=false)]
        public string OrderCreateTime { get; set; }

        // 订单支付标题， 150个字符以内
        [NameInMap("pay_subject")]
        [Validation(Required=false)]
        public string PaySubject { get; set; }

        // 支付宝支付订单号，用于拉起主动支付页面
        [NameInMap("trade_no")]
        [Validation(Required=false)]
        public string TradeNo { get; set; }

        // 支付详情
        [NameInMap("order_pay_info")]
        [Validation(Required=false)]
        public OrderPayInfo OrderPayInfo { get; set; }

        // 分账详情
        [NameInMap("order_split_info")]
        [Validation(Required=false)]
        public OrderSplitInfo OrderSplitInfo { get; set; }

        // 支付渠道是ALIPAY场景下-支付宝用户2088xxxx
        [NameInMap("pay_channel_user_id")]
        [Validation(Required=false)]
        public string PayChannelUserId { get; set; }

        // 支付渠道，默认：ALIPAY
        [NameInMap("pay_channel")]
        [Validation(Required=false)]
        public string PayChannel { get; set; }

        // 支付产品，默认：JSAPI
        [NameInMap("pay_product")]
        [Validation(Required=false)]
        public string PayProduct { get; set; }

    }

}
