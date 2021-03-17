// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    public class StartRealtytradeSigningResponse : TeaModel {
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

        // 签署流程 ID
        [NameInMap("process_id")]
        [Validation(Required=false)]
        public string ProcessId { get; set; }

        // 签署中的多个合同文件信息
        [NameInMap("contract_list")]
        [Validation(Required=false)]
        public List<Contract> ContractList { get; set; }

    }

}
