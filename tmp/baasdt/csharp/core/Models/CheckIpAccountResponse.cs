// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class CheckIpAccountResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 申请状态(0:运营审核中, 1:运营审核失败, 2:进件审核中, 3:进件审核失败, 4:进件审核成功)
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 运营审核失败原因
        [NameInMap("reject_reason")]
        [Validation(Required=false)]
        public string RejectReason { get; set; }

        // 是否需要支付宝签约(当为true,需要用户到支付宝进行签约) 签约引导说明: https://opendocs.alipay.com/open/00gfyb	
        [NameInMap("need_sign")]
        [Validation(Required=false)]
        public bool? NeedSign { get; set; }

    }

}
