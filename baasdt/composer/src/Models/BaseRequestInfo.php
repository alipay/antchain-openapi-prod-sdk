<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class BaseRequestInfo extends Model
{
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

    // 场景码(入驻时申请)(长度不超过50个字符)
    /**
     * @example IPTRADE
     *
     * @var string
     */
    public $productCode;
    protected $_name = [
        'bizId'       => 'biz_id',
        'chainId'     => 'chain_id',
        'productCode' => 'product_code',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('productCode', $this->productCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaseRequestInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }

        return $model;
    }
}
