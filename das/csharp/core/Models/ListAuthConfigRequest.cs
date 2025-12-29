// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class ListAuthConfigRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据源可信空间id
        [NameInMap("source_service_node_id")]
        [Validation(Required=true)]
        public string SourceServiceNodeId { get; set; }

        // 数据源租户id
        [NameInMap("source_tenant_id")]
        [Validation(Required=true)]
        public string SourceTenantId { get; set; }

        // 客户名称
        [NameInMap("target_name")]
        [Validation(Required=false)]
        public string TargetName { get; set; }

        // 业务应用名称
        [NameInMap("auth_app_name")]
        [Validation(Required=false)]
        public string AuthAppName { get; set; }

        // 授权内容code列表
        [NameInMap("auth_content_code_list")]
        [Validation(Required=false)]
        public List<string> AuthContentCodeList { get; set; }

        // 国标产品标识码列表
        [NameInMap("product_identity_id_list")]
        [Validation(Required=false)]
        public List<string> ProductIdentityIdList { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 每页数量
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
