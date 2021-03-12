// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 数据授权服务数据对象结构体
    public class DataEntity : TeaModel {
        // 授权状态
        [NameInMap("auth_status")]
        [Validation(Required=false)]
        public string AuthStatus { get; set; }

        // 业务系统唯一标示
        [NameInMap("biz_uid")]
        [Validation(Required=false, MaxLength=64)]
        public string BizUid { get; set; }

        // 区块链ID
        [NameInMap("blockchain_id")]
        [Validation(Required=false)]
        public string BlockchainId { get; set; }

        // 数据类别
        [NameInMap("category")]
        [Validation(Required=true, MaxLength=32)]
        public string Category { get; set; }

        // 数据ID
        [NameInMap("data_id")]
        [Validation(Required=true, MaxLength=100)]
        public string DataId { get; set; }

        // 数据模型ID
        [NameInMap("data_model_id")]
        [Validation(Required=false)]
        public string DataModelId { get; set; }

        // 扩展信息，标准JSON格式
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public string ExtensionInfo { get; set; }

        // 数据名称
        [NameInMap("name")]
        [Validation(Required=true, MaxLength=64)]
        public string Name { get; set; }

        // 数据所有者ID
        [NameInMap("owner_id")]
        [Validation(Required=true, MaxLength=100)]
        public string OwnerId { get; set; }

        // 流程节点信息
        [NameInMap("process_template")]
        [Validation(Required=false)]
        public List<ProcessNode> ProcessTemplate { get; set; }

        // 数据状态
        [NameInMap("status")]
        [Validation(Required=false, MaxLength=16)]
        public string Status { get; set; }

        // 创建时间
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

        // 修改时间
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public long? UpdateTime { get; set; }

    }

}
