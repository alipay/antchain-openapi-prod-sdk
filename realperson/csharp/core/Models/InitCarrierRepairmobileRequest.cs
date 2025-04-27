// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class InitCarrierRepairmobileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
        [NameInMap("outer_order_no")]
        [Validation(Required=true)]
        public string OuterOrderNo { get; set; }

        // 流程ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，用于流程串联。
        [NameInMap("process_id")]
        [Validation(Required=true)]
        public string ProcessId { get; set; }

        // 运营商类型，取值如下：
        // CHINA_TELECOM：中国电信
        // CHINA_MOBILE：中国移动
        // CHINA_UNICOM：中国联通
        [NameInMap("carrier")]
        [Validation(Required=true)]
        public string Carrier { get; set; }

        // 入参加密模式：
        // "0"（默认值）：不加密；
        // "2"：身份证号、曾用手机号字段都需填写SHA256加密后的字符串。
        // 默认未"0"
        [NameInMap("encrypt_type")]
        [Validation(Required=false)]
        public string EncryptType { get; set; }

        // 失联修复身份证号，使用入参加密模式加密
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 用户姓名，明文
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 曾用手机号码，使用入参加密模式加密
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

    }

}
