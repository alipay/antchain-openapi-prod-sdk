// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiidentify.models;

import com.aliyun.tea.*;

public class QueryIdentifypointResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 品类名称
    @NameInMap("category_name")
    public String categoryName;

    // 品牌名称
    @NameInMap("brand_name")
    public String brandName;

    // 款式名称
    @NameInMap("style_name")
    public String styleName;

    // 款式编号
    @NameInMap("style_code")
    public String styleCode;

    // 至少上传鉴定点数量
    @NameInMap("at_least_num")
    public Long atLeastNum;

    // 鉴定点信息列表
    @NameInMap("identify_point_list")
    public java.util.List<IdentifyPointResp> identifyPointList;

    public static QueryIdentifypointResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIdentifypointResponse self = new QueryIdentifypointResponse();
        return TeaModel.build(map, self);
    }

    public QueryIdentifypointResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIdentifypointResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIdentifypointResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIdentifypointResponse setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public QueryIdentifypointResponse setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }
    public String getBrandName() {
        return this.brandName;
    }

    public QueryIdentifypointResponse setStyleName(String styleName) {
        this.styleName = styleName;
        return this;
    }
    public String getStyleName() {
        return this.styleName;
    }

    public QueryIdentifypointResponse setStyleCode(String styleCode) {
        this.styleCode = styleCode;
        return this;
    }
    public String getStyleCode() {
        return this.styleCode;
    }

    public QueryIdentifypointResponse setAtLeastNum(Long atLeastNum) {
        this.atLeastNum = atLeastNum;
        return this;
    }
    public Long getAtLeastNum() {
        return this.atLeastNum;
    }

    public QueryIdentifypointResponse setIdentifyPointList(java.util.List<IdentifyPointResp> identifyPointList) {
        this.identifyPointList = identifyPointList;
        return this;
    }
    public java.util.List<IdentifyPointResp> getIdentifyPointList() {
        return this.identifyPointList;
    }

}
