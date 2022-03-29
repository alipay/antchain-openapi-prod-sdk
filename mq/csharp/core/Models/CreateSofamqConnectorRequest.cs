// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class CreateSofamqConnectorRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // cron表达式描述任务触发，如果类型是cron的话
        [NameInMap("cron")]
        [Validation(Required=false)]
        public string Cron { get; set; }

        // 数据过滤，支持SQL92过滤
        [NameInMap("filter")]
        [Validation(Required=false)]
        public string Filter { get; set; }

        // 实例编号
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 任务名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 限流值
        [NameInMap("rate")]
        [Validation(Required=false)]
        public long? Rate { get; set; }

        // 描述任务
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 去向信息的配置, kv结构的数组 的 JSON String
        [NameInMap("sink_configs")]
        [Validation(Required=true)]
        public string SinkConfigs { get; set; }

        // 去向类型
        [NameInMap("sink_type")]
        [Validation(Required=true)]
        public string SinkType { get; set; }

        // 来源的配置项列表， kv结构数组 的 JSON String
        [NameInMap("source_configs")]
        [Validation(Required=true)]
        public string SourceConfigs { get; set; }

        // 来源类型
        [NameInMap("source_type")]
        [Validation(Required=true)]
        public string SourceType { get; set; }

        // 如果类型是once的话，给定一个unix时间戳
        [NameInMap("time")]
        [Validation(Required=false)]
        public long? Time { get; set; }

        // 数据转化配置。数据转化配置的数组 的JSON String
        [NameInMap("transformation")]
        [Validation(Required=false)]
        public string Transformation { get; set; }

        // 任务调度类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 任务所有者，一般是app维度
        [NameInMap("app")]
        [Validation(Required=true)]
        public string App { get; set; }

        // stepflow平台上的某个 模板编号
        [NameInMap("stepflow_template_id")]
        [Validation(Required=false)]
        public string StepflowTemplateId { get; set; }

        // 时间订阅的配置，json格式
        [NameInMap("event_sub_configs")]
        [Validation(Required=false)]
        public string EventSubConfigs { get; set; }

        // 事件订阅是否开启
        [NameInMap("event_sub_enabled")]
        [Validation(Required=true)]
        public bool? EventSubEnabled { get; set; }

        // 预期完成时间(s)
        [NameInMap("acceptable_execution_interval")]
        [Validation(Required=false)]
        public long? AcceptableExecutionInterval { get; set; }

        // 是否自动回收实例
        [NameInMap("auto_recycle_instance")]
        [Validation(Required=false)]
        public bool? AutoRecycleInstance { get; set; }

    }

}
