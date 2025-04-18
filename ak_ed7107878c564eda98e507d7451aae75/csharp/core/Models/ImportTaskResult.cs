// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ed7107878c564eda98e507d7451aae75.Models
{
    // 知识点批量导入任务结果
    public class ImportTaskResult : TeaModel {
        // 任务状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 进度值
        [NameInMap("progress")]
        [Validation(Required=false)]
        public long? Progress { get; set; }

        // 错误日志
        [NameInMap("error_message")]
        [Validation(Required=false)]
        public string ErrorMessage { get; set; }

        // 导入日志文件url
        [NameInMap("file_url")]
        [Validation(Required=false)]
        public string FileUrl { get; set; }

    }

}
