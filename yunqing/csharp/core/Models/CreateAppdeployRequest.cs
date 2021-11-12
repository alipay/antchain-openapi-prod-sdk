// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class CreateAppdeployRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用码
        [NameInMap("apps")]
        [Validation(Required=true)]
        public List<string> Apps { get; set; }

        // 将要发布的单元id
        [NameInMap("cell_ids")]
        [Validation(Required=true)]
        public List<string> CellIds { get; set; }

        // 产品码
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // 解决方案id
        [NameInMap("solution_id")]
        [Validation(Required=true)]
        public string SolutionId { get; set; }

        // 是否强制重发
        [NameInMap("force")]
        [Validation(Required=true)]
        public bool? Force { get; set; }

    }

}
