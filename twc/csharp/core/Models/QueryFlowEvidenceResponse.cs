// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryFlowEvidenceResponse : TeaModel {
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

        // 链上证据包对应的链上交易Hash，只有resultMsg为success时才返回
        [NameInMap("chain_pack_tx_hash")]
        [Validation(Required=false)]
        public string ChainPackTxHash { get; set; }

        // 暂不支持，预留字段，链下证据包对应的可下载链接，有效期3小时，只有申请时选择了链下证据包、查询入参evidencePackType选择LocalEvidencePack及resultMsg为success时才返回
        [NameInMap("local_pack_url")]
        [Validation(Required=false)]
        public string LocalPackUrl { get; set; }

    }

}
