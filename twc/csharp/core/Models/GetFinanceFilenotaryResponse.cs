// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class GetFinanceFilenotaryResponse : TeaModel {
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

        // 存证文件名称
        [NameInMap("file_name")]
        [Validation(Required=false)]
        public string FileName { get; set; }

        // 文件存证类型
        [NameInMap("file_notary_type")]
        [Validation(Required=false)]
        public string FileNotaryType { get; set; }

        // 哈希算法
        [NameInMap("hash_algorithm")]
        [Validation(Required=false)]
        public string HashAlgorithm { get; set; }

        // FILE_HASH 模式时该值为文件哈希；FILE_RAW 模式时该值为临时 oss 下载地址
        [NameInMap("notary_content")]
        [Validation(Required=false)]
        public string NotaryContent { get; set; }

        // 存证阶段
        [NameInMap("phase")]
        [Validation(Required=false)]
        public string Phase { get; set; }

        // 扩展属性
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

        // 可信时间戳
        [NameInMap("tsr")]
        [Validation(Required=false)]
        public TsrResponse Tsr { get; set; }

    }

}
