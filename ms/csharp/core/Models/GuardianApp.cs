// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // GuardianApp
    public class GuardianApp : TeaModel {
        // 是否生效
        [NameInMap("enable")]
        [Validation(Required=false)]
        public bool? Enable { get; set; }

        // 监控id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 描述字段
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 运行模式
        [NameInMap("run_mode")]
        [Validation(Required=false)]
        public string RunMode { get; set; }

    }

}
