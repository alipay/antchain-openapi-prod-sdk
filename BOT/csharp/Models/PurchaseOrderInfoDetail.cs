// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // PurchaseOrderInfoDetail 
    public class PurchaseOrderInfoDetail : TeaModel {
        // 租赁订单号
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>dadadasda</para>
        /// </summary>
        [NameInMap("order_number")]
        [Validation(Required=true)]
        public string OrderNumber { get; set; }

        // 收货人姓名
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>立敢</para>
        /// </summary>
        [NameInMap("consignee_name")]
        [Validation(Required=true)]
        public string ConsigneeName { get; set; }

        // 收货人身份证号
        /// <summary>
        /// <b>Example:</b>
        /// <para>424234324324234</para>
        /// </summary>
        [NameInMap("consignee_id_number")]
        [Validation(Required=true)]
        public string ConsigneeIdNumber { get; set; }

        // 收货人手机号
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>13400113344</para>
        /// </summary>
        [NameInMap("consignee_phone")]
        [Validation(Required=true)]
        public string ConsigneePhone { get; set; }

        // 收货人地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>北京市海淀区XXXXXXXX</para>
        /// </summary>
        [NameInMap("consignee_address")]
        [Validation(Required=true)]
        public string ConsigneeAddress { get; set; }

        // 供货商名称
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>fsafsafaf</para>
        /// </summary>
        [NameInMap("supplier_name")]
        [Validation(Required=true)]
        public string SupplierName { get; set; }

        // 供货商租户id
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>fsffafaf</para>
        /// </summary>
        [NameInMap("supplier_id")]
        [Validation(Required=true)]
        public string SupplierId { get; set; }

        // 采购商id
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>fafsafaf</para>
        /// </summary>
        [NameInMap("lease_id")]
        [Validation(Required=true)]
        public string LeaseId { get; set; }

        // 商品信息列表
        [NameInMap("goods_id_and_count")]
        [Validation(Required=true)]
        public List<GoodsIdAndCount> GoodsIdAndCount { get; set; }

    }

}
