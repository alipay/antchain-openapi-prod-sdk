// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class SignIpOrdercontractResponse : TeaModel {
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

        // 签署完成的文件OSS key。只有在签署流程全部完成后才会返回该数据。
        [NameInMap("signed_contract_file")]
        [Validation(Required=false)]
        public string SignedContractFile { get; set; }

        // 签署完成的文件下载链接。只有在签署流程全部完成后才会返回该数据。
        [NameInMap("signed_contract_file_url")]
        [Validation(Required=false)]
        public string SignedContractFileUrl { get; set; }

    }

}
