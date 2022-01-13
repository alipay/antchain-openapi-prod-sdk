// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACCOUNT.Models
{
    public class QueryCustomerChargeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 若有，则返回相应的状态，INIT/SUCCESS/FAIL
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 访问的页码数
        [NameInMap("page_no")]
        [Validation(Required=true)]
        public long? PageNo { get; set; }

        // 每页的数量
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 调用系统来源
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 1- 按时间升序
        // 2-按时间倒序
        // 不填默认2
        [NameInMap("sort_type")]
        [Validation(Required=false)]
        public long? SortType { get; set; }

    }

}
