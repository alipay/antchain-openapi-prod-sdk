// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 电子券批次信息
    public class CouponCollection : TeaModel {
        // 批次ID
        [NameInMap("collection_id")]
        [Validation(Required=true)]
        public string CollectionId { get; set; }

        // 电子券批次名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 批次发行方
        [NameInMap("issuer")]
        [Validation(Required=true)]
        public string Issuer { get; set; }

        // 批次前缀
        [NameInMap("coupon_number_prefix")]
        [Validation(Required=true)]
        public string CouponNumberPrefix { get; set; }

        // 批次管理员链上ID
        [NameInMap("coupon_admin_account")]
        [Validation(Required=true)]
        public string CouponAdminAccount { get; set; }

        // 批次管理员租户ID
        [NameInMap("coupon_admin_tenant_id")]
        [Validation(Required=true)]
        public string CouponAdminTenantId { get; set; }

        // 批次过期观察员链上ID
        [NameInMap("expire_monitor_account")]
        [Validation(Required=true)]
        public string ExpireMonitorAccount { get; set; }

        // 批次过期观察员租户ID
        [NameInMap("expire_monitor_tenant_id")]
        [Validation(Required=true)]
        public string ExpireMonitorTenantId { get; set; }

        // 是否记名
        [NameInMap("need_registered")]
        [Validation(Required=true)]
        public bool? NeedRegistered { get; set; }

        // 是否创建时记名
        [NameInMap("need_pre_registered")]
        [Validation(Required=true)]
        public bool? NeedPreRegistered { get; set; }

    }

}
