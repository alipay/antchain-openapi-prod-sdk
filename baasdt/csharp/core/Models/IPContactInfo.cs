// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // IP授权服务: ContactInfo
    public class IPContactInfo : TeaModel {
        // 联系人姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 联系人手机号码
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 联系人电话号码
        [NameInMap("phone")]
        [Validation(Required=false)]
        public string Phone { get; set; }

        // 联系人类型, 1-法人；2-实际控制人；3-代理人；4-其他
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // 联系人身份证号
        [NameInMap("certno")]
        [Validation(Required=false)]
        public string Certno { get; set; }

    }

}
