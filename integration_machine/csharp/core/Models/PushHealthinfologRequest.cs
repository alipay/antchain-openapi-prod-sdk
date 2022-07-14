// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTEGRATION_MACHINE.Models
{
    public class PushHealthinfologRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 通行记录ID
        [NameInMap("pass_id")]
        [Validation(Required=true)]
        public string PassId { get; set; }

        // 设备SN
        [NameInMap("serial_no")]
        [Validation(Required=true)]
        public string SerialNo { get; set; }

        // 设备厂商
        // 
        [NameInMap("corp_name")]
        [Validation(Required=true)]
        public string CorpName { get; set; }

        // 通行时长(ms)
        [NameInMap("cost_time")]
        [Validation(Required=true)]
        public long? CostTime { get; set; }

        // 通行结果
        [NameInMap("pass_result")]
        [Validation(Required=false)]
        public string PassResult { get; set; }

        // 被查询人姓名
        // 
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 被查询人身份证号
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

        // 异常类型
        [NameInMap("error_type")]
        [Validation(Required=false)]
        public string ErrorType { get; set; }

        // 错误码
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 错误信息
        [NameInMap("error_msg")]
        [Validation(Required=false)]
        public string ErrorMsg { get; set; }

        // 体温
        [NameInMap("temperature")]
        [Validation(Required=false)]
        public string Temperature { get; set; }

        // 健康信息
        [NameInMap("health_info")]
        [Validation(Required=false)]
        public HealthInfo HealthInfo { get; set; }

        // 核酸信息
        [NameInMap("nucleic_acid_info")]
        [Validation(Required=false)]
        public NucleicAcidInfo NucleicAcidInfo { get; set; }

        // 行程信息
        // 
        [NameInMap("travel_info")]
        [Validation(Required=false)]
        public TravelInfo TravelInfo { get; set; }

        // 疫苗接种信息
        [NameInMap("vaccination_info")]
        [Validation(Required=false)]
        public VaccinationInfo VaccinationInfo { get; set; }

        // 抗原信息
        [NameInMap("antigen_info")]
        [Validation(Required=false)]
        public AntigenInfo AntigenInfo { get; set; }

        // 场所信息
        // 
        [NameInMap("scene_info")]
        [Validation(Required=false)]
        public SceneInfo SceneInfo { get; set; }

        // 通行方式(1:自动刷脸, 2:刷证非1:1, 3:刷证1:1, 4:反扫, 5:刷奥智定制卡, 6:手动刷脸)
        [NameInMap("pass_mode")]
        [Validation(Required=false)]
        public string PassMode { get; set; }

        // 经度
        [NameInMap("longitude")]
        [Validation(Required=false)]
        public string Longitude { get; set; }

        // 纬度
        [NameInMap("latitude")]
        [Validation(Required=false)]
        public string Latitude { get; set; }

        // 数据源通行状态 0:禁止通行,1:允许通行
        [NameInMap("channel_pass_state")]
        [Validation(Required=false)]
        public string ChannelPassState { get; set; }

    }

}
