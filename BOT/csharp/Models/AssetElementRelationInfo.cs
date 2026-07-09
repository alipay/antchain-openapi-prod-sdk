// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 要素关系信息
    public class AssetElementRelationInfo : TeaModel {
        // 来源要素ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>112233</para>
        /// </summary>
        [NameInMap("source_element_id")]
        [Validation(Required=true)]
        public string SourceElementId { get; set; }

        // 目标要素ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>112233</para>
        /// </summary>
        [NameInMap("target_element_id")]
        [Validation(Required=true)]
        public string TargetElementId { get; set; }

        // 关联类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("relation_type")]
        [Validation(Required=true)]
        public long? RelationType { get; set; }

        // 关联依据类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>NORMAL</para>
        /// </summary>
        [NameInMap("relation_dependency_type")]
        [Validation(Required=false)]
        public string RelationDependencyType { get; set; }

        // 关联依据
        /// <summary>
        /// <b>Example:</b>
        /// <para>{...}</para>
        /// </summary>
        [NameInMap("relation_dependency")]
        [Validation(Required=false)]
        public string RelationDependency { get; set; }

        // 项目ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>112233</para>
        /// </summary>
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 来源要素名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>来源要素</para>
        /// </summary>
        [NameInMap("source_element_name")]
        [Validation(Required=true)]
        public string SourceElementName { get; set; }

        // 目标要素名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>目标要素</para>
        /// </summary>
        [NameInMap("target_element_name")]
        [Validation(Required=true)]
        public string TargetElementName { get; set; }

    }

}
