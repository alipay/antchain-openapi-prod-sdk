// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class ListKubernetesResourcesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 所属工作空间组名称。
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 标签选择器。
        [NameInMap("label_selector")]
        [Validation(Required=false)]
        public string LabelSelector { get; set; }

        // kubernetes资源路径。
        [NameInMap("path")]
        [Validation(Required=true)]
        public string Path { get; set; }

        // 命名空间名称。
        [NameInMap("namespace")]
        [Validation(Required=false)]
        public string Namespace { get; set; }

        // cell名称列表，只查指定cell的集群
        [NameInMap("cells")]
        [Validation(Required=false)]
        public List<string> Cells { get; set; }

    }

}
