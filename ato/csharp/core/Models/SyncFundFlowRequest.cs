// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SyncFundFlowRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 商户统一社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 资方统一社会信用代码
        [NameInMap("fund_id")]
        [Validation(Required=true)]
        public string FundId { get; set; }

        // 电子签署流程ID, 业务方唯一id，每一个签署流程唯一确定一个flowId
        [NameInMap("flow_id")]
        [Validation(Required=true)]
        public string FlowId { get; set; }

        // 合同待签署url
        [NameInMap("sign_url")]
        [Validation(Required=true)]
        public string SignUrl { get; set; }

        // 合同类型
        // TRANSFER(传授信合同)、AUTHORIZATION(授权函)、CREDIT_UTILIZATION(用信合同)、OTHER(其他)
        [NameInMap("contract_type")]
        [Validation(Required=true)]
        public string ContractType { get; set; }

        // 合同名称，资方可自行命名，传授信合同/征信授权函/保理合同/其他
        [NameInMap("contract_name")]
        [Validation(Required=true)]
        public string ContractName { get; set; }

        // json格式 拓展信息 由资方自行推送补充内容，例如签署最晚时间、签署要求等
        [NameInMap("extend_info")]
        [Validation(Required=true)]
        public string ExtendInfo { get; set; }

        // 商户租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

    }

}
