// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class DeleteDrmDrmattributesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 属性名称
        [NameInMap("attribute_name")]
        [Validation(Required=false)]
        public string AttributeName { get; set; }

        // 资源id
        [NameInMap("data_id")]
        [Validation(Required=false)]
        public string DataId { get; set; }

        // 属性id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 描述字段
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 父节点信息
        [NameInMap("parent")]
        [Validation(Required=false)]
        public string Parent { get; set; }

        // 父节点ID，冗余字段
        [NameInMap("parent_id")]
        [Validation(Required=false)]
        public string ParentId { get; set; }

    }

}
