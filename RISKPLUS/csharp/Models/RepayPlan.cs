// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 还款计划
    public class RepayPlan : TeaModel {
        // 期次号，还款期次序号
        /// <summary>
        /// <b>Example:</b>
        /// <para>2023343380112</para>
        /// </summary>
        [NameInMap("term_no")]
        [Validation(Required=true)]
        public string TermNo { get; set; }

        // 本期开始时间，格式：yyyy-MM-dd
        /// <summary>
        /// <b>Example:</b>
        /// <para>2000-01-01</para>
        /// </summary>
        [NameInMap("term_start")]
        [Validation(Required=false)]
        public string TermStart { get; set; }

        // 本期结束时间，格式：yyyy-MM-dd
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999-01-01</para>
        /// </summary>
        [NameInMap("term_end")]
        [Validation(Required=true)]
        public string TermEnd { get; set; }

        // 本期本金，单位：元，2 位小数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000.00</para>
        /// </summary>
        [NameInMap("term_prin")]
        [Validation(Required=true)]
        public string TermPrin { get; set; }

        // 本期利息，单位：元，2 位小数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000.00</para>
        /// </summary>
        [NameInMap("term_int")]
        [Validation(Required=true)]
        public string TermInt { get; set; }

    }

}
