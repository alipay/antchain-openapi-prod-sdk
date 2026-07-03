// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 设备规格信息体
    public class IotBasicDeviceSpecs : TeaModel {
        // 厂商编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>telpo</para>
        /// </summary>
        [NameInMap("corp_value")]
        [Validation(Required=true)]
        public string CorpValue { get; set; }

        // 厂商名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>天波</para>
        /// </summary>
        [NameInMap("corp_name")]
        [Validation(Required=true)]
        public string CorpName { get; set; }

        // 型号名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>TPS1231</para>
        /// </summary>
        [NameInMap("model_name")]
        [Validation(Required=true)]
        public string ModelName { get; set; }

        // 型号编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>TPS123</para>
        /// </summary>
        [NameInMap("model_value")]
        [Validation(Required=true)]
        public string ModelValue { get; set; }

        // 防疫机
        /// <summary>
        /// <b>Example:</b>
        /// <para>设备品类名称</para>
        /// </summary>
        [NameInMap("category_name")]
        [Validation(Required=true)]
        public string CategoryName { get; set; }

        // 设备品类编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>antmic</para>
        /// </summary>
        [NameInMap("category_code")]
        [Validation(Required=true)]
        public string CategoryCode { get; set; }

        // 规格ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>12321321</para>
        /// </summary>
        [NameInMap("specs_id")]
        [Validation(Required=true)]
        public long? SpecsId { get; set; }

        // 规格名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>规格名称</para>
        /// </summary>
        [NameInMap("specs_name")]
        [Validation(Required=true)]
        public string SpecsName { get; set; }

        // 规格编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>规格编码</para>
        /// </summary>
        [NameInMap("specs_value")]
        [Validation(Required=true)]
        public string SpecsValue { get; set; }

        // 规格参数
        /// <summary>
        /// <b>Example:</b>
        /// <para>规格参数</para>
        /// </summary>
        [NameInMap("specs_param")]
        [Validation(Required=true)]
        public string SpecsParam { get; set; }

    }

}
