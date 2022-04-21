// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWOE.Models
{
    // 证据信息
    public class EvidenceInfo : TeaModel {
        // 取证类型
        // PHOTO 照片
        // VIDEO 视频
        // STREAM 流
        [NameInMap("forensic_type")]
        [Validation(Required=true)]
        public string ForensicType { get; set; }

        // 取证时间戳
        [NameInMap("forensic_timestamp")]
        [Validation(Required=true)]
        public long? ForensicTimestamp { get; set; }

        // 形成证据时间戳
        [NameInMap("evidence_timestamp")]
        [Validation(Required=true)]
        public long? EvidenceTimestamp { get; set; }

        // 证据哈希值
        [NameInMap("evidence_file_hash")]
        [Validation(Required=true)]
        public string EvidenceFileHash { get; set; }

        // 证据大小，byte
        [NameInMap("evidence_file_size")]
        [Validation(Required=true)]
        public long? EvidenceFileSize { get; set; }

        // 证据视频/照片下载链接
        [NameInMap("evidence_file_url")]
        [Validation(Required=true)]
        public string EvidenceFileUrl { get; set; }

        // 缩略图链接
        [NameInMap("thumbnail_url")]
        [Validation(Required=true)]
        public string ThumbnailUrl { get; set; }

        // 取证经度，根据是否需要自清洁决定
        [NameInMap("longitude")]
        [Validation(Required=false)]
        public string Longitude { get; set; }

        // 取证纬度，根据是否需要自清洁决定
        [NameInMap("latitude")]
        [Validation(Required=false)]
        public string Latitude { get; set; }

        // 统一证据编号，根据是否需要上链决定
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 公证处，根据是否需要公证决定
        [NameInMap("notary_office")]
        [Validation(Required=false)]
        public string NotaryOffice { get; set; }

        // 存证证明文件链接，根据是否需要公证决定
        [NameInMap("notary_url")]
        [Validation(Required=false)]
        public string NotaryUrl { get; set; }

        // 存证证明文件编号，根据是否需要公证决定
        [NameInMap("notary_cert_no")]
        [Validation(Required=false)]
        public string NotaryCertNo { get; set; }

        // 可信时间戳，根据是否需要时间戳决定，JSON类型字符串
        [NameInMap("tsr")]
        [Validation(Required=false)]
        public string Tsr { get; set; }

    }

}
