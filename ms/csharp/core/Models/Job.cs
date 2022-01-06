// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 定时任务
    public class Job : TeaModel {
        // 数据库ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public int? Id { get; set; }

        // 所属租户实例ID
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 任务所属APP
        [NameInMap("app")]
        [Validation(Required=false)]
        public string App { get; set; }

        // 任务名字
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 任务CRON表达式
        [NameInMap("cron")]
        [Validation(Required=false)]
        public string Cron { get; set; }

        // 任务分片数量
        [NameInMap("sharding_count")]
        [Validation(Required=false)]
        public int? ShardingCount { get; set; }

        // 任务自定义参数
        [NameInMap("custom_params")]
        [Validation(Required=false)]
        public List<string> CustomParams { get; set; }

        // 任务状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 任务描述信息
        [NameInMap("des")]
        [Validation(Required=false)]
        public string Des { get; set; }

        // 任务创建时间
        [NameInMap("creation_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreationTime { get; set; }

        // 任务修改时间
        [NameInMap("update_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UpdateTime { get; set; }

    }

}
