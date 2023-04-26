// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 实例信息列表
    public class InstanceInfo : TeaModel {
        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 实例名称
        [NameInMap("instance_name")]
        [Validation(Required=true)]
        public string InstanceName { get; set; }

    }

}
