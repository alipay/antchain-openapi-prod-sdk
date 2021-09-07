// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class SyncInnerProvisionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 自增id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public long? GmtModified { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 租户名称
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // 产品码
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 是否正式账号
        [NameInMap("is_official")]
        [Validation(Required=false)]
        public bool? IsOfficial { get; set; }

        // 业务分类
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public long? BizId { get; set; }

        // 是否法院节点
        [NameInMap("legal_account")]
        [Validation(Required=false)]
        public bool? LegalAccount { get; set; }

        // 服务状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 商品开通实例id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 订单渠道
        [NameInMap("order_channel")]
        [Validation(Required=false)]
        public long? OrderChannel { get; set; }

    }

}
