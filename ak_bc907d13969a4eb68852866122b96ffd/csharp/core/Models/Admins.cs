// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_bc907d13969a4eb68852866122b96ffd.Models
{
    // 任务管理员列表
    public class Admins : TeaModel {
        // 管理员列表
        [NameInMap("users")]
        [Validation(Required=false)]
        public List<User> Users { get; set; }

        // 组ID
        [NameInMap("groups")]
        [Validation(Required=false)]
        public List<Groups> Groups { get; set; }

    }

}
