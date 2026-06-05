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
        /// 待上传文件
        /// </summary>
        [NameInMap("fileObject")]
        [Validation(Required=false)]
        public Stream FileObject { get; set; }

        /// <summary>
        /// 待上传文件名
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
        [NameInMap("face_picture_ref")]
        [Validation(Required=false)]
        public string FacePictureRef { get; set; }

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

    }

}
