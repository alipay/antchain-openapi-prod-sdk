// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class SetComputerAssignRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // app_id
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // 应用服务实例
        [NameInMap("app_service_id")]
        [Validation(Required=true)]
        public string AppServiceId { get; set; }

        // computer_ids
        [NameInMap("computer_ids")]
        [Validation(Required=true)]
        public List<string> ComputerIds { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

        // cell信息
        [NameInMap("cell")]
        [Validation(Required=false)]
        public List<MapStringToStringEntity> Cell { get; set; }

    }

}
