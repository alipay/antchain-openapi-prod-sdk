// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 创建xr用户通行证结果信息
    public class XrUserTicketResultInfo : TeaModel {
        // xr通行证资源池名称
        [NameInMap("xr_ticket_pool_name")]
        [Validation(Required=true)]
        public string XrTicketPoolName { get; set; }

        // 购买数量，失败列表有值
        [NameInMap("count")]
        [Validation(Required=false)]
        public long? Count { get; set; }

        // 失败原因，失败列表有值
        [NameInMap("error_msg")]
        [Validation(Required=false)]
        public string ErrorMsg { get; set; }

        // 通行证编号，成功列表有值
        [NameInMap("xr_ticket_code")]
        [Validation(Required=false)]
        public string XrTicketCode { get; set; }

    }

}
