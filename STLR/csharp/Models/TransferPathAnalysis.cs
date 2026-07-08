// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 转型路径分析数据
    public class TransferPathAnalysis : TeaModel {
        // 所属领域
        /// <summary>
        /// <b>Example:</b>
        /// <para>系统能效提升</para>
        /// </summary>
        [NameInMap("field")]
        [Validation(Required=true)]
        public string Field { get; set; }

        // 目录编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.12</para>
        /// </summary>
        [NameInMap("index_number")]
        [Validation(Required=true)]
        public string IndexNumber { get; set; }

        // 目录内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>低温余热有机工质郎肯循环（ORC）发电</para>
        /// </summary>
        [NameInMap("index_content")]
        [Validation(Required=true)]
        public string IndexContent { get; set; }

        // 技术标准说明
        /// <summary>
        /// <b>Example:</b>
        /// <para>基于有机朗肯循环（ORC）原理，通过蒸发器回收95-300℃的热水、热液、蒸汽、烟气中的低温余热，通过向心涡轮和发电机将热量转换成高品质电能。参考标准《低温余热双循环发电装置》（GB/T 37819-2019）、《低温双循环余热回收利用装置性能测试方法》（GB/T 40286-2021）等。</para>
        /// </summary>
        [NameInMap("detail")]
        [Validation(Required=true)]
        public string Detail { get; set; }

        // 企业是否采取该路径
        /// <summary>
        /// <b>Example:</b>
        /// <para>长期目标</para>
        /// </summary>
        [NameInMap("target")]
        [Validation(Required=true)]
        public string Target { get; set; }

    }

}
