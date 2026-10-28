// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryIotagentFeatureRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户名
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 要素项目ID
        [NameInMap("asset_element_project_id")]
        [Validation(Required=true)]
        public string AssetElementProjectId { get; set; }

    }

}
