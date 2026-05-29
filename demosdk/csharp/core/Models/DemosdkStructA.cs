// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMOSDK.Models
{
    // DEMOSDK结构体A·edit for test18
    public class DemosdkStructA : TeaModel {
        // 【公司名称】
        [NameInMap("company_name")]
        [Validation(Required=false)]
        public string CompanyName { get; set; }

        // 【业务类型】
        [NameInMap("product_main_class")]
        [Validation(Required=false)]
        public string ProductMainClass { get; set; }

        // 【公司地址】
        [NameInMap("company_address")]
        [Validation(Required=false)]
        public string CompanyAddress { get; set; }

        // 【联系人】
        [NameInMap("contact_name")]
        [Validation(Required=false)]
        public string ContactName { get; set; }

        // 【联系人手机号】
        [NameInMap("contact_mobile")]
        [Validation(Required=false)]
        public string ContactMobile { get; set; }

    }

}
