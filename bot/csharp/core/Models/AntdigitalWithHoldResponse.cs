// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 代扣服务返回对象
    public class AntdigitalWithHoldResponse : TeaModel {
        // 网关返回码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 网关返回码描述
        [NameInMap("msg")]
        [Validation(Required=true)]
        public string Msg { get; set; }

        // 务返回码
        [NameInMap("sub_code")]
        [Validation(Required=true)]
        public string SubCode { get; set; }

        // 业务返回码描述
        [NameInMap("sub_msg")]
        [Validation(Required=true)]
        public string SubMsg { get; set; }

        // 结果返回内容
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

        // 响应签名
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

    }

}
