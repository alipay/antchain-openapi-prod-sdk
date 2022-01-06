// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // ConfigDispatchLogDO
    public class ConfigDispatchLogDO : TeaModel {
        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 配置的key
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // 配置的类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 配置下发的信息
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
