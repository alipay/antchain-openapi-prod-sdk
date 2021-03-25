// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    // 阿里云鉴权上下文
    public class AliyunRamAuthContext : TeaModel {
        // 操作名称
        [NameInMap("action")]
        [Validation(Required=true)]
        public string Action { get; set; }

        // 条件
        [NameInMap("conditions")]
        [Validation(Required=false)]
        public List<Condition> Conditions { get; set; }

        // 唯一ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // regionId
        [NameInMap("region_id")]
        [Validation(Required=true)]
        public string RegionId { get; set; }

        // 资源
        [NameInMap("resources")]
        [Validation(Required=true)]
        public List<AliyunResource> Resources { get; set; }

        // 服务名称
        [NameInMap("service_name")]
        [Validation(Required=true)]
        public string ServiceName { get; set; }

    }

}
