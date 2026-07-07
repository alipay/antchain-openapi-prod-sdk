// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class QueryRecodescreenResponse : TeaModel {
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

        // 取证id
        [NameInMap("evidence_id")]
        [Validation(Required=false)]
        public string EvidenceId { get; set; }

        // 取证状态 具体见附录 RecordScreenStatus
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 取证操作Url （状态为INIT和DOING 时返回 可以重复打开使用）
        [NameInMap("operate_url")]
        [Validation(Required=false)]
        public string OperateUrl { get; set; }

        // 取证详情（状态为PACKAGING,SUCCESS,FAIL才有数据）
        [NameInMap("data")]
        [Validation(Required=false)]
        public RecordScreenData Data { get; set; }

    }

}
