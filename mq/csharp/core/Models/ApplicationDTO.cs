// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 应用页面
    public class ApplicationDTO : TeaModel {
        // 创建时间
        [NameInMap("gmt_created")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreated { get; set; }

        // 应用id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 应用名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 服务端get队列
        [NameInMap("pub_get_queue")]
        [Validation(Required=false)]
        public string PubGetQueue { get; set; }

        // 服务端put队列
        [NameInMap("pub_put_queue")]
        [Validation(Required=false)]
        public string PubPutQueue { get; set; }

        // 服务端开关
        [NameInMap("pub_rpc_status")]
        [Validation(Required=false)]
        public long? PubRpcStatus { get; set; }

        // 客户端get队列
        [NameInMap("sub_get_queue")]
        [Validation(Required=false)]
        public string SubGetQueue { get; set; }

        // 客户端put队列
        [NameInMap("sub_put_queue")]
        [Validation(Required=false)]
        public string SubPutQueue { get; set; }

        // rpc分流比例
        [NameInMap("sub_rpc_scale")]
        [Validation(Required=false)]
        public long? SubRpcScale { get; set; }

        // 服务类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
