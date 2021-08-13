// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryIpCopyrightResponse : TeaModel {
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

        // 存证状态，PROCESSING：存证中；SUCCESS：存证成功；FAIL：存证失败
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 文件hash
        [NameInMap("hash")]
        [Validation(Required=false)]
        public string Hash { get; set; }

        // 存证交易hash
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 存证块高
        [NameInMap("block_height")]
        [Validation(Required=false)]
        public long? BlockHeight { get; set; }

        // 存证时间
        [NameInMap("timestamp")]
        [Validation(Required=false)]
        public long? Timestamp { get; set; }

        // 证书oss地址
        [NameInMap("certificate_oss")]
        [Validation(Required=false)]
        public string CertificateOss { get; set; }

        // 证书下载链接
        [NameInMap("certificate_downurl")]
        [Validation(Required=false)]
        public string CertificateDownurl { get; set; }

        // 公证处证书编号
        [NameInMap("certificate_no")]
        [Validation(Required=false)]
        public string CertificateNo { get; set; }

    }

}
