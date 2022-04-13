// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class RebootSidecaropsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用服务名
        [NameInMap("container_service_name")]
        [Validation(Required=true)]
        public string ContainerServiceName { get; set; }

        // 防重放
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

        // 部署单元名称
        [NameInMap("cell_name")]
        [Validation(Required=true)]
        public string CellName { get; set; }

        // 需要重启的pod列表，元素值为pod的名称
        [NameInMap("server_identities")]
        [Validation(Required=true)]
        public List<string> ServerIdentities { get; set; }

        // 执行单号
        [NameInMap("order_num")]
        [Validation(Required=true)]
        public string OrderNum { get; set; }

    }

}
