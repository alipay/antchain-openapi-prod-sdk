// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ExecRbbCompanyGuardRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 企业名称或统一社会信用代码
        [NameInMap("keyword")]
        [Validation(Required=true)]
        public string Keyword { get; set; }

        // 规则ID，在风险大脑系统中配置
        [NameInMap("rule_id")]
        [Validation(Required=true)]
        public long? RuleId { get; set; }

    }

}
