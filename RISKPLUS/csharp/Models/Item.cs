// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 批量样本三要素
    public class Item : TeaModel {
        // 样本唯一id
        /// <summary>
        /// <b>Example:</b>
        /// <para>7ef15c83-57b4-4932-9180-35b11b102075</para>
        /// </summary>
        [NameInMap("sample_id")]
        [Validation(Required=true)]
        public string SampleId { get; set; }

        // 小写加密身份证（身份证如果有X，要大写再生成MD5）
        /// <summary>
        /// <b>Example:</b>
        /// <para>51db170b113f8c57533ae28605f2b76b</para>
        /// </summary>
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 手机号加密
        /// <summary>
        /// <b>Example:</b>
        /// <para>077e5fc68135bd8e8223a094029d4cee</para>
        /// </summary>
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 回溯日期（yyyyMMdd格式）
        /// <summary>
        /// <b>Example:</b>
        /// <para>20260620</para>
        /// </summary>
        [NameInMap("sample_back_date")]
        [Validation(Required=false)]
        public string SampleBackDate { get; set; }

    }

}
