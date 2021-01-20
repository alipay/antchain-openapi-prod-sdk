// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 蓝绿发布概览
    public class BGReleaseArrangement : TeaModel {
        // 活跃单元 ID
        [NameInMap("active_unit_id")]
        [Validation(Required=false)]
        public string ActiveUnitId { get; set; }

        // 非活跃单元 ID
        [NameInMap("deactivated_unit_id")]
        [Validation(Required=false)]
        public string DeactivatedUnitId { get; set; }

        // 灰度进程ID
        [NameInMap("gray_traffic_process_id")]
        [Validation(Required=false)]
        public string GrayTrafficProcessId { get; set; }

        // 回滚进程ID
        [NameInMap("rollback_process_id")]
        [Validation(Required=false)]
        public string RollbackProcessId { get; set; }

        // 发布应用信息集合
        [NameInMap("service_info_collection")]
        [Validation(Required=false)]
        public List<ServiceInfo> ServiceInfoCollection { get; set; }

        // 类型
        [NameInMap("step_type")]
        [Validation(Required=false)]
        public string StepType { get; set; }

        // 单元类型
        [NameInMap("unit_type")]
        [Validation(Required=false)]
        public string UnitType { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 类型
        [NameInMap("arrangement_type")]
        [Validation(Required=false)]
        public string ArrangementType { get; set; }

        // 环境变量
        [NameInMap("env_config")]
        [Validation(Required=false)]
        public List<Pair> EnvConfig { get; set; }

        // 合法状态列表
        [NameInMap("targets_legal_states")]
        [Validation(Required=false)]
        public List<OpsTargetLegalStates> TargetsLegalStates { get; set; }

        // 运维进程ID
        [NameInMap("process_definition_id")]
        [Validation(Required=false)]
        public string ProcessDefinitionId { get; set; }

        // 父运维进程ID
        [NameInMap("parent_id")]
        [Validation(Required=false)]
        public string ParentId { get; set; }

        // 父进程类型
        [NameInMap("parent_entity_type")]
        [Validation(Required=false)]
        public string ParentEntityType { get; set; }

        // 支持的转换类型
        [NameInMap("supported_transitions")]
        [Validation(Required=false)]
        public List<string> SupportedTransitions { get; set; }

        // 流程节点 ID
        [NameInMap("node_id")]
        [Validation(Required=false)]
        public string NodeId { get; set; }

        // 状态
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // 开始时间
        [NameInMap("started_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string StartedTime { get; set; }

        // 结束时间
        [NameInMap("finished_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string FinishedTime { get; set; }

        // 是否可以独立运行
        [NameInMap("standalone_executable")]
        [Validation(Required=false)]
        public bool? StandaloneExecutable { get; set; }

        // ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

    }

}
