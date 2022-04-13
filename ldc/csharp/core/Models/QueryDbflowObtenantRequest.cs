// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class QueryDbflowObtenantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 租户类型GZONE|RZONE，分别用于存放单库或分片库
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 租户名称前缀
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 当前页码，默认为1
        [NameInMap("page_number")]
        [Validation(Required=false)]
        public long? PageNumber { get; set; }

        // 单页个数，默认为10
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

    }

}
