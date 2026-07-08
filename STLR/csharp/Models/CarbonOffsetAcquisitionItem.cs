// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 碳普惠补偿采集数据条目
    public class CarbonOffsetAcquisitionItem : TeaModel {
        // 采集数据单号
        /// <summary>
        /// <b>Example:</b>
        /// <para>123456789abcdefghi</para>
        /// </summary>
        [NameInMap("acquisition_item_no")]
        [Validation(Required=true)]
        public string AcquisitionItemNo { get; set; }

        // 碳补偿项目编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>13222</para>
        /// </summary>
        [NameInMap("project_no")]
        [Validation(Required=true)]
        public string ProjectNo { get; set; }

        // 参与账户DID
        /// <summary>
        /// <b>Example:</b>
        /// <para>123456789abcdefghi</para>
        /// </summary>
        [NameInMap("account_did")]
        [Validation(Required=true)]
        public string AccountDid { get; set; }

        // 发生时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2023-05-23 12:11:32:33</para>
        /// </summary>
        [NameInMap("occurrent_time")]
        [Validation(Required=true)]
        public string OccurrentTime { get; set; }

        // 发生场景编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>xingzou</para>
        /// </summary>
        [NameInMap("scenario_code")]
        [Validation(Required=true)]
        public string ScenarioCode { get; set; }

        // 发生场景名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>出行</para>
        /// </summary>
        [NameInMap("scenario_name")]
        [Validation(Required=true)]
        public string ScenarioName { get; set; }

        // 碳普惠平台编码，如果非平台采集数据，则显示为自采编码：Self
        /// <summary>
        /// <b>Example:</b>
        /// <para>Antforest</para>
        /// </summary>
        [NameInMap("platform_no")]
        [Validation(Required=true)]
        public string PlatformNo { get; set; }

        // 活动数据原始值，多个活动数据列表
        [NameInMap("active_datum")]
        [Validation(Required=false)]
        public List<AnyAmountItem> ActiveDatum { get; set; }

        // 减碳量
        /// <summary>
        /// <b>Example:</b>
        /// <para>122.22</para>
        /// </summary>
        [NameInMap("offset_volume")]
        [Validation(Required=false)]
        public string OffsetVolume { get; set; }

        // 碳能量值
        /// <summary>
        /// <b>Example:</b>
        /// <para>229</para>
        /// </summary>
        [NameInMap("carbon_energy")]
        [Validation(Required=false)]
        public long? CarbonEnergy { get; set; }

    }

}
