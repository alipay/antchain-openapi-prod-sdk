// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class ListSidecarInstanceResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // sidecar版本实例列表
        [NameInMap("sidecar_version_instances")]
        [Validation(Required=false)]
        public List<SidecarVersionInstance> SidecarVersionInstances { get; set; }

        // 总记录条数
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public long? TotalCount { get; set; }

    }

}
