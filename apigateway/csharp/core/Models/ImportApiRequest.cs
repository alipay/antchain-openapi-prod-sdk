// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    public class ImportApiRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 分组id
        [NameInMap("api_group_id")]
        [Validation(Required=false)]
        public string ApiGroupId { get; set; }

        // api_transfer_list字符串
        [NameInMap("api_transfer_list")]
        [Validation(Required=false)]
        public string ApiTransferList { get; set; }

        // 租户标识
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // null效验api及配置是否重复，true覆盖，false跳过
        [NameInMap("update_flag")]
        [Validation(Required=false)]
        public bool? UpdateFlag { get; set; }

        // 工作空间标识
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

    }

}
