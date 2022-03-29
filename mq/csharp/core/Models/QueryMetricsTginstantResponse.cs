// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class QueryMetricsTginstantResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 当前 Group 死信
        [NameInMap("dlq")]
        [Validation(Required=false)]
        public long? Dlq { get; set; }

        // 当前消息积压
        [NameInMap("msg_backlog")]
        [Validation(Required=false)]
        public long? MsgBacklog { get; set; }

        // 每分钟消费数据大小
        [NameInMap("recv_bpm")]
        [Validation(Required=false)]
        public long? RecvBpm { get; set; }

        // 每分钟拉请求数量
        [NameInMap("recv_ppm")]
        [Validation(Required=false)]
        public long? RecvPpm { get; set; }

        // 消费 TPM
        [NameInMap("recv_tpm")]
        [Validation(Required=false)]
        public long? RecvTpm { get; set; }

        // 每分钟发送消息大小
        [NameInMap("send_bpm")]
        [Validation(Required=false)]
        public long? SendBpm { get; set; }

        // 发送 TPM
        [NameInMap("send_tpm")]
        [Validation(Required=false)]
        public long? SendTpm { get; set; }

    }

}
