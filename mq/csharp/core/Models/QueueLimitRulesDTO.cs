// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 限流规则信息
    public class QueueLimitRulesDTO : TeaModel {
        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 限流规则id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 限流算法
        [NameInMap("l_algorithm")]
        [Validation(Required=true)]
        public string LAlgorithm { get; set; }

        // 限流后操作
        [NameInMap("l_operation")]
        [Validation(Required=true)]
        public string LOperation { get; set; }

        // 方法
        [NameInMap("meth")]
        [Validation(Required=true)]
        public string Meth { get; set; }

        // 限流规则名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 队列id
        [NameInMap("queue_id")]
        [Validation(Required=true)]
        public long? QueueId { get; set; }

        // 运行模式
        [NameInMap("r_mode")]
        [Validation(Required=true)]
        public string RMode { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 应用名
        [NameInMap("app")]
        [Validation(Required=true)]
        public string App { get; set; }

    }

}
