// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 产品产量填报项
    public class GclProductionItem : TeaModel {
        // 用户侧传入明细编码，用于异常回传和排查
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("external_item_code")]
        [Validation(Required=false)]
        public string ExternalItemCode { get; set; }

        // 生产单元名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("location_name")]
        [Validation(Required=true)]
        public string LocationName { get; set; }

        // 产品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 产品规格
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("specification")]
        [Validation(Required=true)]
        public string Specification { get; set; }

        // 月度产量明细
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("production_data_list")]
        [Validation(Required=true)]
        public MonthDataDetail ProductionDataList { get; set; }

    }

}
