<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AIOSPRODUCT\Models;

use AlibabaCloud\Tea\Model;

class QueryGwchildinsuranceProfiledetailRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenanatId' => 'tenanat_id',
        'requestData' => 'request_data',
    ];
    public function validate() {
        Model::validateRequired('tenanatId', $this->tenanatId, true);
        Model::validateRequired('requestData', $this->requestData, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->tenanatId) {
            $res['tenanat_id'] = $this->tenanatId;
        }
        if (null !== $this->requestData) {
            $res['request_data'] = $this->requestData;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryGwchildinsuranceProfiledetailRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['tenanat_id'])){
            $model->tenanatId = $map['tenanat_id'];
        }
        if(isset($map['request_data'])){
            $model->requestData = $map['request_data'];
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

    // 当前联调租户；必须精确命中 finaigateway 发布白名单
    /**
     * @var string
     */
    public $tenanatId;

    // 输入参数
    /**
     * @var string
     */
    public $requestData;

}
