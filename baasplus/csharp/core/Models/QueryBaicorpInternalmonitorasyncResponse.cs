// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class QueryBaicorpInternalmonitorasyncResponse : TeaModel {
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

        // 数据
        [NameInMap("data")]
        [Validation(Required=false)]
        public List<AntiPiracyResultObject> Data { get; set; }

        // 如果字段status == "failed"，该字段保存相关错误信息
        [NameInMap("err_msg")]
        [Validation(Required=false)]
        public string ErrMsg { get; set; }

        // success 数据入库成功，后续处于被检测状态；
        // continue 数据处于被检测状态，data 字段包含监测结果
        // failed 任务失败
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 任务ID
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

    }

}
