// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 消费限流DTO
    public class ConsumeLimiterDTO : TeaModel {
        // 实例ID
        // 
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 限流类型
        // - UNIT：单元限流，指定单元/CELL限流
        // 
        [NameInMap("limiter_type")]
        [Validation(Required=true)]
        public string LimiterType { get; set; }

        // 限流资源名，由 GROUP@TOPIC 组成
        // 
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 限流值配置，BASE 为基准限流值。
        [NameInMap("tps")]
        [Validation(Required=true)]
        public string Tps { get; set; }

    }

}
