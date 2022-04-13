// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class UpdateCellgroupDisasterinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 灾备信息。
        [NameInMap("disaster_info")]
        [Validation(Required=true)]
        public List<DisasterInfo> DisasterInfo { get; set; }

        // 逻辑单元名称。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 所属环境名称。
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 操作人。
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

    }

}
