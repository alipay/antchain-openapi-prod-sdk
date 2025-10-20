// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    public class QueryRightsprodGrantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 外部发放订单号
        [NameInMap("out_grant_order_no")]
        [Validation(Required=true)]
        public string OutGrantOrderNo { get; set; }

        // 技术租户ID、当开通权益中心产品在非数科的应用租户下时需要填写对应的技术租户ID（涉及到时技术对接时 技术会分配，如未分配则不需要传值）
        [NameInMap("tech_tenant_id")]
        [Validation(Required=false)]
        public string TechTenantId { get; set; }

        // 扩展信息
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
