// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DistributionUser extends TeaModel {
    // 用户创建时间
    /**
     * <strong>example:</strong>
     * <p>2018-01-02 20:00:00</p>
     */
    @NameInMap("create_time")
    @Validation(required = true)
    public String createTime;

    // 用户手机号
    /**
     * <strong>example:</strong>
     * <p>13000005555</p>
     */
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 用户唯一标识
    /**
     * <strong>example:</strong>
     * <p>000:111:222:333</p>
     */
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static DistributionUser build(java.util.Map<String, ?> map) throws Exception {
        DistributionUser self = new DistributionUser();
        return TeaModel.build(map, self);
    }

    public DistributionUser setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DistributionUser setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public DistributionUser setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
