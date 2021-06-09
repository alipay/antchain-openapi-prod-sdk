// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class ApplyInsuranceStockinRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 入库交易流水号，保持唯一；
        // 格式为 yyyyMMdd_身份标识_其他编码。
        // 系统会根据该流水号做防重、幂等判断逻辑。
        // 当极端场景中（接口超时），客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
        [NameInMap("trade_no")]
        [Validation(Required=true, MaxLength=50)]
        public string TradeNo { get; set; }

        // 入库单号，可参考格式：年月日+唯一字符
        [NameInMap("stockin_no")]
        [Validation(Required=true, MaxLength=50)]
        public string StockinNo { get; set; }

        // 入库时间，格式：yyyy-MM-dd HH:mm:ss
        [NameInMap("stockin_date")]
        [Validation(Required=true)]
        public string StockinDate { get; set; }

        // 时区	
        [NameInMap("timezone")]
        [Validation(Required=true, MaxLength=16)]
        public string Timezone { get; set; }

        // 仓库代码
        [NameInMap("repository_code")]
        [Validation(Required=true, MaxLength=50)]
        public string RepositoryCode { get; set; }

        // 客户代码
        [NameInMap("customer_code")]
        [Validation(Required=true, MaxLength=50)]
        public string CustomerCode { get; set; }

        // 保单号,国内起运时投保产生的保单号
        [NameInMap("policy_no")]
        [Validation(Required=false, MaxLength=64)]
        public string PolicyNo { get; set; }

        // 入库货物列表
        [NameInMap("stockin_cargos")]
        [Validation(Required=true)]
        public List<StockinCargo> StockinCargos { get; set; }

    }

}
