<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryScfleaseEqpinfoRequest extends Model
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

    // 设备识别号
    /**
     * @var string
     */
    public $deviceNo;

    // 运营日期
    /**
     * @var string
     */
    public $operationDate;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceNo'          => 'device_no',
        'operationDate'     => 'operation_date',
    ];

    public function validate()
    {
        Model::validateRequired('deviceNo', $this->deviceNo, true);
        Model::validateRequired('operationDate', $this->operationDate, true);
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
        if (null !== $this->deviceNo) {
            $res['device_no'] = $this->deviceNo;
        }
        if (null !== $this->operationDate) {
            $res['operation_date'] = $this->operationDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryScfleaseEqpinfoRequest
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
        if (isset($map['device_no'])) {
            $model->deviceNo = $map['device_no'];
        }
        if (isset($map['operation_date'])) {
            $model->operationDate = $map['operation_date'];
        }

        return $model;
    }
}
