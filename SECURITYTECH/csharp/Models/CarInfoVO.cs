// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 车辆信息列表
    public class CarInfoVO : TeaModel {
        // 车辆型号
        /// <summary>
        /// <b>Example:</b>
        /// <para>E10R</para>
        /// </summary>
        [NameInMap("car_model")]
        [Validation(Required=true)]
        public string CarModel { get; set; }

        // 车辆颜色
        /// <summary>
        /// <b>Example:</b>
        /// <para>红色</para>
        /// </summary>
        [NameInMap("car_color")]
        [Validation(Required=true)]
        public string CarColor { get; set; }

        // 车型编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>AAA470106</para>
        /// </summary>
        [NameInMap("model_no")]
        [Validation(Required=true)]
        public string ModelNo { get; set; }

        // 车架号
        /// <summary>
        /// <b>Example:</b>
        /// <para>220922507905000</para>
        /// </summary>
        [NameInMap("frame_no")]
        [Validation(Required=true)]
        public string FrameNo { get; set; }

        // 设备ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>FF9999995FF1020251009BE8B1B08855</para>
        /// </summary>
        [NameInMap("tuid")]
        [Validation(Required=true)]
        public string Tuid { get; set; }

        // tagId
        /// <summary>
        /// <b>Example:</b>
        /// <para>4EA1FFFFFFFFFFFFFFFFFFFFE13D02862257</para>
        /// </summary>
        [NameInMap("tag_id")]
        [Validation(Required=true)]
        public string TagId { get; set; }

        // 品牌ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>SAIGE</para>
        /// </summary>
        [NameInMap("brand_id")]
        [Validation(Required=true)]
        public string BrandId { get; set; }

        // 协议类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>ble</para>
        /// </summary>
        [NameInMap("protocol_type")]
        [Validation(Required=true)]
        public string ProtocolType { get; set; }

    }

}
