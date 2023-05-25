// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEFININSTCHANNEL.Models
{
    public class SubmitInstapiRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 通用参数
        [NameInMap("sys_param")]
        [Validation(Required=true)]
        public SystemParam SysParam { get; set; }

        // 业务参数
        [NameInMap("encoded_biz_param")]
        [Validation(Required=true)]
        public string EncodedBizParam { get; set; }

    }

}
