// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class FinishSidecaropsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 请求token
        [NameInMap("client_token")]
        [Validation(Required=false)]
        public string ClientToken { get; set; }

        // 命名空间
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 请求单号
        [NameInMap("order_num")]
        [Validation(Required=true)]
        public string OrderNum { get; set; }

        // 部署单元列表
        [NameInMap("cell_names")]
        [Validation(Required=true)]
        public List<string> CellNames { get; set; }

        // sidecar配置
        [NameInMap("sidecar_config")]
        [Validation(Required=true)]
        public SidecarConfig SidecarConfig { get; set; }

        // 是否回滚流程
        [NameInMap("is_rollback")]
        [Validation(Required=false)]
        public bool? IsRollback { get; set; }

    }

}
