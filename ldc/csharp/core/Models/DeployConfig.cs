// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 容器服务部署配置。
    public class DeployConfig : TeaModel {
        // 节点亲和性配置
        [NameInMap("affinity")]
        [Validation(Required=false)]
        public AffinityEntity Affinity { get; set; }

        // annotations
        [NameInMap("annotations")]
        [Validation(Required=false)]
        public string Annotations { get; set; }

        // 用户自定义标签，将会在pod上生效
        [NameInMap("custom_labels")]
        [Validation(Required=false)]
        public string CustomLabels { get; set; }

        // 最小分组数
        [NameInMap("group_count")]
        [Validation(Required=false)]
        public long? GroupCount { get; set; }

        // 容器服务部署分组策略。
        [NameInMap("group_strategy")]
        [Validation(Required=false)]
        public string GroupStrategy { get; set; }

        // labels
        [NameInMap("labels")]
        [Validation(Required=false)]
        public string Labels { get; set; }

        // 单个分组最大Pod数量。
        [NameInMap("max_group_capacity")]
        [Validation(Required=false)]
        public long? MaxGroupCapacity { get; set; }

        // 是否需要beta confirm。
        [NameInMap("need_beta")]
        [Validation(Required=false)]
        public bool? NeedBeta { get; set; }

        // 是否需要分组确认。
        [NameInMap("need_confirm")]
        [Validation(Required=false)]
        public bool? NeedConfirm { get; set; }

        // 已废弃
        [NameInMap("enable_sofa_mesh")]
        [Validation(Required=false)]
        public bool? EnableSofaMesh { get; set; }

        // 只支持InPlace
        [NameInMap("upgrade_strategy")]
        [Validation(Required=false)]
        public string UpgradeStrategy { get; set; }

        // 分组确认策略，FIRST：第一个分组需要确认，EACH：每个分组都需要确认（默认）
        [NameInMap("confirm_strategy")]
        [Validation(Required=false)]
        public string ConfirmStrategy { get; set; }

        // pod name 命名规则，lks 1.23.0 开始支持。Default/PersistentSequence
        [NameInMap("pod_naming_policy")]
        [Validation(Required=false)]
        public string PodNamingPolicy { get; set; }

        // [已废除] 是否开启强制步长控制。对于ALL_ONE, ALL_ONE_CELL_BETA等分组模式，group_count与max_group_capacity字段将生效，提供精细化分组，以满足用户的pod发布并发控制需求
        [NameInMap("force_stride_control")]
        [Validation(Required=false)]
        public bool? ForceStrideControl { get; set; }

        // 每个部署单元单批次最大变更pod比例，仅当group_strategy为ALL_CELL_PERCENTAGE时生效
        [NameInMap("max_cell_pod_percentage")]
        [Validation(Required=false)]
        public long? MaxCellPodPercentage { get; set; }

    }

}
