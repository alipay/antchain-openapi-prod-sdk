// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // Agent详情-Agent安全审核配置
    public class AgentSecConfig : TeaModel {
        // 是否打开安全审核
        [NameInMap("enable_sec_check")]
        [Validation(Required=true)]
        public bool? EnableSecCheck { get; set; }

        // 安全提供方:平台配置 大安全、天鉴等
        [NameInMap("sec_provider")]
        [Validation(Required=true)]
        public string SecProvider { get; set; }

    }

}
