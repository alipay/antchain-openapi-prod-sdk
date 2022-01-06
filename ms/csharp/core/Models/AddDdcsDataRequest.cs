// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class AddDdcsDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 属性自增长 ID
        [NameInMap("attribute_id")]
        [Validation(Required=true)]
        public long? AttributeId { get; set; }

        // 需要发布的单元列表，英文逗号隔开，为空表示推送到所有单元
        [NameInMap("cells")]
        [Validation(Required=false)]
        public string Cells { get; set; }

        // 推送的属性值
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

        // 系统字段：环境实例 ID
        // 
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

    }

}
