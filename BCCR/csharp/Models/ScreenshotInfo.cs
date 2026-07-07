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
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://xxxx">https://xxxx</a></para>
        /// </summary>
        [NameInMap("process_log_file")]
        [Validation(Required=false)]
        public string ProcessLogFile { get; set; }

        // 全链路取证日志文件哈希
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("process_log_file_hash")]
        [Validation(Required=false)]
        public string ProcessLogFileHash { get; set; }

        // 自清洁文件下载链接
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://xxxx">https://xxxx</a></para>
        /// </summary>
        [NameInMap("check_log_file")]
        [Validation(Required=false)]
        public string CheckLogFile { get; set; }

        // 自清洁文件哈希
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("check_log_file_hash")]
        [Validation(Required=false)]
        public string CheckLogFileHash { get; set; }

        // 网页截图文件下载链接
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://xxxx">https://xxxx</a></para>
        /// </summary>
        [NameInMap("screenshot_file")]
        [Validation(Required=true)]
        public string ScreenshotFile { get; set; }

        // 网页截图文件哈希
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("screenshot_file_hash")]
        [Validation(Required=false)]
        public string ScreenshotFileHash { get; set; }

        // 日志打包文件hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd</para>
        /// </summary>
        [NameInMap("log_zip_file_hash")]
        [Validation(Required=false)]
        public string LogZipFileHash { get; set; }

        // 日志文件上链hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd</para>
        /// </summary>
        [NameInMap("log_zip_tx_hash")]
        [Validation(Required=false)]
        public string LogZipTxHash { get; set; }

    }

}
