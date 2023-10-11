// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 合同文件信息
    public class BclContractFileInfo : TeaModel {
        // 文件OSS Id
        [NameInMap("oss_file_id")]
        [Validation(Required=true, MaxLength=64)]
        public string OssFileId { get; set; }

        // 买家用户签署区信息
        [NameInMap("user_sign_fields")]
        [Validation(Required=true)]
        public List<BclSignField> UserSignFields { get; set; }

        // 租赁商家签署区信息
        [NameInMap("merchant_sign_fields")]
        [Validation(Required=false)]
        public List<BclSignField> MerchantSignFields { get; set; }

        // 合同模板填充项内容扩展字段:
        // 以key:value传入，JSON对象模板签署链路，不能传"  "或空"{}"，k-v模式，k和v都必须有。
        // 当订单创建选择是模板签署时，该字段必填。
        [NameInMap("simple_form_fields")]
        [Validation(Required=false, MaxLength=2048)]
        public string SimpleFormFields { get; set; }

    }

}
