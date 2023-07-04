// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class DetailAapApplicationinstanceResponse : TeaModel {
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

        // 应用名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 镜像
        [NameInMap("image")]
        [Validation(Required=false)]
        public string Image { get; set; }

        // 副本数
        [NameInMap("replicas")]
        [Validation(Required=false)]
        public long? Replicas { get; set; }

        // 容器详情
        [NameInMap("pod_instances")]
        [Validation(Required=false)]
        public List<ContainerInstance> PodInstances { get; set; }

        // 应用版本
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

    }

}
