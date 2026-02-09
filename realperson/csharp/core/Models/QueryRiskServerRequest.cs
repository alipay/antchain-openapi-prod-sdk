// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class QueryRiskServerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备信息
        [NameInMap("device_info")]
        [Validation(Required=false)]
        public DeviceInfo DeviceInfo { get; set; }

        // 设备风险信息
        [NameInMap("device_risk_info")]
        [Validation(Required=false)]
        public DeviceRiskInfo DeviceRiskInfo { get; set; }

        // 视频文件
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
        [Validation(Required=false)]
        public string FileId { get; set; }

        // base64编码最佳人脸图，可加密
        [NameInMap("face_image")]
        [Validation(Required=true)]
        public string FaceImage { get; set; }

        // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
        [NameInMap("out_order_no")]
        [Validation(Required=true)]
        public string OutOrderNo { get; set; }

        // 标识应用程序名称
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 标识应用程序版本
        [NameInMap("app_version")]
        [Validation(Required=false)]
        public string AppVersion { get; set; }

        // 标识业务场景
        [NameInMap("scene_id")]
        [Validation(Required=false)]
        public string SceneId { get; set; }

        // 姓名，可加密
        [NameInMap("cert_name")]
        [Validation(Required=false)]
        public string CertName { get; set; }

        // 身份证号，可加密
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

        // 表示用户唯一id
        [NameInMap("uid")]
        [Validation(Required=false)]
        public string Uid { get; set; }

        // cert_name、cert_no两个字段的传入模式0：明文 1：密文
        [NameInMap("enc_type")]
        [Validation(Required=false)]
        public string EncType { get; set; }

        // 图片的传入加密模式 0：明文 1：AES加密
        [NameInMap("material_enc_type")]
        [Validation(Required=false)]
        public string MaterialEncType { get; set; }

        // 公钥加密后的密钥，用于传入的加密图片/视频
        [NameInMap("material_enc_token")]
        [Validation(Required=false)]
        public string MaterialEncToken { get; set; }

        // 端安全产品名
        [NameInMap("security_product_name")]
        [Validation(Required=true)]
        public string SecurityProductName { get; set; }

        // 调用蚂蚁终端安全或人脸保镖的token
        [NameInMap("security_product_token")]
        [Validation(Required=false)]
        public string SecurityProductToken { get; set; }

        // 端安全SDK版本
        [NameInMap("security_version")]
        [Validation(Required=false)]
        public string SecurityVersion { get; set; }

    }

}
