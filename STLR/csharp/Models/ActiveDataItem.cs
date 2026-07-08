// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 活动数据填报
    public class ActiveDataItem : TeaModel {
        // 明细编码，用于异常回传和排查
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("external_item_code")]
        [Validation(Required=false)]
        public string ExternalItemCode { get; set; }

        // 单元过程名称；`inputByProcess = true` 时必填，取 options 返回的 `processList[].processName`
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("process_name")]
        [Validation(Required=false)]
        public string ProcessName { get; set; }

        // 物料名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("material_name")]
        [Validation(Required=true)]
        public string MaterialName { get; set; }

        // 供应商名称，无供应商时为空
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("supplier_name")]
        [Validation(Required=false)]
        public string SupplierName { get; set; }

        // 外购产品或自有产品名称，无供应商产品时为空
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("supplier_product_name")]
        [Validation(Required=false)]
        public string SupplierProductName { get; set; }

        // 月度活动数据明细，包含多个月份
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("active_data_list")]
        [Validation(Required=true)]
        public List<MonthDataDetail> ActiveDataList { get; set; }

        // 单元过程编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("process_no")]
        [Validation(Required=false)]
        public string ProcessNo { get; set; }

        // 物料类型，默认为RAW原辅料数据
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("material_type")]
        [Validation(Required=false)]
        public string MaterialType { get; set; }

    }

}
