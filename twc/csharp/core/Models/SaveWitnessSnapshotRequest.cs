// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class SaveWitnessSnapshotRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 快照数据
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // 快照步骤，最大20长度，START-开始，UPDATE-更新，FINISH-结束，允许自定义
        [NameInMap("step")]
        [Validation(Required=true)]
        public string Step { get; set; }

        // 快照步骤描述，最大40长度
        [NameInMap("step_description")]
        [Validation(Required=true)]
        public string StepDescription { get; set; }

        // 见证流程id
        [NameInMap("witness_flow_id")]
        [Validation(Required=true)]
        public string WitnessFlowId { get; set; }

        // 发起请求的实例应用ID
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // 发起请求的鉴权token
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

    }

}
