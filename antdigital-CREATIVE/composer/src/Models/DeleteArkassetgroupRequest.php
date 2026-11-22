<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

class DeleteArkassetgroupRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'requestBody' => 'request_body',
    ];
    public function validate() {
        Model::validateRequired('requestBody', $this->requestBody, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->requestBody) {
            $res['request_body'] = $this->requestBody;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DeleteArkassetgroupRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['request_body'])){
            $model->requestBody = $map['request_body'];
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

    // {"Id":"group-20240514212750-b5e9m","ProjectName":"default"}
    /**
     * @var string
     */
    public $requestBody;

}
