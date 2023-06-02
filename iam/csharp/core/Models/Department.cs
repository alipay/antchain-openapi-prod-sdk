// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    // 部门
    public class Department : TeaModel {
        // 部门唯一代码
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 部门名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 部门描述信息
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 父部门 code
        [NameInMap("parent_code")]
        [Validation(Required=false)]
        public string ParentCode { get; set; }

        // 父部门一直到根节点的路径，例如：DP0000000001/DP0000000002
        [NameInMap("parent_path")]
        [Validation(Required=false)]
        public string ParentPath { get; set; }

        // 企业 id
        [NameInMap("customer_id")]
        [Validation(Required=false)]
        public string CustomerId { get; set; }

        // 是否为叶子结点
        [NameInMap("is_leaf")]
        [Validation(Required=false)]
        public bool? IsLeaf { get; set; }

        // 创建时间，ISO8601格式
        [NameInMap("creation_time")]
        [Validation(Required=false)]
        public string CreationTime { get; set; }

        // 更新时间，ISO8601格式
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public string UpdateTime { get; set; }

    }

}
