<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_4b3196fa612148cd8407b20f4e5ed132\Models;

use AlibabaCloud\Tea\Model;

class ConfirmBlockchainArecRcpMgRequest extends Model
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

    // 银行编号
    /**
     * @var string
     */
    public $bankNo;

    // 抵押单号
    /**
     * @var string
     */
    public $mgOrderNo;

    // 确认抵押登记结果，Y:继续,N:中止抵押
    /**
     * @var string
     */
    public $result;

    // 银行返回的中止抵押原因code
    /**
     * @var string
     */
    public $failCode;

    // 银行反馈的中止抵押原因描述
    /**
     * @var string
     */
    public $failDesc;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bankNo'            => 'bank_no',
        'mgOrderNo'         => 'mg_order_no',
        'result'            => 'result',
        'failCode'          => 'fail_code',
        'failDesc'          => 'fail_desc',
    ];

    public function validate()
    {
        Model::validateRequired('bankNo', $this->bankNo, true);
        Model::validateRequired('mgOrderNo', $this->mgOrderNo, true);
        Model::validateRequired('result', $this->result, true);
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
        if (null !== $this->bankNo) {
            $res['bank_no'] = $this->bankNo;
        }
        if (null !== $this->mgOrderNo) {
            $res['mg_order_no'] = $this->mgOrderNo;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->failCode) {
            $res['fail_code'] = $this->failCode;
        }
        if (null !== $this->failDesc) {
            $res['fail_desc'] = $this->failDesc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfirmBlockchainArecRcpMgRequest
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
        if (isset($map['bank_no'])) {
            $model->bankNo = $map['bank_no'];
        }
        if (isset($map['mg_order_no'])) {
            $model->mgOrderNo = $map['mg_order_no'];
        }
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }
        if (isset($map['fail_code'])) {
            $model->failCode = $map['fail_code'];
        }
        if (isset($map['fail_desc'])) {
            $model->failDesc = $map['fail_desc'];
        }

        return $model;
    }
}
