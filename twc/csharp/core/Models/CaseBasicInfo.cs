// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 自动进件案件基础信息
    public class CaseBasicInfo : TeaModel {
        // 案件租户id
        [NameInMap("biz_tenant_id")]
        [Validation(Required=true)]
        public string BizTenantId { get; set; }

        // 案件类型:LEASE：租赁，FINANCIAL：金融，OTHER：其他
        [NameInMap("case_type")]
        [Validation(Required=true)]
        public string CaseType { get; set; }

        // 标的金额（单位元）
        [NameInMap("amount")]
        [Validation(Required=false)]
        public string Amount { get; set; }

        // 业务来源主键
        [NameInMap("input_source_id")]
        [Validation(Required=true)]
        public string InputSourceId { get; set; }

        // 案件进件来源 
        [NameInMap("input_source")]
        [Validation(Required=true)]
        public string InputSource { get; set; }

        // 根据业务来源主键对应订单号下的租赁事实报告和证据列表页面的嵌入URL
        [NameInMap("case_ext")]
        [Validation(Required=false)]
        public string CaseExt { get; set; }

    }

}
