// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class RollbackOpsProductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 需要回滚的解决方案ID
        [NameInMap("solution_id")]
        [Validation(Required=true)]
        public string SolutionId { get; set; }

        // 产品码
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // 需要回滚的快照版本
        [NameInMap("prod_snapshot_version")]
        [Validation(Required=true)]
        public string ProdSnapshotVersion { get; set; }

        // 分组策略
        [NameInMap("group_strategy")]
        [Validation(Required=false)]
        public string GroupStrategy { get; set; }

        // 部署单元ID
        [NameInMap("unit_instance_id")]
        [Validation(Required=true)]
        public string UnitInstanceId { get; set; }

        // 操作人ID
        [NameInMap("submitter_id")]
        [Validation(Required=true)]
        public string SubmitterId { get; set; }

        // 操作人名称（花名或者真名）
        [NameInMap("submitter_name")]
        [Validation(Required=false)]
        public string SubmitterName { get; set; }

    }

}
