// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class QueryNotaryDocumenttosignResponse : TeaModel {
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

        // 需要用户签署的文件列表
        [NameInMap("sign_document_list")]
        [Validation(Required=false)]
        public List<SignDocument> SignDocumentList { get; set; }

        // 生成文件的时间，需要在提交申办接口传入
        [NameInMap("preview_time")]
        [Validation(Required=false)]
        public long? PreviewTime { get; set; }

    }

}
