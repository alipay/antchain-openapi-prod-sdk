// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BXPT_NEW.Models
{
    public class ExecSyncmultimodalDataprodResponse : TeaModel {
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

        // 业务返回值json
        [NameInMap("biz_result")]
        [Validation(Required=false)]
        public string BizResult { get; set; }

        // 是否计费标识
        [NameInMap("charge_flag")]
        [Validation(Required=false)]
        public string ChargeFlag { get; set; }

    }

}
