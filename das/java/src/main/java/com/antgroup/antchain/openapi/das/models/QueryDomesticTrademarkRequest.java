// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryDomesticTrademarkRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商标名称
    @NameInMap("tm_name")
    public String tmName;

    // 商标注册证号
    @NameInMap("tm_reg_num")
    public String tmRegNum;

    // 商标所有人名称
    @NameInMap("tm_owner_name")
    public String tmOwnerName;

    // 商标所有人社会信用统一代码
    @NameInMap("tm_owner_uscc")
    public String tmOwnerUscc;

    // 数据集ID
    @NameInMap("data_set_id")
    @Validation(required = true)
    public String dataSetId;

    // 每页的数量
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 当前页码，从0开始。
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    public static QueryDomesticTrademarkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDomesticTrademarkRequest self = new QueryDomesticTrademarkRequest();
        return TeaModel.build(map, self);
    }

    public QueryDomesticTrademarkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDomesticTrademarkRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDomesticTrademarkRequest setTmName(String tmName) {
        this.tmName = tmName;
        return this;
    }
    public String getTmName() {
        return this.tmName;
    }

    public QueryDomesticTrademarkRequest setTmRegNum(String tmRegNum) {
        this.tmRegNum = tmRegNum;
        return this;
    }
    public String getTmRegNum() {
        return this.tmRegNum;
    }

    public QueryDomesticTrademarkRequest setTmOwnerName(String tmOwnerName) {
        this.tmOwnerName = tmOwnerName;
        return this;
    }
    public String getTmOwnerName() {
        return this.tmOwnerName;
    }

    public QueryDomesticTrademarkRequest setTmOwnerUscc(String tmOwnerUscc) {
        this.tmOwnerUscc = tmOwnerUscc;
        return this;
    }
    public String getTmOwnerUscc() {
        return this.tmOwnerUscc;
    }

    public QueryDomesticTrademarkRequest setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public String getDataSetId() {
        return this.dataSetId;
    }

    public QueryDomesticTrademarkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDomesticTrademarkRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

}
