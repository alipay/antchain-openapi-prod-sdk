// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢系统个人信息结构体
    public class PersonalInfo : TeaModel {
        // 客户姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("custom_name")]
        [Validation(Required=true)]
        public string CustomName { get; set; }

        // 身份证号码(18位)
        /// <summary>
        /// <b>Example:</b>
        /// <para>1234555</para>
        /// </summary>
        [NameInMap("card_no")]
        [Validation(Required=true)]
        public string CardNo { get; set; }

        // 1-身份证
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("id_type")]
        [Validation(Required=true)]
        public string IdType { get; set; }

        // 证件开始日期(格式：YYYY-MM-DD)
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>YYYY-MM-DD</para>
        /// </summary>
        [NameInMap("cert_sign_date")]
        [Validation(Required=true)]
        public string CertSignDate { get; set; }

        // 格式：YYYY-MM-DD，身份证有效期为长期的送: 9999-12-31
        /// <summary>
        /// <b>Example:</b>
        /// <para>YYYY-MM-DD</para>
        /// </summary>
        [NameInMap("cert_validate")]
        [Validation(Required=true)]
        public string CertValidate { get; set; }

        // 证件地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>浙江</para>
        /// </summary>
        [NameInMap("cert_adr")]
        [Validation(Required=true)]
        public string CertAdr { get; set; }

        // 手机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>12344</para>
        /// </summary>
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 学历
        /// <summary>
        /// <b>Example:</b>
        /// <para>本科</para>
        /// </summary>
        [NameInMap("education")]
        [Validation(Required=false)]
        public string Education { get; set; }

        // 所在省份 汉字
        /// <summary>
        /// <b>Example:</b>
        /// <para>浙江</para>
        /// </summary>
        [NameInMap("province")]
        [Validation(Required=false)]
        public string Province { get; set; }

        // 所在城市 汉字
        /// <summary>
        /// <b>Example:</b>
        /// <para>杭州</para>
        /// </summary>
        [NameInMap("city")]
        [Validation(Required=false)]
        public string City { get; set; }

        // 地区名称 汉字
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("area")]
        [Validation(Required=false)]
        public string Area { get; set; }

        // 详细地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 性别M-男
        // F-女
        /// <summary>
        /// <b>Example:</b>
        /// <para>M</para>
        /// </summary>
        [NameInMap("sex")]
        [Validation(Required=false)]
        public string Sex { get; set; }

        // 民族
        /// <summary>
        /// <b>Example:</b>
        /// <para>汉</para>
        /// </summary>
        [NameInMap("nation")]
        [Validation(Required=false)]
        public string Nation { get; set; }

        // 婚姻状态：00-未婚，01-已婚，02-离婚，03-丧偶，99-未知
        /// <summary>
        /// <b>Example:</b>
        /// <para>00</para>
        /// </summary>
        [NameInMap("marital_status")]
        [Validation(Required=false)]
        public string MaritalStatus { get; set; }

    }

}
