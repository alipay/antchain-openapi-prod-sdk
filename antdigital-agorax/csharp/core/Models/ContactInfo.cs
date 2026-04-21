// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 联系人信息
    public class ContactInfo : TeaModel {
        // 联系人名字
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 手机号
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 电子邮箱
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 电话
        [NameInMap("phone")]
        [Validation(Required=false)]
        public string Phone { get; set; }

        // 身份证号
        [NameInMap("id_card_no")]
        [Validation(Required=false)]
        public string IdCardNo { get; set; }

    }

}
