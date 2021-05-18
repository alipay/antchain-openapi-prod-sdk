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

    // 数据标识
    /**
     * @var string
     */
    public $businessCode;

    // 资产类型
    /**
     * @var string
     */
    public $assetType;

    // 发行金额_Integer
    /**
     * @var int
     */
    public $amountInt;

    // 发行金额_Long
    /**
     * @var int
     */
    public $amountLong;

    // 账户是否存在
    /**
     * @var bool
     */
    public $exist;

    // 发行时间
    /**
     * @var string
     */
    public $issueTime;

    // 签署方
    /**
     * @var ApiTest
     */
    public $apiTest;

    // 凭证列表_voucherArray
    /**
     * @var int[]
     */
    public $voucherArray;

    // 凭证列表_voucherList
    /**
     * @var string[]
     */
    public $voucherList;

    // 凭证列表_apiTestList
    /**
     * @var ApiTest[]
     */
    public $apiTestList;

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
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'businessCode'      => 'business_code',
        'assetType'         => 'asset_type',
        'amountInt'         => 'amount_int',
        'amountLong'        => 'amount_long',
        'exist'             => 'exist',
        'issueTime'         => 'issue_time',
        'apiTest'           => 'api_test',
        'voucherArray'      => 'voucher_array',
        'voucherList'       => 'voucher_list',
        'apiTestList'       => 'api_test_list',
        'booleanList'       => 'boolean_list',
        'dateList'          => 'date_list',
    ];

    public function validate()
    {
        Model::validateRequired('businessCode', $this->businessCode, true);
        Model::validateRequired('assetType', $this->assetType, true);
        Model::validateRequired('amountInt', $this->amountInt, true);
        Model::validateRequired('amountLong', $this->amountLong, true);
        Model::validateRequired('exist', $this->exist, true);
        Model::validateRequired('issueTime', $this->issueTime, true);
        Model::validateRequired('apiTest', $this->apiTest, true);
        Model::validateRequired('voucherArray', $this->voucherArray, true);
        Model::validateRequired('voucherList', $this->voucherList, true);
        Model::validateRequired('apiTestList', $this->apiTestList, true);
        Model::validateRequired('booleanList', $this->booleanList, true);
        Model::validateRequired('dateList', $this->dateList, true);
        Model::validateMaxLength('businessCode', $this->businessCode, 10);
        Model::validateMaxLength('assetType', $this->assetType, 10);
        Model::validateMinLength('businessCode', $this->businessCode, 0);
        Model::validateMinLength('assetType', $this->assetType, 0);
        Model::validateMaximum('amountInt', $this->amountInt, 10);
        Model::validateMaximum('amountLong', $this->amountLong, 10);
        Model::validateMinimum('amountInt', $this->amountInt, 0);
        Model::validateMinimum('amountLong', $this->amountLong, 0);
        Model::validatePattern('issueTime', $this->issueTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->businessCode) {
            $res['business_code'] = $this->businessCode;
        }
        if (null !== $this->assetType) {
            $res['asset_type'] = $this->assetType;
        }
        if (null !== $this->amountInt) {
            $res['amount_int'] = $this->amountInt;
        }
        if (null !== $this->amountLong) {
            $res['amount_long'] = $this->amountLong;
        }
        if (null !== $this->exist) {
            $res['exist'] = $this->exist;
        }
        if (null !== $this->issueTime) {
            $res['issue_time'] = $this->issueTime;
        }
        if (null !== $this->apiTest) {
            $res['api_test'] = null !== $this->apiTest ? $this->apiTest->toMap() : null;
        }
        if (null !== $this->voucherArray) {
            $res['voucher_array'] = $this->voucherArray;
        }
        if (null !== $this->voucherList) {
            $res['voucher_list'] = $this->voucherList;
        }
        if (null !== $this->apiTestList) {
            $res['api_test_list'] = [];
            if (null !== $this->apiTestList && \is_array($this->apiTestList)) {
                $n = 0;
                foreach ($this->apiTestList as $item) {
                    $res['api_test_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->booleanList) {
            $res['boolean_list'] = $this->booleanList;
        }
        if (null !== $this->dateList) {
            $res['date_list'] = $this->dateList;
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
        if (isset($map['business_code'])) {
            $model->businessCode = $map['business_code'];
        }
        if (isset($map['asset_type'])) {
            $model->assetType = $map['asset_type'];
        }
        if (isset($map['amount_int'])) {
            $model->amountInt = $map['amount_int'];
        }
        if (isset($map['amount_long'])) {
            $model->amountLong = $map['amount_long'];
        }
        if (isset($map['exist'])) {
            $model->exist = $map['exist'];
        }
        if (isset($map['issue_time'])) {
            $model->issueTime = $map['issue_time'];
        }
        if (isset($map['api_test'])) {
            $model->apiTest = ApiTest::fromMap($map['api_test']);
        }
        if (isset($map['voucher_array'])) {
            if (!empty($map['voucher_array'])) {
                $model->voucherArray = $map['voucher_array'];
            }
        }
        if (isset($map['voucher_list'])) {
            if (!empty($map['voucher_list'])) {
                $model->voucherList = $map['voucher_list'];
            }
        }
        if (isset($map['api_test_list'])) {
            if (!empty($map['api_test_list'])) {
                $model->apiTestList = [];
                $n                  = 0;
                foreach ($map['api_test_list'] as $item) {
                    $model->apiTestList[$n++] = null !== $item ? ApiTest::fromMap($item) : $item;
                }
            }
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

        return $model;
    }
}
