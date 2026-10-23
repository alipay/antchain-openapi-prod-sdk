// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class PushAdvisormarketAnalysisRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 分析能力标识。当前仅支持 YINLI_CROWD_ANALYSIS。
        [NameInMap("analysis_type")]
        [Validation(Required=true)]
        public string AnalysisType { get; set; }

        // UTF-8 JSON 对象字符串，禁止二次编码。示例：{"city":"深圳","time_range":{"start_date":"2026-09-01","end_date":"2026-09-30"},"business_area":{"name":"中心商圈","aoi":{"geometry":{"type":"Polygon","coordinates":[[[114,22],[115,22],[114,23],[114,22]]]}},"reachable_aoi":{"geometry":{"type":"Polygon","coordinates":[[[113,21],[116,21],[113,24],[113,21]]]}}},"audience_path":"/a.txt.pgp"}。日期格式为 YYYY-MM-DD；两个 coordinates 均为闭合的 GeoJSON Polygon；audience_path 必须以 .txt.pgp 结尾。
        [NameInMap("input")]
        [Validation(Required=true)]
        public string Input { get; set; }

    }

}
