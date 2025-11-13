// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class RenderInnerFundmngmerchantpromiseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资方租户id
        [NameInMap("fund_tenant_id")]
        [Validation(Required=true)]
        public string FundTenantId { get; set; }

        // 商户履约计划excel文件
        [NameInMap("file_info")]
        [Validation(Required=true)]
        public FileInfo FileInfo { get; set; }

        // traceid
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

        // 资方社会统一信用代码
        [NameInMap("fund_id")]
        [Validation(Required=true)]
        public string FundId { get; set; }

        // 商户租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 商户社会统一信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 商户履约起始期数
        [NameInMap("pay_start_term_index")]
        [Validation(Required=true)]
        public long? PayStartTermIndex { get; set; }

        // 融资模式 
        // 供应链金融: SUPPLY_CHAIN_FINANCE 
        // 自定义还款: DEFAULT
        [NameInMap("fund_mode")]
        [Validation(Required=true)]
        public string FundMode { get; set; }

    }

}
