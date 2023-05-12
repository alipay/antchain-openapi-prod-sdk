// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 悬挂事务恢复详情
    public class Correction : TeaModel {
        // 分支事务上下文
        [NameInMap("action_context")]
        [Validation(Required=true)]
        public string ActionContext { get; set; }

        // 参与者名称
        [NameInMap("action_name")]
        [Validation(Required=true)]
        public string ActionName { get; set; }

        // 1：提交，2：回滚
        [NameInMap("action_type")]
        [Validation(Required=true)]
        public long? ActionType { get; set; }

        // 主事务上下文
        [NameInMap("activity_context")]
        [Validation(Required=true)]
        public string ActivityContext { get; set; }

        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 记录id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 0 已提交  4 已执行
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 是否同步主账务；0、不同步，1、同步
        [NameInMap("sync_acctrans")]
        [Validation(Required=true)]
        public long? SyncAcctrans { get; set; }

        // 是否同步统一支付；0、不同步，1同步
        [NameInMap("sync_paycore")]
        [Validation(Required=true)]
        public long? SyncPaycore { get; set; }

        // tracer上下文
        [NameInMap("tracer_context")]
        [Validation(Required=false)]
        public string TracerContext { get; set; }

        // 事务id
        [NameInMap("tx_id")]
        [Validation(Required=true)]
        public string TxId { get; set; }

    }

}
