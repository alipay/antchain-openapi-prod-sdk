// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class UpdateContainerserviceCommentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // wsg
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // fed namespace
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // container service name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // specific container service revision
        [NameInMap("revision")]
        [Validation(Required=true)]
        public string Revision { get; set; }

        // 版本注释
        [NameInMap("comment")]
        [Validation(Required=false)]
        public string Comment { get; set; }

    }

}
