// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class GetFileResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 文件哈希，当 file_notary_type 为 FILE_HASH 时才有此值。
        [NameInMap("file_hash")]
        [Validation(Required=false)]
        public string FileHash { get; set; }

        // 文件存证模式，有 FILE_RAW 和 FILE_HASH 两种可能值。
        [NameInMap("file_notary_type")]
        [Validation(Required=false)]
        public string FileNotaryType { get; set; }

        // 哈希算法，当 file_notary_type 为 FILE_HASH 时，此返回值才有效。
        [NameInMap("hash_algorithm")]
        [Validation(Required=false)]
        public string HashAlgorithm { get; set; }

        // 文件下载地址，当 file_notary_type 为 FILE_RAW 时才有此值。
        [NameInMap("oss_path")]
        [Validation(Required=false)]
        public string OssPath { get; set; }

    }

}
