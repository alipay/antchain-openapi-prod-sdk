// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ed7107878c564eda98e507d7451aae75.Models
{
    // 数字人平台--话术配置信息
    public class AvatarScriptConfigInfo : TeaModel {
        // 唤醒词列表
        [NameInMap("wake_words")]
        [Validation(Required=false)]
        public List<string> WakeWords { get; set; }

        // 欢迎语列表
        [NameInMap("welcome_phrases")]
        [Validation(Required=false)]
        public List<string> WelcomePhrases { get; set; }

        // 兜底语列表
        [NameInMap("fallback_phrases")]
        [Validation(Required=false)]
        public List<string> FallbackPhrases { get; set; }

    }

}
