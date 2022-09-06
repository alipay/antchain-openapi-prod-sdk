// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 企业信息详情
    public class BusinessDetail : TeaModel {
        // 经营地址
        [NameInMap("operating_addr_json")]
        [Validation(Required=true)]
        public string OperatingAddrJson { get; set; }

        // 社会统一信用代码
        [NameInMap("uc_code")]
        [Validation(Required=true)]
        public string UcCode { get; set; }

        // 注册日期
        [NameInMap("register_date")]
        [Validation(Required=true)]
        public string RegisterDate { get; set; }

        // 详细地址
        [NameInMap("address_detail")]
        [Validation(Required=true)]
        public string AddressDetail { get; set; }

    }

}
