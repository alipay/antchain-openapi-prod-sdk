// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // AuthAppInfoVO
    public class AuthAppInfoVO : TeaModel {
        // api数
        [NameInMap("api_count")]
        [Validation(Required=false)]
        public long? ApiCount { get; set; }

        // 应用类型
        [NameInMap("app_type")]
        [Validation(Required=false)]
        public string AppType { get; set; }

        // auth_app_info_id
        [NameInMap("auth_app_info_id")]
        [Validation(Required=false)]
        public string AuthAppInfoId { get; set; }

        // authAppType
        [NameInMap("auth_app_type")]
        [Validation(Required=false)]
        public string AuthAppType { get; set; }

        // 是否可以删除
        [NameInMap("can_delete")]
        [Validation(Required=false)]
        public bool? CanDelete { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // operator
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // subAppCompany
        [NameInMap("sub_app_company")]
        [Validation(Required=false)]
        public string SubAppCompany { get; set; }

        // subAppDesc
        [NameInMap("sub_app_desc")]
        [Validation(Required=false)]
        public string SubAppDesc { get; set; }

        // 订阅方appid
        [NameInMap("sub_app_id")]
        [Validation(Required=false)]
        public string SubAppId { get; set; }

        // sub_app_info
        [NameInMap("sub_app_info")]
        [Validation(Required=false)]
        public AppInfoVO SubAppInfo { get; set; }

        // subTenantId
        [NameInMap("sub_tenant_id")]
        [Validation(Required=false)]
        public string SubTenantId { get; set; }

        // subWorkspaceId
        [NameInMap("sub_workspace_id")]
        [Validation(Required=false)]
        public string SubWorkspaceId { get; set; }

        // api标识
        [NameInMap("api_id")]
        [Validation(Required=false)]
        public string ApiId { get; set; }

        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

    }

}
