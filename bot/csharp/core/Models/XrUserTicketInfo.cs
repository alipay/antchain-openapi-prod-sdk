// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 用户通行证创建详情
    public class XrUserTicketInfo : TeaModel {
        // xr通行证资源池名称
        [NameInMap("xr_ticket_pool_name")]
        [Validation(Required=true)]
        public string XrTicketPoolName { get; set; }

        // 购买数量
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

    }

}
