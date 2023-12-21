// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class StartRiskEvaluationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 个人身份证号
        [NameInMap("identity_id")]
        [Validation(Required=true)]
        public string IdentityId { get; set; }

        // 个人姓名
        [NameInMap("identity_name")]
        [Validation(Required=false)]
        public string IdentityName { get; set; }

        // 企业的统一社会信用编码
        [NameInMap("enterprise_id")]
        [Validation(Required=false)]
        public string EnterpriseId { get; set; }

        // 某某某公司
        [NameInMap("enterprise_name")]
        [Validation(Required=false)]
        public string EnterpriseName { get; set; }

        // 企业或者个人企业：ENTERPRISE 个人：PERSONAL
        [NameInMap("identity_type")]
        [Validation(Required=true)]
        public string IdentityType { get; set; }

        // 101
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

        // 授权订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 请求流水号(必填),调用 方保证每次请求号唯   一，受理方用来校验唯 一性，同一受理号返回 请求结果一致
        [NameInMap("biz_request_id")]
        [Validation(Required=true)]
        public string BizRequestId { get; set; }

        // 子渠道渠道编码，需要同步蚂蚁，由蚂蚁设置。如果是银行本身，可不填 备注：如果同一信贷客户在不同银行的调用需要严格区分，分别授权
        [NameInMap("sub_tenant")]
        [Validation(Required=true)]
        public string SubTenant { get; set; }

        // 扩展信息
        [NameInMap("extend_info")]
        [Validation(Required=true)]
        public RiskEvaluationExtendInfoRequest ExtendInfo { get; set; }

        // 查询模式，SINGLE_CITY 查到第一个城市就结束，ALL_CITY 查询所有城市，默认ALL_CITY
        [NameInMap("search_model")]
        [Validation(Required=false)]
        public string SearchModel { get; set; }

    }

}
