// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class AddDdsJobRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // middleware instance id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 任务所属APP
        [NameInMap("app")]
        [Validation(Required=true)]
        public string App { get; set; }

        // 任务名字
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 任务CRON表达式
        [NameInMap("cron")]
        [Validation(Required=true)]
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

    }

}
