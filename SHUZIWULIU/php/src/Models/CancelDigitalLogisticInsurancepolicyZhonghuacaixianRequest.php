<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'polNo' => 'pol_no',
        'preMium' => 'pre_mium',
        'tradeNo' => 'trade_no',
    ];
    public function validate() {
        Model::validateMaxLength('polNo', $this->polNo, 60);
        Model::validateMaxLength('tradeNo', $this->tradeNo, 32);
        Model::validateMinLength('tradeNo', $this->tradeNo, 32);
    }
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
        if (null !== $this->polNo) {
            $res['pol_no'] = $this->polNo;
        }
        if (null !== $this->preMium) {
            $res['pre_mium'] = $this->preMium;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest
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
        if(isset($map['pol_no'])){
            $model->polNo = $map['pol_no'];
        }
        if(isset($map['pre_mium'])){
            $model->preMium = $map['pre_mium'];
        }
        if(isset($map['trade_no'])){
            $model->tradeNo = $map['trade_no'];
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

    // 保单号，投保成功后返回的
    /**
     * @var string
     */
    public $polNo;

    // 含税保费，精确到小数点后两位
    /**
     * @var string
     */
    public $preMium;

    // 全局唯一交易流水号
    /**
     * @var string
     */
    public $tradeNo;

}
