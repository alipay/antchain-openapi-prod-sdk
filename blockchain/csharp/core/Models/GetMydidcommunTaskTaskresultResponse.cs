// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class GetMydidcommunTaskTaskresultResponse : TeaModel {
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

        // 任务ID
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

        // FINISH 执行成功
        // CANCEL 执行失败
        // 只有FINISH 和CANCEL为最终状态，其他均为中间状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // json序列化后的，任务执行结果，对不同的任务格式会有不同
        // 如：
        // - 代理VC的任务，返回值结构为{"vc":"1111111"}
        // - 获取数据的任务，返回值结构为{"response":{"output":"xxxx","status":"FINISH"}}
        [NameInMap("data_result")]
        [Validation(Required=false)]
        public string DataResult { get; set; }

    }

}
