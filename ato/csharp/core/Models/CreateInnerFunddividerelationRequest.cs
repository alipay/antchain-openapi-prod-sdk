// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class CreateInnerFunddividerelationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户8位id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 第一次暂存或提交可以不传，由后端生成
        [NameInMap("relation_id")]
        [Validation(Required=false)]
        public string RelationId { get; set; }

        // 分账公司名称
        [NameInMap("company_name")]
        [Validation(Required=false)]
        public string CompanyName { get; set; }

        // 分账公司社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 分账合同或协议
        [NameInMap("contract_files")]
        [Validation(Required=false)]
        public List<FileInfo> ContractFiles { get; set; }

        // 分账关系说明
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

        // 分账方企业pid
        [NameInMap("alipay_pid")]
        [Validation(Required=false)]
        public string AlipayPid { get; set; }

        // 分账方企业支付宝账号
        [NameInMap("alipay_account")]
        [Validation(Required=false)]
        public string AlipayAccount { get; set; }

        // 是否直接提交
        // SUBMITTED 直接提交
        // STAGE 暂存
        [NameInMap("submit")]
        [Validation(Required=true)]
        public string Submit { get; set; }

        // 操作人名称
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

    }

}
