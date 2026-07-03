// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 预警企业
    public class RtopCompanyAlarm : TeaModel {
        // 企业ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("company_id")]
        [Validation(Required=true)]
        public string CompanyId { get; set; }

        // 预警类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("alarm_type")]
        [Validation(Required=true)]
        public string AlarmType { get; set; }

        // 预警序号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("alarm_idx")]
        [Validation(Required=true)]
        public string AlarmIdx { get; set; }

        // 预警日期
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("alarm_date")]
        [Validation(Required=true)]
        public string AlarmDate { get; set; }

        // 预警标识，是否需要预警
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("alarm_flag")]
        [Validation(Required=true)]
        public string AlarmFlag { get; set; }

    }

}
