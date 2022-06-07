// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    // 短信消息体
    public class SmsContent : TeaModel {
        // 模板
        [NameInMap("service_code")]
        [Validation(Required=false)]
        public string ServiceCode { get; set; }

        // 手机号
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 开发者ID
        [NameInMap("developer_id")]
        [Validation(Required=false)]
        public string DeveloperId { get; set; }

        // 填充内容
        [NameInMap("arguments")]
        [Validation(Required=false)]
        public List<Pair> Arguments { get; set; }

    }

}
