// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    // 邮箱数据
    public class EmailContent : TeaModel {
        // code
        [NameInMap("service_code")]
        [Validation(Required=false)]
        public string ServiceCode { get; set; }

        // 开发者Id
        [NameInMap("developer_id")]
        [Validation(Required=false)]
        public string DeveloperId { get; set; }

        // 邮箱
        [NameInMap("email")]
        [Validation(Required=true)]
        public string Email { get; set; }

        // 参数
        [NameInMap("arguments")]
        [Validation(Required=false)]
        public List<Pair> Arguments { get; set; }

    }

}
