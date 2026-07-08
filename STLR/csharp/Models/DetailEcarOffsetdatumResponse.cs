// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class DetailEcarOffsetdatumResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 碳补偿项目编码
        [NameInMap("project_no")]
        [Validation(Required=false)]
        public string ProjectNo { get; set; }

        // 碳普惠项目名称
        [NameInMap("project_name")]
        [Validation(Required=false)]
        public string ProjectName { get; set; }

        // 会员账户DID
        [NameInMap("account_did")]
        [Validation(Required=false)]
        public string AccountDid { get; set; }

        // 采集数据单号
        // 
        [NameInMap("acquisition_item_no")]
        [Validation(Required=false)]
        public string AcquisitionItemNo { get; set; }

        // 发生时间
        [NameInMap("occurrent_time")]
        [Validation(Required=false)]
        public string OccurrentTime { get; set; }

        // 发生场景编码
        [NameInMap("scenario_code")]
        [Validation(Required=false)]
        public string ScenarioCode { get; set; }

        // 发生场景名称
        [NameInMap("scenario_name")]
        [Validation(Required=false)]
        public string ScenarioName { get; set; }

        // 碳普惠平台编码，如果非平台采集数据，则显示为自采编码：Self
        [NameInMap("platform_no")]
        [Validation(Required=false)]
        public string PlatformNo { get; set; }

        // 减碳量
        [NameInMap("offset_volume")]
        [Validation(Required=false)]
        public string OffsetVolume { get; set; }

        // 碳能量值
        [NameInMap("carbon_energy")]
        [Validation(Required=false)]
        public long? CarbonEnergy { get; set; }

        // 活动数据详情列表
        [NameInMap("active_data_list")]
        [Validation(Required=false)]
        public List<CarbonOffsetActiveDataDetail> ActiveDataList { get; set; }

    }

}
