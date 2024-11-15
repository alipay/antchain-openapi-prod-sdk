// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    public class EnableBusinessruleOperateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // api名称
        [NameInMap("api_name")]
        [Validation(Required=true)]
        public string ApiName { get; set; }

        // 环境
        [NameInMap("env")]
        [Validation(Required=false)]
        public string Env { get; set; }

        // 版本（不传为创建新版）
        [NameInMap("rule_version")]
        [Validation(Required=true)]
        public string RuleVersion { get; set; }

    }

}
