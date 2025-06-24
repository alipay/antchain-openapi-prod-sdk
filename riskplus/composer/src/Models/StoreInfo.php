<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class StoreInfo extends Model
{
    // 门店ID
    /**
     * @example xxxx
     *
     * @var string
     */
    public $storeId;

    // 蚂蚁数科入驻账号
    /**
     * @example xxxx
     *
     * @var string
     */
    public $loginTenant;

    // 收款账号
    /**
     * @example xxxx
     *
     * @var string
     */
    public $payeeBankCard;

    // 收款人
    /**
     * @example xxx
     *
     * @var string
     */
    public $payeeName;

    // 门店名称
    /**
     * @example xxxx
     *
     * @var string
     */
    public $storeName;

    // 销售ID
    /**
     * @example xxxx
     *
     * @var string
     */
    public $salesman;

    // 销售设备编号
    /**
     * @example xxxx
     *
     * @var string
     */
    public $device;
    protected $_name = [
        'storeId'       => 'store_id',
        'loginTenant'   => 'login_tenant',
        'payeeBankCard' => 'payee_bank_card',
        'payeeName'     => 'payee_name',
        'storeName'     => 'store_name',
        'salesman'      => 'salesman',
        'device'        => 'device',
    ];

    public function validate()
    {
        Model::validateRequired('storeId', $this->storeId, true);
        Model::validateRequired('loginTenant', $this->loginTenant, true);
        Model::validateRequired('payeeBankCard', $this->payeeBankCard, true);
        Model::validateRequired('payeeName', $this->payeeName, true);
        Model::validateRequired('storeName', $this->storeName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->storeId) {
            $res['store_id'] = $this->storeId;
        }
        if (null !== $this->loginTenant) {
            $res['login_tenant'] = $this->loginTenant;
        }
        if (null !== $this->payeeBankCard) {
            $res['payee_bank_card'] = $this->payeeBankCard;
        }
        if (null !== $this->payeeName) {
            $res['payee_name'] = $this->payeeName;
        }
        if (null !== $this->storeName) {
            $res['store_name'] = $this->storeName;
        }
        if (null !== $this->salesman) {
            $res['salesman'] = $this->salesman;
        }
        if (null !== $this->device) {
            $res['device'] = $this->device;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StoreInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['store_id'])) {
            $model->storeId = $map['store_id'];
        }
        if (isset($map['login_tenant'])) {
            $model->loginTenant = $map['login_tenant'];
        }
        if (isset($map['payee_bank_card'])) {
            $model->payeeBankCard = $map['payee_bank_card'];
        }
        if (isset($map['payee_name'])) {
            $model->payeeName = $map['payee_name'];
        }
        if (isset($map['store_name'])) {
            $model->storeName = $map['store_name'];
        }
        if (isset($map['salesman'])) {
            $model->salesman = $map['salesman'];
        }
        if (isset($map['device'])) {
            $model->device = $map['device'];
        }

        return $model;
    }
}
