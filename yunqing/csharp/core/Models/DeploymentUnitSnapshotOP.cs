// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 回滚快照
    public class DeploymentUnitSnapshotOP : TeaModel {
        // 环境ID
        [NameInMap("env_id")]
        [Validation(Required=false)]
        public string EnvId { get; set; }

        // 产品码
        [NameInMap("prod_code")]
        [Validation(Required=false)]
        public string ProdCode { get; set; }

        // 产品版本
        [NameInMap("prod_version")]
        [Validation(Required=false)]
        public string ProdVersion { get; set; }

        // 关联的解决方案id
        [NameInMap("solution_id")]
        [Validation(Required=false)]
        public string SolutionId { get; set; }

        // 快照关联的发布单id
        [NameInMap("ops_plan_id")]
        [Validation(Required=false)]
        public string OpsPlanId { get; set; }

        // 快照版本, 根据日期生成 
        [NameInMap("snapshot_version")]
        [Validation(Required=false)]
        public string SnapshotVersion { get; set; }

        // 快照创建时间
        [NameInMap("snapshot_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string SnapshotTime { get; set; }

        // 部署单元实例唯一标识
        [NameInMap("deployment_unit_instance_identity")]
        [Validation(Required=false)]
        public string DeploymentUnitInstanceIdentity { get; set; }

        // 部署单元唯一标识
        [NameInMap("deployment_unit_identity")]
        [Validation(Required=false)]
        public string DeploymentUnitIdentity { get; set; }

        // 部署拓扑
        [NameInMap("deploy_topology_identity")]
        [Validation(Required=false)]
        public string DeployTopologyIdentity { get; set; }

        // 应用回滚快照
        [NameInMap("app_snapshot")]
        [Validation(Required=false)]
        public List<string> AppSnapshot { get; set; }

    }

}
