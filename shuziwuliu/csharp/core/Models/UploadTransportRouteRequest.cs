// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class UploadTransportRouteRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 目的地省市区，要求格式 XX省-XX市-XX区，比如四川省-成都市-青白江区。当线路类型为STOCK_IN（即入库物流）时，此字段必填
        [NameInMap("end_address")]
        [Validation(Required=false)]
        public string EndAddress { get; set; }

        // 目的地详细地址，街道村社区道路楼宇门牌号。当线路类型为STOCK_IN（即入库物流）时，此字段必填
        [NameInMap("end_detailed_address")]
        [Validation(Required=false)]
        public string EndDetailedAddress { get; set; }

        // 起始地省市区，要求格式 XX省-XX市-XX区。比如浙江省-杭州市-余杭区。当线路类型为STOCK_OUT（即出库物流）时，此字段必填
        [NameInMap("start_address")]
        [Validation(Required=false)]
        public string StartAddress { get; set; }

        // 起始地详细地址，街道村社区道路楼宇门牌号。当线路类型为STOCK_OUT（即出库物流）时，此字段必填
        [NameInMap("start_detailed_address")]
        [Validation(Required=false)]
        public string StartDetailedAddress { get; set; }

        // 3plDid
        [NameInMap("third_party_logistics_did")]
        [Validation(Required=true)]
        public string ThirdPartyLogisticsDid { get; set; }

        // 运输合同编号
        [NameInMap("transport_contract_code")]
        [Validation(Required=true)]
        public string TransportContractCode { get; set; }

        // 运输线路编码
        [NameInMap("transport_route_code")]
        [Validation(Required=true)]
        public string TransportRouteCode { get; set; }

        // 线路类型，以下二选一填写（可填STOCK_OUT、STOCK_IN）。注：以上分别表示出库物流、入库物流
        [NameInMap("route_type")]
        [Validation(Required=true)]
        public string RouteType { get; set; }

    }

}
