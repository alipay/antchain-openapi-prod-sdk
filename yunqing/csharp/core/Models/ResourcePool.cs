// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 资源池信息
    public class ResourcePool : TeaModel {
        // 资源池名称, Local站点下唯一
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 资源的提供者, ALB,SLB,ALISQL,RDS,OCEANBASE,AFS,OSS,ECS,ALIYUNECS
        [NameInMap("provider")]
        [Validation(Required=true)]
        public string Provider { get; set; }

        // 支持的资源类型
        [NameInMap("resource_type")]
        [Validation(Required=true)]
        public string ResourceType { get; set; }

        // 资源池访问信息
        [NameInMap("access_info")]
        [Validation(Required=true)]
        public string AccessInfo { get; set; }

        // 所属cloud的id
        [NameInMap("cloud_id")]
        [Validation(Required=true)]
        public string CloudId { get; set; }

    }

}
