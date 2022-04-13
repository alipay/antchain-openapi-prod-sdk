// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class CreateSidecarOperationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 环境信息，对应workspace_group名称
        [NameInMap("env")]
        [Validation(Required=true)]
        public string Env { get; set; }

        // sidecar运维动作：
        // 接入 open
        // 升级 upgrade
        [NameInMap("service_key")]
        [Validation(Required=true)]
        public string ServiceKey { get; set; }

        // sidecar运维请求体
        [NameInMap("execute_task_request")]
        [Validation(Required=true)]
        public SidecarOperationTask ExecuteTaskRequest { get; set; }

    }

}
