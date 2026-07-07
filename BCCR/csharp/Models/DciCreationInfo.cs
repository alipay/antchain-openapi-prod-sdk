// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // dci作品创作信息
    public class DciCreationInfo : TeaModel {
        // 作品创作性质
        /// <summary>
        /// <b>Example:</b>
        /// <para>ORIGINAL</para>
        /// </summary>
        [NameInMap("creation_nature")]
        [Validation(Required=true)]
        public string CreationNature { get; set; }

        // 创作完成日期
        /// <summary>
        /// <b>Example:</b>
        /// <para>yyyy-MM-dd</para>
        /// </summary>
        [NameInMap("creation_completion_date")]
        [Validation(Required=true)]
        public string CreationCompletionDate { get; set; }

        // 创作完成地点
        /// <summary>
        /// <b>Example:</b>
        /// <para>杭州</para>
        /// </summary>
        [NameInMap("creation_completion_place")]
        [Validation(Required=false)]
        public string CreationCompletionPlace { get; set; }

        // 作品创作地点地区编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>110101</para>
        /// </summary>
        [NameInMap("creation_completion_code")]
        [Validation(Required=true)]
        public string CreationCompletionCode { get; set; }

    }

}
