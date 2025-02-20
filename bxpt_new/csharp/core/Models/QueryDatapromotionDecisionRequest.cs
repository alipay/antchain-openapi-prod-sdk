// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BXPT_NEW.Models
{
    public class QueryDatapromotionDecisionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 保司编码
        [NameInMap("insurer_code")]
        [Validation(Required=true)]
        public string InsurerCode { get; set; }

        // 保险险种
        [NameInMap("insurance_type")]
        [Validation(Required=true)]
        public string InsuranceType { get; set; }

        // 业务参数内容JSON字符串
        [NameInMap("biz_content")]
        [Validation(Required=true)]
        public string BizContent { get; set; }

    }

}
