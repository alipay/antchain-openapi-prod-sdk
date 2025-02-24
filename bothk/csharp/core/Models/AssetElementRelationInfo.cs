// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOTHK.Models
{
    // 要素关系信息
    public class AssetElementRelationInfo : TeaModel {
        // 来源要素ID
        [NameInMap("source_element_id")]
        [Validation(Required=true)]
        public string SourceElementId { get; set; }

        // 目标要素ID
        [NameInMap("target_element_id")]
        [Validation(Required=true)]
        public string TargetElementId { get; set; }

        // 关联类型
        [NameInMap("relation_type")]
        [Validation(Required=true)]
        public long? RelationType { get; set; }

        // 关联依据类型
        [NameInMap("relation_dependency_type")]
        [Validation(Required=false)]
        public string RelationDependencyType { get; set; }

        // 关联依据
        [NameInMap("relation_dependency")]
        [Validation(Required=false)]
        public string RelationDependency { get; set; }

        // 项目ID
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 来源要素名称
        [NameInMap("source_element_name")]
        [Validation(Required=true)]
        public string SourceElementName { get; set; }

        // 目标要素名称
        [NameInMap("target_element_name")]
        [Validation(Required=true)]
        public string TargetElementName { get; set; }

    }

}
