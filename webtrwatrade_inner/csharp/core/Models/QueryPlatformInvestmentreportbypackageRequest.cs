// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE_INNER.Models
{
    public class QueryPlatformInvestmentreportbypackageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 可信产业资产项目批次id
        [NameInMap("project_external_id")]
        [Validation(Required=true)]
        public string ProjectExternalId { get; set; }

        // 资产包id
        [NameInMap("asset_package_id")]
        [Validation(Required=true)]
        public string AssetPackageId { get; set; }

    }

}
