// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateLogisticFinanceAccountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 指定的分布式数字身份，缺省时默认为自己的分布式数字身份
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

        // 纳税人识别号
        [NameInMap("drawee_tax_no")]
        [Validation(Required=true)]
        public string DraweeTaxNo { get; set; }

        // 业务方企业id
        [NameInMap("org_id")]
        [Validation(Required=true)]
        public string OrgId { get; set; }

        // 业务方用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

    }

}
