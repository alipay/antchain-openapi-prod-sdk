// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // result.resultData
    public class DeviceRiskReportResultData : TeaModel {
        // webrtc_url
        /// <summary>
        /// <b>Example:</b>
        /// <para>webrtc_url</para>
        /// </summary>
        [NameInMap("webrtc_url")]
        [Validation(Required=true)]
        public string WebrtcUrl { get; set; }

        // a_dynamic_swi
        /// <summary>
        /// <b>Example:</b>
        /// <para>a_dynamic_swi</para>
        /// </summary>
        [NameInMap("a_dynamic_swi")]
        [Validation(Required=true)]
        public string ADynamicSwi { get; set; }

        // dynamic_interval
        /// <summary>
        /// <b>Example:</b>
        /// <para>dynamic_interval</para>
        /// </summary>
        [NameInMap("dynamic_interval")]
        [Validation(Required=true)]
        public string DynamicInterval { get; set; }

        // color
        /// <summary>
        /// <b>Example:</b>
        /// <para>color</para>
        /// </summary>
        [NameInMap("color")]
        [Validation(Required=true)]
        public string Color { get; set; }

        // os
        /// <summary>
        /// <b>Example:</b>
        /// <para>os</para>
        /// </summary>
        [NameInMap("os")]
        [Validation(Required=true)]
        public string Os { get; set; }

        // dynamic_cmd
        /// <summary>
        /// <b>Example:</b>
        /// <para>dynamic_cmd</para>
        /// </summary>
        [NameInMap("dynamic_cmd")]
        [Validation(Required=true)]
        public string DynamicCmd { get; set; }

        // time_interval
        /// <summary>
        /// <b>Example:</b>
        /// <para>time_interval</para>
        /// </summary>
        [NameInMap("time_interval")]
        [Validation(Required=true)]
        public string TimeInterval { get; set; }

        // dynamic_trace
        /// <summary>
        /// <b>Example:</b>
        /// <para>dynamic_trace</para>
        /// </summary>
        [NameInMap("dynamic_trace")]
        [Validation(Required=true)]
        public string DynamicTrace { get; set; }

        // dynamic_num
        /// <summary>
        /// <b>Example:</b>
        /// <para>dynamic_num</para>
        /// </summary>
        [NameInMap("dynamic_num")]
        [Validation(Required=true)]
        public string DynamicNum { get; set; }

        // result_type
        /// <summary>
        /// <b>Example:</b>
        /// <para>result_type</para>
        /// </summary>
        [NameInMap("result_type")]
        [Validation(Required=true)]
        public string ResultType { get; set; }

    }

}
