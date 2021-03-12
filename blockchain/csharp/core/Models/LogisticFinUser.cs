// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 物流金融平台用户信息
    public class LogisticFinUser : TeaModel {
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
