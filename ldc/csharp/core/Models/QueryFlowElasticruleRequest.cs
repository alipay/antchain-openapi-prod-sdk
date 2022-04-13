// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class QueryFlowElasticruleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 环境
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 规则名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 所属类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 所属应用名称
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 场景名称
        [NameInMap("scene_name")]
        [Validation(Required=false)]
        public string SceneName { get; set; }

        // 分页大小，默认 10
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 当前页，默认 1
        [NameInMap("page_no")]
        [Validation(Required=false)]
        public long? PageNo { get; set; }

    }

}
