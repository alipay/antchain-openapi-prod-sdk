// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.HK_SECURITYTECH.Models
{
    // 安卓加固HardeningTaskResponse
    public class HardeningTaskResponse : TeaModel {
        // 加固任务的 ID，后续用来轮询调用
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 加固任务的状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 加固后 APK/ABB 的 MD5
        [NameInMap("after_md_five")]
        [Validation(Required=true)]
        public string AfterMdFive { get; set; }

        // 加固后 APK/ABB 的大小
        [NameInMap("after_size")]
        [Validation(Required=true)]
        public long? AfterSize { get; set; }

    }

}
