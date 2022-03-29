// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class QueryMeshApplicationbynameResponse : TeaModel {
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

        // 创建日期
        [NameInMap("gmt_created")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreated { get; set; }

        // 应用id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 应用名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 服务端get队列
        [NameInMap("pub_get_queue")]
        [Validation(Required=false)]
        public string PubGetQueue { get; set; }

        // 服务端put队列
        [NameInMap("pub_put_queue")]
        [Validation(Required=false)]
        public string PubPutQueue { get; set; }

        // 服务端rpc开关
        [NameInMap("pub_rpc_status")]
        [Validation(Required=false)]
        public long? PubRpcStatus { get; set; }

        // 返回状态
        [NameInMap("state")]
        [Validation(Required=false)]
        public long? State { get; set; }

        // 客户端get队列
        [NameInMap("sub_get_queue")]
        [Validation(Required=false)]
        public string SubGetQueue { get; set; }

        // 客户端put队列
        [NameInMap("sub_put_queue")]
        [Validation(Required=false)]
        public string SubPutQueue { get; set; }

        // 客户端rpc比例
        [NameInMap("sub_rpc_scale")]
        [Validation(Required=false)]
        public long? SubRpcScale { get; set; }

        // 服务类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
