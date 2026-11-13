// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    public class ExecAntcloudMarketingagentCreativeScriptRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 待扩写的原始脚本或简要描述，复用现有文生视频的脚本扩写逻辑
        [NameInMap("prompt")]
        [Validation(Required=true)]
        public string Prompt { get; set; }

    }

}
