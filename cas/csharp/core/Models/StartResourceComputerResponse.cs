// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class StartResourceComputerResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 0表示正常，非0表示异常
        [NameInMap("ret_code")]
        [Validation(Required=false)]
        public long? RetCode { get; set; }

        // 异步任务执行id
        [NameInMap("job_id")]
        [Validation(Required=false)]
        public string JobId { get; set; }

        // 错误描述信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
