// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // eKYT人脸核身结果数据
    public class FaceVerifyResultData : TeaModel {
        // 请求唯一标识Id
        /// <summary>
        /// <b>Example:</b>
        /// <para>111111111111111</para>
        /// </summary>
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 认证是否通过
        /// <summary>
        /// <b>Example:</b>
        /// <para>T、F 或 null</para>
        /// </summary>
        [NameInMap("passed")]
        [Validation(Required=true)]
        public string Passed { get; set; }

        // faceOcclusion:面部遮挡信息；true为有面部遮挡，false为无面部遮挡
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;{&quot;faceOcclusion&quot;:false}&quot;</para>
        /// </summary>
        [NameInMap("material_info")]
        [Validation(Required=true)]
        public string MaterialInfo { get; set; }

    }

}
