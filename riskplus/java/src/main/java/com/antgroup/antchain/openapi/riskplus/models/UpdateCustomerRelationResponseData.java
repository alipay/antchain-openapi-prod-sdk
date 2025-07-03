// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class UpdateCustomerRelationResponseData extends TeaModel {
    // id
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("id")
    public Long id;

    // 渠道编码
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("channel_code")
    public String channelCode;

    // 渠道id
    /**
     * <strong>example:</strong>
     * <p>123AA</p>
     */
    @NameInMap("channel_no")
    public String channelNo;

    // 客户号
    /**
     * <strong>example:</strong>
     * <p>PCM123</p>
     */
    @NameInMap("customer_no")
    public String customerNo;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("create_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createTime;

    // 更新时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("update_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String updateTime;

    public static UpdateCustomerRelationResponseData build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomerRelationResponseData self = new UpdateCustomerRelationResponseData();
        return TeaModel.build(map, self);
    }

    public UpdateCustomerRelationResponseData setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateCustomerRelationResponseData setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public UpdateCustomerRelationResponseData setChannelNo(String channelNo) {
        this.channelNo = channelNo;
        return this;
    }
    public String getChannelNo() {
        return this.channelNo;
    }

    public UpdateCustomerRelationResponseData setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
        return this;
    }
    public String getCustomerNo() {
        return this.customerNo;
    }

    public UpdateCustomerRelationResponseData setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public UpdateCustomerRelationResponseData setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
