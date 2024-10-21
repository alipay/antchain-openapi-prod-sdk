// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SP.Models
{
    public class PreopenSpProductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("product_access_code")]
        [Validation(Required=false)]
        public string ProductAccessCode { get; set; }

        // 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 产品码 全局唯一
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 	
        // 产品实例Id
        [NameInMap("instance_ids")]
        [Validation(Required=true)]
        public List<string> InstanceIds { get; set; }

        // 	
        // 具体规格配置信息（JSON格式）会按照key进行排序
        [NameInMap("specification")]
        [Validation(Required=true)]
        public string Specification { get; set; }

        // 部分产品创建时需要非生产规格的数据（JSON格式） 比如：ECS生产需要账号、密码等 会按照key进行排序
        [NameInMap("custom_data")]
        [Validation(Required=false)]
        public string CustomData { get; set; }

        // 实例需要创建到租户的环境信息
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

        // 	
        // 实例需要创建到租户的地域
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

        // 	
        // 实例需要创建到租户的机房，可以有多个（冗灾场景）
        [NameInMap("zones")]
        [Validation(Required=false)]
        public List<string> Zones { get; set; }

        // 	
        // 购买产品的租户ID，格式为2088XXXXXXXXXXXX
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址
        [NameInMap("access_code")]
        [Validation(Required=true)]
        public string AccessCode { get; set; }

        // 商业业务信息，如签约的项目ID、合同ID、合作伙伴ID等信息
        [NameInMap("business_data")]
        [Validation(Required=false)]
        public string BusinessData { get; set; }

    }

}
