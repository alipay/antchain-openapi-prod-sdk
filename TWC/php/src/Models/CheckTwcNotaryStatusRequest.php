<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TWC\Models\NotaryCheckMeta;

class CheckTwcNotaryStatusRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'notaryCheckMetaList' => 'notary_check_meta_list',
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
     * @return CheckTwcNotaryStatusRequest
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

    /**
     * @var string
     */
    public $regionName;

    // 存证核验数据组
    /**
     * @var array
     */
    public $notaryCheckMetaList;

}
