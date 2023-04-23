// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    // 合作方（伙伴、商家）联系信息
    public class PartnerContactInformation : TeaModel {
        // 企业联系人姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 企业联系人手机
        [NameInMap("phone")]
        [Validation(Required=true)]
        public string Phone { get; set; }

        // 企业联系邮箱
        [NameInMap("email")]
        [Validation(Required=true)]
        public string Email { get; set; }

        // 通信邮编
        [NameInMap("post_code")]
        [Validation(Required=true)]
        public string PostCode { get; set; }

        // 通信地址
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

    }

}
