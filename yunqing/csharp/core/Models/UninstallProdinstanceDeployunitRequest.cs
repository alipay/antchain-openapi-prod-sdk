// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class UninstallProdinstanceDeployunitRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 单元ID
        [NameInMap("cell_id")]
        [Validation(Required=true)]
        public string CellId { get; set; }

        // 环境唯一标识
        [NameInMap("env_id")]
        [Validation(Required=true)]
        public string EnvId { get; set; }

        // 产品码
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 部署单元实例标识
        [NameInMap("unit_instance_id")]
        [Validation(Required=true)]
        public string UnitInstanceId { get; set; }

        // 操作人ID
        [NameInMap("submitter_id")]
        [Validation(Required=true)]
        public string SubmitterId { get; set; }

        // 	
        // 操作人名称（花名或者真名）
        [NameInMap("submitter_name")]
        [Validation(Required=false)]
        public string SubmitterName { get; set; }

    }

}
