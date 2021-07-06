// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class QueryEnterpriseidFaceauthinternalResponse : TeaModel {
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

        // 	
        // 认证的唯一性标示
        [NameInMap("biz_no")]
        [Validation(Required=false)]
        public string BizNo { get; set; }

        // 认证失败错误码
        // 
        [NameInMap("failed_code")]
        [Validation(Required=false)]
        public string FailedCode { get; set; }

        // 认证失败原因信息
        // 
        [NameInMap("failed_message")]
        [Validation(Required=false)]
        public string FailedMessage { get; set; }

        // 是否认证通过
        [NameInMap("passed")]
        [Validation(Required=false)]
        public bool? Passed { get; set; }

    }

}
