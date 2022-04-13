// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class UpdateSidecaropsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 保证请求幂等性
        [NameInMap("client_token")]
        [Validation(Required=false)]
        public string ClientToken { get; set; }

        // 所属命名空间
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 所属工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // sidecar的类型，如mosn，odp
        [NameInMap("sidecar_config")]
        [Validation(Required=true)]
        public SidecarConfig SidecarConfig { get; set; }

        // 指定sidecar的基线模板版本进行升级，可选，不填时，默认选中指定sidecar的最新版本进行升级
        [NameInMap("sidecar_version")]
        [Validation(Required=false)]
        public string SidecarVersion { get; set; }

        // 单元名称
        [NameInMap("cell_name")]
        [Validation(Required=true)]
        public string CellName { get; set; }

        // 要更新的hostname列表
        [NameInMap("server_identities")]
        [Validation(Required=true)]
        public List<string> ServerIdentities { get; set; }

        // 工单id
        [NameInMap("order_num")]
        [Validation(Required=true)]
        public string OrderNum { get; set; }

    }

}
