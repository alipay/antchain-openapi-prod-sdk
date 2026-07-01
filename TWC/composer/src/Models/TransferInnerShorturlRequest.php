<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class TransferInnerShorturlRequest extends Model
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

    // 对接雨燕（basement）短网址服务
    /**
     * @var string
     */
    public $sourceUrl;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sourceUrl'         => 'source_url',
    ];

    public function validate()
    {
        Model::validateRequired('sourceUrl', $this->sourceUrl, true);
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
        if (null !== $this->sourceUrl) {
            $res['source_url'] = $this->sourceUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransferInnerShorturlRequest
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
        if (isset($map['source_url'])) {
            $model->sourceUrl = $map['source_url'];
        }

        return $model;
    }
}
