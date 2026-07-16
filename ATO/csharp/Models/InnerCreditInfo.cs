// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 内部使用接口资产凭证信息
    public class InnerCreditInfo : TeaModel {
        // 凭证内容id
        /// <summary>
        /// <b>Example:</b>
        /// <para>10000009000001811659604036991910</para>
        /// </summary>
        [NameInMap("content_id")]
        [Validation(Required=false)]
        public string ContentId { get; set; }

        // 资产凭证的类型，可支持：FILE(文件)、TEXT(文本)、JSON_TEXT(JSON文本)
        /// <summary>
        /// <b>Example:</b>
        /// <para>TEXT</para>
        /// </summary>
        [NameInMap("content_type")]
        [Validation(Required=false)]
        public string ContentType { get; set; }

        // 资产凭证名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>凭证材料001</para>
        /// </summary>
        [NameInMap("credit_name")]
        [Validation(Required=false)]
        public string CreditName { get; set; }

        // 凭证文件下载链接
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://xxxx.com/xxx.pdf">https://xxxx.com/xxx.pdf</a></para>
        /// </summary>
        [NameInMap("credit_file_url")]
        [Validation(Required=false)]
        public string CreditFileUrl { get; set; }

        // 上传的文本内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;内容:&quot;文本文本文本&quot;}</para>
        /// </summary>
        [NameInMap("credit_content")]
        [Validation(Required=false)]
        public string CreditContent { get; set; }

        // 凭证创建时间(yyyy-MM-dd HH:mm:ss)
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10 10:10:00</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

    }

}
