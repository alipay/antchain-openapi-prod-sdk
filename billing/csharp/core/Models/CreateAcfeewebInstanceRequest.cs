// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BILLING.Models
{
    public class CreateAcfeewebInstanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 出账验证主键id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 计量域code
        [NameInMap("domain_code")]
        [Validation(Required=true)]
        public string DomainCode { get; set; }

        // 计量域名称
        [NameInMap("domain_name")]
        [Validation(Required=true)]
        public string DomainName { get; set; }

        // 计量域版本
        [NameInMap("domain_version")]
        [Validation(Required=true)]
        public string DomainVersion { get; set; }

        // 业务产品code
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 业务产品名称
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 渠道产品code
        [NameInMap("service_code")]
        [Validation(Required=true)]
        public string ServiceCode { get; set; }

        // 渠道产品名称
        [NameInMap("service_name")]
        [Validation(Required=true)]
        public string ServiceName { get; set; }

        // 商品code
        [NameInMap("offer_code")]
        [Validation(Required=true)]
        public string OfferCode { get; set; }

        // 商品名称
        [NameInMap("offer_name")]
        [Validation(Required=true)]
        public string OfferName { get; set; }

        // 验证的计量数据
        [NameInMap("oms_data")]
        [Validation(Required=true)]
        public string OmsData { get; set; }

        // 计量数据业务幂等号
        [NameInMap("oms_biz_no")]
        [Validation(Required=true)]
        public string OmsBizNo { get; set; }

        // 缓存报文
        [NameInMap("verification_cache")]
        [Validation(Required=true)]
        public string VerificationCache { get; set; }

        // 缓存链接
        [NameInMap("verification_url")]
        [Validation(Required=true)]
        public string VerificationUrl { get; set; }

        // 审批流id
        [NameInMap("bpms_id")]
        [Validation(Required=true)]
        public string BpmsId { get; set; }

        // 配置报文
        [NameInMap("config_data")]
        [Validation(Required=true)]
        public string ConfigData { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 创建人
        [NameInMap("creator")]
        [Validation(Required=true)]
        public string Creator { get; set; }

        // 修改人
        [NameInMap("modifor")]
        [Validation(Required=true)]
        public string Modifor { get; set; }

    }

}
