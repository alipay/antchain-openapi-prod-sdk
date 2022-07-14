// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTEGRATION_MACHINE.Models
{
    // 通行记录
    public class HealthInfoLog : TeaModel {
        // 身份证号
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 姓名
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

        // 健康码颜色(绿色:1,黄码:2,红码:3,灰码:4)
        [NameInMap("health_code")]
        [Validation(Required=true)]
        public string HealthCode { get; set; }

        // 行程信息
        // 
        [NameInMap("travel_info")]
        [Validation(Required=true)]
        public TravelInfo TravelInfo { get; set; }

        // 核酸信息
        // 
        [NameInMap("nucleic_acid_info")]
        [Validation(Required=true)]
        public NucleicAcidInfo NucleicAcidInfo { get; set; }

        // 疫苗信息
        // 
        [NameInMap("vaccination_info")]
        [Validation(Required=true)]
        public VaccinationInfo VaccinationInfo { get; set; }

        // 抗原信息
        // 
        [NameInMap("antigen_info")]
        [Validation(Required=true)]
        public AntigenInfo AntigenInfo { get; set; }

        // 场所信息
        // 
        [NameInMap("scene_info")]
        [Validation(Required=true)]
        public SceneInfo SceneInfo { get; set; }

        // 数据源通行状态 0:禁止通行,1:允许通行
        // 
        [NameInMap("channel_pass_state")]
        [Validation(Required=true)]
        public string ChannelPassState { get; set; }

        // 经度
        // 
        [NameInMap("longitude")]
        [Validation(Required=true)]
        public string Longitude { get; set; }

        // 纬度
        [NameInMap("latitude")]
        [Validation(Required=true)]
        public string Latitude { get; set; }

        // 通行方式（1:自动刷脸, 2:刷证非1:1, 3:刷证1:1, 4:反扫, 5:刷奥智定制卡, 6:手动刷脸）
        // 
        [NameInMap("pass_mode")]
        [Validation(Required=true)]
        public string PassMode { get; set; }

        // 通行时长(单位:毫秒)
        // 
        [NameInMap("pass_duration")]
        [Validation(Required=true)]
        public string PassDuration { get; set; }

        // 通行时间
        // 
        [NameInMap("pass_time")]
        [Validation(Required=true)]
        public string PassTime { get; set; }

        // 通行结果(0:禁止通行,1:允许通行)
        // 
        [NameInMap("pass_result")]
        [Validation(Required=true)]
        public string PassResult { get; set; }

    }

}
