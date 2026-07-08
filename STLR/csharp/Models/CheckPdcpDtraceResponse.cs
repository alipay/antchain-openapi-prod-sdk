// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class CheckPdcpDtraceResponse : TeaModel {
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

        // 存证操作内容
        [NameInMap("deposit_data")]
        [Validation(Required=false)]
        public DataDepositInfo DepositData { get; set; }

        // 区块链编号
        [NameInMap("block_number")]
        [Validation(Required=false)]
        public long? BlockNumber { get; set; }

        // 数据存证方式
        [NameInMap("deposit_type")]
        [Validation(Required=false)]
        public string DepositType { get; set; }

        // 链上数据
        [NameInMap("on_chain_data")]
        [Validation(Required=false)]
        public string OnChainData { get; set; }

        // 链下数据
        [NameInMap("off_chain_data")]
        [Validation(Required=false)]
        public string OffChainData { get; set; }

        // 链上-链下数据是否一致
        [NameInMap("consistent")]
        [Validation(Required=false)]
        public bool? Consistent { get; set; }

    }

}
