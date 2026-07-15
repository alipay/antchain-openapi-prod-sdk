<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class QuerySimilardayRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'runDate' => 'run_date',
        'similarStartDate' => 'similar_start_date',
        'similarEndDate' => 'similar_end_date',
        'similarFeatureType' => 'similar_feature_type',
        'province' => 'province',
    ];
    public function validate() {
        Model::validateRequired('runDate', $this->runDate, true);
        Model::validateRequired('similarStartDate', $this->similarStartDate, true);
        Model::validateRequired('similarEndDate', $this->similarEndDate, true);
        Model::validateRequired('similarFeatureType', $this->similarFeatureType, true);
        Model::validateRequired('province', $this->province, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->runDate) {
            $res['run_date'] = $this->runDate;
        }
        if (null !== $this->similarStartDate) {
            $res['similar_start_date'] = $this->similarStartDate;
        }
        if (null !== $this->similarEndDate) {
            $res['similar_end_date'] = $this->similarEndDate;
        }
        if (null !== $this->similarFeatureType) {
            $res['similar_feature_type'] = $this->similarFeatureType;
        }
        if (null !== $this->province) {
            $res['province'] = $this->province;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QuerySimilardayRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['run_date'])){
            $model->runDate = $map['run_date'];
        }
        if(isset($map['similar_start_date'])){
            $model->similarStartDate = $map['similar_start_date'];
        }
        if(isset($map['similar_end_date'])){
            $model->similarEndDate = $map['similar_end_date'];
        }
        if(isset($map['similar_feature_type'])){
            $model->similarFeatureType = $map['similar_feature_type'];
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

    // 运行日，格式：yyyy-mm-dd
    /**
     * @var string
     */
    public $runDate;

    // 相似日范围开始日，格式：yyyy-mm-dd
    /**
     * @var string
     */
    public $similarStartDate;

    // 相似日范围结束日，yyyy-MM-dd
    /**
     * @var string
     */
    public $similarEndDate;

    // 相似特征类型枚举，枚举范围
    // BIDDING_SPACE: 竞价空间
    // PROVINCIAL_DISPATCH_LOAD: 省调负荷
    // NEW_ENERGY_OUTPUT: 新能源出力
    // INTERCONNECTION_PLAN: 联络线计划
    /**
     * @var string
     */
    public $similarFeatureType;

    // 省地区编码，目前仅支持江苏省
    /**
     * @var string
     */
    public $province;

}
