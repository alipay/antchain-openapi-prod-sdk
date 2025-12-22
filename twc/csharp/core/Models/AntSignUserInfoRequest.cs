// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 法务电子签签署人信息
    public class AntSignUserInfoRequest : TeaModel {
        // signUserId
        [NameInMap("sign_user_id")]
        [Validation(Required=false)]
        public string SignUserId { get; set; }

        // 是否为我方（蚂蚁域）公司
        [NameInMap("our_corp")]
        [Validation(Required=true)]
        public bool? OurCorp { get; set; }

        // 签署文件列表（包含印模和签署区域）
        [NameInMap("ca_system_sign_file_request_list")]
        [Validation(Required=true)]
        public List<CaSystemSignFileRequest> CaSystemSignFileRequestList { get; set; }

        // 用户类型
        [NameInMap("sign_user_type")]
        [Validation(Required=true)]
        public string SignUserType { get; set; }

        // 签署人名称
        [NameInMap("signer_name")]
        [Validation(Required=true)]
        public string SignerName { get; set; }

        // 签署人证件类型
        [NameInMap("signer_cert_type")]
        [Validation(Required=true)]
        public string SignerCertType { get; set; }

        // 签署人证件号码
        [NameInMap("signer_cert_number")]
        [Validation(Required=true)]
        public string SignerCertNumber { get; set; }

        // 企业子类型
        [NameInMap("sign_sub_type")]
        [Validation(Required=false)]
        public string SignSubType { get; set; }

        // 签署方联系手机号
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 邮件联系地址
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 签署顺序
        [NameInMap("order")]
        [Validation(Required=false)]
        public long? Order { get; set; }

        // 是否自动签署
        // true：自动签署需传递坐标信息
        // false：非自动签署，不需要传递坐标信息，签署文件会发送给签署方签署
        [NameInMap("auto_sign")]
        [Validation(Required=true)]
        public bool? AutoSign { get; set; }

        // 签署方签署操作人签署时支持的印章来源类型目前支持上传公章(UPLOAD)、手写签名(PERSONAL)
        [NameInMap("seal_source_types")]
        [Validation(Required=false)]
        public List<string> SealSourceTypes { get; set; }

    }

}
