// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 查询全流程存证证据详情查询的请求信息
    public class NotaryFlowDetailQueryReq : TeaModel {
        // 全流程存证模板ID
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        // 全流程存证流程id
        [NameInMap("flow_id")]
        [Validation(Required=true)]
        public string FlowId { get; set; }

        // 链上证据包对应的链上交易Hash
        [NameInMap("chain_pack_tx_hash")]
        [Validation(Required=true)]
        public string ChainPackTxHash { get; set; }

        // 链上证据包授权码
        [NameInMap("authcode")]
        [Validation(Required=true)]
        public string Authcode { get; set; }

    }

}
