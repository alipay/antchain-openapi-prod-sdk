// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class CreateProdinstanceDeployunitRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 环境标识
        [NameInMap("env_id")]
        [Validation(Required=false)]
        public string EnvId { get; set; }

        // 云游内产品码
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 执行部署单元实例id
        [NameInMap("unit_id")]
        [Validation(Required=true)]
        public string UnitId { get; set; }

        // 部署单元名称
        [NameInMap("unit_name")]
        [Validation(Required=true)]
        public string UnitName { get; set; }

        // 单元ID
        [NameInMap("cell_id")]
        [Validation(Required=true)]
        public string CellId { get; set; }

        // 逻辑部署单元实例id
        [NameInMap("logical_instance_id")]
        [Validation(Required=true)]
        public string LogicalInstanceId { get; set; }

        // 操作人id
        [NameInMap("submitter_id")]
        [Validation(Required=false)]
        public string SubmitterId { get; set; }

        // 	
        // 操作人名称（花名或者真名）
        [NameInMap("submitter_name")]
        [Validation(Required=false)]
        public string SubmitterName { get; set; }

    }

}
