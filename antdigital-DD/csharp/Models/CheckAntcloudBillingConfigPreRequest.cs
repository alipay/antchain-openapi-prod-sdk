// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    public class CheckAntcloudBillingConfigPreRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 配置字符串
        [NameInMap("new_fee_config")]
        [Validation(Required=true)]
        public FeeConfEntityVO NewFeeConfig { get; set; }

        // 请求单号
        [NameInMap("biz_no")]
        [Validation(Required=true)]
        public string BizNo { get; set; }

    }

}
