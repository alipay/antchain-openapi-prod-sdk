// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INDUSTRY.Models
{
    // 联系人信息
    public class ContactInfo : TeaModel {
        // 联系人姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 联系人手机号码
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 联系人电话号码
        [NameInMap("phone")]
        [Validation(Required=false)]
        public string Phone { get; set; }

        // 联系人类型, LEGAL_PERSON-法人；CONTROLLER-实际控制人；AGENT-代理人；OTHER-其他
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
