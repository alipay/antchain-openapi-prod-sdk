// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 标签流转历史
    public class LabelTrace : TeaModel {
        // 场景码
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

        // 租户
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

        // 标签id
        [NameInMap("label_id")]
        [Validation(Required=false)]
        public string LabelId { get; set; }

        // 标签状态
        [NameInMap("label_status")]
        [Validation(Required=true)]
        public string LabelStatus { get; set; }

        // 资产Id
        [NameInMap("asset_id")]
        [Validation(Required=false)]
        public string AssetId { get; set; }

        // 操作员
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 标签拥有者
        [NameInMap("owner")]
        [Validation(Required=false)]
        public string Owner { get; set; }

        // 标签所处流程
        [NameInMap("process")]
        [Validation(Required=false)]
        public string Process { get; set; }

        // 标签操作
        [NameInMap("action")]
        [Validation(Required=false)]
        public string Action { get; set; }

        // 操作时间
        [NameInMap("operate_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string OperateTime { get; set; }

        // 操作设备
        [NameInMap("operate_device")]
        [Validation(Required=false)]
        public string OperateDevice { get; set; }

        // 操作内容
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 链上哈希
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 上链时间
        [NameInMap("tx_time")]
        [Validation(Required=false)]
        public string TxTime { get; set; }

        // 区块链高度
        [NameInMap("block_number")]
        [Validation(Required=false)]
        public long? BlockNumber { get; set; }

        // 请求ID
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        // 上链失败的错误码
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 上链失败的错误信息
        [NameInMap("error_msg")]
        [Validation(Required=false)]
        public string ErrorMsg { get; set; }

        // 是否上链成功
        [NameInMap("is_success")]
        [Validation(Required=false)]
        public bool? IsSuccess { get; set; }

    }

}
