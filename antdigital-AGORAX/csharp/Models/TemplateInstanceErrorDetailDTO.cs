// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 证书颁发校验错误描述
    public class TemplateInstanceErrorDetailDTO : TeaModel {
        // 当前错误类型的错误行数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1-5000</para>
        /// </summary>
        [NameInMap("error_num")]
        [Validation(Required=true)]
        public long? ErrorNum { get; set; }

        // 出错数据抽样
        /// <summary>
        /// <b>Example:</b>
        /// <para>[“xxx“, “xxxx“]</para>
        /// </summary>
        [NameInMap("samples")]
        [Validation(Required=true)]
        public List<string> Samples { get; set; }

        // 出错列，从0开始
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("error_column_index")]
        [Validation(Required=true)]
        public long? ErrorColumnIndex { get; set; }

        // 当前错误类型的描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>身份证号格式不正确</para>
        /// </summary>
        [NameInMap("error_description")]
        [Validation(Required=true)]
        public string ErrorDescription { get; set; }

    }

}
