// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    // 待签约任务描述
    public class SignTaskProfile : TeaModel {
        // 签署任务列表
        [NameInMap("sign_task_list")]
        [Validation(Required=true)]
        public List<SignTask> SignTaskList { get; set; }

    }

}
