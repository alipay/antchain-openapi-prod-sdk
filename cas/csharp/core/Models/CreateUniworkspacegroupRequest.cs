// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateUniworkspacegroupRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间组名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 显示名字，可以中文
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // namespace
        [NameInMap("namespace")]
        [Validation(Required=false)]
        public string Namespace { get; set; }

        // json格式的字符串，工作空间组属性 
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

        // release_mode
        [NameInMap("release_mode")]
        [Validation(Required=false)]
        public string ReleaseMode { get; set; }

        // 工作空间的名称
        [NameInMap("workspaces")]
        [Validation(Required=true)]
        public List<string> Workspaces { get; set; }

        // workspaces_create_param
        [NameInMap("workspaces_create_param")]
        [Validation(Required=true)]
        public List<string> WorkspacesCreateParam { get; set; }

        // cell_group_create_params
        [NameInMap("cell_group_create_params")]
        [Validation(Required=false)]
        public List<string> CellGroupCreateParams { get; set; }

        // cell_create_params
        [NameInMap("cell_create_params")]
        [Validation(Required=false)]
        public List<string> CellCreateParams { get; set; }

        // 域名前缀
        [NameInMap("domain_suffix")]
        [Validation(Required=false)]
        public string DomainSuffix { get; set; }

        // VPC创建参数
        [NameInMap("vpc_create_params")]
        [Validation(Required=true)]
        public List<string> VpcCreateParams { get; set; }

        // 导入的VPCIDs
        [NameInMap("import_vpcs")]
        [Validation(Required=false)]
        public List<string> ImportVpcs { get; set; }

    }

}
