// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 机构联系人信息
    public class InstitutionContactInfo : TeaModel {
        // 联系人
        [NameInMap("contact_person")]
        [Validation(Required=true)]
        public string ContactPerson { get; set; }

        // 联系人邮箱
        [NameInMap("contact_email")]
        [Validation(Required=true)]
        public string ContactEmail { get; set; }

    }

}
