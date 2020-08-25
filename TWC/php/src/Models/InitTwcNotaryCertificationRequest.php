<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TWC\Models\Identity;
use AntChain\TWC\Models\NotaryInfo;

class InitTwcNotaryCertificationRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'applier' => 'applier',
        'notaryInfo' => 'notary_info',
        'type' => 'type',
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
        if (null !== $this->applier) {
            $res['applier'] = null !== $this->applier ? $this->applier->toMap() : null;
        }
        if (null !== $this->notaryInfo) {
            $res['notary_info'] = [];
            if(null !== $this->notaryInfo && is_array($this->notaryInfo)){
                $n = 0;
                foreach($this->notaryInfo as $item){
                    $res['notary_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return InitTwcNotaryCertificationRequest
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
        if(isset($map['applier'])){
            $model->applier = Identity::fromMap($map['applier']);
        }
        if(isset($map['notary_info'])){
            if(!empty($map['notary_info'])){
                $model->notaryInfo = [];
                $n = 0;
                foreach($map['notary_info'] as $item) {
                    $model->notaryInfo[$n++] = null !== $item ? NotaryInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
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

    // 申请人的身份信息
    /**
     * @var Identity
     */
    public $applier;

    // 存证证明所要展示的存证信息，可填多个
    /**
     * @var array
     */
    public $notaryInfo;

    // 存证证明的类型：STANDARD（标准存证证明）或COPYRIGHT（版权存证证明），默认为COPYRIGHT
    /**
     * @var string
     */
    public $type;

}
