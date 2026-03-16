// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerFundasssetpackagepromiseplanRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资产包id
        [NameInMap("asset_package_id")]
        [Validation(Required=true)]
        public string AssetPackageId { get; set; }

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

        // PROMISE_PLAN 履约计划页面
        // ASSET_PACKAGE_DETAIL 资产包详情页面
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // trace_id
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

        // 生成方式，
        // AI：智能体；
        // MANUL：人工。
        // source=ASSET_PACKAGE_DETAIL，禁止传该参数
        // source=PROMISE_PLAN，必传该参数
        [NameInMap("generate_method")]
        [Validation(Required=false)]
        public string GenerateMethod { get; set; }

    }

}
