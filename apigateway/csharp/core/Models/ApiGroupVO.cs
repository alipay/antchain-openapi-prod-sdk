// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // ApiGroupVO
    public class ApiGroupVO : TeaModel {
        // api数
        [NameInMap("api_count")]
        [Validation(Required=false)]
        public long? ApiCount { get; set; }

        // 分组标识(全局唯一)
        [NameInMap("api_group_id")]
        [Validation(Required=false)]
        public string ApiGroupId { get; set; }

        // 用户授权开关
        [NameInMap("auth_user_switch")]
        [Validation(Required=false)]
        public string AuthUserSwitch { get; set; }

        // 是否可以删除
        [NameInMap("can_delete")]
        [Validation(Required=false)]
        public bool? CanDelete { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 域名
        [NameInMap("domain_name")]
        [Validation(Required=false)]
        public string DomainName { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 分组名
        [NameInMap("group_name")]
        [Validation(Required=false)]
        public string GroupName { get; set; }

        // need_api_auth_user
        [NameInMap("need_api_auth_user")]
        [Validation(Required=false)]
        public bool? NeedApiAuthUser { get; set; }

        // 创建人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 租户标识
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 工作空间标识
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // 是否可操作
        [NameInMap("operation_permission")]
        [Validation(Required=false)]
        public bool? OperationPermission { get; set; }

        // DEFAULT|CUSTOM
        [NameInMap("domain_type")]
        [Validation(Required=false)]
        public string DomainType { get; set; }

        // 自定义域名
        [NameInMap("domain_list")]
        [Validation(Required=false)]
        public List<ApiGroupDomainVO> DomainList { get; set; }

    }

}
