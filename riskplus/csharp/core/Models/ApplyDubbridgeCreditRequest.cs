// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ApplyDubbridgeCreditRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础信息
        [NameInMap("personal_info")]
        [Validation(Required=true)]
        public PersonalInfo PersonalInfo { get; set; }

        // 资产方用户唯一标识
        [NameInMap("open_id")]
        [Validation(Required=true)]
        public string OpenId { get; set; }

        // 订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 居住信息
        [NameInMap("borrower_live_info")]
        [Validation(Required=false)]
        public LiveInfo BorrowerLiveInfo { get; set; }

        // 工作信息
        [NameInMap("borrower_emp_info")]
        [Validation(Required=false)]
        public JobInfo BorrowerEmpInfo { get; set; }

        // 产品编号
        [NameInMap("prod_no")]
        [Validation(Required=false)]
        public string ProdNo { get; set; }

        // 风险数据对象json字符串
        [NameInMap("risk_data")]
        [Validation(Required=true)]
        public string RiskData { get; set; }

        // 借款用途
        [NameInMap("loan_reason")]
        [Validation(Required=false)]
        public string LoanReason { get; set; }

        // 资料文件
        [NameInMap("materials")]
        [Validation(Required=false)]
        public List<Material> Materials { get; set; }

        // 导流平台
        [NameInMap("traffic_platform")]
        [Validation(Required=false)]
        public string TrafficPlatform { get; set; }

        // 流量名称
        [NameInMap("traffic_source_name")]
        [Validation(Required=false)]
        public string TrafficSourceName { get; set; }

        // 广告位标志
        [NameInMap("traffic_ad_id")]
        [Validation(Required=false)]
        public string TrafficAdId { get; set; }

        // 预留
        [NameInMap("traffic_mkt_id")]
        [Validation(Required=false)]
        public string TrafficMktId { get; set; }

        // 预留
        [NameInMap("click_id")]
        [Validation(Required=false)]
        public string ClickId { get; set; }

        // 渠道类型
        [NameInMap("channel_type")]
        [Validation(Required=false)]
        public string ChannelType { get; set; }

        // 客户类型
        [NameInMap("custom_type")]
        [Validation(Required=false)]
        public string CustomType { get; set; }

        // 资金方代码
        [NameInMap("fund_code")]
        [Validation(Required=false)]
        public string FundCode { get; set; }

    }

}
