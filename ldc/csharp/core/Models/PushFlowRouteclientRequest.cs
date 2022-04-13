// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class PushFlowRouteclientRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 流量类型
        // NORMAL：正常流量
        // PRESS：压测流量
        [NameInMap("flow_type")]
        [Validation(Required=true)]
        public string FlowType { get; set; }

        // 异构机房列表
        [NameInMap("isomerism_sites")]
        [Validation(Required=false)]
        public List<string> IsomerismSites { get; set; }

        // 操作人
        [NameInMap("operator_name")]
        [Validation(Required=true)]
        public string OperatorName { get; set; }

        // 推送类型
        // DRM：DRM推送
        // JMX：JMX推送
        // SPANNER：SPANNER推送
        [NameInMap("push_type")]
        [Validation(Required=true)]
        public string PushType { get; set; }

        // 工作空间
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 部署单元组的流量规则
        [NameInMap("unit_flows")]
        [Validation(Required=true)]
        public List<UnitFlow> UnitFlows { get; set; }

    }

}
