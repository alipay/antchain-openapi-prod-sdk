// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // 档案
    public class TestStu : TeaModel {
        // 567
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("card_info")]
        [Validation(Required=false)]
        public CardInfo CardInfo { get; set; }

        // 12
        /// <summary>
        /// <b>Example:</b>
        /// <para>档案号</para>
        /// </summary>
        [NameInMap("stu_no")]
        [Validation(Required=true)]
        public string StuNo { get; set; }

    }

}
