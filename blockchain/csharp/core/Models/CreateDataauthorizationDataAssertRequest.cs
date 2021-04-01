// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateDataauthorizationDataAssertRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务系统数据唯一标示
        [NameInMap("biz_uid")]
        [Validation(Required=true)]
        public string BizUid { get; set; }

        // 区块链ID
        [NameInMap("blockchain_id")]
        [Validation(Required=false)]
        public string BlockchainId { get; set; }

        // 资产类别
        [NameInMap("category")]
        [Validation(Required=true)]
        public string Category { get; set; }

        // 数据模型ID
        [NameInMap("data_model_id")]
        [Validation(Required=false)]
        public string DataModelId { get; set; }

        // 扩展参数
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public string ExtensionInfo { get; set; }

        // 资产名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 所有者ID
        [NameInMap("owner_id")]
        [Validation(Required=true)]
        public string OwnerId { get; set; }

        // 审批流程模版
        [NameInMap("process_template")]
        [Validation(Required=false)]
        public List<ProcessNode> ProcessTemplate { get; set; }

    }

}
