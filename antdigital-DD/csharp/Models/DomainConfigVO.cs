// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 计量域信息
    public class DomainConfigVO : TeaModel {
        // 操作类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>ADD</para>
        /// </summary>
        [NameInMap("operate_type")]
        [Validation(Required=false)]
        public string OperateType { get; set; }

        // 产品域Code，例如OSS
        /// <summary>
        /// <b>Example:</b>
        /// <para>test_r</para>
        /// </summary>
        [NameInMap("domain_code")]
        [Validation(Required=false)]
        public string DomainCode { get; set; }

        // 版本
        /// <summary>
        /// <b>Example:</b>
        /// <para>2023#test_r</para>
        /// </summary>
        [NameInMap("domain_version")]
        [Validation(Required=false)]
        public string DomainVersion { get; set; }

        // 计量域中文名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>中文名</para>
        /// </summary>
        [NameInMap("chinese_name")]
        [Validation(Required=false)]
        public string ChineseName { get; set; }

        // 计量域英文名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>english_name</para>
        /// </summary>
        [NameInMap("english_name")]
        [Validation(Required=false)]
        public string EnglishName { get; set; }

        // 计量域描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>计量域描述</para>
        /// </summary>
        [NameInMap("domain_desc")]
        [Validation(Required=false)]
        public string DomainDesc { get; set; }

        // 渠道产品Code
        /// <summary>
        /// <b>Example:</b>
        /// <para>serviceCode</para>
        /// </summary>
        [NameInMap("service_code")]
        [Validation(Required=false)]
        public string ServiceCode { get; set; }

        // 商品code
        /// <summary>
        /// <b>Example:</b>
        /// <para>商品code</para>
        /// </summary>
        [NameInMap("commodity_code")]
        [Validation(Required=false)]
        public string CommodityCode { get; set; }

        // 推送类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>全量</para>
        /// </summary>
        [NameInMap("push_type")]
        [Validation(Required=false)]
        public string PushType { get; set; }

        // 计量数据维度
        /// <summary>
        /// <b>Example:</b>
        /// <para>r</para>
        /// </summary>
        [NameInMap("dimension")]
        [Validation(Required=false)]
        public string Dimension { get; set; }

        // 环境标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>prod</para>
        /// </summary>
        [NameInMap("env")]
        [Validation(Required=false)]
        public string Env { get; set; }

        // 计量说明
        /// <summary>
        /// <b>Example:</b>
        /// <para>说明</para>
        /// </summary>
        [NameInMap("memo")]
        [Validation(Required=false)]
        public string Memo { get; set; }

        // domainCode是否需要聚合
        /// <summary>
        /// <b>Example:</b>
        /// <para>N</para>
        /// </summary>
        [NameInMap("need_aggregate")]
        [Validation(Required=false)]
        public string NeedAggregate { get; set; }

        // 创建者
        /// <summary>
        /// <b>Example:</b>
        /// <para>工号</para>
        /// </summary>
        [NameInMap("creator")]
        [Validation(Required=false)]
        public string Creator { get; set; }

        // 修改者
        /// <summary>
        /// <b>Example:</b>
        /// <para>工号</para>
        /// </summary>
        [NameInMap("modifier")]
        [Validation(Required=false)]
        public string Modifier { get; set; }

        // 计量项list
        [NameInMap("domain_field_set")]
        [Validation(Required=false)]
        public List<DomainField> DomainFieldSet { get; set; }

        // 主键规则配置
        [NameInMap("primary_key_gen_rule")]
        [Validation(Required=false)]
        public PrimaryKeyGenRule PrimaryKeyGenRule { get; set; }

        // 计量节点
        [NameInMap("domain_node_set")]
        [Validation(Required=false)]
        public List<DomainNode> DomainNodeSet { get; set; }

        // 计量域成员信息
        [NameInMap("meter_domain_member_set")]
        [Validation(Required=false)]
        public List<MeterDomainMember> MeterDomainMemberSet { get; set; }

        // DomainSLS配置
        [NameInMap("domain_sls")]
        [Validation(Required=false)]
        public DomainSls DomainSls { get; set; }

    }

}
