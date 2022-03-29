// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // router
    public class RouterConfigDO : TeaModel {
        // 消费端 Group
        [NameInMap("consumer_id")]
        [Validation(Required=true)]
        public string ConsumerId { get; set; }

        // 消费起始位点。取值范围：0：最小位点；1：最大位点；2：时间戳。
        [NameInMap("consume_from_type")]
        [Validation(Required=true)]
        public long? ConsumeFromType { get; set; }

        // 消费起始位点时间戳，时间戳的值，单位是秒
        [NameInMap("consume_from_value")]
        [Validation(Required=true)]
        public long? ConsumeFromValue { get; set; }

        // 消费终止位点。取值范围：0：最小位点；1：最大位点；2：时间戳。
        [NameInMap("consume_to_type")]
        [Validation(Required=true)]
        public long? ConsumeToType { get; set; }

        // 消费终止位点时间戳，时间戳的值，单位是秒
        [NameInMap("consume_to_value")]
        [Validation(Required=true)]
        public long? ConsumeToValue { get; set; }

        // 延迟时间
        [NameInMap("delay_time")]
        [Validation(Required=false)]
        public string DelayTime { get; set; }

        // 描述信息
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 目标单元
        [NameInMap("destination_cell")]
        [Validation(Required=true)]
        public string DestinationCell { get; set; }

        // 目标实例 ID
        [NameInMap("destination_instance_id")]
        [Validation(Required=true)]
        public string DestinationInstanceId { get; set; }

        // 目标 Topic
        [NameInMap("destination_topic")]
        [Validation(Required=true)]
        public string DestinationTopic { get; set; }

        // 容灾标识
        [NameInMap("disaster")]
        [Validation(Required=true)]
        public bool? Disaster { get; set; }

        // 容灾机房
        [NameInMap("disaster_recovery_datacenter")]
        [Validation(Required=true)]
        public string DisasterRecoveryDatacenter { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public string GmtModified { get; set; }

        // 路由任务 ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 源单元
        [NameInMap("source_cell")]
        [Validation(Required=true)]
        public string SourceCell { get; set; }

        // 源实例 ID
        [NameInMap("source_instance_id")]
        [Validation(Required=true)]
        public string SourceInstanceId { get; set; }

        // 源 Topic
        [NameInMap("source_topic")]
        [Validation(Required=true)]
        public string SourceTopic { get; set; }

        // 过滤 Tag
        [NameInMap("tag")]
        [Validation(Required=true)]
        public string Tag { get; set; }

        // 任务状态。取值说明：0：初始化；1：工作中；2：停止。
        [NameInMap("task_status")]
        [Validation(Required=true)]
        public long? TaskStatus { get; set; }

        // 任务类型。取值范围： 0：LDC 复制；1：非 LDC；2...
        [NameInMap("task_type")]
        [Validation(Required=true)]
        public long? TaskType { get; set; }

    }

}
