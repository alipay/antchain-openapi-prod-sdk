// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 静态数据模块详情
    public class StaticDataModuleDetail : TeaModel {
        // 描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>企业</para>
        /// </summary>
        [NameInMap("property_text")]
        [Validation(Required=true)]
        public string PropertyText { get; set; }

        // 商户类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>01</para>
        /// </summary>
        [NameInMap("property_value")]
        [Validation(Required=true)]
        public string PropertyValue { get; set; }

        // 图标
        /// <summary>
        /// <b>Example:</b>
        /// <para>图标</para>
        /// </summary>
        [NameInMap("icon")]
        [Validation(Required=false)]
        public string Icon { get; set; }

        // 置灰图标
        /// <summary>
        /// <b>Example:</b>
        /// <para>置灰图标</para>
        /// </summary>
        [NameInMap("grey_icon")]
        [Validation(Required=false)]
        public string GreyIcon { get; set; }

        // 叶子结点，目前存的一级类目下的二级类目
        /// <summary>
        /// <b>Example:</b>
        /// <para>[{&quot;propertyText&quot;:&quot;123&quot;,&quot;propertyValue&quot;:&quot;123&quot;}]</para>
        /// </summary>
        [NameInMap("children_detail_list")]
        [Validation(Required=false)]
        public string ChildrenDetailList { get; set; }

        // 是否有叶子结点
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("has_children")]
        [Validation(Required=false)]
        public bool? HasChildren { get; set; }

    }

}
