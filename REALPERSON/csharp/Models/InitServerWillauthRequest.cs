// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class InitServerWillauthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // string
        /// <summary>
        /// <para>待上传文件</para>
        /// </summary>
        [NameInMap("fileObject")]
        [Validation(Required=false)]
        public Stream FileObject { get; set; }

        /// <summary>
        /// <para>待上传文件名</para>
        /// </summary>
        [NameInMap("fileObjectName")]
        [Validation(Required=false)]
        public string FileObjectName { get; set; }

        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 场景id
        [NameInMap("scene_id")]
        [Validation(Required=true)]
        public string SceneId { get; set; }

        // 身份证姓名
        [NameInMap("cert_name")]
        [Validation(Required=false)]
        public string CertName { get; set; }

        // 身份证号
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

        // 加密方式
        [NameInMap("enc_type")]
        [Validation(Required=false)]
        public string EncType { get; set; }

        // 无源比对图片base64
        [NameInMap("facial_picture_ref")]
        [Validation(Required=false)]
        public string FacialPictureRef { get; set; }

        // 业务回跳地址
        [NameInMap("return_url")]
        [Validation(Required=false)]
        public string ReturnUrl { get; set; }

        // 业务请求唯一标识
        [NameInMap("outer_order_no")]
        [Validation(Required=true)]
        public string OuterOrderNo { get; set; }

        // 扩展参数
        [NameInMap("extern_param")]
        [Validation(Required=false)]
        public string ExternParam { get; set; }

        // 身份信息来源类型，当前仅支持证件（CERT_INFO）
        [NameInMap("identity_type")]
        [Validation(Required=false)]
        public string IdentityType { get; set; }

        // 证件类型，当前仅支持身份证类型证件，包括：二代身份证、港澳居住证、台湾居住证（IDENTITY_CARD）
        [NameInMap("cert_type")]
        [Validation(Required=false)]
        public string CertType { get; set; }

        // 要进行活体检测的类型
        [NameInMap("model")]
        [Validation(Required=false)]
        public string Model { get; set; }

        // 图片/视频的传入加密模式
        [NameInMap("material_enc_type")]
        [Validation(Required=false)]
        public string MaterialEncType { get; set; }

        // RSA/SM2公钥加密后的AES/SM4密钥（Base64编码），用于传入的加密图片/视频。
        [NameInMap("material_enc_token")]
        [Validation(Required=false)]
        public string MaterialEncToken { get; set; }

    }

}
