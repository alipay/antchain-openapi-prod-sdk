// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SP.Models
{
    // 干系人
    public class RelUser : TeaModel {
        // 工号
        [NameInMap("emp_id")]
        [Validation(Required=true)]
        public string EmpId { get; set; }

        // 域账号
        [NameInMap("login_name")]
        [Validation(Required=true)]
        public string LoginName { get; set; }

        // 花名
        [NameInMap("nick_name")]
        [Validation(Required=true)]
        public string NickName { get; set; }

        // 角色，PD-产品经理，DEV-研发
        [NameInMap("role")]
        [Validation(Required=true)]
        public string Role { get; set; }

    }

}
