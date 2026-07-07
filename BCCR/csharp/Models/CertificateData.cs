// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 证书信息
    public class CertificateData : TeaModel {
        // 任务ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>任务ID</para>
        /// </summary>
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 版权用户UID
        /// <summary>
        /// <b>Example:</b>
        /// <para>版权用户UID</para>
        /// </summary>
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // DCI码
        /// <summary>
        /// <b>Example:</b>
        /// <para>DCI码</para>
        /// </summary>
        [NameInMap("dci_code")]
        [Validation(Required=true)]
        public string DciCode { get; set; }

        // 证书下载的链接地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>证书下载的链接地址</para>
        /// </summary>
        [NameInMap("certificate_url")]
        [Validation(Required=true)]
        public string CertificateUrl { get; set; }

    }

}
