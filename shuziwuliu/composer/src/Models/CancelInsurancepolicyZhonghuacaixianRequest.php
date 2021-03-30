<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CancelInsurancepolicyZhonghuacaixianRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

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
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'polNo'             => 'pol_no',
        'preMium'           => 'pre_mium',
        'tradeNo'           => 'trade_no',
    ];

    public function validate()
    {
        Model::validateRequired('polNo', $this->polNo, true);
        Model::validateRequired('preMium', $this->preMium, true);
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateMaxLength('polNo', $this->polNo, 60);
        Model::validateMaxLength('tradeNo', $this->tradeNo, 32);
        Model::validateMinLength('tradeNo', $this->tradeNo, 32);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
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
     *
     * @return CancelInsurancepolicyZhonghuacaixianRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['pol_no'])) {
            $model->polNo = $map['pol_no'];
        }
        if (isset($map['pre_mium'])) {
            $model->preMium = $map['pre_mium'];
        }
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }

        return $model;
    }
}
