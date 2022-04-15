// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    // 钉钉At
    public class At : TeaModel {
        // @手机号
        [NameInMap("at_mobiles")]
        [Validation(Required=false)]
        public List<string> AtMobiles { get; set; }

        // @用户ID
        [NameInMap("at_user_ids")]
        [Validation(Required=false)]
        public List<string> AtUserIds { get; set; }

        // @所有人
        [NameInMap("is_at_all")]
        [Validation(Required=false)]
        public bool? IsAtAll { get; set; }

    }

}
