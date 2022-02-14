// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateContractCourtdeductResponse : TeaModel {
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

        // 给工行上传的调解书文件名
        [NameInMap("file_name")]
        [Validation(Required=false)]
        public string FileName { get; set; }

        // 存证txHash，存证核验时需要
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 存证原文
        [NameInMap("notary_content")]
        [Validation(Required=false)]
        public string NotaryContent { get; set; }

        // 存证原文hash
        [NameInMap("notary_content_hash")]
        [Validation(Required=false)]
        public string NotaryContentHash { get; set; }

    }

}
