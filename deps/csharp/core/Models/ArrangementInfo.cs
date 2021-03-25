// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 发布概览信息
    public class ArrangementInfo : TeaModel {
        // 类型
        [NameInMap("arrangement_type")]
        [Validation(Required=false)]
        public string ArrangementType { get; set; }

        // 环境变量
        [NameInMap("env_config")]
        [Validation(Required=false)]
        public List<Pair> EnvConfig { get; set; }

        // 发布概览名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 发布进程ID
        [NameInMap("process_definition_id")]
        [Validation(Required=false)]
        public string ProcessDefinitionId { get; set; }

        // 环境 ID
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // 策略
        [NameInMap("ops_action_policies")]
        [Validation(Required=false)]
        public List<OpsActionPolicy> OpsActionPolicies { get; set; }

    }

}
