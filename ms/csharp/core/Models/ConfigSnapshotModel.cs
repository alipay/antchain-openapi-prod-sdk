// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // ConfigSnapshotModel
    public class ConfigSnapshotModel : TeaModel {
        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 配置的key，例如在服务鉴权里是dataId
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // 配置类型：例如 auth、lb 等
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 配置值
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
