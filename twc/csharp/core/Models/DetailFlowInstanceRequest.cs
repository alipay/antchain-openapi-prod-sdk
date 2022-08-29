// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class DetailFlowInstanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 流程id
        [NameInMap("flow_id")]
        [Validation(Required=true)]
        public string FlowId { get; set; }

        // 链上证据包对应的链上交易Hash，通过twc.notary.flow.evidence.query(全流程证据包生成进度查询)获取
        [NameInMap("chain_pack_tx_hash")]
        [Validation(Required=true)]
        public string ChainPackTxHash { get; set; }

        // 链上证据包授权码，不传默认按照当前租户校验，填写则按照授权租户检查
        [NameInMap("auth_code")]
        [Validation(Required=false)]
        public string AuthCode { get; set; }

    }

}
