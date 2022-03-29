// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class QuerySofamqConnectordateResponse : TeaModel {
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

        // 返回该任务的执行计划的实例摘要
        [NameInMap("data")]
        [Validation(Required=false)]
        public List<InstanceDigest> Data { get; set; }

        // 时间列表
        [NameInMap("date_list")]
        [Validation(Required=false)]
        public List<string> DateList { get; set; }

        // 错误报告
        [NameInMap("error_report")]
        [Validation(Required=false)]
        public ErrorReport ErrorReport { get; set; }

    }

}
