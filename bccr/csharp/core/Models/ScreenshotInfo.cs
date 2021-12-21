// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 网页取证具体信息
    public class ScreenshotInfo : TeaModel {
        // 全链路取证日志文件下载链接
        [NameInMap("process_log_file")]
        [Validation(Required=false)]
        public string ProcessLogFile { get; set; }

        // 自清洁文件下载链接
        [NameInMap("check_log_file")]
        [Validation(Required=false)]
        public string CheckLogFile { get; set; }

        // 网页截图文件下载链接
        [NameInMap("screenshot_file")]
        [Validation(Required=true)]
        public string ScreenshotFile { get; set; }

        // 操作日志文件交易hash
        [NameInMap("process_log_file_tx_hash")]
        [Validation(Required=false)]
        public string ProcessLogFileTxHash { get; set; }

        // 自清洁日志文件交易hash
        [NameInMap("check_log_file_tx_hash")]
        [Validation(Required=false)]
        public string CheckLogFileTxHash { get; set; }

    }

}
