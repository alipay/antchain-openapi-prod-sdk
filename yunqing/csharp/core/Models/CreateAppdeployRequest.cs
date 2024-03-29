// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class CreateAppdeployRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用码
        [NameInMap("apps")]
        [Validation(Required=true)]
        public List<string> Apps { get; set; }

        // 将要发布的单元id
        [NameInMap("cell_ids")]
        [Validation(Required=true)]
        public List<string> CellIds { get; set; }

        // 产品码
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // 解决方案id
        [NameInMap("solution_id")]
        [Validation(Required=true)]
        public string SolutionId { get; set; }

        // 是否强制重发
        [NameInMap("force")]
        [Validation(Required=true)]
        public bool? Force { get; set; }

        // 是否需要手动的确认
        [NameInMap("need_beta")]
        [Validation(Required=false)]
        public bool? NeedBeta { get; set; }

        // TWO_GROUP分两组ALL_ONE共分一组无灰生产禁用EACH_ONE每台一组SYSTEM_RECOMMENDATION系统推荐
        [NameInMap("group_strategy")]
        [Validation(Required=false)]
        public string GroupStrategy { get; set; }

        // 操作人ID
        [NameInMap("submitter_id")]
        [Validation(Required=false)]
        public string SubmitterId { get; set; }

        // 	
        // 操作人名称（花名或者真名）
        [NameInMap("submitter_name")]
        [Validation(Required=false)]
        public string SubmitterName { get; set; }

        // 是否由云游自动确认资源规划，默认false；
        // 云游自动确认规划可能不符合预期，请谨慎使用
        [NameInMap("auto_confirm_plan")]
        [Validation(Required=false)]
        public bool? AutoConfirmPlan { get; set; }

    }

}
