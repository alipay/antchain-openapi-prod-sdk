// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class DetailFlowInstanceResponse : TeaModel {
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

        // 本次存证的存证主体信息
        [NameInMap("notary_user")]
        [Validation(Required=false)]
        public NotaryUser NotaryUser { get; set; }

        // 本次全流程的阶段存证详情列表
        [NameInMap("phase_detail_list")]
        [Validation(Required=false)]
        public List<PhaseDetail> PhaseDetailList { get; set; }

    }

}
