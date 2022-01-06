// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class AddDrmDrmattributesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 属性名称
        [NameInMap("attribute_name")]
        [Validation(Required=true)]
        public string AttributeName { get; set; }

        // 服务id
        [NameInMap("data_id")]
        [Validation(Required=false)]
        public string DataId { get; set; }

        // 资源属性id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 描述字段
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 父节点数据
        [NameInMap("parent")]
        [Validation(Required=false)]
        public string Parent { get; set; }

        // 父节点ID，冗余字段
        [NameInMap("parent_id")]
        [Validation(Required=true)]
        public long? ParentId { get; set; }

    }

}
