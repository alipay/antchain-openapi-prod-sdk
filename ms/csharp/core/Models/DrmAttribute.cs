// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 资源属性
    public class DrmAttribute : TeaModel {
        // 属性名，与代码中的成员变量名一致
        [NameInMap("attribute_name")]
        [Validation(Required=false)]
        public string AttributeName { get; set; }

        // 资源id
        // 
        [NameInMap("data_id")]
        [Validation(Required=false)]
        public string DataId { get; set; }

        // 属性id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 节点名称，显示在树形菜单上用的
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 属性所属的资源
        [NameInMap("parent")]
        [Validation(Required=false)]
        public DrmResourceWithoutAttributes Parent { get; set; }

        // 父节点ID，冗余字段
        [NameInMap("parent_id")]
        [Validation(Required=false)]
        public long? ParentId { get; set; }

    }

}
