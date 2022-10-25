// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 租赁风控查询的实体描述
    public class LesseePerson : TeaModel {
        // 承租人姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 承租人身份证号
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 承租人手机号
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

    }

}
