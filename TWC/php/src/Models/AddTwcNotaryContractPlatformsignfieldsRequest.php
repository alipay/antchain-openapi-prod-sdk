<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TWC\Models\ContractPlatformSignFieldApplication;

class AddTwcNotaryContractPlatformsignfieldsRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'flowId' => 'flow_id',
        'signfields' => 'signfields',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->signfields) {
            $res['signfields'] = null !== $this->signfields ? $this->signfields->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AddTwcNotaryContractPlatformsignfieldsRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['flow_id'])){
            $model->flowId = $map['flow_id'];
        }
        if(isset($map['signfields'])){
            $model->signfields = ContractPlatformSignFieldApplication::fromMap($map['signfields']);
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 流程id
    /**
     * @var string
     */
    public $flowId;

    // 签署区列表数据
    /**
     * @var ContractPlatformSignFieldApplication
     */
    public $signfields;

}
