// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class ExportOpsplanStagesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 容器服务列表
        [NameInMap("container_service")]
        [Validation(Required=false)]
        public ContainerServiceOperation ContainerService { get; set; }

        // Pod分组策略。
        [NameInMap("group_strategy")]
        [Validation(Required=false)]
        public string GroupStrategy { get; set; }

        // 工作空间组名称
        [NameInMap("workspace_group_name")]
        [Validation(Required=false)]
        public string WorkspaceGroupName { get; set; }

        // 命名空间
        [NameInMap("namespace")]
        [Validation(Required=false)]
        public string Namespace { get; set; }

        // 目前支持：REBOOT | REPLACE | DEPLOY | SCALEINOUT，其余默认DEPLOY
        [NameInMap("operation")]
        [Validation(Required=false)]
        public string Operation { get; set; }

        // 最小分组数
        [NameInMap("group_amount")]
        [Validation(Required=false)]
        public long? GroupAmount { get; set; }

        // 每个分组的最大涉及变更pod个数
        [NameInMap("max_group_capacity")]
        [Validation(Required=false)]
        public long? MaxGroupCapacity { get; set; }

        // 是否开启beta分组，目前仅在扩缩容场景下使用，默认false
        [NameInMap("need_beta")]
        [Validation(Required=false)]
        public bool? NeedBeta { get; set; }

    }

}
