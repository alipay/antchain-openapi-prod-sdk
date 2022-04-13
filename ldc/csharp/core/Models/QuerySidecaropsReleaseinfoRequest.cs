// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class QuerySidecaropsReleaseinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用名称（借花场景即为应用服务名）
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // sidecar类型
        [NameInMap("sidecar_type")]
        [Validation(Required=true)]
        public string SidecarType { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 命名空间
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 变更单号
        [NameInMap("order_num")]
        [Validation(Required=false)]
        public string OrderNum { get; set; }

        // 应用服务发布sidecar的版本号，每次发布程序会自己分配一个，可用于作为查询key
        [NameInMap("release_version")]
        [Validation(Required=false)]
        public string ReleaseVersion { get; set; }

    }

}
