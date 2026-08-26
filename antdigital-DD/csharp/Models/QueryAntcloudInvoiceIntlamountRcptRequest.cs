// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    public class QueryAntcloudInvoiceIntlamountRcptRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 合同号或订单号
        [NameInMap("ar_no")]
        [Validation(Required=true)]
        public string ArNo { get; set; }

        // 当前页码，默认1
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 每页条数，默认20
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

    }

}
