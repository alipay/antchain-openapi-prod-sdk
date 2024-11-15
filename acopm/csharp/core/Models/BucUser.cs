// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    // user信息
    public class BucUser : TeaModel {
        // 工号
        [NameInMap("emp_id")]
        [Validation(Required=true)]
        public string EmpId { get; set; }

        // 域账号
        [NameInMap("email_prefix")]
        [Validation(Required=true)]
        public string EmailPrefix { get; set; }

        // 花名
        [NameInMap("nick_name")]
        [Validation(Required=false)]
        public string NickName { get; set; }

    }

}
