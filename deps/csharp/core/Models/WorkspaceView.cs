// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 工作空间视图
    public class WorkspaceView : TeaModel {
        // 部署单元列表
        [NameInMap("cells")]
        [Validation(Required=false)]
        public List<CellView> Cells { get; set; }

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

        // 网络类型
        [NameInMap("network_type")]
        [Validation(Required=false)]
        public string NetworkType { get; set; }

        // workspace所在region名称
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

    }

}
