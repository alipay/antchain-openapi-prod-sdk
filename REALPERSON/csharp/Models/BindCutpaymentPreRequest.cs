// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class BindCutpaymentPreRequest : TeaModel {
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

        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 银行卡类型
        // 0：借记卡
        // 1：信用卡
        [NameInMap("card_type")]
        [Validation(Required=true)]
        public string CardType { get; set; }

        // 银行卡属性
        // 0私人，1公司。不填时，默认为私人0
        [NameInMap("card_pro")]
        [Validation(Required=false)]
        public string CardPro { get; set; }

        // 银行卡卡号
        [NameInMap("card_no")]
        [Validation(Required=true)]
        public string CardNo { get; set; }

        // 证件类型
        // 0：身份证
        // 1：港澳居民居住证
        // 2：台湾居民居住证
        // 3：外国人永久居住证
        [NameInMap("id_card_type")]
        [Validation(Required=true)]
        public string IdCardType { get; set; }

        // 持卡人姓名
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

        // 证件号
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 手机号
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 银行卡安全码
        [NameInMap("security_code")]
        [Validation(Required=false)]
        public string SecurityCode { get; set; }

        // 银行卡有期（格式为：YYMM）
        [NameInMap("valid_date")]
        [Validation(Required=false)]
        public string ValidDate { get; set; }

    }

}
