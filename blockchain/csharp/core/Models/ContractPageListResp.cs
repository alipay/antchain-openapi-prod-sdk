// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 合约列表
    public class ContractPageListResp : TeaModel {
        // 服务ID
        [NameInMap("service_id")]
        [Validation(Required=false)]
        public string ServiceId { get; set; }

        // 合约名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 合约类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 创建时间
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

    }

}
