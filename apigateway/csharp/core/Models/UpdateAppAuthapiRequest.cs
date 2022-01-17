// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    public class UpdateAppAuthapiRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // api标识列表
        [NameInMap("api_info_id_list")]
        [Validation(Required=true)]
        public List<string> ApiInfoIdList { get; set; }

        // app标识
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // 加密状态
        [NameInMap("encryption_status")]
        [Validation(Required=true)]
        public string EncryptionStatus { get; set; }

        // 租户标识
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 工作空间标识
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

    }

}
