// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AntChainPurposeResponse extends TeaModel {
    // 用户申报用途状态
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    public String status;

    // 已申报的用途，比如供应链金融
    /**
     * <strong>example:</strong>
     * <p>已申报的用途，比如供应链金融</p>
     */
    @NameInMap("purpose")
    public String purpose;

    // 申报时间
    /**
     * <strong>example:</strong>
     * <p>21-1-1</p>
     */
    @NameInMap("create_time")
    public String createTime;

    // 简短说明用途
    /**
     * <strong>example:</strong>
     * <p>简短说明用途</p>
     */
    @NameInMap("chain_purpose_item")
    public String chainPurposeItem;

    // 用途详情
    /**
     * <strong>example:</strong>
     * <p>用途详情</p>
     */
    @NameInMap("chain_purpose_extend")
    public String chainPurposeExtend;

    // 申请用途列表
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("record_list")
    public java.util.List<ChainPurpose> recordList;

    public static AntChainPurposeResponse build(java.util.Map<String, ?> map) throws Exception {
        AntChainPurposeResponse self = new AntChainPurposeResponse();
        return TeaModel.build(map, self);
    }

    public AntChainPurposeResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AntChainPurposeResponse setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }
    public String getPurpose() {
        return this.purpose;
    }

    public AntChainPurposeResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public AntChainPurposeResponse setChainPurposeItem(String chainPurposeItem) {
        this.chainPurposeItem = chainPurposeItem;
        return this;
    }
    public String getChainPurposeItem() {
        return this.chainPurposeItem;
    }

    public AntChainPurposeResponse setChainPurposeExtend(String chainPurposeExtend) {
        this.chainPurposeExtend = chainPurposeExtend;
        return this;
    }
    public String getChainPurposeExtend() {
        return this.chainPurposeExtend;
    }

    public AntChainPurposeResponse setRecordList(java.util.List<ChainPurpose> recordList) {
        this.recordList = recordList;
        return this;
    }
    public java.util.List<ChainPurpose> getRecordList() {
        return this.recordList;
    }

}
