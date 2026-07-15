<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class QueryBiddingspaceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'queryDate' => 'query_date',
        'busiType' => 'busi_type',
        'deviationType' => 'deviation_type',
        'province' => 'province',
    ];
    public function validate() {
        Model::validateRequired('queryDate', $this->queryDate, true);
        Model::validateRequired('busiType', $this->busiType, true);
        Model::validateRequired('deviationType', $this->deviationType, true);
        Model::validateRequired('province', $this->province, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->queryDate) {
            $res['query_date'] = $this->queryDate;
        }
        if (null !== $this->busiType) {
            $res['busi_type'] = $this->busiType;
        }
        if (null !== $this->deviationType) {
            $res['deviation_type'] = $this->deviationType;
        }
        if (null !== $this->province) {
            $res['province'] = $this->province;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBiddingspaceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['query_date'])){
            $model->queryDate = $map['query_date'];
        }
        if(isset($map['busi_type'])){
            $model->busiType = $map['busi_type'];
        }
        if(isset($map['deviation_type'])){
            $model->deviationType = $map['deviation_type'];
        }
        if(isset($map['province'])){
            $model->province = $map['province'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 运行日期，yyyy-mm-dd
    /**
     * @var string
     */
    public $queryDate;

    // 业务类型枚举，枚举范围如下
    // BIDDING_SPACE: 竞价空间
    // 
    /**
     * @var string
     */
    public $busiType;

    // 业务偏差类型枚举，枚举范围：
    // DAY_AHEAD_ACTUAL: 日前-实际
    // DAY_AHEAD_FORECAST: 日前-预测
    // PRE_CLEARING_ACTUAL: 预出清-实际
    // PRE_CLEARING_FORECAST: 预出清-预测
    // ACTUAL_FORECAST: 实际-预测
    // PRE_CLEARING: 预出清
    // DAY_AHEAD: 日前
    // REAL_TIME: 实时
    // ACTUAL: 实际
    /**
     * @var string
     */
    public $deviationType;

    // 省地区编码，目前仅支持江苏省
    /**
     * @var string
     */
    public $province;

}
