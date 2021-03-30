// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UploadTransportRouteRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 目的地省市区，要求格式 XX省-XX市-XX区，比如四川省-成都市-青白江区。当线路类型为STOCK_IN（即入库物流）时，此字段必填
    @NameInMap("end_address")
    public String endAddress;

    // 目的地详细地址，街道村社区道路楼宇门牌号。当线路类型为STOCK_IN（即入库物流）时，此字段必填
    @NameInMap("end_detailed_address")
    public String endDetailedAddress;

    // 起始地省市区，要求格式 XX省-XX市-XX区。比如浙江省-杭州市-余杭区。当线路类型为STOCK_OUT（即出库物流）时，此字段必填
    @NameInMap("start_address")
    public String startAddress;

    // 起始地详细地址，街道村社区道路楼宇门牌号。当线路类型为STOCK_OUT（即出库物流）时，此字段必填
    @NameInMap("start_detailed_address")
    public String startDetailedAddress;

    // 3plDid
    @NameInMap("third_party_logistics_did")
    @Validation(required = true)
    public String thirdPartyLogisticsDid;

    // 运输合同编号
    @NameInMap("transport_contract_code")
    @Validation(required = true)
    public String transportContractCode;

    // 运输线路编码
    @NameInMap("transport_route_code")
    @Validation(required = true)
    public String transportRouteCode;

    // 线路类型，以下二选一填写（可填STOCK_OUT、STOCK_IN）。注：以上分别表示出库物流、入库物流
    @NameInMap("route_type")
    @Validation(required = true)
    public String routeType;

    public static UploadTransportRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadTransportRouteRequest self = new UploadTransportRouteRequest();
        return TeaModel.build(map, self);
    }

    public UploadTransportRouteRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadTransportRouteRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadTransportRouteRequest setEndAddress(String endAddress) {
        this.endAddress = endAddress;
        return this;
    }
    public String getEndAddress() {
        return this.endAddress;
    }

    public UploadTransportRouteRequest setEndDetailedAddress(String endDetailedAddress) {
        this.endDetailedAddress = endDetailedAddress;
        return this;
    }
    public String getEndDetailedAddress() {
        return this.endDetailedAddress;
    }

    public UploadTransportRouteRequest setStartAddress(String startAddress) {
        this.startAddress = startAddress;
        return this;
    }
    public String getStartAddress() {
        return this.startAddress;
    }

    public UploadTransportRouteRequest setStartDetailedAddress(String startDetailedAddress) {
        this.startDetailedAddress = startDetailedAddress;
        return this;
    }
    public String getStartDetailedAddress() {
        return this.startDetailedAddress;
    }

    public UploadTransportRouteRequest setThirdPartyLogisticsDid(String thirdPartyLogisticsDid) {
        this.thirdPartyLogisticsDid = thirdPartyLogisticsDid;
        return this;
    }
    public String getThirdPartyLogisticsDid() {
        return this.thirdPartyLogisticsDid;
    }

    public UploadTransportRouteRequest setTransportContractCode(String transportContractCode) {
        this.transportContractCode = transportContractCode;
        return this;
    }
    public String getTransportContractCode() {
        return this.transportContractCode;
    }

    public UploadTransportRouteRequest setTransportRouteCode(String transportRouteCode) {
        this.transportRouteCode = transportRouteCode;
        return this;
    }
    public String getTransportRouteCode() {
        return this.transportRouteCode;
    }

    public UploadTransportRouteRequest setRouteType(String routeType) {
        this.routeType = routeType;
        return this;
    }
    public String getRouteType() {
        return this.routeType;
    }

}
