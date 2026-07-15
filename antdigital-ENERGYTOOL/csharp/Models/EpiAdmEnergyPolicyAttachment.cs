// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    // 附件详情
    public class EpiAdmEnergyPolicyAttachment : TeaModel {
        // 文件名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>文件名称.pdf</para>
        /// </summary>
        [NameInMap("filename")]
        [Validation(Required=false)]
        public string Filename { get; set; }

        // 文件下载地址
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://www.oss.com/download">https://www.oss.com/download</a></para>
        /// </summary>
        [NameInMap("fileurl")]
        [Validation(Required=false)]
        public string Fileurl { get; set; }

    }

}
