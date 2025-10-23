// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class ApplyCutpaymentRefundRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
        [NameInMap("outer_order_no")]
        [Validation(Required=true)]
        public string OuterOrderNo { get; set; }

        // 入参加密模式：
        // "0"（默认值）：不加密；
        // "6"：AES加密
        // 默认为"0"
        [NameInMap("encrypt_type")]
        [Validation(Required=false)]
        public string EncryptType { get; set; }

        // 加密密钥
        [NameInMap("encrypt_token")]
        [Validation(Required=false)]
        public string EncryptToken { get; set; }

        // 原支付商户订单号
        [NameInMap("payment_trans_id")]
        [Validation(Required=true)]
        public string PaymentTransId { get; set; }

        // 签约协议号
        [NameInMap("protocol_no")]
        [Validation(Required=true)]
        public string ProtocolNo { get; set; }

        // 退款商户订单号
        [NameInMap("refund_trans_id")]
        [Validation(Required=true)]
        public string RefundTransId { get; set; }

        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 退款商户流水号
        [NameInMap("refund_serial_no")]
        [Validation(Required=true)]
        public string RefundSerialNo { get; set; }

        // 退款原因
        [NameInMap("refund_reason")]
        [Validation(Required=true)]
        public string RefundReason { get; set; }

        // 退款金额，整数，单位:分
        [NameInMap("refund_amt")]
        [Validation(Required=true)]
        public string RefundAmt { get; set; }

        // 分账退款信息
        [NameInMap("share_refund_info")]
        [Validation(Required=false)]
        public List<ShareRefundInfo> ShareRefundInfo { get; set; }

    }

}
