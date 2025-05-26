// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 服务商下工作人员
    public class IsvWorkerInfoVO : TeaModel {
        // 工作人员账号id
        [NameInMap("worker_account_id")]
        [Validation(Required=true)]
        public string WorkerAccountId { get; set; }

        // 工作人员姓名
        [NameInMap("worker_name")]
        [Validation(Required=true)]
        public string WorkerName { get; set; }

    }

}
