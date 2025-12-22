// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class ApplyInnerAntesignResponse : TeaModel {
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

        // 用印流程受理流水号
        [NameInMap("sign_flow_id")]
        [Validation(Required=false)]
        public string SignFlowId { get; set; }

        // 业务流水号
        [NameInMap("biz_no")]
        [Validation(Required=false)]
        public string BizNo { get; set; }

        // 子任务信息
        [NameInMap("sub_ant_sign_result_list")]
        [Validation(Required=false)]
        public List<SubAntSignResult> SubAntSignResultList { get; set; }

    }

}
