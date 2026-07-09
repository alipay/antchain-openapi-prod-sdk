// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class PushRentMerchantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 企业法人名称(个人可空)
        [NameInMap("legal_person_name")]
        [Validation(Required=false)]
        public string LegalPersonName { get; set; }

        // 企业法人证件号(个人可空)
        [NameInMap("legal_persion_idcard")]
        [Validation(Required=false)]
        public string LegalPersionIdcard { get; set; }

        // 企业名称(个人名称)
        [NameInMap("merchant_name")]
        [Validation(Required=true)]
        public string MerchantName { get; set; }

        // 企业社会信用代码(个人身份证)
        [NameInMap("merchant_credit_no")]
        [Validation(Required=true)]
        public string MerchantCreditNo { get; set; }

        // 支付宝监管户账号
        [NameInMap("alipay_account")]
        [Validation(Required=false)]
        public string AlipayAccount { get; set; }

        // 个人或企业
        // 个人：P
        // 企业：E
        [NameInMap("merchant_type")]
        [Validation(Required=true)]
        public string MerchantType { get; set; }

        // 企业联系人
        [NameInMap("contacts")]
        [Validation(Required=false)]
        public string Contacts { get; set; }

        // 企业位置
        [NameInMap("addr")]
        [Validation(Required=false)]
        public string Addr { get; set; }

    }

}
