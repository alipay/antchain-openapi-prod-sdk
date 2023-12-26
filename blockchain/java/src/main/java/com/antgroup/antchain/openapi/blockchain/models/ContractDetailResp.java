// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContractDetailResp extends TeaModel {
    // 合约服务ID
    @NameInMap("service_id")
    public String serviceId;

    // 合约服务名称
    @NameInMap("name")
    public String name;

    // 创建人
    @NameInMap("creator")
    public String creator;

    // 创建时间
    @NameInMap("create_time")
    public Long createTime;

    // 订购产品
    @NameInMap("ordering_products")
    public String orderingProducts;

    // 关联区块链id
    @NameInMap("chan_id")
    public String chanId;

    // 合约状态
    @NameInMap("contract_status")
    public String contractStatus;

    // 合约部署进度当前状态
    @NameInMap("status")
    public String status;

    // 合约部署进度
    @NameInMap("progress_info_list")
    public java.util.List<InstanceProgressInfo> progressInfoList;

    // 实例最近调用记录(暂缓，先不做)
    @NameInMap("record_info_list")
    public java.util.List<InstanceRecordInfo> recordInfoList;

    public static ContractDetailResp build(java.util.Map<String, ?> map) throws Exception {
        ContractDetailResp self = new ContractDetailResp();
        return TeaModel.build(map, self);
    }

    public ContractDetailResp setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ContractDetailResp setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContractDetailResp setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public ContractDetailResp setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ContractDetailResp setOrderingProducts(String orderingProducts) {
        this.orderingProducts = orderingProducts;
        return this;
    }
    public String getOrderingProducts() {
        return this.orderingProducts;
    }

    public ContractDetailResp setChanId(String chanId) {
        this.chanId = chanId;
        return this;
    }
    public String getChanId() {
        return this.chanId;
    }

    public ContractDetailResp setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus;
        return this;
    }
    public String getContractStatus() {
        return this.contractStatus;
    }

    public ContractDetailResp setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ContractDetailResp setProgressInfoList(java.util.List<InstanceProgressInfo> progressInfoList) {
        this.progressInfoList = progressInfoList;
        return this;
    }
    public java.util.List<InstanceProgressInfo> getProgressInfoList() {
        return this.progressInfoList;
    }

    public ContractDetailResp setRecordInfoList(java.util.List<InstanceRecordInfo> recordInfoList) {
        this.recordInfoList = recordInfoList;
        return this;
    }
    public java.util.List<InstanceRecordInfo> getRecordInfoList() {
        return this.recordInfoList;
    }

}
