// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateDataauthorizationDataEntityRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务系统数据对象唯一标示
        [NameInMap("biz_uid")]
        [Validation(Required=true)]
        public string BizUid { get; set; }

        // 区块链ID
        [NameInMap("blockchain_id")]
        [Validation(Required=false)]
        public string BlockchainId { get; set; }

        // 数据类别
        [NameInMap("category")]
        [Validation(Required=true, MaxLength=32)]
        public string Category { get; set; }

        // 数据模型ID
        [NameInMap("data_model_id")]
        [Validation(Required=false)]
        public string DataModelId { get; set; }

        // 扩展参数，标准JSON格式
        [NameInMap("extension_info")]
        [Validation(Required=false, MaxLength=2000)]
        public string ExtensionInfo { get; set; }

        // 数据名称
        [NameInMap("name")]
        [Validation(Required=true, MaxLength=64)]
        public string Name { get; set; }

        // 数据所有者ID
        [NameInMap("owner_id")]
        [Validation(Required=true, MaxLength=100)]
        public string OwnerId { get; set; }

        // 审批模版
        [NameInMap("process_template")]
        [Validation(Required=false)]
        public List<ProcessNode> ProcessTemplate { get; set; }

    }

}
