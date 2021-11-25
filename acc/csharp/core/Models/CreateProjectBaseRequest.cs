// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class CreateProjectBaseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 唯一业务id
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public long? ProjectId { get; set; }

        // 项目编号
        [NameInMap("project_code")]
        [Validation(Required=true)]
        public string ProjectCode { get; set; }

        // 项目名称
        [NameInMap("project_name")]
        [Validation(Required=true)]
        public string ProjectName { get; set; }

        // 项目建立时间
        [NameInMap("project_create_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ProjectCreateTime { get; set; }

        // 建设单位统一社会信用代码
        [NameInMap("party_a_bidder_code")]
        [Validation(Required=true)]
        public string PartyABidderCode { get; set; }

        // 施工单位统一社会信用代码
        [NameInMap("party_b_bidder_code")]
        [Validation(Required=true)]
        public string PartyBBidderCode { get; set; }

        // 项目所在行政区域代码
        [NameInMap("region_code")]
        [Validation(Required=true)]
        public string RegionCode { get; set; }

        // 项目类型
        [NameInMap("project_type")]
        [Validation(Required=true)]
        public string ProjectType { get; set; }

        // 拟开工时间
        [NameInMap("start_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 拟建成时间
        [NameInMap("end_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // 工程造价（单位：元，精确小数点后6位）
        [NameInMap("project_price")]
        [Validation(Required=true)]
        public string ProjectPrice { get; set; }

        // 资金来源
        [NameInMap("fund_source")]
        [Validation(Required=true)]
        public string FundSource { get; set; }

        // 行业分类
        [NameInMap("indus_category")]
        [Validation(Required=true)]
        public string IndusCategory { get; set; }

        // 项目地址
        [NameInMap("project_address")]
        [Validation(Required=true)]
        public string ProjectAddress { get; set; }

        // 争议解决方式
        [NameInMap("disputeresolution_type")]
        [Validation(Required=false)]
        public string DisputeresolutionType { get; set; }

        // 资金落实比例
        [NameInMap("contribution_ratio")]
        [Validation(Required=false)]
        public string ContributionRatio { get; set; }

        // 资金落实情况
        [NameInMap("fund_impl")]
        [Validation(Required=false)]
        public string FundImpl { get; set; }

        // 项目规模
        [NameInMap("project_scale")]
        [Validation(Required=false)]
        public string ProjectScale { get; set; }

        // 总投资额(单位：元，小数点后六位)
        [NameInMap("bid_bond")]
        [Validation(Required=false)]
        public string BidBond { get; set; }

        // 建设单位的项目联系人
        [NameInMap("contactor")]
        [Validation(Required=false)]
        public string Contactor { get; set; }

        // 建设单位的项目联系人联系方式
        [NameInMap("contact_information")]
        [Validation(Required=false)]
        public string ContactInformation { get; set; }

        // 是否国有投资
        [NameInMap("is_g_contruction")]
        [Validation(Required=false)]
        public string IsGContruction { get; set; }

        // 担保方式
        [NameInMap("guarantee_type")]
        [Validation(Required=false)]
        public string GuaranteeType { get; set; }

        // 反担保协议编号
        [NameInMap("conter_guar_agree_no")]
        [Validation(Required=false)]
        public string ConterGuarAgreeNo { get; set; }

        // 创建人did
        [NameInMap("created_did")]
        [Validation(Required=false)]
        public string CreatedDid { get; set; }

        // 数据时间戳
        [NameInMap("data_timestamp")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DataTimestamp { get; set; }

    }

}
