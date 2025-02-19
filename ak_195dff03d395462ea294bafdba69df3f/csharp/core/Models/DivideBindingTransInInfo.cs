// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    // 分账关系绑定收入方信息
    public class DivideBindingTransInInfo : TeaModel {
        // 分账方支付宝pid
        [NameInMap("alipay_pid")]
        [Validation(Required=true)]
        public string AlipayPid { get; set; }

    }

}
