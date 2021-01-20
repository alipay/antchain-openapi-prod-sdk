// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class UpdateCellgroupDisasterinfoRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 灾备信息
        [NameInMap("disaster_info")]
        [Validation(Required=false)]
        public List<DisasterInfo> DisasterInfo { get; set; }

        // 逻辑单元名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 所属环境组名称
        [NameInMap("workspace_group")]
        [Validation(Required=false)]
        public string WorkspaceGroup { get; set; }

    }

}
