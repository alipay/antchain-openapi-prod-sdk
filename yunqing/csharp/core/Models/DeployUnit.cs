// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 部署单元。
    public class DeployUnit : TeaModel {
        // 单元ID
        [NameInMap("cell_id")]
        [Validation(Required=true)]
        public string CellId { get; set; }

        // 环境唯一标识。
        [NameInMap("env_id")]
        [Validation(Required=true)]
        public string EnvId { get; set; }

        // 部署单元id，产品实例下唯一。
        [NameInMap("identity")]
        [Validation(Required=true)]
        public string Identity { get; set; }

        // 部署单元名称。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 产品码。
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 用户传入部署单元标识，如果没有传入，则为deployment_unit_identity
        [NameInMap("unit_ig")]
        [Validation(Required=true)]
        public string UnitIg { get; set; }

    }

}
