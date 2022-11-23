// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryContractTaskResponse : TeaModel {
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

        // 任务类型,FILE_DECRYPT_ESIGN_UPLOAD
        [NameInMap("task_type")]
        [Validation(Required=false)]
        public string TaskType { get; set; }

        // 任务结果
        //  INIT,初始化
        //  DOING，处理中
        //  FAIL，失败
        //  SUCCESS，成功
        [NameInMap("task_status")]
        [Validation(Required=false)]
        public string TaskStatus { get; set; }

        // 当任务为FILE_DECRYPT_ESIGN_UPLOAD时，为处理成功后的文件id
        [NameInMap("task_result")]
        [Validation(Required=false)]
        public string TaskResult { get; set; }

        // 失败原因
        [NameInMap("fail_reason")]
        [Validation(Required=false)]
        public string FailReason { get; set; }

    }

}
