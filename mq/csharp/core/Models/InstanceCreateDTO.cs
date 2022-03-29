// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // InstanceCreate返回数据
    public class InstanceCreateDTO : TeaModel {
        // instance id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 实例类型
        [NameInMap("instance_type")]
        [Validation(Required=true)]
        public long? InstanceType { get; set; }

    }

}
