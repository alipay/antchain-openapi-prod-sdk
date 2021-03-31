// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class UploadCreditAplusissueResponse : TeaModel {
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

        // 批次id
        [NameInMap("batch_id")]
        [Validation(Required=false)]
        public string BatchId { get; set; }

        // 批次状态 -1:失效， 0:初始化完成，1:进行中，2:部分成功，3:成功
        [NameInMap("batch_id_status")]
        [Validation(Required=false)]
        public long? BatchIdStatus { get; set; }

        // 凭证发行跳转url
        [NameInMap("issue_url")]
        [Validation(Required=false)]
        public string IssueUrl { get; set; }

    }

}
