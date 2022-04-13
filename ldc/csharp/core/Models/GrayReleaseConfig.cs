// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 灰度发布参数
    public class GrayReleaseConfig : TeaModel {
        // 加到流量上的灰度标签
        [NameInMap("gray_label")]
        [Validation(Required=true)]
        public string GrayLabel { get; set; }

        // 提供南北流量网关服务的类型
        [NameInMap("provider")]
        [Validation(Required=true)]
        public string Provider { get; set; }

        // 给流量添加灰度label的策略，可选byWeight或者byRule
        // 在byWeight模式下，会按照用户指定的比例，给进入的流量加上灰度标签
        // 在byRule模式下，会按照用户指定的规则（条件），给进入的流量加上灰度标签。
        [NameInMap("label_apply_policy")]
        [Validation(Required=true)]
        public string LabelApplyPolicy { get; set; }

        // 给进入的流量添加灰度label的比例，仅当label_apply_policy为byWeight时生效
        [NameInMap("weight")]
        [Validation(Required=false)]
        public long? Weight { get; set; }

        // 给进入的流量添加灰度label的规则，仅当label_apply_policy为byRule时生效
        [NameInMap("rule")]
        [Validation(Required=false)]
        public GrayLabelApplyRule Rule { get; set; }

        // 在各部署单元期望部署的pod个数，若应用服务当前不部署在其中的部署单元，则该不会在该部署单元上为应用进行部署
        [NameInMap("scale_replicas")]
        [Validation(Required=false)]
        public List<ReplicaCount> ScaleReplicas { get; set; }

    }

}
