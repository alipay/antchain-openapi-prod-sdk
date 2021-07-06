// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class InitEpayauthVerifyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 待认证银行卡号
        // 
        [NameInMap("bank_card_no")]
        [Validation(Required=true)]
        public string BankCardNo { get; set; }

        // 人行联行号
        [NameInMap("bank_code")]
        [Validation(Required=true)]
        public string BankCode { get; set; }

        // 回调通知地址
        [NameInMap("callback_url")]
        [Validation(Required=true)]
        public string CallbackUrl { get; set; }

        // 企业名称
        [NameInMap("ep_cert_name")]
        [Validation(Required=true)]
        public string EpCertName { get; set; }

        // 企业证件号
        [NameInMap("ep_cert_no")]
        [Validation(Required=true)]
        public string EpCertNo { get; set; }

        // 法人姓名
        [NameInMap("legal_person_cert_name")]
        [Validation(Required=true)]
        public string LegalPersonCertName { get; set; }

        // 企业法人身份证号码
        [NameInMap("legal_person_cert_no")]
        [Validation(Required=true)]
        public string LegalPersonCertNo { get; set; }

        // 手机号码 用于接收打款验证通知短信
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

    }

}
