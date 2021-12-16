// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    // 发票电子邮箱
    public class InvoiceEmail : TeaModel {
        // 电子邮箱
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 主键id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 唯一id
        [NameInMap("unique_id")]
        [Validation(Required=false)]
        public string UniqueId { get; set; }

    }

}
