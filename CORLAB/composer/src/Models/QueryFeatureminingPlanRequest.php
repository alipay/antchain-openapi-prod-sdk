<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CORLAB\Models;

use AlibabaCloud\Tea\Model;

class QueryFeatureminingPlanRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'planNo' => 'plan_no',
    ];
    public function validate() {
        Model::validateRequired('planNo', $this->planNo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->planNo) {
            $res['plan_no'] = $this->planNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryFeatureminingPlanRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['plan_no'])){
            $model->planNo = $map['plan_no'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 特征计划任务ID
    /**
     * @var string
     */
    public $planNo;

}
