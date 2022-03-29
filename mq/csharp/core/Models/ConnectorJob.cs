// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 连接器任务
    public class ConnectorJob : TeaModel {
        // cron表达式描述任务的触发详情。
        [NameInMap("cron")]
        [Validation(Required=false)]
        public string Cron { get; set; }

        // sql过滤
        [NameInMap("filter")]
        [Validation(Required=false)]
        public string Filter { get; set; }

        // 任务名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 限流值
        [NameInMap("rate")]
        [Validation(Required=false)]
        public long? Rate { get; set; }

        // 描述这个任务的具体详情
        [NameInMap("remark")]
        [Validation(Required=false, MaxLength=128)]
        public string Remark { get; set; }

        // 去向信息的配置
        [NameInMap("sink_configs")]
        [Validation(Required=true)]
        public List<UIKeyVauleTemplate> SinkConfigs { get; set; }

        // 去向类型
        [NameInMap("sink_type")]
        [Validation(Required=true)]
        public string SinkType { get; set; }

        // 数据源的配置项列表
        [NameInMap("source_configs")]
        [Validation(Required=true)]
        public List<UIKeyVauleTemplate> SourceConfigs { get; set; }

        // 来源类型
        [NameInMap("source_type")]
        [Validation(Required=true)]
        public string SourceType { get; set; }

        // 当任务类型选择为once时，会有本字段，表示具体执行的时间
        [NameInMap("time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string Time { get; set; }

        // 数据转化
        [NameInMap("transformation")]
        [Validation(Required=false)]
        public List<ColumnConfig> Transformation { get; set; }

        // 任务的调度类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 任务所有者
        [NameInMap("app")]
        [Validation(Required=false)]
        public string App { get; set; }

        // stepflow平台的某个模板的编号
        [NameInMap("stepflow_template_id")]
        [Validation(Required=false)]
        public string StepflowTemplateId { get; set; }

        // 单例模式
        [NameInMap("singleton")]
        [Validation(Required=true)]
        public bool? Singleton { get; set; }

        // 事件订阅是否开启
        [NameInMap("event_sub_enabled")]
        [Validation(Required=false)]
        public bool? EventSubEnabled { get; set; }

        // 事件订阅的配置集合
        [NameInMap("event_sub_configs")]
        [Validation(Required=false)]
        public List<EventSubConfig> EventSubConfigs { get; set; }

        // 可接受延迟时间
        [NameInMap("acceptable_execution_interval")]
        [Validation(Required=false)]
        public long? AcceptableExecutionInterval { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 工单状态
        [NameInMap("process_status")]
        [Validation(Required=false)]
        public string ProcessStatus { get; set; }

        // 是否自动回收实例
        [NameInMap("auto_recycle_instance")]
        [Validation(Required=true)]
        public bool? AutoRecycleInstance { get; set; }

    }

}
