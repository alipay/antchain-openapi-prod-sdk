// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MARKETING.Models
{
    // 公司联系人
    public class CorporateContacts : TeaModel {
        // 职务
        [NameInMap("job_title")]
        [Validation(Required=false)]
        public string JobTitle { get; set; }

        // 姓名
        [NameInMap("real_name")]
        [Validation(Required=true)]
        public string RealName { get; set; }

        // 电话
        [NameInMap("mobile_phone")]
        [Validation(Required=false)]
        public string MobilePhone { get; set; }

        // 邮箱
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

    }

}
