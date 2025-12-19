// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QFTEST.Models
{
    // 核销明细月文件
    public class BenefitWriteOffMonthFileData : TeaModel {
        // 所属月份
        [NameInMap("billing_month")]
        [Validation(Required=true)]
        public string BillingMonth { get; set; }

        // AFTS 上传到文件 id
        [NameInMap("file_filed_id")]
        [Validation(Required=true)]
        public string FileFiledId { get; set; }

    }

}
