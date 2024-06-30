// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class UpdateChaininsightContracttimelineconfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 链上地址：合约 / 存证账户
    @NameInMap("hex_address")
    @Validation(required = true)
    public String hexAddress;

    // 需要更新的区块高度（会更新生效区间包含该高度的时间轴配置）
    @NameInMap("ver")
    @Validation(required = true)
    public String ver;

    // 时间轴配置
    @NameInMap("timeline_config")
    @Validation(required = true)
    public AddressTimelineConfig timelineConfig;

    public static UpdateChaininsightContracttimelineconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateChaininsightContracttimelineconfigRequest self = new UpdateChaininsightContracttimelineconfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateChaininsightContracttimelineconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateChaininsightContracttimelineconfigRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateChaininsightContracttimelineconfigRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateChaininsightContracttimelineconfigRequest setHexAddress(String hexAddress) {
        this.hexAddress = hexAddress;
        return this;
    }
    public String getHexAddress() {
        return this.hexAddress;
    }

    public UpdateChaininsightContracttimelineconfigRequest setVer(String ver) {
        this.ver = ver;
        return this;
    }
    public String getVer() {
        return this.ver;
    }

    public UpdateChaininsightContracttimelineconfigRequest setTimelineConfig(AddressTimelineConfig timelineConfig) {
        this.timelineConfig = timelineConfig;
        return this;
    }
    public AddressTimelineConfig getTimelineConfig() {
        return this.timelineConfig;
    }

}
