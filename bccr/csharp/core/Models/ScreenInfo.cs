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

        // 全链路取证日志文件哈希
        [NameInMap("process_log_file_hash")]
        [Validation(Required=false)]
        public string ProcessLogFileHash { get; set; }

        // 自清洁文件下载地址
        [NameInMap("check_log_file")]
        [Validation(Required=false)]
        public string CheckLogFile { get; set; }

        // 自清洁文件哈希
        [NameInMap("check_log_file_hash")]
        [Validation(Required=false)]
        public string CheckLogFileHash { get; set; }

        // 网页截图文件下载链接
        [NameInMap("web_screenshot_file")]
        [Validation(Required=false)]
        public string WebScreenshotFile { get; set; }

        // 网页截图文件哈希
        [NameInMap("web_screenshot_file_hash")]
        [Validation(Required=false)]
        public string WebScreenshotFileHash { get; set; }

        // 网页源码文件下载链接
        [NameInMap("web_source_file")]
        [Validation(Required=false)]
        public string WebSourceFile { get; set; }

        // 网页源码文件哈希
        [NameInMap("web_source_file_hash")]
        [Validation(Required=false)]
        public string WebSourceFileHash { get; set; }

        // 视频源文件下载链接
        [NameInMap("video_file")]
        [Validation(Required=false)]
        public string VideoFile { get; set; }

        // 视频源文件哈希
        [NameInMap("video_file_hash")]
        [Validation(Required=false)]
        public string VideoFileHash { get; set; }

        // 手机自清洁文件下载链接
        [NameInMap("extend_device_check_file")]
        [Validation(Required=false)]
        public string ExtendDeviceCheckFile { get; set; }

        // 手机自清洁文件哈希
        [NameInMap("extend_device_check_file_hash")]
        [Validation(Required=false)]
        public string ExtendDeviceCheckFileHash { get; set; }

        // 手机操作日志下载链接
        [NameInMap("extend_device_process_file")]
        [Validation(Required=false)]
        public string ExtendDeviceProcessFile { get; set; }

        // 手机操作日志哈希
        [NameInMap("extend_device_process_file_hash")]
        [Validation(Required=false)]
        public string ExtendDeviceProcessFileHash { get; set; }

    }

}
