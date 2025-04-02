// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SecurityScene extends TeaModel {
    // 接入渠道
    @NameInMap("access_channel")
    public String accessChannel;

    // 事件信息
    @NameInMap("ctu_params")
    public String ctuParams;

    // 产品名称
    @NameInMap("product_name")
    public String productName;

    // 产品节点
    @NameInMap("product_node")
    public String productNode;

    // 扩展参数
    @NameInMap("security_scene_params")
    public String securitySceneParams;

    // 系统名称
    @NameInMap("system_name")
    public String systemName;

    // 总金额
    @NameInMap("total_fee")
    public String totalFee;

    public static SecurityScene build(java.util.Map<String, ?> map) throws Exception {
        SecurityScene self = new SecurityScene();
        return TeaModel.build(map, self);
    }

    public SecurityScene setAccessChannel(String accessChannel) {
        this.accessChannel = accessChannel;
        return this;
    }
    public String getAccessChannel() {
        return this.accessChannel;
    }

    public SecurityScene setCtuParams(String ctuParams) {
        this.ctuParams = ctuParams;
        return this;
    }
    public String getCtuParams() {
        return this.ctuParams;
    }

    public SecurityScene setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public SecurityScene setProductNode(String productNode) {
        this.productNode = productNode;
        return this;
    }
    public String getProductNode() {
        return this.productNode;
    }

    public SecurityScene setSecuritySceneParams(String securitySceneParams) {
        this.securitySceneParams = securitySceneParams;
        return this;
    }
    public String getSecuritySceneParams() {
        return this.securitySceneParams;
    }

    public SecurityScene setSystemName(String systemName) {
        this.systemName = systemName;
        return this;
    }
    public String getSystemName() {
        return this.systemName;
    }

    public SecurityScene setTotalFee(String totalFee) {
        this.totalFee = totalFee;
        return this;
    }
    public String getTotalFee() {
        return this.totalFee;
    }

}
