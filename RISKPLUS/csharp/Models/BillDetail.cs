// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 还款账单明细Object
    public class BillDetail : TeaModel {
        // 对账流水号，在扣款回盘文件中返回，用于对账
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("serial_number")]
        [Validation(Required=false)]
        public string SerialNumber { get; set; }

        // 还款期数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("rpy_term")]
        [Validation(Required=true)]
        public long? RpyTerm { get; set; }

        // 账单维度的还款总额（单位：分），单笔账单本利罚之和
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("rpy_amt")]
        [Validation(Required=true)]
        public long? RpyAmt { get; set; }

        // 实还本金（单位：分）
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("rpy_principal")]
        [Validation(Required=true)]
        public long? RpyPrincipal { get; set; }

        // 实还利息（单位：分）
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("rpy_fee_amt")]
        [Validation(Required=true)]
        public long? RpyFeeAmt { get; set; }

        // 实还罚息（单位：分）
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("rpy_muclt")]
        [Validation(Required=true)]
        public long? RpyMuclt { get; set; }

        // 其他科目金额，可能会其他类型的金额,用json数组的格式提高扩展性，涉及到保费和咨询服务费的项目，需要提供此字段。
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>[{&quot;fee&quot;:&quot;费用（单位：分）&quot;,&quot;type&quot;:&quot;（费用大项）1:保费, 2:信用评估费类&quot;,&quot;subType&quot;:&quot;费用子项） 57:担保咨询服务费（属于信用评估费类型）  50:信用评估费（属于信用评估费类型）  40保费&quot;,&quot;insureMode&quot;:&quot;分期乐内部担保模式号&quot;}]</para>
        /// </summary>
        [NameInMap("other_info")]
        [Validation(Required=false)]
        public string OtherInfo { get; set; }

        // 用户实还日，用户主动发起是当前日；定时扣款是应还日，格式=yyyy-MM-dd
        /// <summary>
        /// <b>Example:</b>
        /// <para>yyyy-MM-dd</para>
        /// </summary>
        [NameInMap("rpy_date")]
        [Validation(Required=false)]
        public string RpyDate { get; set; }

    }

}
