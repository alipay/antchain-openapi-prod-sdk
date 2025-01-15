// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MARKETING.Models
{
    public class CreateLeadClueRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 补登线索,客户信息
        [NameInMap("request")]
        [Validation(Required=true)]
        public ClueInformationReq Request { get; set; }

        // 线索来源
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 企业名称
        [NameInMap("customer_name")]
        [Validation(Required=true)]
        public string CustomerName { get; set; }

        // 多租户模型。线索服务化的租户模型。请联系线索服务管理员提供。固定值。
        // tenant+source+customerName唯一确定一条线索。
        [NameInMap("tenant_name")]
        [Validation(Required=true)]
        public string TenantName { get; set; }

    }

}
