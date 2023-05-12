// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 事务详情
    public class TransactionInfo : TeaModel {
        // Saga模式返回3, tcc-local 返回 1， tcc-remote 返回2
        [NameInMap("action_mode")]
        [Validation(Required=false)]
        public long? ActionMode { get; set; }

        // 业务码
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 业务id
        [NameInMap("business_id")]
        [Validation(Required=true)]
        public string BusinessId { get; set; }

        // 结束时间
        [NameInMap("end_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // 发起方ip
        [NameInMap("initiator_ip")]
        [Validation(Required=true)]
        public string InitiatorIp { get; set; }

        // 发起方名称
        [NameInMap("initiator_name")]
        [Validation(Required=true)]
        public string InitiatorName { get; set; }

        // 最近修改时间
        [NameInMap("modify_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ModifyTime { get; set; }

        // 参与者id列表
        [NameInMap("participator_ids")]
        [Validation(Required=true)]
        public List<string> ParticipatorIds { get; set; }

        // 开始时间
        [NameInMap("start_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 事务状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 事务id
        [NameInMap("tx_id")]
        [Validation(Required=true)]
        public string TxId { get; set; }

    }

}
