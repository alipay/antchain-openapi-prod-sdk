// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    public class FinishRcpRtcRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 申办业务号
        [NameInMap("apply_biz_id")]
        [Validation(Required=true)]
        public string ApplyBizId { get; set; }

        // 业务状态，可选值：PENDING("审核中")、CANCELLED("已撤回")、DONE("已办结")、REJECTED("已退件")、NEED_MORE_MATERIAL("待补件")
        [NameInMap("biz_status")]
        [Validation(Required=true)]
        public string BizStatus { get; set; }

        // 业务类型，可选值：FIRST_BIZTYPE("不动产抵押权首次登记(普通抵押)"),、EGAGECANCEL_BIZTYPE("不动产抵押权注销登记")、FIRSTMAXGAGE_BIZTYPE("不动产抵押权首次登记(最高额抵押)")
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 被担保主债权数额
        [NameInMap("debt_amount")]
        [Validation(Required=true)]
        public Amount DebtAmount { get; set; }

        // 履债结束日期，格式为：yyyy-MM-dd
        [NameInMap("debt_end_date")]
        [Validation(Required=false)]
        public string DebtEndDate { get; set; }

        // 履债开始日期，格式为：yyyy-MM-dd
        [NameInMap("debt_start_date")]
        [Validation(Required=false)]
        public string DebtStartDate { get; set; }

        // 评估价值
        [NameInMap("evaluation_amount")]
        [Validation(Required=false)]
        public Amount EvaluationAmount { get; set; }

        // 抵押权人
        [NameInMap("mortgagee")]
        [Validation(Required=true)]
        public EntityBasicInfo Mortgagee { get; set; }

        // 抵押方式，可选值： NORMAL_MORT("一般抵押权")、MAX_AMOUNT_MORT("最高额抵押权")
        [NameInMap("mortgage_type")]
        [Validation(Required=true)]
        public string MortgageType { get; set; }

        // 他项权证信息
        [NameInMap("other_right_info")]
        [Validation(Required=true)]
        public OtherRightInfo OtherRightInfo { get; set; }

        // 登记日期，格式为：yyyy-MM-dd
        [NameInMap("registered_date")]
        [Validation(Required=true)]
        public string RegisteredDate { get; set; }

        // 材料文件列表，待缴费时必填）当业务状态为待缴费时，本材料文件列表会返回缴款通知书。
        [NameInMap("material_file_list")]
        [Validation(Required=false)]
        public List<MaterialFileInfo> MaterialFileList { get; set; }

    }

}
