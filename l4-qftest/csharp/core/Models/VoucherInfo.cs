// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QFTEST.Models
{
    // 券信息
    public class VoucherInfo : TeaModel {
        // 券id
        [NameInMap("voucher_id")]
        [Validation(Required=true)]
        public string VoucherId { get; set; }

        // 2088id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 产品编码
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 资产编码
        [NameInMap("assets_code")]
        [Validation(Required=true)]
        public string AssetsCode { get; set; }

        // 券名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 券模板ID
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        // 发行人id
        [NameInMap("publisher_user_id")]
        [Validation(Required=true)]
        public string PublisherUserId { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 券生效时间
        [NameInMap("gmt_active")]
        [Validation(Required=true)]
        public string GmtActive { get; set; }

        // 券失效时间
        [NameInMap("gmt_expired")]
        [Validation(Required=true)]
        public string GmtExpired { get; set; }

        // 展期
        [NameInMap("gmt_extend")]
        [Validation(Required=true)]
        public string GmtExtend { get; set; }

        // 面额
        [NameInMap("total_amount")]
        [Validation(Required=true)]
        public string TotalAmount { get; set; }

        // 门槛金额
        [NameInMap("floor_amount")]
        [Validation(Required=true)]
        public string FloorAmount { get; set; }

        // 总次数
        [NameInMap("total_count")]
        [Validation(Required=true)]
        public long? TotalCount { get; set; }

        // 可用次数
        [NameInMap("available_count")]
        [Validation(Required=true)]
        public long? AvailableCount { get; set; }

        // 已使用次数
        [NameInMap("used_count")]
        [Validation(Required=true)]
        public long? UsedCount { get; set; }

        // 券描述
        [NameInMap("voucher_description")]
        [Validation(Required=true)]
        public string VoucherDescription { get; set; }

        // 券模板扩展信息
        [NameInMap("extend_template_info")]
        [Validation(Required=true)]
        public string ExtendTemplateInfo { get; set; }

        // 扩展信息
        [NameInMap("extend_info")]
        [Validation(Required=true)]
        public string ExtendInfo { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public string GmtModified { get; set; }

        // 业务类型
        [NameInMap("biz_code")]
        [Validation(Required=true)]
        public string BizCode { get; set; }

        // 收银台展示分组
        [NameInMap("group_code")]
        [Validation(Required=true)]
        public string GroupCode { get; set; }

        // 收银台展示分组名称
        [NameInMap("group_code_name")]
        [Validation(Required=true)]
        public string GroupCodeName { get; set; }

    }

}
