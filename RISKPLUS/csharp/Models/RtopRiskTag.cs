// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 监管风险标签
    public class RtopRiskTag : TeaModel {
        // 标签ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>CMN00010</para>
        /// </summary>
        [NameInMap("tag_id")]
        [Validation(Required=true)]
        public string TagId { get; set; }

        // 标签名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>网站失联</para>
        /// </summary>
        [NameInMap("tag_name")]
        [Validation(Required=true)]
        public string TagName { get; set; }

        // 标签类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>CMN</para>
        /// </summary>
        [NameInMap("tag_type")]
        [Validation(Required=false)]
        public string TagType { get; set; }

        // 标签文本
        /// <summary>
        /// <b>Example:</b>
        /// <para>网站失联</para>
        /// </summary>
        [NameInMap("tag_text")]
        [Validation(Required=false)]
        public string TagText { get; set; }

        // 线索概览
        /// <summary>
        /// <b>Example:</b>
        /// <para>企业已列入经营异常名录</para>
        /// </summary>
        [NameInMap("tag_clue")]
        [Validation(Required=false)]
        public string TagClue { get; set; }

        // 线索明细类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>01</para>
        /// </summary>
        [NameInMap("clue_detail_type")]
        [Validation(Required=false)]
        public string ClueDetailType { get; set; }

        // 线索明细
        /// <summary>
        /// <b>Example:</b>
        /// <para>通过登记的住所或者经营场所无法联系</para>
        /// </summary>
        [NameInMap("tag_clue_detail")]
        [Validation(Required=false)]
        public string TagClueDetail { get; set; }

    }

}
