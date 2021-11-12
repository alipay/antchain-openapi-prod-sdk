// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 工作空间
    public class Workspace : TeaModel {
        // 包含的单元（逻辑机房）
        [NameInMap("cells")]
        [Validation(Required=true)]
        public List<Cell> Cells { get; set; }

        // 显示的名字
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // workspace的名字
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 所属地域
        [NameInMap("region")]
        [Validation(Required=true)]
        public Region Region { get; set; }

        // 工作空间的id
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

        // 机房列表
        [NameInMap("zones")]
        [Validation(Required=true)]
        public List<Zone> Zones { get; set; }

    }

}
