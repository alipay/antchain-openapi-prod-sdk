// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    public class QueryRealtytradeSigningResponse : TeaModel {
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

        // 签署流程状态，包括值为：Initial、Pending、Ready、Started、Finish
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 签署结果，包括值为：2-完成，所有签署人完成签署，3-撤销，发起方撤销签署任务，5-过期（签署截止日到期后触发），7-拒签 
        [NameInMap("signing_result")]
        [Validation(Required=false)]
        public string SigningResult { get; set; }

        // 合同信息列表，列表描述本流程中的多个文件详情，只有签署结果为完成时才有合同的归档文件下载路径：archived_file_url
        [NameInMap("contract_list")]
        [Validation(Required=false)]
        public List<Contract> ContractList { get; set; }

    }

}
