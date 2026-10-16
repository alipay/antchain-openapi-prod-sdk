// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class QueryUsedcarAreaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 响应码
    @NameInMap("code")
    public String code;

    // 响应信息
    @NameInMap("msg")
    public String msg;

    // 省份集合
    @NameInMap("province")
    public java.util.List<Province> province;

    // 城市集合
    @NameInMap("city")
    public java.util.List<City> city;

    // 区县集合
    @NameInMap("county")
    public java.util.List<County> county;

    public static QueryUsedcarAreaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUsedcarAreaResponse self = new QueryUsedcarAreaResponse();
        return TeaModel.build(map, self);
    }

    public QueryUsedcarAreaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUsedcarAreaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUsedcarAreaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUsedcarAreaResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUsedcarAreaResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryUsedcarAreaResponse setProvince(java.util.List<Province> province) {
        this.province = province;
        return this;
    }
    public java.util.List<Province> getProvince() {
        return this.province;
    }

    public QueryUsedcarAreaResponse setCity(java.util.List<City> city) {
        this.city = city;
        return this;
    }
    public java.util.List<City> getCity() {
        return this.city;
    }

    public QueryUsedcarAreaResponse setCounty(java.util.List<County> county) {
        this.county = county;
        return this;
    }
    public java.util.List<County> getCounty() {
        return this.county;
    }

}
