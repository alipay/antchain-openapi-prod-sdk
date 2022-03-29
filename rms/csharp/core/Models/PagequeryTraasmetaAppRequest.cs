// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class PagequeryTraasmetaAppRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 每页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 当前页
        [NameInMap("current_page")]
        [Validation(Required=true)]
        public long? CurrentPage { get; set; }

        // tenant_uuid
        [NameInMap("tenant_uuid")]
        [Validation(Required=false)]
        public string TenantUuid { get; set; }

        // tenant_name
        // 
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // 是否是模糊搜索，默认为false
        [NameInMap("search")]
        [Validation(Required=true)]
        public bool? Search { get; set; }

        // name
        // 
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // app_group_name
        [NameInMap("app_group_name")]
        [Validation(Required=false)]
        public string AppGroupName { get; set; }

    }

}
