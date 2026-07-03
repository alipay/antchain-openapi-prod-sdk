// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢系统职业信息
    public class JobInfo : TeaModel {
        // 职业
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("job_type")]
        [Validation(Required=false)]
        public string JobType { get; set; }

        // 职务
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("work_position")]
        [Validation(Required=false)]
        public string WorkPosition { get; set; }

        // 工作年限
        /// <summary>
        /// <b>Example:</b>
        /// <para>2</para>
        /// </summary>
        [NameInMap("job_life")]
        [Validation(Required=false)]
        public string JobLife { get; set; }

        // 本单位工作年限
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("current_job_life")]
        [Validation(Required=false)]
        public long? CurrentJobLife { get; set; }

        // 公司名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("company_name")]
        [Validation(Required=false)]
        public string CompanyName { get; set; }

        // 公司行业类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>xx</para>
        /// </summary>
        [NameInMap("company_industry_type")]
        [Validation(Required=false)]
        public string CompanyIndustryType { get; set; }

        // 公司电话
        /// <summary>
        /// <b>Example:</b>
        /// <para>111</para>
        /// </summary>
        [NameInMap("company_tel")]
        [Validation(Required=false)]
        public string CompanyTel { get; set; }

        // 公司省份
        /// <summary>
        /// <b>Example:</b>
        /// <para>浙江</para>
        /// </summary>
        [NameInMap("company_province")]
        [Validation(Required=false)]
        public string CompanyProvince { get; set; }

        // 公司城市
        /// <summary>
        /// <b>Example:</b>
        /// <para>公司城市</para>
        /// </summary>
        [NameInMap("company_city")]
        [Validation(Required=false)]
        public string CompanyCity { get; set; }

        // 公司区域
        /// <summary>
        /// <b>Example:</b>
        /// <para>公司区域</para>
        /// </summary>
        [NameInMap("company_area")]
        [Validation(Required=false)]
        public string CompanyArea { get; set; }

        // 公司街道
        /// <summary>
        /// <b>Example:</b>
        /// <para>公司街道</para>
        /// </summary>
        [NameInMap("company_street")]
        [Validation(Required=false)]
        public string CompanyStreet { get; set; }

        // 公司详细地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>公司详细地址</para>
        /// </summary>
        [NameInMap("company_address")]
        [Validation(Required=false)]
        public string CompanyAddress { get; set; }

        // 年收入
        /// <summary>
        /// <b>Example:</b>
        /// <para>年收入</para>
        /// </summary>
        [NameInMap("year_salary")]
        [Validation(Required=false)]
        public long? YearSalary { get; set; }

        // 贷款用户所属行业类别
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("indu_invol")]
        [Validation(Required=false)]
        public string InduInvol { get; set; }

    }

}
