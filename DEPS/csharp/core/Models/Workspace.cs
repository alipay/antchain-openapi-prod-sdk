// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // Workspace
    public class Workspace : TeaModel {
        // 创建时间
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // workspace 显示名称
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // workspace 名称
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 工作空间唯一标识
        [NameInMap("identity")]
        [Validation(Required=false)]
        public string Identity { get; set; }

        // workspace 名称（等同于唯一标识）
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 网络类型
        [NameInMap("network_type")]
        [Validation(Required=false)]
        public string NetworkType { get; set; }

        // workspace所在regionId
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

        // region id
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // 所属租户名称
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

        // 最近更新时间
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public string UpdateTime { get; set; }

        // workspace所在zoneIdentity列表
        [NameInMap("zones")]
        [Validation(Required=false)]
        public List<string> Zones { get; set; }

        // 工作空间类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
