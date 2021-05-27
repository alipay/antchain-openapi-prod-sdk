// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 申请信息
    public class RegisterWhReceiptHeader : TeaModel {
        // 注册申请单ID
        [NameInMap("register_wh_receipt_id")]
        [Validation(Required=false)]
        public string RegisterWhReceiptId { get; set; }

        // 注册仓单状态【 NONE：无效状态，WAITING：待审核，AGREED：审核同意，REJECTED：审核拒绝，CANCELED：已取消，WAITING_PRE_ALLOC_POSITION：待预分配仓位，WAITING_TRANSACTION_IN：待入库，TRANSACTION_IN：入库中，FINISHED_TRANSACTION_IN：已入库/待确认，CONFIRMED_TRANSACTION_IN：完成入库，INTERRUPTION：已中断，ALL：所有状态】
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 入库中时的子状态，只有入库中才有值【ALLOCATED_LOCATION：已调用分配仓位信息接口，TRANSACTION_IN_INFO：已调用添加入库信息接口，LOCATION_INFO：已调用补充仓位占用信息接口】
        [NameInMap("in_storing_status")]
        [Validation(Required=false)]
        public string InStoringStatus { get; set; }

        // 更新时间
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public long? UpdateTime { get; set; }

    }

}
