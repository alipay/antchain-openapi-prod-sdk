// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // xr通行证券池分页返回
    public class XrTicketPoolItem : TeaModel {
        // 业务类型
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

        // 通行证名称
        [NameInMap("xr_ticket_pool_name")]
        [Validation(Required=true)]
        public string XrTicketPoolName { get; set; }

        // 资源id
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public long? ResourceId { get; set; }

        // 有效期
        [NameInMap("valid_time")]
        [Validation(Required=true)]
        public string ValidTime { get; set; }

        // 体验时长
        [NameInMap("test_time")]
        [Validation(Required=true)]
        public long? TestTime { get; set; }

        // 通行证状态：EXPIRED：已过期  VALID：有效  SALED：已出售
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 判断已发放数量>0(USED：已使用)  判断已发放数量=0(NOT_USED：未使用)
        [NameInMap("use_status")]
        [Validation(Required=true)]
        public string UseStatus { get; set; }

        // 资源名称
        [NameInMap("resource_name")]
        [Validation(Required=true)]
        public string ResourceName { get; set; }

        // 设备集合
        [NameInMap("xr_apps")]
        [Validation(Required=false)]
        public string XrApps { get; set; }

        // 券池最大票数
        [NameInMap("max_pool_count")]
        [Validation(Required=true)]
        public long? MaxPoolCount { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 核销类型
        [NameInMap("xr_verification_type")]
        [Validation(Required=true)]
        public string XrVerificationType { get; set; }

        // 剩余可用券数量
        [NameInMap("surplus_count")]
        [Validation(Required=true)]
        public long? SurplusCount { get; set; }

        // 已发放数量 （总数-剩余数量）
        [NameInMap("issued_count")]
        [Validation(Required=true)]
        public long? IssuedCount { get; set; }

    }

}
