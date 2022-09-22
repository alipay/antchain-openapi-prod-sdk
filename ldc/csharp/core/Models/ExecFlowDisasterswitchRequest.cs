// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class ExecFlowDisasterswitchRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 容灾切换类型，枚举型，CUTOFF（切流），RECOVER（恢复）
        [NameInMap("disaster_type")]
        [Validation(Required=true)]
        public string DisasterType { get; set; }

        // 容灾切换范围，枚举型，GROUP（单元组）、ZONE（单元）、IDC（机房，暂不支持）
        [NameInMap("disaster_scope")]
        [Validation(Required=true)]
        public string DisasterScope { get; set; }

        // 同城或者异地容灾，true代表异地容灾，false代表同城容灾
        [NameInMap("remote")]
        [Validation(Required=true)]
        public bool? Remote { get; set; }

        // 容灾切换对象列表
        [NameInMap("targets")]
        [Validation(Required=true)]
        public List<string> Targets { get; set; }

        // 操作者，选填，应填登录名
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

    }

}
