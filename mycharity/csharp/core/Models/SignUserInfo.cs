// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYCHARITY.Models
{
    // 签约账号用户信息
    public class SignUserInfo : TeaModel {
        // 签约记录id
        [NameInMap("id")]
        [Validation(Required=true, MaxLength=50)]
        public string Id { get; set; }

        // 支付宝代扣账号
        [NameInMap("alipay_account")]
        [Validation(Required=true, MaxLength=100)]
        public string AlipayAccount { get; set; }

    }

}
