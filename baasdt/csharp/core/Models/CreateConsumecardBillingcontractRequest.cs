// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class CreateConsumecardBillingcontractRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础请求结构
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequest BaseRequest { get; set; }

        // 购买数字商品服务平台的租户ID
        [NameInMap("platform_tenant_id")]
        [Validation(Required=true)]
        public string PlatformTenantId { get; set; }

        // 认证平台ID 本期支付宝用户ID
        [NameInMap("certification_id")]
        [Validation(Required=true)]
        public string CertificationId { get; set; }

        // 企业名称 企业营业执照名称
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 企业简称 默认企业营业执照名称，可自定义
        [NameInMap("company_short_name")]
        [Validation(Required=true)]
        public string CompanyShortName { get; set; }

        // 身份信息 金融机构/非金融机构
        [NameInMap("identity")]
        [Validation(Required=true)]
        public string Identity { get; set; }

        // 统一信用社会代码
        [NameInMap("usci")]
        [Validation(Required=true)]
        public string Usci { get; set; }

        // 客户编号（业务系统） 平台业务系统IP
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 营业执照地址
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 说明商家收款原因-字数中文500字以内（例如ETC服务,加油卡服务）
        [NameInMap("service_content")]
        [Validation(Required=true)]
        public string ServiceContent { get; set; }

    }

}
