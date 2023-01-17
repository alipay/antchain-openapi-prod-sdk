// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryDataflowActionResponse : TeaModel {
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

        // 操作状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 信封公钥加密后的存证公钥信息，当查询类型为DEPLOY且status为密钥上传成功时返回。
        [NameInMap("encrypted_pubkey")]
        [Validation(Required=false)]
        public string EncryptedPubkey { get; set; }

    }

}
