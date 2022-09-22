// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class CreateContainerserviceOperationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 容器服务列表。	
        [NameInMap("container_services")]
        [Validation(Required=true)]
        public ContainerServiceOperationList ContainerServices { get; set; }

        // 分组策略：ALL_ONE、EACH_ONE、CELL，默认EACH_ONE
        [NameInMap("group_strategy")]
        [Validation(Required=false)]
        public string GroupStrategy { get; set; }

        // 是否自动执行，默认false
        [NameInMap("is_auto_execute")]
        [Validation(Required=false)]
        public bool? IsAutoExecute { get; set; }

        // 是否需要beta卡点，默认 true
        [NameInMap("is_need_beta")]
        [Validation(Required=false)]
        public bool? IsNeedBeta { get; set; }

        // 所属命名空间
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 运维类型：重启等
        [NameInMap("ops_mode")]
        [Validation(Required=true)]
        public string OpsMode { get; set; }

        // 默认值：CLOUD_NATIVE_OPERATION
        [NameInMap("ops_type")]
        [Validation(Required=false)]
        public string OpsType { get; set; }

        // 运维单名称
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 所属工作空间组名称。
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 最小分组数，同发布单中的group_count
        [NameInMap("group_amount")]
        [Validation(Required=false)]
        public long? GroupAmount { get; set; }

        // 审批人账号id，暂时不支持
        [NameInMap("assignee_ids")]
        [Validation(Required=false)]
        public List<string> AssigneeIds { get; set; }

        // 操作人账号，lks1.23.0才支持
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // [huanyu场景使用]huanyu变更单id
        [NameInMap("huanyu_exec_no")]
        [Validation(Required=false)]
        public string HuanyuExecNo { get; set; }

        // 每个批次最大涉及变更的pod个数
        [NameInMap("max_group_capacity")]
        [Validation(Required=false)]
        public long? MaxGroupCapacity { get; set; }

        // 每个部署单元单批次变更pod数量百分比，仅当group_strategey为ALL_CELL_PERCENTAGE时生效
        [NameInMap("max_cell_pod_percentage")]
        [Validation(Required=false)]
        public long? MaxCellPodPercentage { get; set; }

        // 部署单元流量权重
        [NameInMap("cell_weights")]
        [Validation(Required=false)]
        public List<CellWeightInfo> CellWeights { get; set; }

    }

}
