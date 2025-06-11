// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class CreateScreenshotNewRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 取证名称（最长128个字符）
        [NameInMap("name")]
        [Validation(Required=true, MaxLength=128)]
        public string Name { get; set; }

        // 取证备注（最长512个字符）
        [NameInMap("memo")]
        [Validation(Required=false, MaxLength=512)]
        public string Memo { get; set; }

        // 取证地址（最长2048个字符）
        [NameInMap("url")]
        [Validation(Required=true, MaxLength=2048)]
        public string Url { get; set; }

        // 公证处Id
        [NameInMap("org_id")]
        [Validation(Required=false)]
        public string OrgId { get; set; }

        // 取证人证件名称
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

        // 取证人证件号码
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 取证人证件类型
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 法人代表姓名(如果certType为BUSINESS_LICENSE 则必传)
        [NameInMap("legal_person_name")]
        [Validation(Required=false)]
        public string LegalPersonName { get; set; }

        // 法人代表身份证号(如果certType为BUSINESS_LICENSE 则必传)
        [NameInMap("legal_person_no")]
        [Validation(Required=false)]
        public string LegalPersonNo { get; set; }

        // 法人证件类型
        [NameInMap("legal_person_type")]
        [Validation(Required=false)]
        public string LegalPersonType { get; set; }

        // 企业用户取证人姓名(如果certType为BUSINESS_LICENSE 则必传)
        [NameInMap("agent_name")]
        [Validation(Required=false)]
        public string AgentName { get; set; }

        // 企业用户取证人身份证号(如果certType为BUSINESS_LICENSE 则必传)
        [NameInMap("agent_no")]
        [Validation(Required=false)]
        public string AgentNo { get; set; }

        // 取证人电话号码，生成公证处证书需要，公证处需要作登记 格式范例：(86-573)2651630 或 (86)13738258505
        [NameInMap("phone_num")]
        [Validation(Required=false)]
        public string PhoneNum { get; set; }

        // 代理信息
        [NameInMap("proxy_info")]
        [Validation(Required=false)]
        public ProxyData ProxyInfo { get; set; }

        // 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符
        [NameInMap("client_token")]
        [Validation(Required=true, MaxLength=64)]
        public string ClientToken { get; set; }

    }

}
