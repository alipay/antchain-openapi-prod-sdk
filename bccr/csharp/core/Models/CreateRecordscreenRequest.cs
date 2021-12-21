// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class CreateRecordscreenRequest : TeaModel {
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

        // 预校验网址和预打开网页（不能大于10条），如果automatic为true 则必填
        [NameInMap("url")]
        [Validation(Required=false)]
        public List<string> Url { get; set; }

        // 取证类型 具体见附录 RecordScreenType
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 取证服务器地域 具体见附录 RecordScreenArea
        [NameInMap("area")]
        [Validation(Required=true)]
        public string Area { get; set; }

        // 定制录屏桌面识别码，目前取值只有默认值：DEFAULT
        [NameInMap("screen_code")]
        [Validation(Required=false)]
        public string ScreenCode { get; set; }

        // 最大录屏时间，maxTimeInMin不能小于6min，不能大于300min
        [NameInMap("max_time_in_min")]
        [Validation(Required=true)]
        public long? MaxTimeInMin { get; set; }

        // 服务器进入ready状态，指定时间未开始进入abort状态的等待时间，单位为分钟，默认1min，waitInMin不能小于1，不能大于10min
        [NameInMap("wait_in_min")]
        [Validation(Required=false)]
        public long? WaitInMin { get; set; }

        // 当所选地域无机器资源时，是否使用其它地域 目前取值只有默认值：FORBID
        [NameInMap("cross_region")]
        [Validation(Required=false)]
        public string CrossRegion { get; set; }

        // ip地域取值 目前取值只有默认值：ANY
        [NameInMap("ip_type")]
        [Validation(Required=false)]
        public string IpType { get; set; }

        // 回调地址
        [NameInMap("callback_url")]
        [Validation(Required=false)]
        public string CallbackUrl { get; set; }

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

        // 取证人证件类型 具体见附录CertType
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 企业法人代表姓名(如果certType为BUSINESS_LICENSE 则必传)
        [NameInMap("legal_person_name")]
        [Validation(Required=false)]
        public string LegalPersonName { get; set; }

        // 企业法人代表身份证号(如果certType为BUSINESS_LICENSE 则必传)
        [NameInMap("legal_person_no")]
        [Validation(Required=false)]
        public string LegalPersonNo { get; set; }

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

        // 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

    }

}
