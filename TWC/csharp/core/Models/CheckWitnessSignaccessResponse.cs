// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CheckWitnessSignaccessResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 有权限的印章id列表
        [NameInMap("access_seal_ids")]
        [Validation(Required=false)]
        public List<string> AccessSealIds { get; set; }

        // 审批数据
        [NameInMap("approval_datas")]
        [Validation(Required=false)]
        public List<WitnessApprovalData> ApprovalDatas { get; set; }

        // 错误码
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // 错误信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 签署票证
        [NameInMap("sign_ticket")]
        [Validation(Required=false)]
        public string SignTicket { get; set; }

    }

}
