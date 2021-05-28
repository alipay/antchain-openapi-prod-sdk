// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class AuthCorpRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 企业注册地址和电话号码
        [NameInMap("corp_address_phone_no")]
        [Validation(Required=true)]
        public string CorpAddressPhoneNo { get; set; }

        // 企业银行账号
        [NameInMap("corp_bank_no")]
        [Validation(Required=true)]
        public string CorpBankNo { get; set; }

        // 填写公司名称
        [NameInMap("corp_name")]
        [Validation(Required=true)]
        public string CorpName { get; set; }

        // 企业授权秘钥
        [NameInMap("corp_private_key")]
        [Validation(Required=true)]
        public string CorpPrivateKey { get; set; }

        // 企业纳税人识别号
        [NameInMap("corp_tax_id")]
        [Validation(Required=true)]
        public string CorpTaxId { get; set; }

    }

}
