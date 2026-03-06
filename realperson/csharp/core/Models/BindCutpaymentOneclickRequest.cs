// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class BindCutpaymentOneclickRequest : TeaModel {
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

        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 银行编号
        [NameInMap("bank_code")]
        [Validation(Required=true)]
        public string BankCode { get; set; }

        // 银行卡类型，
        // 0：借记卡
        // 1：信用卡
        [NameInMap("card_type")]
        [Validation(Required=true)]
        public string CardType { get; set; }

        // 证件类型，
        // 0：身份证
        // 1：港澳居民居住证
        // 2：台湾居民居住证
        [NameInMap("id_card_type")]
        [Validation(Required=true)]
        public string IdCardType { get; set; }

        // 姓名
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

        // 身份证号
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 页面返回地址，
        // 签约完成，页面跳转地址，注：地址后不能带参数
        [NameInMap("page_url")]
        [Validation(Required=true)]
        public string PageUrl { get; set; }

    }

}
