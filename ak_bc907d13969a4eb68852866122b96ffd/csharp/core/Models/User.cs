// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_bc907d13969a4eb68852866122b96ffd.Models
{
    // 添加用户至租户
    public class User : TeaModel {
        // 接入标注系统的用户ID
        [NameInMap("accountno")]
        [Validation(Required=false)]
        public string Accountno { get; set; }

        // 用户名称
        [NameInMap("username")]
        [Validation(Required=false)]
        public string Username { get; set; }

        // 用户来源
        [NameInMap("accountsource")]
        [Validation(Required=false)]
        public string Accountsource { get; set; }

        // UserId
        [NameInMap("userid")]
        [Validation(Required=false)]
        public string Userid { get; set; }

    }

}
