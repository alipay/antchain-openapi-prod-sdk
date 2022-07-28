// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 取证文件信息
    public class ScreenInfo : TeaModel {
        // 全链路取证日志文件下载链接
        [NameInMap("process_log_file")]
        [Validation(Required=false)]
        public string ProcessLogFile { get; set; }

        // 自清洁文件下载地址
        [NameInMap("check_log_file")]
        [Validation(Required=false)]
        public string CheckLogFile { get; set; }

        // 网页截图文件下载链接
        [NameInMap("web_screenshot_file")]
        [Validation(Required=false)]
        public string WebScreenshotFile { get; set; }

        // 网页源码文件下载链接
        [NameInMap("web_source_file")]
        [Validation(Required=false)]
        public string WebSourceFile { get; set; }

        // 视频源文件下载链接
        [NameInMap("video_file")]
        [Validation(Required=false)]
        public string VideoFile { get; set; }

    }

}
