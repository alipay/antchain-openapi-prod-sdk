// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 网页截图结果
    public class ScreenshotResult : TeaModel {
        // 截图文件下载链接
        [NameInMap("screenshot_file_url")]
        [Validation(Required=true)]
        public string ScreenshotFileUrl { get; set; }

        // 网页截取编号
        [NameInMap("screenshot_id")]
        [Validation(Required=true)]
        public string ScreenshotId { get; set; }

        // 取证类型(SCREENSHOT: 网页截图)
        [NameInMap("screenshot_type")]
        [Validation(Required=true)]
        public string ScreenshotType { get; set; }

        // 取证状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 错误码
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 错误信息
        [NameInMap("error_message")]
        [Validation(Required=false)]
        public string ErrorMessage { get; set; }

        // 网页截取名称
        [NameInMap("screenshot_name")]
        [Validation(Required=true)]
        public string ScreenshotName { get; set; }

    }

}
