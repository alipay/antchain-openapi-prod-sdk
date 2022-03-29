// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class RunSofamqConnectorjobRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 期望任务执行时间的unix 时间戳，精度是毫秒
        [NameInMap("execution_time")]
        [Validation(Required=false)]
        public long? ExecutionTime { get; set; }

        // 任务名
        [NameInMap("job")]
        [Validation(Required=true)]
        public string Job { get; set; }

        // 分区描述
        [NameInMap("partition")]
        [Validation(Required=false)]
        public string Partition { get; set; }

        // 租户实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // Sink开发分组
        [NameInMap("sink_dev_group")]
        [Validation(Required=false)]
        public string SinkDevGroup { get; set; }

        // dt=20210910
        [NameInMap("source_partition")]
        [Validation(Required=false)]
        public string SourcePartition { get; set; }

        // 目标分组
        [NameInMap("sink_partition")]
        [Validation(Required=false)]
        public string SinkPartition { get; set; }

        // Source开发分组
        [NameInMap("source_dev_group")]
        [Validation(Required=false)]
        public string SourceDevGroup { get; set; }

    }

}
