// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    // 签署人信息
    public class CaSignUserInfoRequest : TeaModel {
        // 用户类型个人:PERSON 机构:ORG
        [NameInMap("sign_user_type")]
        [Validation(Required=true)]
        public string SignUserType { get; set; }

        // 签署方名称，个人传真实姓名：张三 机构传机构正确的名称：xxx责任有限公司
        [NameInMap("signer_name")]
        [Validation(Required=true)]
        public string SignerName { get; set; }

        // 授权签署时的签署人证件类型,签署方证件类型 CRED_PSN_CH_IDCARD(大陆身份证) CRED_ORG_USCC(统一社会信用代码)
        [NameInMap("signer_cert_type")]
        [Validation(Required=true)]
        public string SignerCertType { get; set; }

        // 签署方证件号码,签署方证件号码： 个人传递身份证件号 企业传递统一社会信用编码
        [NameInMap("signer_cert_number")]
        [Validation(Required=true)]
        public string SignerCertNumber { get; set; }

        // 企业子类型,signUserType为org时必选 企业子类型 * BUS("BUS", "企业"), * SINGLE("SINGLE", "个体工商户"), * GOV("GOV", "党政机关"), * INST("INST", "事业单位"), * COMMON("COMMON", "社会组织"), * OTHER("OTHER", "其他组织")
        [NameInMap("sign_sub_type")]
        [Validation(Required=false)]
        public string SignSubType { get; set; }

        // 是否指定授权人签署
        [NameInMap("authorized")]
        [Validation(Required=false)]
        public string Authorized { get; set; }

        // authorized=1时必填,签署方名称
        [NameInMap("auth_signer_name")]
        [Validation(Required=false)]
        public string AuthSignerName { get; set; }

        // authorized=1 时必填,授权签署时的签署人证件类型
        [NameInMap("auth_signer_cert_type")]
        [Validation(Required=false)]
        public string AuthSignerCertType { get; set; }

        // authorized=1 时必填,授权签署方证件号码
        [NameInMap("auth_signer_cert_number")]
        [Validation(Required=false)]
        public string AuthSignerCertNumber { get; set; }

        // 手机号，用于发送签署短信
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 邮箱联系方式
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 签署顺序，默认-1无签署顺序
        [NameInMap("order")]
        [Validation(Required=false)]
        public string Order { get; set; }

        // 是否自动签署,ture为需要自动签署，false为手动签署
        [NameInMap("auto_sign")]
        [Validation(Required=true)]
        public bool? AutoSign { get; set; }

        // 签署文件列表（包含印模和签署区域）
        [NameInMap("system_sign_file_request_list")]
        [Validation(Required=true)]
        public List<CaSystemSignFileRequest> SystemSignFileRequestList { get; set; }

    }

}
