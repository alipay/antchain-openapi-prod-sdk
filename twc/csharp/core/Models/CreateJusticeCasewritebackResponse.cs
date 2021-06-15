// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateJusticeCasewritebackResponse : TeaModel {
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

        // 创建成功状态
        // success, fail
        [NameInMap("create_status")]
        [Validation(Required=false)]
        public string CreateStatus { get; set; }

        // 创建状态说明
        [NameInMap("create_status_message")]
        [Validation(Required=false)]
        public string CreateStatusMessage { get; set; }

        // 创建时间（如创建成功，则返回创建日期时间）
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // 业务来源主键
        [NameInMap("input_source_id")]
        [Validation(Required=false)]
        public string InputSourceId { get; set; }

        // 案件ID
        [NameInMap("case_id")]
        [Validation(Required=false)]
        public string CaseId { get; set; }

        // 业务码 0表示成功
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // 业务码描述
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
