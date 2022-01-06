// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class AddDrmDrmdataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资源标识
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 推送目标Cell列表,英文逗号隔开
        [NameInMap("push_cells")]
        [Validation(Required=false)]
        public string PushCells { get; set; }

        // 推送目标类型
        [NameInMap("push_target_type")]
        [Validation(Required=false)]
        public string PushTargetType { get; set; }

        // 数据值
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
