// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class CreateRealpersonFacevrfRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 实人认证方案枚举
        // APP（客户端android/ios方案）
        // H5（网页）
        // ZFB（支付宝客户端H5方案）
        [NameInMap("solution_type")]
        [Validation(Required=true)]
        public string SolutionType { get; set; }

        // 真实姓名
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

        // 证件号码
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 身份信息来源类型
        // IDENTITY_CARD（身份证）
        // RESIDENCE_HK_MC（港澳居民居住证）
        // RESIDENCE_TAIWAN（台湾居民居住证）
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 【solution_type=ZFB使用】
        // reserve（保存活体人脸 默认值）
        // never（不保存活体人脸）
        [NameInMap("face_reserve_strategy")]
        [Validation(Required=false)]
        public string FaceReserveStrategy { get; set; }

        // 【solution_type=ZFB使用】
        // 认证成功后需要跳转的地址
        [NameInMap("return_url")]
        [Validation(Required=false)]
        public string ReturnUrl { get; set; }

    }

}
