// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYCHARITY.Models
{
    public class CreateAlipaysignRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 签约记录id
        [NameInMap("id")]
        [Validation(Required=true, MaxLength=50)]
        public string Id { get; set; }

        // 机构id
        [NameInMap("org_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrgId { get; set; }

        // 支付宝代扣账号
        [NameInMap("alipay_account")]
        [Validation(Required=true, MaxLength=100)]
        public string AlipayAccount { get; set; }

    }

}
