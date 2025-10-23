// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class ApplyCutpaymentPaymentRequest : TeaModel {
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

        // 支付订单id
        [NameInMap("trans_id")]
        [Validation(Required=true)]
        public string TransId { get; set; }

        // 签约协议号
        [NameInMap("protocol_no")]
        [Validation(Required=true)]
        public string ProtocolNo { get; set; }

        // 银行卡卡号
        [NameInMap("card_no")]
        [Validation(Required=true)]
        public string CardNo { get; set; }

        // 用户姓名
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

        // 交易金额，整数，单位:分
        [NameInMap("txn_amt")]
        [Validation(Required=true)]
        public string TxnAmt { get; set; }

        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 安全码
        [NameInMap("security_code")]
        [Validation(Required=false)]
        public string SecurityCode { get; set; }

        // 有效期
        [NameInMap("valid_date")]
        [Validation(Required=false)]
        public string ValidDate { get; set; }

        // 分账信息
        [NameInMap("share_info")]
        [Validation(Required=false)]
        public List<ShareInfo> ShareInfo { get; set; }

    }

}
