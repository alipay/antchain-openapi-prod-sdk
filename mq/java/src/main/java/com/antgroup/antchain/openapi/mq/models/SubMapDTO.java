// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class SubMapDTO extends TeaModel {
    // cell name
    @NameInMap("cell")
    public String cell;

    // 该 Group ID 客户端消费记录的明细列表
    // 
    // 
    @NameInMap("client_list")
    @Validation(required = true)
    public java.util.List<SubClientInfoDTO> clientList;

    // 该 Group ID 消费失败次数统计
    @NameInMap("fail_count")
    @Validation(required = true)
    public Long failCount;

    // 消费方 Group ID
    @NameInMap("sub_group_name")
    @Validation(required = true)
    public String subGroupName;

    // 该 Group ID 消费成功次数统计
    @NameInMap("success_count")
    @Validation(required = true)
    public Long successCount;

    public static SubMapDTO build(java.util.Map<String, ?> map) throws Exception {
        SubMapDTO self = new SubMapDTO();
        return TeaModel.build(map, self);
    }

    public SubMapDTO setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public SubMapDTO setClientList(java.util.List<SubClientInfoDTO> clientList) {
        this.clientList = clientList;
        return this;
    }
    public java.util.List<SubClientInfoDTO> getClientList() {
        return this.clientList;
    }

    public SubMapDTO setFailCount(Long failCount) {
        this.failCount = failCount;
        return this;
    }
    public Long getFailCount() {
        return this.failCount;
    }

    public SubMapDTO setSubGroupName(String subGroupName) {
        this.subGroupName = subGroupName;
        return this;
    }
    public String getSubGroupName() {
        return this.subGroupName;
    }

    public SubMapDTO setSuccessCount(Long successCount) {
        this.successCount = successCount;
        return this;
    }
    public Long getSuccessCount() {
        return this.successCount;
    }

}
