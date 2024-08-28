<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CancelDigitalkeyPreauthpayRequest extends Model
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

    // 商户对本次撤销操作的附言描述
    /**
     * @var string
     */
    public $remark;

    // 商户的授权资金操作流水号
    /**
     * @var string
     */
    public $outRequestNo;

    // 商户的授权资金订单号
    /**
     * @var string
     */
    public $outOrderNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'remark'            => 'remark',
        'outRequestNo'      => 'out_request_no',
        'outOrderNo'        => 'out_order_no',
    ];

    public function validate()
    {
        Model::validateRequired('remark', $this->remark, true);
        Model::validateRequired('outRequestNo', $this->outRequestNo, true);
        Model::validateRequired('outOrderNo', $this->outOrderNo, true);
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
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->outRequestNo) {
            $res['out_request_no'] = $this->outRequestNo;
        }
        if (null !== $this->outOrderNo) {
            $res['out_order_no'] = $this->outOrderNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelDigitalkeyPreauthpayRequest
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
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['out_request_no'])) {
            $model->outRequestNo = $map['out_request_no'];
        }
        if (isset($map['out_order_no'])) {
            $model->outOrderNo = $map['out_order_no'];
        }

        return $model;
    }
}
