// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 应用等级
    public class AppLevel : TeaModel {
        // 应用等级ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 应用等级名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 应用等级负责人登录名
        [NameInMap("owner_login_name")]
        [Validation(Required=false)]
        public string OwnerLoginName { get; set; }

    }

}
