// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 组织单元树结构体
    public class OrganizationUnitTree : TeaModel {
        // 组织单元编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxx</para>
        /// </summary>
        [NameInMap("organization_no")]
        [Validation(Required=true)]
        public string OrganizationNo { get; set; }

        // 组织单元名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxxx</para>
        /// </summary>
        [NameInMap("organization_name")]
        [Validation(Required=true)]
        public string OrganizationName { get; set; }

        // 从根到直接父级的组织编码链；根节点为空
        /// <summary>
        /// <b>Example:</b>
        /// <para>[xxx,xxx]</para>
        /// </summary>
        [NameInMap("parent_organization_no_list")]
        [Validation(Required=false)]
        public List<string> ParentOrganizationNoList { get; set; }

        // 直接父级组织名称；根节点为空
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxxx</para>
        /// </summary>
        [NameInMap("parent_organization_name")]
        [Validation(Required=false)]
        public string ParentOrganizationName { get; set; }

        // 最后更新时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxxx</para>
        /// </summary>
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public string GmtModified { get; set; }

        // 重复结构体
        /// <summary>
        /// <b>Example:</b>
        /// <para>[{}]</para>
        /// </summary>
        [NameInMap("children")]
        [Validation(Required=true)]
        public List<OrganizationUnitSubTree> Children { get; set; }

    }

}
