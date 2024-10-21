// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // APIKEY试图对象
    public class ApiKey : TeaModel {
        // 主键
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // AK
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

        // SK(或公钥)
        [NameInMap("secret")]
        [Validation(Required=true)]
        public string Secret { get; set; }

        // 创建日期
        [NameInMap("gmt_created")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreated { get; set; }

    }

}
