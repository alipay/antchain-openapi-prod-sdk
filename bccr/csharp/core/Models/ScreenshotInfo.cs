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

        // 全链路取证日志文件哈希
        [NameInMap("process_log_file_hash")]
        [Validation(Required=false)]
        public string ProcessLogFileHash { get; set; }

        // 自清洁文件下载链接
        [NameInMap("check_log_file")]
        [Validation(Required=false)]
        public string CheckLogFile { get; set; }

        // 自清洁文件哈希
        [NameInMap("check_log_file_hash")]
        [Validation(Required=false)]
        public string CheckLogFileHash { get; set; }

        // 网页截图文件下载链接
        [NameInMap("screenshot_file")]
        [Validation(Required=true)]
        public string ScreenshotFile { get; set; }

        // 网页截图文件哈希
        [NameInMap("screenshot_file_hash")]
        [Validation(Required=false)]
        public string ScreenshotFileHash { get; set; }

        // 日志打包文件hash
        [NameInMap("log_zip_file_hash")]
        [Validation(Required=false)]
        public string LogZipFileHash { get; set; }

        // 日志文件上链hash
        [NameInMap("log_zip_tx_hash")]
        [Validation(Required=false)]
        public string LogZipTxHash { get; set; }

    }

}
