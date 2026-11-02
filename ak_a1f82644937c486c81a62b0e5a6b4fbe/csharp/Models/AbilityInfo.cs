// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_a1f82644937c486c81a62b0e5a6b4fbe.Models
{
    // 能力信息
    public class AbilityInfo : TeaModel {
        // 能力编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>ak_3821c8f0145440dab91b9b23edb1dc73</para>
        /// </summary>
        [NameInMap("ability_id")]
        [Validation(Required=true)]
        public string AbilityId { get; set; }

        // 能力名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>B2B支付网关</para>
        /// </summary>
        [NameInMap("ability_name")]
        [Validation(Required=true)]
        public string AbilityName { get; set; }

        // 研发负责人
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("dev_owner")]
        [Validation(Required=true)]
        public string DevOwner { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2021-12-30 00:00:00</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // 描述信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>适用场景：企业资金支付场景   适合行业：存在企业采购/企业充值/企业转账等企业支付场景的行业   归属行业线：B类基础产品   产品描述：将交易场景与企业对公账户支付线上关联，订单交易对应的支付需求自动发送给企业网银做财务支出的确认和复核。</para>
        /// </summary>
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 研发负责人邮箱前缀
        /// <summary>
        /// <b>Example:</b>
        /// <para>qiujianglong.qjl</para>
        /// </summary>
        [NameInMap("dev_owner_prefix_email")]
        [Validation(Required=true)]
        public string DevOwnerPrefixEmail { get; set; }

        // 产品负责人
        /// <summary>
        /// <b>Example:</b>
        /// <para>江来</para>
        /// </summary>
        [NameInMap("product_owner")]
        [Validation(Required=true)]
        public string ProductOwner { get; set; }

        // 能力对应商业中台L5Code
        /// <summary>
        /// <b>Example:</b>
        /// <para>DMZNFM00883001</para>
        /// </summary>
        [NameInMap("business_code")]
        [Validation(Required=false)]
        public string BusinessCode { get; set; }

        // apiInfoModels列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("api_info_models")]
        [Validation(Required=true)]
        public List<ApiInfoModel> ApiInfoModels { get; set; }

        // 能力sla看板url
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://antslo.alipay.com/maas/slistd/115600116/std/d/147100480_slistd?var-tag1=xxx&var-tag2=All">https://antslo.alipay.com/maas/slistd/115600116/std/d/147100480_slistd?var-tag1=xxx&amp;var-tag2=All</a></para>
        /// </summary>
        [NameInMap("sla_url")]
        [Validation(Required=false)]
        public string SlaUrl { get; set; }

    }

}
