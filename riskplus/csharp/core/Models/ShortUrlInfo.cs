// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 卡短解析服务返回参数
    public class ShortUrlInfo : TeaModel {
        // 支持卡片短信的手机号
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 解析生成的短链
        [NameInMap("short_url")]
        [Validation(Required=true)]
        public string ShortUrl { get; set; }

    }

}
