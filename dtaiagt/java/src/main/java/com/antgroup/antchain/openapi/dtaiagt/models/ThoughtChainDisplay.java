// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class ThoughtChainDisplay extends TeaModel {
    // 思维链显示状态
    /**
     * <strong>example:</strong>
     * <p>思维链显示状态</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 思维链显示名称
    /**
     * <strong>example:</strong>
     * <p>思维链显示名称</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 思维链类型
    /**
     * <strong>example:</strong>
     * <p>思维链类型</p>
     */
    @NameInMap("sub_type")
    @Validation(required = true)
    public String subType;

    // 思维链图标
    /**
     * <strong>example:</strong>
     * <p>思维链图标</p>
     */
    @NameInMap("icon")
    @Validation(required = true)
    public String icon;

    // 思维链模块额外信息
    /**
     * <strong>example:</strong>
     * <p>思维链模块额外信息</p>
     */
    @NameInMap("result_msg")
    @Validation(required = true)
    public String resultMsg;

    public static ThoughtChainDisplay build(java.util.Map<String, ?> map) throws Exception {
        ThoughtChainDisplay self = new ThoughtChainDisplay();
        return TeaModel.build(map, self);
    }

    public ThoughtChainDisplay setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ThoughtChainDisplay setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ThoughtChainDisplay setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public ThoughtChainDisplay setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public ThoughtChainDisplay setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

}
