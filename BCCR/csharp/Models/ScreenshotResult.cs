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
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://www.baidu.com">https://www.baidu.com</a></para>
        /// </summary>
        [NameInMap("screenshot_file_url")]
        [Validation(Required=true)]
        public string ScreenshotFileUrl { get; set; }

        // 网页截取编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>8240328000000007919</para>
        /// </summary>
        [NameInMap("screenshot_id")]
        [Validation(Required=true)]
        public string ScreenshotId { get; set; }

        // 取证类型(SCREENSHOT: 网页截图)
        /// <summary>
        /// <b>Example:</b>
        /// <para>SCREENSHOT</para>
        /// </summary>
        [NameInMap("screenshot_type")]
        [Validation(Required=true)]
        public string ScreenshotType { get; set; }

        // 取证状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>SUCCESS</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 错误码
        /// <summary>
        /// <b>Example:</b>
        /// <para>NOTARY_SCREENSHOT_ERROR</para>
        /// </summary>
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 错误信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>公证处网页取证存证失败</para>
        /// </summary>
        [NameInMap("error_message")]
        [Validation(Required=false)]
        public string ErrorMessage { get; set; }

        // 网页截取名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>名称</para>
        /// </summary>
        [NameInMap("screenshot_name")]
        [Validation(Required=true)]
        public string ScreenshotName { get; set; }

    }

}
