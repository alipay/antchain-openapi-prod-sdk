// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class BatchcreateWorkersBaseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 项目编号
        [NameInMap("project_code")]
        [Validation(Required=true)]
        public string ProjectCode { get; set; }

        // 农民工基本信息
        [NameInMap("worker_list")]
        [Validation(Required=true)]
        public List<WorkersBaseInfo> WorkerList { get; set; }

    }

}
