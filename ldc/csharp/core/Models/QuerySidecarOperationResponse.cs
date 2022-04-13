// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class QuerySidecarOperationResponse : TeaModel {
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

        // 是否成功
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // 是否结束
        [NameInMap("finished")]
        [Validation(Required=false)]
        public bool? Finished { get; set; }

        // 执行状态
        [NameInMap("operation_status")]
        [Validation(Required=false)]
        public string OperationStatus { get; set; }

        // 执行详情
        [NameInMap("target_processes")]
        [Validation(Required=false)]
        public List<string> TargetProcesses { get; set; }

        // 发布分组执行详情
        [NameInMap("process_detail_list")]
        [Validation(Required=false)]
        public List<SidecarOpsMachineGroup> ProcessDetailList { get; set; }

        // 扩展信息
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

    }

}
