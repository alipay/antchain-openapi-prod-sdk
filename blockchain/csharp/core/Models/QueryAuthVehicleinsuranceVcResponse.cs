// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryAuthVehicleinsuranceVcResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 上次交强险投保年月
        [NameInMap("last_insurance_date")]
        [Validation(Required=false)]
        public string LastInsuranceDate { get; set; }

        // 初次投保日期
        [NameInMap("first_insurance_date")]
        [Validation(Required=false)]
        public string FirstInsuranceDate { get; set; }

        // 最近交强险投保期止
        [NameInMap("latest_insurance_date")]
        [Validation(Required=false)]
        public string LatestInsuranceDate { get; set; }

        // 车辆did
        [NameInMap("vehicle_did")]
        [Validation(Required=false)]
        public string VehicleDid { get; set; }

        // 车主did
        [NameInMap("owner_user_did")]
        [Validation(Required=false)]
        public string OwnerUserDid { get; set; }

        // 可验证声明id
        [NameInMap("vc_id")]
        [Validation(Required=false)]
        public string VcId { get; set; }

        // 业务提供方代码
        [NameInMap("isp_type")]
        [Validation(Required=false)]
        public long? IspType { get; set; }

    }

}
