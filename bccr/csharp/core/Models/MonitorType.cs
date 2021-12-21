// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 监测文件类型
    public class MonitorType : TeaModel {
        // 文件类型
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

        // 提交类型
        [NameInMap("submit_type")]
        [Validation(Required=true)]
        public string SubmitType { get; set; }

    }

}
