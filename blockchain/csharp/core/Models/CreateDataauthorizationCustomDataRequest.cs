// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateDataauthorizationCustomDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 区块链ID
        [NameInMap("blockchain_id")]
        [Validation(Required=true)]
        public string BlockchainId { get; set; }

        // 数据对象类别
        [NameInMap("category")]
        [Validation(Required=true)]
        public string Category { get; set; }

        // 数据对象ID，全局唯一
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 扩展参数
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public string ExtensionInfo { get; set; }

        // 数据对象名字
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 数据所有者ID
        [NameInMap("owner_id")]
        [Validation(Required=true)]
        public string OwnerId { get; set; }

        // 流程审批模版
        [NameInMap("process_template")]
        [Validation(Required=false)]
        public List<ProcessNode> ProcessTemplate { get; set; }

    }

}
