// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class QuerySidecaropsStateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 命名空间
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 命名空间组名称
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 需要查询的部署单元列表
        [NameInMap("cell_names")]
        [Validation(Required=true)]
        public List<string> CellNames { get; set; }

        // 运维单号
        [NameInMap("order_num")]
        [Validation(Required=true)]
        public string OrderNum { get; set; }

        // sidecar配置
        [NameInMap("sidecar_config")]
        [Validation(Required=true)]
        public SidecarConfig SidecarConfig { get; set; }

    }

}
