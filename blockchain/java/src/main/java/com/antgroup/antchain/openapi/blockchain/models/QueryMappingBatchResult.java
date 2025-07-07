// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryMappingBatchResult extends TeaModel {
    // 本次查询获取的账户信息
    @NameInMap("accounts")
    @Validation(required = true)
    public java.util.List<AccountMappingInfo> accounts;

    // 该商户下总共映射账户的数量
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("total_num")
    @Validation(required = true)
    public Long totalNum;

    // 该商户下账户信息的总页数
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("total_page")
    @Validation(required = true)
    public Long totalPage;

    public static QueryMappingBatchResult build(java.util.Map<String, ?> map) throws Exception {
        QueryMappingBatchResult self = new QueryMappingBatchResult();
        return TeaModel.build(map, self);
    }

    public QueryMappingBatchResult setAccounts(java.util.List<AccountMappingInfo> accounts) {
        this.accounts = accounts;
        return this;
    }
    public java.util.List<AccountMappingInfo> getAccounts() {
        return this.accounts;
    }

    public QueryMappingBatchResult setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public QueryMappingBatchResult setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

}
