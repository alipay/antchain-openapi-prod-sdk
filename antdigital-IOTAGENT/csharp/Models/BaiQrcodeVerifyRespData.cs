// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 溯源防伪码质检响应数据
    public class BaiQrcodeVerifyRespData : TeaModel {
        // 鉴定结果
        // REAL：通过
        // UNABLE_IDENTIFY：无法鉴定
        /// <summary>
        /// <b>Example:</b>
        /// <para>REAL</para>
        /// </summary>
        [NameInMap("identification_result")]
        [Validation(Required=true)]
        public string IdentificationResult { get; set; }

        // 辅助识别结果码
        /// <summary>
        /// <b>Example:</b>
        /// <para>700</para>
        /// </summary>
        [NameInMap("identification_code")]
        [Validation(Required=true)]
        public string IdentificationCode { get; set; }

        // 辅助识别信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>二维码不符合标准</para>
        /// </summary>
        [NameInMap("identification_message")]
        [Validation(Required=true)]
        public string IdentificationMessage { get; set; }

        // 无法鉴定时的解决方案
        /// <summary>
        /// <b>Example:</b>
        /// <para>请重新印刷</para>
        /// </summary>
        [NameInMap("unable_identify_solution")]
        [Validation(Required=true)]
        public string UnableIdentifySolution { get; set; }

    }

}
