// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ChatAiotdatalinkAskdataResponse : TeaModel {
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

        // 任务Id
        [NameInMap("job_id")]
        [Validation(Required=false)]
        public string JobId { get; set; }

        // 请求ID
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        // 任务状态， ACCEPTED 提交，RESOLVING_MODEL 解析寓意，INTERPRETING 生成SQL，SQL_VALIDATING sql 校验，EXECUTING 执行查询，ANALYZING 保存结果，COMPLETE 任务完成，FAILED 任务失败，CANCELLED 任务取消
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // json 格式字符串
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

        // 数据总条数
        [NameInMap("row_num")]
        [Validation(Required=false)]
        public long? RowNum { get; set; }

    }

}
