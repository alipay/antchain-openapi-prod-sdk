// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class CreateIpCopyrightRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 【暂不支持中文】文件名称
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 文件oss地址
        [NameInMap("file_url")]
        [Validation(Required=true)]
        public string FileUrl { get; set; }

        // 文件类型，IMAGE：图片文件；TEXT：文本文件；VIDEO：视屏；AUDIO：音频；ZIP：压缩包；FILE：其他文件
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

        // 【需要真实的】版权方法人证件名称
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

        // 证件类型
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 【需要真实的】版权方法人证件号码
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 是否创建证书，此时默认选true
        [NameInMap("create_certificate")]
        [Validation(Required=true)]
        public bool? CreateCertificate { get; set; }

        // 证书类型，公证处证书，值为NotaryOffice
        [NameInMap("certificate_type")]
        [Validation(Required=false)]
        public string CertificateType { get; set; }

        // 是否创建证据包，默认选否，如果没有创建公证书，不支持证据包
        [NameInMap("certificate_package")]
        [Validation(Required=false)]
        public bool? CertificatePackage { get; set; }

        // 公证处ID，默认为LUJIANG，鹭江公证处
        [NameInMap("org_id")]
        [Validation(Required=false)]
        public string OrgId { get; set; }

        // 电话号码，生成公证处证书需要，格式范例，(86-573)2651630或(86)13738258505
        [NameInMap("phone_num")]
        [Validation(Required=false)]
        public string PhoneNum { get; set; }

        // 备注，最长不超过512字符
        [NameInMap("memo")]
        [Validation(Required=false)]
        public string Memo { get; set; }

    }

}
