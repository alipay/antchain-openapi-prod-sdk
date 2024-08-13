// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class QueryRegisterstatusResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 登记状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 存证时间
        [NameInMap("timestamp")]
        [Validation(Required=false)]
        public long? Timestamp { get; set; }

        // 文件hash
        [NameInMap("hash")]
        [Validation(Required=false)]
        public string Hash { get; set; }

        // 统一证据编号（存证交易HASH）
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 存证块高
        [NameInMap("block_height")]
        [Validation(Required=false)]
        public long? BlockHeight { get; set; }

        // tsr信息
        [NameInMap("tsr")]
        [Validation(Required=false)]
        public string Tsr { get; set; }

        // 公证处证书下载链接
        [NameInMap("certificate_url")]
        [Validation(Required=false)]
        public string CertificateUrl { get; set; }

        // 公证处证书编号
        [NameInMap("certificate_storage_no")]
        [Validation(Required=false)]
        public string CertificateStorageNo { get; set; }

        // 授时中心证书下载链接
        [NameInMap("certificate_time_url")]
        [Validation(Required=false)]
        public string CertificateTimeUrl { get; set; }

        // 证据包下载地址（状态为SUCCESS并且请求要求生成证据包才有数据）
        [NameInMap("package_url")]
        [Validation(Required=false)]
        public string PackageUrl { get; set; }

        // 证据包存证交易HASH  注意只有生成了证据包才会返回
        [NameInMap("package_tx_hash")]
        [Validation(Required=false)]
        public string PackageTxHash { get; set; }

        // 权利声明书下载地址 注意只有传递了权利信息并且生成了权利声明书才会返回
        [NameInMap("statement_url")]
        [Validation(Required=false)]
        public string StatementUrl { get; set; }

        // 安全信息
        [NameInMap("security")]
        [Validation(Required=false)]
        public SecurityData Security { get; set; }

        // 保管函url
        [NameInMap("correction_url")]
        [Validation(Required=false)]
        public string CorrectionUrl { get; set; }

    }

}
