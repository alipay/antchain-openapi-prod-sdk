<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CreateStandardVoucherRequest extends Model
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

    // 账户是否存在
    /**
     * @var bool
     */
    public $exist;

    // 签署方
    /**
     * @var VoucherTestTwo
     */
    public $voucherTestOne;

    // 数据标识
    /**
     * @var string
     */
    public $businessCode;

    // 凭证列表_apiTestList
    /**
     * @var VoucherTestTwo[]
     */
    public $voucherTestThree;

    // 发行时间
    /**
     * @var string
     */
    public $issueTime;

    // 凭证列表_voucherList
    /**
     * @var string[]
     */
    public $voucherList;

    // 发行金额_Long
    /**
     * @var int
     */
    public $amountLong;

    // 发行金额_Integer
    /**
     * @var int
     */
    public $amountInt;

    // 签署方
    /**
     * @var VoucherTestTwo
     */
    public $voucherTestTwo;

    // 凭证列表_booleanList
    /**
     * @var bool[]
     */
    public $booleanList;

    // 凭证列表_dateList
    /**
     * @var string[]
     */
    public $dateList;

    // 资产类型
    /**
     * @var string
     */
    public $assetType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'exist'             => 'exist',
        'voucherTestOne'    => 'voucher_test_one',
        'businessCode'      => 'business_code',
        'voucherTestThree'  => 'voucher_test_three',
        'issueTime'         => 'issue_time',
        'voucherList'       => 'voucher_list',
        'amountLong'        => 'amount_long',
        'amountInt'         => 'amount_int',
        'voucherTestTwo'    => 'voucher_test_two',
        'booleanList'       => 'boolean_list',
        'dateList'          => 'date_list',
        'assetType'         => 'asset_type',
    ];

    public function validate()
    {
        Model::validateRequired('exist', $this->exist, true);
        Model::validateRequired('voucherTestOne', $this->voucherTestOne, true);
        Model::validateRequired('businessCode', $this->businessCode, true);
        Model::validateRequired('voucherTestThree', $this->voucherTestThree, true);
        Model::validateRequired('issueTime', $this->issueTime, true);
        Model::validateRequired('voucherList', $this->voucherList, true);
        Model::validateRequired('amountLong', $this->amountLong, true);
        Model::validateRequired('amountInt', $this->amountInt, true);
        Model::validateRequired('voucherTestTwo', $this->voucherTestTwo, true);
        Model::validateRequired('booleanList', $this->booleanList, true);
        Model::validateRequired('dateList', $this->dateList, true);
        Model::validateRequired('assetType', $this->assetType, true);
        Model::validateMaxLength('businessCode', $this->businessCode, 10);
        Model::validateMaxLength('assetType', $this->assetType, 10);
        Model::validateMinLength('businessCode', $this->businessCode, 0);
        Model::validateMinLength('assetType', $this->assetType, 0);
        Model::validatePattern('issueTime', $this->issueTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateMaximum('amountLong', $this->amountLong, 10);
        Model::validateMaximum('amountInt', $this->amountInt, 10);
        Model::validateMinimum('amountLong', $this->amountLong, 0);
        Model::validateMinimum('amountInt', $this->amountInt, 0);
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
        if (null !== $this->exist) {
            $res['exist'] = $this->exist;
        }
        if (null !== $this->voucherTestOne) {
            $res['voucher_test_one'] = null !== $this->voucherTestOne ? $this->voucherTestOne->toMap() : null;
        }
        if (null !== $this->businessCode) {
            $res['business_code'] = $this->businessCode;
        }
        if (null !== $this->voucherTestThree) {
            $res['voucher_test_three'] = [];
            if (null !== $this->voucherTestThree && \is_array($this->voucherTestThree)) {
                $n = 0;
                foreach ($this->voucherTestThree as $item) {
                    $res['voucher_test_three'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->issueTime) {
            $res['issue_time'] = $this->issueTime;
        }
        if (null !== $this->voucherList) {
            $res['voucher_list'] = $this->voucherList;
        }
        if (null !== $this->amountLong) {
            $res['amount_long'] = $this->amountLong;
        }
        if (null !== $this->amountInt) {
            $res['amount_int'] = $this->amountInt;
        }
        if (null !== $this->voucherTestTwo) {
            $res['voucher_test_two'] = null !== $this->voucherTestTwo ? $this->voucherTestTwo->toMap() : null;
        }
        if (null !== $this->booleanList) {
            $res['boolean_list'] = $this->booleanList;
        }
        if (null !== $this->dateList) {
            $res['date_list'] = $this->dateList;
        }
        if (null !== $this->assetType) {
            $res['asset_type'] = $this->assetType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateStandardVoucherRequest
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
        if (isset($map['exist'])) {
            $model->exist = $map['exist'];
        }
        if (isset($map['voucher_test_one'])) {
            $model->voucherTestOne = VoucherTestTwo::fromMap($map['voucher_test_one']);
        }
        if (isset($map['business_code'])) {
            $model->businessCode = $map['business_code'];
        }
        if (isset($map['voucher_test_three'])) {
            if (!empty($map['voucher_test_three'])) {
                $model->voucherTestThree = [];
                $n                       = 0;
                foreach ($map['voucher_test_three'] as $item) {
                    $model->voucherTestThree[$n++] = null !== $item ? VoucherTestTwo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['issue_time'])) {
            $model->issueTime = $map['issue_time'];
        }
        if (isset($map['voucher_list'])) {
            if (!empty($map['voucher_list'])) {
                $model->voucherList = $map['voucher_list'];
            }
        }
        if (isset($map['amount_long'])) {
            $model->amountLong = $map['amount_long'];
        }
        if (isset($map['amount_int'])) {
            $model->amountInt = $map['amount_int'];
        }
        if (isset($map['voucher_test_two'])) {
            $model->voucherTestTwo = VoucherTestTwo::fromMap($map['voucher_test_two']);
        }
        if (isset($map['boolean_list'])) {
            if (!empty($map['boolean_list'])) {
                $model->booleanList = $map['boolean_list'];
            }
        }
        if (isset($map['date_list'])) {
            if (!empty($map['date_list'])) {
                $model->dateList = $map['date_list'];
            }
        }
        if (isset($map['asset_type'])) {
            $model->assetType = $map['asset_type'];
        }

        return $model;
    }
}
