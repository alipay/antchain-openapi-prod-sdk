// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 智租风控模型结构体
    public class AppletRiskModel : TeaModel {
        // 智租风控调用结果码，10000 表示调用成功。
        /// <summary>
        /// <b>Example:</b>
        /// <para>10000</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 风险咨询事件ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>202403220000000000008833</para>
        /// </summary>
        [NameInMap("record_id")]
        [Validation(Required=true)]
        public string RecordId { get; set; }

        // 风险等级。枚举值：RANK0-无法判断；RANK1-极低风险；RANK2-低风险；RANK3-中风险；RANK4-高风险；RANK5-极高风险
        /// <summary>
        /// <b>Example:</b>
        /// <para>RANK1</para>
        /// </summary>
        [NameInMap("risk_rank")]
        [Validation(Required=true)]
        public string RiskRank { get; set; }

        // 风险名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>综合风险</para>
        /// </summary>
        [NameInMap("risk_name")]
        [Validation(Required=true)]
        public string RiskName { get; set; }

        // 风险等级中文描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>低风险</para>
        /// </summary>
        [NameInMap("risk_desc")]
        [Validation(Required=true)]
        public string RiskDesc { get; set; }

        // 流程id
        /// <summary>
        /// <b>Example:</b>
        /// <para>10000009000001804441658067824640</para>
        /// </summary>
        [NameInMap("flow_id")]
        [Validation(Required=true)]
        public string FlowId { get; set; }

        // 子风险结果列表
        [NameInMap("sub_risk_result_list")]
        [Validation(Required=false)]
        public List<SubRentRiskItem> SubRiskResultList { get; set; }

        // 调用失败错误提示信息，仅调用失败时返回该字段信息。
        /// <summary>
        /// <b>Example:</b>
        /// <para>参数有误身份证号不合法</para>
        /// </summary>
        [NameInMap("error_msg")]
        [Validation(Required=false)]
        public string ErrorMsg { get; set; }

    }

}
