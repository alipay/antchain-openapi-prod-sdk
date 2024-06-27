// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class CreateInnerMerchantpayexpandRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 公司信息
        [NameInMap("company_info")]
        [Validation(Required=true)]
        public CompanyInfo CompanyInfo { get; set; }

        // 法人信息
        [NameInMap("legal_info")]
        [Validation(Required=true)]
        public LegalInfo LegalInfo { get; set; }

        // 应用信息
        [NameInMap("application_info")]
        [Validation(Required=true)]
        public ApplicationInfo ApplicationInfo { get; set; }

        // 是否直接提交
        // SUBMITTED 直接提交
        // STAGE 暂存
        [NameInMap("submit")]
        [Validation(Required=true)]
        public string Submit { get; set; }

        // 进件模式
        // DIRECT(直连进件)
        // AGENT(代理进件)
        [NameInMap("expand_mode")]
        [Validation(Required=true)]
        public string ExpandMode { get; set; }

        // expand_mode=_AGENT_ 必填
        [NameInMap("sub_tenant_id")]
        [Validation(Required=false)]
        public string SubTenantId { get; set; }

        // 操作人名称
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 第一次暂存或保存可以不传，后端直接生成
        [NameInMap("pay_expand_id")]
        [Validation(Required=false)]
        public string PayExpandId { get; set; }

    }

}
