// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class StatusBlockchainBotIotsuccessProductKnowledgebaseContentResponse : TeaModel {
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

        [NameInMap("kb_id")]
        [Validation(Required=true)]
        public string KbId { get; set; }

        // 已有ai_knowledge_document.doc_id
        [NameInMap("doc_id")]
        [Validation(Required=true)]
        public string DocId { get; set; }

        // 已有解析任务关联，接纳时可能尚未分配
        [NameInMap("parse_task_id")]
        [Validation(Required=true)]
        public string ParseTaskId { get; set; }

        // 枚举:PENDING,PROCESSING,COMPLETED,FAILED
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 现有文档error_message，脱敏返回
        [NameInMap("error_message")]
        [Validation(Required=true)]
        public string ErrorMessage { get; set; }

    }

}
