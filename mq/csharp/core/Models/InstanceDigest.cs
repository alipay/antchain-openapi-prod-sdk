// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 任务实例摘要信息
    public class InstanceDigest : TeaModel {
        // job instance id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 分区信息
        [NameInMap("partition")]
        [Validation(Required=true)]
        public string Partition { get; set; }

        // 时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // 任务状态
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

    }

}
