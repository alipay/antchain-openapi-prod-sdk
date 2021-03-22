<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class BaseRequest extends Model
{
    // 用户的链上账户Id(长度不超过256个字符)
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16...
     *
     * @var string
     */
    public $accountId;

    // 业务幂等Id,防止同一笔交易重复发送(长度不超过256个字符)
    /**
     * @example S20200707123456
     *
     * @var string
     */
    public $bizId;

    // 支持多链多合约,该参数为指明需要操作哪个智能合约环境(长度不超过50个字符)
    /**
     * @example antdao
     *
     * @var string
     */
    public $chainId;

    // 备注信息(不要超过500个字符)。
    // 部分接口要求memo必填，以接口返回信息为准。
    /**
     * @example 备注信息
     *
     * @var string
     */
    public $memo;

    // 场景码(入驻时申请)(长度不超过50个字符)
    /**
     * @example CONSUMECARD
     *
     * @var string
     */
    public $productCode;
    protected $_name = [
        'accountId'   => 'account_id',
        'bizId'       => 'biz_id',
        'chainId'     => 'chain_id',
        'memo'        => 'memo',
        'productCode' => 'product_code',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('productCode', $this->productCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaseRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }

        return $model;
    }
}
