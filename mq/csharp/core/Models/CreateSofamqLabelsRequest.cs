// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class CreateSofamqLabelsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 实例 ID（命名空间）
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 资源类型：TOPIC、GROUP
        [NameInMap("resource_type")]
        [Validation(Required=true)]
        public string ResourceType { get; set; }

        // 资源名
        [NameInMap("resource_name")]
        [Validation(Required=true)]
        public string ResourceName { get; set; }

        // 标签
        [NameInMap("labels")]
        [Validation(Required=true)]
        public List<string> Labels { get; set; }

    }

}
