// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 单元（逻辑机房）
    public class Cell : TeaModel {
        // LDC下cellGroup的ID
        [NameInMap("cell_group_id")]
        [Validation(Required=false)]
        public string CellGroupId { get; set; }

        // 单元的id
        [NameInMap("cell_id")]
        [Validation(Required=true)]
        public string CellId { get; set; }

        // LDC的蓝绿着色
        [NameInMap("color")]
        [Validation(Required=false)]
        public string Color { get; set; }

        // LDC的默认权重
        [NameInMap("default_weight")]
        [Validation(Required=false)]
        public long? DefaultWeight { get; set; }

        // LDC下是否灰度
        [NameInMap("gray")]
        [Validation(Required=false)]
        public bool? Gray { get; set; }

        // 单元的名字
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 所在地域的id
        [NameInMap("region_id")]
        [Validation(Required=true)]
        public string RegionId { get; set; }

        // LDC的GRCZone类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 工作空间id
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

        // 所属机房的id
        [NameInMap("zone_id")]
        [Validation(Required=true)]
        public string ZoneId { get; set; }

        // 显示的名字
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

    }

}
