// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 出证的公证书信息
    public class NotaryInfo : TeaModel {
        // 公证书编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>公证书编号</para>
        /// </summary>
        [NameInMap("notarial_deed_no")]
        [Validation(Required=true)]
        public string NotarialDeedNo { get; set; }

        // 电子公证书文件路径
        /// <summary>
        /// <b>Example:</b>
        /// <para>电子公证书文件路径</para>
        /// </summary>
        [NameInMap("notary_paper_path")]
        [Validation(Required=true)]
        public string NotaryPaperPath { get; set; }

        // 公证书出证日期（yyyy-MM-dd）
        /// <summary>
        /// <b>Example:</b>
        /// <para>2022-10-17</para>
        /// </summary>
        [NameInMap("notary_time")]
        [Validation(Required=true)]
        public string NotaryTime { get; set; }

    }

}
