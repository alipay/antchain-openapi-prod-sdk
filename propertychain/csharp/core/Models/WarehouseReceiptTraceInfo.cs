// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 溯源信息
    public class WarehouseReceiptTraceInfo : TeaModel {
        // string (enum: PICK_UP, WEAK_ASSET, WEAK_ASSET_TRANSFER, WAREHOUSE_RECEIPT_TRANSFER, WAREHOUSE_RECEIPT_REGISTER, PLEDGE_APPLICATION, PLEDGE_RELEASE, WAREHOUSE_RECEIPT_CANCEL, WAREHOUSE_RECEIPT_UPDATE)
        [NameInMap("operate_type")]
        [Validation(Required=false)]
        public string OperateType { get; set; }

        // 操作标识
        [NameInMap("operate_type_desc")]
        [Validation(Required=false)]
        public string OperateTypeDesc { get; set; }

        // 操作时间
        [NameInMap("operate_time")]
        [Validation(Required=false)]
        public long? OperateTime { get; set; }

        // 区块链信息
        [NameInMap("blockchain_info")]
        [Validation(Required=false)]
        public BlockchainInfo BlockchainInfo { get; set; }

        // 操作主体
        [NameInMap("operator_name")]
        [Validation(Required=false)]
        public string OperatorName { get; set; }

        // string (enum: COMMIT, AGREE, REJECT, CREATE, START, PRE_ALLOC, ALLOC, UPLOAD, UPDATE, COMPLETE, CONFIRM, CONFIRM_COMMIT, CONFIRM_RECALL, TRIGGER, SPLIT, RECALL)
        [NameInMap("action_type")]
        [Validation(Required=false)]
        public string ActionType { get; set; }

        // 动作描述
        [NameInMap("action_desc")]
        [Validation(Required=false)]
        public string ActionDesc { get; set; }

        // 操作对象
        [NameInMap("operate_object")]
        [Validation(Required=false)]
        public string OperateObject { get; set; }

    }

}
