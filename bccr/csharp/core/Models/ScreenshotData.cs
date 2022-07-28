// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 网页取证数据
    public class ScreenshotData : TeaModel {
        // 取证地址
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // 网页取证时间
        [NameInMap("gmt_evidence")]
        [Validation(Required=false)]
        public long? GmtEvidence { get; set; }

        // 网页取证文件Hash值
        [NameInMap("file_hash")]
        [Validation(Required=false)]
        public string FileHash { get; set; }

        // 网页取证文件大小
        [NameInMap("file_size")]
        [Validation(Required=false)]
        public long? FileSize { get; set; }

        // 统一证据编号
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 网页取证文件存证块高
        [NameInMap("block_height")]
        [Validation(Required=false)]
        public long? BlockHeight { get; set; }

        // 网页取证文件上链时间
        [NameInMap("timestamp")]
        [Validation(Required=false)]
        public long? Timestamp { get; set; }

        // 可信时间戳的返回对象
        [NameInMap("tsr")]
        [Validation(Required=false)]
        public string Tsr { get; set; }

        // 网页截图文件公证处证书下载链接
        [NameInMap("certificate_url")]
        [Validation(Required=false)]
        public string CertificateUrl { get; set; }

        // 公证处证书编号
        [NameInMap("certificate_storage_no")]
        [Validation(Required=false)]
        public string CertificateStorageNo { get; set; }

        // 网页取证工具软件版本号
        [NameInMap("tool_version")]
        [Validation(Required=false)]
        public string ToolVersion { get; set; }

        // 证据包下载地址（状态为SUCCESS 才有数据）
        [NameInMap("screenshot_zip")]
        [Validation(Required=false)]
        public string ScreenshotZip { get; set; }

        // 取证文件信息
        [NameInMap("screenshot_info")]
        [Validation(Required=false)]
        public ScreenshotInfo ScreenshotInfo { get; set; }

        // 网页title
        [NameInMap("head_title")]
        [Validation(Required=false)]
        public string HeadTitle { get; set; }

        // 证据包交易hash
        [NameInMap("zip_tx_hash")]
        [Validation(Required=false)]
        public string ZipTxHash { get; set; }

        // 网页取证失败原因
        [NameInMap("error_reason")]
        [Validation(Required=false)]
        public string ErrorReason { get; set; }

        // 中文失败原因
        [NameInMap("error_reason_cn")]
        [Validation(Required=false)]
        public string ErrorReasonCn { get; set; }

    }

}
