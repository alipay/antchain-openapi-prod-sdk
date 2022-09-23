// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 调解沟通联系人
    public class ContactInfo : TeaModel {
        // 联系人-姓名
        [NameInMap("contact_name")]
        [Validation(Required=true)]
        public string ContactName { get; set; }

        // 联系人-电话
        [NameInMap("contact_phone")]
        [Validation(Required=true)]
        public string ContactPhone { get; set; }

        // 联系人-电子邮箱
        [NameInMap("contact_email")]
        [Validation(Required=true)]
        public string ContactEmail { get; set; }

    }

}
