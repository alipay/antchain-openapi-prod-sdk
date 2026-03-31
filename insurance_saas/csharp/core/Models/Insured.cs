// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    // 被保人
    public class Insured : TeaModel {
        // 被保人名称
        [NameInMap("insured_name")]
        [Validation(Required=true, MaxLength=32)]
        public string InsuredName { get; set; }

        // 被保人证件类型
        [NameInMap("insured_card_type")]
        [Validation(Required=true, MaxLength=32)]
        public string InsuredCardType { get; set; }

        // 被保人证件号码
        [NameInMap("insured_card_code")]
        [Validation(Required=true, MaxLength=32)]
        public string InsuredCardCode { get; set; }

        // 被保人联系方式
        [NameInMap("insured_contact_info")]
        [Validation(Required=false, MaxLength=128)]
        public string InsuredContactInfo { get; set; }

    }

}
