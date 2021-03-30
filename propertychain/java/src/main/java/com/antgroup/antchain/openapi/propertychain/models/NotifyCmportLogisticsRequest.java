// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class NotifyCmportLogisticsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 融资编号 	
    // 
    @NameInMap("financial_no")
    @Validation(required = true)
    public String financialNo;

    // 货权编号	
    // 
    @NameInMap("cargo_right_no")
    @Validation(required = true)
    public String cargoRightNo;

    // 获物品名	
    // 
    @NameInMap("goods_type_name")
    @Validation(required = true)
    public String goodsTypeName;

    // 运输条款	
    // 
    @NameInMap("transit_clause")
    @Validation(required = true)
    public String transitClause;

    // 箱子数量	
    // 
    @NameInMap("box_num")
    @Validation(required = true)
    public Long boxNum;

    // 箱型	
    // 
    @NameInMap("box_type")
    public String boxType;

    // 运单信息详情列表	
    @NameInMap("order_info_list")
    @Validation(required = true)
    public java.util.List<OrderInfo> orderInfoList;

    // 上链账户
    @NameInMap("user_did")
    @Validation(required = true)
    public String userDid;

    // 联盟id
    @NameInMap("union_id")
    @Validation(required = true)
    public Long unionId;

    // 渠道名称
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    public static NotifyCmportLogisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyCmportLogisticsRequest self = new NotifyCmportLogisticsRequest();
        return TeaModel.build(map, self);
    }

    public NotifyCmportLogisticsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyCmportLogisticsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyCmportLogisticsRequest setFinancialNo(String financialNo) {
        this.financialNo = financialNo;
        return this;
    }
    public String getFinancialNo() {
        return this.financialNo;
    }

    public NotifyCmportLogisticsRequest setCargoRightNo(String cargoRightNo) {
        this.cargoRightNo = cargoRightNo;
        return this;
    }
    public String getCargoRightNo() {
        return this.cargoRightNo;
    }

    public NotifyCmportLogisticsRequest setGoodsTypeName(String goodsTypeName) {
        this.goodsTypeName = goodsTypeName;
        return this;
    }
    public String getGoodsTypeName() {
        return this.goodsTypeName;
    }

    public NotifyCmportLogisticsRequest setTransitClause(String transitClause) {
        this.transitClause = transitClause;
        return this;
    }
    public String getTransitClause() {
        return this.transitClause;
    }

    public NotifyCmportLogisticsRequest setBoxNum(Long boxNum) {
        this.boxNum = boxNum;
        return this;
    }
    public Long getBoxNum() {
        return this.boxNum;
    }

    public NotifyCmportLogisticsRequest setBoxType(String boxType) {
        this.boxType = boxType;
        return this;
    }
    public String getBoxType() {
        return this.boxType;
    }

    public NotifyCmportLogisticsRequest setOrderInfoList(java.util.List<OrderInfo> orderInfoList) {
        this.orderInfoList = orderInfoList;
        return this;
    }
    public java.util.List<OrderInfo> getOrderInfoList() {
        return this.orderInfoList;
    }

    public NotifyCmportLogisticsRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public NotifyCmportLogisticsRequest setUnionId(Long unionId) {
        this.unionId = unionId;
        return this;
    }
    public Long getUnionId() {
        return this.unionId;
    }

    public NotifyCmportLogisticsRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

}
