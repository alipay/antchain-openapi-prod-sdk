// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class SaveBusinessDepositResponse : TeaModel {
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

        // bizid+accountid+keyId/txHash 组成的唯一id，用户可以根据该id到服务中查询链上内容
        [NameInMap("deposit_id")]
        [Validation(Required=false)]
        public string DepositId { get; set; }

        // 是否存在成功
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 链上返回的txHash值
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

    }

}
