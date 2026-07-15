// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 合约市场列表
    public class ContractTemplateResp : TeaModel {
        // 模板标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>tme202307251209228357cc</para>
        /// </summary>
        [NameInMap("template_id")]
        [Validation(Required=false)]
        public string TemplateId { get; set; }

        // 产品码
        /// <summary>
        /// <b>Example:</b>
        /// <para>0001</para>
        /// </summary>
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 合约名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>资产合约</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 缩略图url
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://www.xxx.com">http://www.xxx.com</a></para>
        /// </summary>
        [NameInMap("thumb_url")]
        [Validation(Required=false)]
        public string ThumbUrl { get; set; }

        // 合约描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>实现数据不可删除，不可篡改，不可抵赖的存证效果</para>
        /// </summary>
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 文档地址
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://help.aliyun.com/product/84950.html">https://help.aliyun.com/product/84950.html</a></para>
        /// </summary>
        [NameInMap("detail_url")]
        [Validation(Required=false)]
        public string DetailUrl { get; set; }

        // 是否已开通合约
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("open")]
        [Validation(Required=false)]
        public bool? Open { get; set; }

        // 后续展示：购买用户头像
        [NameInMap("avatar_logo_list")]
        [Validation(Required=false)]
        public List<string> AvatarLogoList { get; set; }

        // 定制合约价格
        /// <summary>
        /// <b>Example:</b>
        /// <para>定制合约服务费用：80,000元/年</para>
        /// </summary>
        [NameInMap("price_message")]
        [Validation(Required=false)]
        public string PriceMessage { get; set; }

    }

}
