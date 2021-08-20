// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 授权人企业信息
    public class AuthPersonEnterpriseInfo : TeaModel {
        // 企业名称
        [NameInMap("enterprise_name")]
        [Validation(Required=true)]
        public string EnterpriseName { get; set; }

        // 企业统一社会信用码
        [NameInMap("enterprise_credit_num")]
        [Validation(Required=true)]
        public string EnterpriseCreditNum { get; set; }

        // 企业法人姓名
        [NameInMap("enterprise_legal_person_name")]
        [Validation(Required=true)]
        public string EnterpriseLegalPersonName { get; set; }

        // 企业法人身份证号
        [NameInMap("enterprise_legal_person_id")]
        [Validation(Required=true)]
        public string EnterpriseLegalPersonId { get; set; }

        // 企业法人电话号码
        [NameInMap("enterprise_legal_person_phone_num")]
        [Validation(Required=true)]
        public long? EnterpriseLegalPersonPhoneNum { get; set; }

    }

}
