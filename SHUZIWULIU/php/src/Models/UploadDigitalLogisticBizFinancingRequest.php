<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SHUZIWULIU\Models\UploadFinancingParam;

class UploadDigitalLogisticBizFinancingRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'financingData' => 'financing_data',
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
        if (null !== $this->financingData) {
            $res['financing_data'] = [];
            if(null !== $this->financingData && is_array($this->financingData)){
                $n = 0;
                foreach($this->financingData as $item){
                    $res['financing_data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UploadDigitalLogisticBizFinancingRequest
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
        if(isset($map['financing_data'])){
            if(!empty($map['financing_data'])){
                $model->financingData = [];
                $n = 0;
                foreach($map['financing_data'] as $item) {
                    $model->financingData[$n++] = null !== $item ? UploadFinancingParam::fromMap($item) : $item;
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

    // 融资数据
    /**
     * @var UploadFinancingParam[]
     */
    public $financingData;

}
