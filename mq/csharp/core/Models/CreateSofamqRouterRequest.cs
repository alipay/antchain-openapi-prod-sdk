// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class CreateSofamqRouterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 消费端 Group
        [NameInMap("consumer_id")]
        [Validation(Required=false)]
        public string ConsumerId { get; set; }

        // 消费起始位点。取值范围：0：最小位点；1：最大位点；2：时间戳。
        [NameInMap("consume_from_type")]
        [Validation(Required=true)]
        public long? ConsumeFromType { get; set; }

        // 消费起始位点时间戳，时间戳的值，单位是秒
        [NameInMap("consume_from_value")]
        [Validation(Required=false)]
        public long? ConsumeFromValue { get; set; }

        // 消费终止位点。取值范围：0：最小位点；1：最大位点；2：时间戳。
        [NameInMap("consume_to_type")]
        [Validation(Required=false)]
        public long? ConsumeToType { get; set; }

        // 消费终止位点时间戳，时间戳的值，单位是秒
        [NameInMap("consume_to_value")]
        [Validation(Required=false)]
        public long? ConsumeToValue { get; set; }

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
        [Validation(Required=false)]
        public bool? Disaster { get; set; }

        // 容灾机房
        [NameInMap("disaster_recovery_datacenter")]
        [Validation(Required=false)]
        public string DisasterRecoveryDatacenter { get; set; }

        // 实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

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
        [Validation(Required=false)]
        public string Tag { get; set; }

        // 任务状态。取值说明：0：初始化；1：工作中；2：停止。
        [NameInMap("task_status")]
        [Validation(Required=false)]
        public long? TaskStatus { get; set; }

        // 任务类型。取值范围： 0：LDC 复制；1：非 LDC；2：LDC 容灾。	
        [NameInMap("task_type")]
        [Validation(Required=true)]
        public long? TaskType { get; set; }

    }

}
