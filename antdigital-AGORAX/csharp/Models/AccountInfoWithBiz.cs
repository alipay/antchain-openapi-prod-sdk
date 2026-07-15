// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 包含业务组的用户信息
    public class AccountInfoWithBiz : TeaModel {
        // 注册地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>北京</para>
        /// </summary>
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 业务场景code
        /// <summary>
        /// <b>Example:</b>
        /// <para>020301</para>
        /// </summary>
        [NameInMap("biz_code")]
        [Validation(Required=true)]
        public string BizCode { get; set; }

        // 业务名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>test1</para>
        /// </summary>
        [NameInMap("biz_name")]
        [Validation(Required=true)]
        public string BizName { get; set; }

        // 业务类型，预留
        /// <summary>
        /// <b>Example:</b>
        /// <para>test1</para>
        /// </summary>
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 用户创建时间，格式yyyy-MM-dd HH:mm:ss
        /// <summary>
        /// <b>Example:</b>
        /// <para>2019-06-12 00:00:00</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // 用户注销时间，格式yyyy-MM-dd HH:mm:ss
        /// <summary>
        /// <b>Example:</b>
        /// <para>2019-06-13 00:00:00  </para>
        /// </summary>
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public string EndTime { get; set; }

        // 扩展字段，使用json格式
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;status&quot;:1}</para>
        /// </summary>
        [NameInMap("extension")]
        [Validation(Required=false, MaxLength=200)]
        public string Extension { get; set; }

        // 业务组code
        /// <summary>
        /// <b>Example:</b>
        /// <para>0101</para>
        /// </summary>
        [NameInMap("group_code")]
        [Validation(Required=true)]
        public string GroupCode { get; set; }

        // 业务组名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>baas平台</para>
        /// </summary>
        [NameInMap("group_name")]
        [Validation(Required=true)]
        public string GroupName { get; set; }

        // 唯一标示类型，0:统一信用代码,1:开票机构代码,2:身份证号
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("identity_type")]
        [Validation(Required=false)]
        public long? IdentityType { get; set; }

        // 唯一标示码
        /// <summary>
        /// <b>Example:</b>
        /// <para>370211198106130000</para>
        /// </summary>
        [NameInMap("identity_value")]
        [Validation(Required=false)]
        public string IdentityValue { get; set; }

        // 用户标签
        /// <summary>
        /// <b>Example:</b>
        /// <para><kpi>0</kpi></para>
        /// </summary>
        [NameInMap("label")]
        [Validation(Required=false)]
        public string Label { get; set; }

        // 间连用户的上层直连用户名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>某某公司</para>
        /// </summary>
        [NameInMap("parent")]
        [Validation(Required=false)]
        public string Parent { get; set; }

        // 统计时间，时间格式：yyyy-MM-dd HH:mm:ss
        /// <summary>
        /// <b>Example:</b>
        /// <para>2019-06-12 00:00:00</para>
        /// </summary>
        [NameInMap("stat_date")]
        [Validation(Required=false)]
        public string StatDate { get; set; }

        // 用户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>bjc1111   </para>
        /// </summary>
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 用户或企业名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>北京公司A</para>
        /// </summary>
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 用户类型：direct直连，indirect间连，partner合作伙伴
        /// <summary>
        /// <b>Example:</b>
        /// <para>direct</para>
        /// </summary>
        [NameInMap("user_type")]
        [Validation(Required=false)]
        public string UserType { get; set; }

    }

}
