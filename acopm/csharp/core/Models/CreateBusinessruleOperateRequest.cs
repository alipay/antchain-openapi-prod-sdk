// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    public class CreateBusinessruleOperateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // api名称
        [NameInMap("api_name")]
        [Validation(Required=true)]
        public string ApiName { get; set; }

        // 规则列表
        [NameInMap("rules")]
        [Validation(Required=true)]
        public List<BusinessRule> Rules { get; set; }

        // api版本（可选，传递则表示导入）
        [NameInMap("rule_version")]
        [Validation(Required=false)]
        public string RuleVersion { get; set; }

    }

}
