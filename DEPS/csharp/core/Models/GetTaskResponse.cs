// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class GetTaskResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 
        //                             异步请求创建的时间和日期。采用UTC时间，按照[ISO8601](https://zh.wikipedia.org/wiki/ISO_8601)标准表示，格式为：`YYYY-MM-DDThh:mm:ssZ`
        //                         
        [NameInMap("creation_time")]
        [Validation(Required=false)]
        public string CreationTime { get; set; }

        // 异步请求中任务的执行结果，key为任务操作对象id比如某个资源的id，value为操作结果
        [NameInMap("execution_results")]
        [Validation(Required=false)]
        public List<TaskResult> ExecutionResults { get; set; }

        // 异步请求唯一标识
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 异步请求业务号
        [NameInMap("req_biz_id")]
        [Validation(Required=false)]
        public string ReqBizId { get; set; }

        // 异步请求状态，取值：
        //                             INIT：初始化中；
        //                             READY：待执行；
        //                             PROCESSING：执行中；
        //                             COMPLETED：执行完成
        //                         
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
