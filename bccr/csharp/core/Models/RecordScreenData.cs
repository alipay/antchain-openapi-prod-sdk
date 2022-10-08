// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 录屏取证信息
    public class RecordScreenData : TeaModel {
        // 错误原因（状态为FAIL才有数据）
        [NameInMap("error_reason")]
        [Validation(Required=false)]
        public string ErrorReason { get; set; }

        // 录屏文件Hash值
        [NameInMap("file_hash")]
        [Validation(Required=false)]
        public string FileHash { get; set; }

        // 录屏结束时间
        [NameInMap("gmt_end")]
        [Validation(Required=true)]
        public long? GmtEnd { get; set; }

        // 录屏开始时间
        [NameInMap("gmt_start")]
        [Validation(Required=true)]
        public long? GmtStart { get; set; }

        // OS版本号
        [NameInMap("os_version")]
        [Validation(Required=true)]
        public string OsVersion { get; set; }

        // 录屏文件信息
        [NameInMap("screen_info")]
        [Validation(Required=false)]
        public ScreenInfo ScreenInfo { get; set; }

        // 证据包下载地址（状态为SUCCESS 才有数据）
        [NameInMap("screen_zip")]
        [Validation(Required=false)]
        public string ScreenZip { get; set; }

        // 录屏软件版本号
        [NameInMap("sw_version")]
        [Validation(Required=true)]
        public string SwVersion { get; set; }

        // 可信时间戳的返回对象
        [NameInMap("tsr")]
        [Validation(Required=false)]
        public string Tsr { get; set; }

        // 统一证据编号
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 录屏文件大小
        [NameInMap("file_size")]
        [Validation(Required=false)]
        public long? FileSize { get; set; }

        // 录屏文件存证块高
        [NameInMap("block_height")]
        [Validation(Required=false)]
        public long? BlockHeight { get; set; }

        // 录屏文件上链时间
        [NameInMap("timestamp")]
        [Validation(Required=false)]
        public long? Timestamp { get; set; }

        // 录屏文件公证处证书下载链接
        [NameInMap("certificate_url")]
        [Validation(Required=false)]
        public string CertificateUrl { get; set; }

        // 公证处证书编号
        [NameInMap("certificate_storage_no")]
        [Validation(Required=false)]
        public string CertificateStorageNo { get; set; }

        // 证据包存证交易hash
        [NameInMap("zip_tx_hash")]
        [Validation(Required=false)]
        public string ZipTxHash { get; set; }

        // 取证备注信息
        [NameInMap("inventory")]
        [Validation(Required=false)]
        public string Inventory { get; set; }

        // 证据包文件hash
        [NameInMap("zip_file_hash")]
        [Validation(Required=false)]
        public string ZipFileHash { get; set; }

    }

}
