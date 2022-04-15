// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class FinishRbbRegdatasyncScheduleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 时间分区
        [NameInMap("biz_date")]
        [Validation(Required=true, MaxLength=8)]
        public string BizDate { get; set; }

        // 记录当前分区离线同步情况
        [NameInMap("sync_info")]
        [Validation(Required=true)]
        public string SyncInfo { get; set; }

    }

}
