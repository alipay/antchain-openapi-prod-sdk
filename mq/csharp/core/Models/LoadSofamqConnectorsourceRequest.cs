// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class LoadSofamqConnectorsourceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 来源的配置信息。source kv结构配置 数组 的 JSON String
        [NameInMap("source_configs")]
        [Validation(Required=true)]
        public string SourceConfigs { get; set; }

        // 数据源类型
        [NameInMap("source_type")]
        [Validation(Required=true)]
        public string SourceType { get; set; }

        // 任务名称，仅仅在任务修改时需要传递
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
