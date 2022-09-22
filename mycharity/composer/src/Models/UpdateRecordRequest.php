<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYCHARITY\Models;

use AlibabaCloud\Tea\Model;

class UpdateRecordRequest extends Model
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

    // id
    /**
     * @var string
     */
    public $id;

    // 快递单号，50字符（发放方式（issue_way）为快递寄送时可修改）
    /**
     * @var string
     */
    public $expressNumber;

    // 快递公司，50字符（发放方式（issue_way）为快递寄送时可修改）
    /**
     * @var string
     */
    public $expressCompany;

    // 快递地址，100字符（发放方式（issue_way）为快递寄送时可修改）
    /**
     * @var string
     */
    public $expressAddress;

    // 支付流水号，100字符（实施内容为善款类且执行记录状态为待发放（receive_status）必填）
    /**
     * @var string
     */
    public $paySerialNumber;

    // 转账方式，100字符 发放方式为善款类且执行记录状态为待发放（receive_status）必填）
    /**
     * @var string
     */
    public $transferMethod;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'id'                => 'id',
        'expressNumber'     => 'express_number',
        'expressCompany'    => 'express_company',
        'expressAddress'    => 'express_address',
        'paySerialNumber'   => 'pay_serial_number',
        'transferMethod'    => 'transfer_method',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateMaxLength('id', $this->id, 50);
        Model::validateMaxLength('expressNumber', $this->expressNumber, 50);
        Model::validateMaxLength('expressCompany', $this->expressCompany, 50);
        Model::validateMaxLength('expressAddress', $this->expressAddress, 100);
        Model::validateMaxLength('paySerialNumber', $this->paySerialNumber, 100);
        Model::validateMaxLength('transferMethod', $this->transferMethod, 100);
        Model::validateMinLength('id', $this->id, 1);
        Model::validateMinLength('expressNumber', $this->expressNumber, 1);
        Model::validateMinLength('expressCompany', $this->expressCompany, 1);
        Model::validateMinLength('expressAddress', $this->expressAddress, 1);
        Model::validateMinLength('paySerialNumber', $this->paySerialNumber, 1);
        Model::validateMinLength('transferMethod', $this->transferMethod, 1);
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->expressNumber) {
            $res['express_number'] = $this->expressNumber;
        }
        if (null !== $this->expressCompany) {
            $res['express_company'] = $this->expressCompany;
        }
        if (null !== $this->expressAddress) {
            $res['express_address'] = $this->expressAddress;
        }
        if (null !== $this->paySerialNumber) {
            $res['pay_serial_number'] = $this->paySerialNumber;
        }
        if (null !== $this->transferMethod) {
            $res['transfer_method'] = $this->transferMethod;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateRecordRequest
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['express_number'])) {
            $model->expressNumber = $map['express_number'];
        }
        if (isset($map['express_company'])) {
            $model->expressCompany = $map['express_company'];
        }
        if (isset($map['express_address'])) {
            $model->expressAddress = $map['express_address'];
        }
        if (isset($map['pay_serial_number'])) {
            $model->paySerialNumber = $map['pay_serial_number'];
        }
        if (isset($map['transfer_method'])) {
            $model->transferMethod = $map['transfer_method'];
        }

        return $model;
    }
}
