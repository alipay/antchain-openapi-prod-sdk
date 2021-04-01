// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartAuthVerifyCarinspectResponse : TeaModel {
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

        // 年检有效期止。
        [NameInMap("inspection_date")]
        [Validation(Required=false)]
        public string InspectionDate { get; set; }

        //  0：正常   1：逾期未检验  2：无法判断
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

    }

}
