// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class ListAppportraitAlertRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // eco0sh0prod
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // tenant_name
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 查询开始时间，utc毫秒
        [NameInMap("start_timestamp")]
        [Validation(Required=true)]
        public long? StartTimestamp { get; set; }

        // 查询结束时间，utc毫秒
        [NameInMap("end_timestamp")]
        [Validation(Required=true)]
        public long? EndTimestamp { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 当前页码，从1开始
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

    }

}
