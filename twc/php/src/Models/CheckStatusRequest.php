<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TWC\Models\NotaryCheckMeta;

class CheckStatusRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'notaryCheckMetaList' => 'notary_check_meta_list',
    ];
    public function validate() {
        Model::validateRequired('notaryCheckMetaList', $this->notaryCheckMetaList, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->notaryCheckMetaList) {
            $res['notary_check_meta_list'] = [];
            if(null !== $this->notaryCheckMetaList && is_array($this->notaryCheckMetaList)){
                $n = 0;
                foreach($this->notaryCheckMetaList as $item){
                    $res['notary_check_meta_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CheckStatusRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['notary_check_meta_list'])){
            if(!empty($map['notary_check_meta_list'])){
                $model->notaryCheckMetaList = [];
                $n = 0;
                foreach($map['notary_check_meta_list'] as $item) {
                    $model->notaryCheckMetaList[$n++] = null !== $item ? NotaryCheckMeta::fromMap($item) : $item;
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

    // 存证核验数据组
    /**
     * @var NotaryCheckMeta[]
     */
    public $notaryCheckMetaList;

}
