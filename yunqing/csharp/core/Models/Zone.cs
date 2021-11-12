// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 机房
    public class Zone : TeaModel {
        // 机房的标识（与阿里云对齐）
        [NameInMap("identity")]
        [Validation(Required=true)]
        public string Identity { get; set; }

        // 机房的名字
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 地域的id
        [NameInMap("region_id")]
        [Validation(Required=true)]
        public string RegionId { get; set; }

        // 机房内关联的资源池列表
        [NameInMap("resource_pools")]
        [Validation(Required=true)]
        public List<ResourcePool> ResourcePools { get; set; }

        // 机房的id
        [NameInMap("zone_id")]
        [Validation(Required=true)]
        public string ZoneId { get; set; }

        // 显示的名字
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

    }

}
