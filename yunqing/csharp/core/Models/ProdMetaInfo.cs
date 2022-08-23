// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 产品基线元信息
    public class ProdMetaInfo : TeaModel {
        // 环境id
        [NameInMap("env_id")]
        [Validation(Required=true)]
        public string EnvId { get; set; }

        // 产品码
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // 产品版本
        [NameInMap("prod_version")]
        [Validation(Required=true)]
        public string ProdVersion { get; set; }

        // 产品部署拓扑标识id
        [NameInMap("deploy_topology_identity")]
        [Validation(Required=true)]
        public string DeployTopologyIdentity { get; set; }

        // 产品部署规格标识id
        [NameInMap("deploy_spec_identity")]
        [Validation(Required=true)]
        public string DeploySpecIdentity { get; set; }

        // 产品基线状态：AVTIVE、FAILED、UPGRADING
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
