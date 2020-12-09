<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SHUZIWULIU\Models\LogisticLocation;

class ImportDigitalLogisticWaybillLocationRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'desc' => 'desc',
        'location' => 'location',
        'platformDid' => 'platform_did',
        'taxWaybillId' => 'tax_waybill_id',
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
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->location) {
            $res['location'] = [];
            if(null !== $this->location && is_array($this->location)){
                $n = 0;
                foreach($this->location as $item){
                    $res['location'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->taxWaybillId) {
            $res['tax_waybill_id'] = $this->taxWaybillId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ImportDigitalLogisticWaybillLocationRequest
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
        if(isset($map['desc'])){
            $model->desc = $map['desc'];
        }
        if(isset($map['location'])){
            if(!empty($map['location'])){
                $model->location = [];
                $n = 0;
                foreach($map['location'] as $item) {
                    $model->location[$n++] = null !== $item ? LogisticLocation::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['platform_did'])){
            $model->platformDid = $map['platform_did'];
        }
        if(isset($map['tax_waybill_id'])){
            $model->taxWaybillId = $map['tax_waybill_id'];
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

    // 描述信息
    // 
    /**
     * @var string
     */
    public $desc;

    // 运单轨迹信息
    /**
     * @var LogisticLocation[]
     */
    public $location;

    // 所属平台分布式数字身份，缺省时为自己的分布式数字身份
    // 
    /**
     * @var string
     */
    public $platformDid;

    // 运单id
    // 
    /**
     * @var string
     */
    public $taxWaybillId;

}
