// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 区域视图
    public class RegionView : TeaModel {
        // 支持的网络类型列表
        [NameInMap("available_network_types")]
        [Validation(Required=false)]
        public List<string> AvailableNetworkTypes { get; set; }

        // 显示名称
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // table id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 标识
        [NameInMap("identity")]
        [Validation(Required=false)]
        public string Identity { get; set; }

        // region包含的所有zone 列表
        [NameInMap("zones")]
        [Validation(Required=false)]
        public List<ZoneView> Zones { get; set; }

    }

}
