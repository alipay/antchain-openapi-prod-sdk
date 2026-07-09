// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CreateDeviceRelationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 主设备链上id
        [NameInMap("subject_chain_device_id")]
        [Validation(Required=true)]
        public string SubjectChainDeviceId { get; set; }

        // 关系谓语，目前的取值范围：SUB_DEVICE（子设备）
        [NameInMap("predicate")]
        [Validation(Required=true)]
        public string Predicate { get; set; }

        // 关联设备链上id列表
        [NameInMap("object_chain_device_id_list")]
        [Validation(Required=true)]
        public List<string> ObjectChainDeviceIdList { get; set; }

    }

}
