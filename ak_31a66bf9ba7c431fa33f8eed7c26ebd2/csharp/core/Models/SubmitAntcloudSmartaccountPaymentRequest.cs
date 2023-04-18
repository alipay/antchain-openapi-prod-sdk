// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_31a66bf9ba7c431fa33f8eed7c26ebd2.Models
{
    public class SubmitAntcloudSmartaccountPaymentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 系统参数
        [NameInMap("sys_param")]
        [Validation(Required=true)]
        public SystemParam SysParam { get; set; }

        // 业务参数，与function定义相匹配
        [NameInMap("encoded_biz_param")]
        [Validation(Required=true)]
        public string EncodedBizParam { get; set; }

    }

}
