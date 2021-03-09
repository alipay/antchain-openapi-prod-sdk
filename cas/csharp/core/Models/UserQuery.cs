// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 用户查询
    public class UserQuery : TeaModel {
        // 基础查询
        [NameInMap("base_query")]
        [Validation(Required=false)]
        public PaginationQuery BaseQuery { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // customerId
        [NameInMap("customer_id")]
        [Validation(Required=false)]
        public string CustomerId { get; set; }

        // tenantId
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // type
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // types
        [NameInMap("types")]
        [Validation(Required=false)]
        public List<string> Types { get; set; }

        // email
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // mobile
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // realName
        [NameInMap("real_name")]
        [Validation(Required=false)]
        public string RealName { get; set; }

        // loginName
        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

    }

}
