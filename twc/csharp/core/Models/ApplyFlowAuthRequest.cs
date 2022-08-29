// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class ApplyFlowAuthRequest : TeaModel {
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

        // 授权时间长度，单位为s，默认72小时，即259200s，有效期为接口调用时间开始，接口调用时间+授权时间长度的时间为结束时间，例如当前时间为2022-08-18 00:00:00，授权时间长度为86400s(即一天)，则授权截止时间为2022-08-19 00:00:00
        [NameInMap("auth_time_period")]
        [Validation(Required=false)]
        public long? AuthTimePeriod { get; set; }

    }

}
