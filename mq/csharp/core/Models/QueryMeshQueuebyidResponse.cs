// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class QueryMeshQueuebyidResponse : TeaModel {
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

        // 关联应用
        [NameInMap("asso_app")]
        [Validation(Required=false)]
        public string AssoApp { get; set; }

        // 通道名
        [NameInMap("channel")]
        [Validation(Required=false)]
        public string Channel { get; set; }

        // 队列管理器ip
        [NameInMap("ip")]
        [Validation(Required=false)]
        public string Ip { get; set; }

        // 队列管理器名
        [NameInMap("manager")]
        [Validation(Required=false)]
        public string Manager { get; set; }

        // 队列名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 队列管理器端口
        [NameInMap("port")]
        [Validation(Required=false)]
        public string Port { get; set; }

        // 状态码
        [NameInMap("state")]
        [Validation(Required=false)]
        public long? State { get; set; }

        // 类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
