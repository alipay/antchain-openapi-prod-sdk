// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    public class GetDocumentFileResponse : TeaModel {
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

        // 文档Id
        [NameInMap("document_id")]
        [Validation(Required=false)]
        public string DocumentId { get; set; }

        // 类型【CONTRACT 合同, NOTE 票据, DOCUMENT 文件, UNKNOWN 未知】
        [NameInMap("file_type")]
        [Validation(Required=false)]
        public string FileType { get; set; }

        // 文档名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 存证哈希
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 存证时间
        [NameInMap("tx_time")]
        [Validation(Required=false)]
        public long? TxTime { get; set; }

        // 文件Url
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

    }

}
