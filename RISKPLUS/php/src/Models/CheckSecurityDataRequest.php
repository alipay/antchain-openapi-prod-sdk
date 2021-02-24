<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CheckSecurityDataRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'reqInfo' => 'req_info',
    ];
    public function validate() {
        Model::validateRequired('reqInfo', $this->reqInfo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->reqInfo) {
            $res['req_info'] = $this->reqInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CheckSecurityDataRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['req_info'])){
            $model->reqInfo = $map['req_info'];
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

    // 入参为Map转换后的String
    /**
     * @var string
     */
    public $reqInfo;

}
