<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RISKPLUS\Models\SecurityDataQueryStruct;

class QuerySecurityDataRequest extends Model {
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
            $res['req_info'] = [];
            if(null !== $this->reqInfo && is_array($this->reqInfo)){
                $n = 0;
                foreach($this->reqInfo as $item){
                    $res['req_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QuerySecurityDataRequest
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
            if(!empty($map['req_info'])){
                $model->reqInfo = [];
                $n = 0;
                foreach($map['req_info'] as $item) {
                    $model->reqInfo[$n++] = null !== $item ? SecurityDataQueryStruct::fromMap($item) : $item;
                }
            }
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
     * @var SecurityDataQueryStruct[]
     */
    public $reqInfo;

}
