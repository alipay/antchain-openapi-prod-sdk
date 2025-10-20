// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class MCPServerQueryPageGatewayRequest extends TeaModel {
    // 空间id
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("space_id")
    @Validation(required = true)
    public String spaceId;

    // 运行模式
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("run_mode")
    public String runMode;

    // 来源
    /**
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("source")
    public String source;

    // 查询条件
    /**
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("query")
    public String query;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 分页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static MCPServerQueryPageGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        MCPServerQueryPageGatewayRequest self = new MCPServerQueryPageGatewayRequest();
        return TeaModel.build(map, self);
    }

    public MCPServerQueryPageGatewayRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public MCPServerQueryPageGatewayRequest setRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }
    public String getRunMode() {
        return this.runMode;
    }

    public MCPServerQueryPageGatewayRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public MCPServerQueryPageGatewayRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public MCPServerQueryPageGatewayRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public MCPServerQueryPageGatewayRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
