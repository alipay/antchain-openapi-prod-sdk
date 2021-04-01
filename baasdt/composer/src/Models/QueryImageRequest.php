<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryImageRequest extends Model
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

    // 要查询的图片数组，填入不可访问的url
    /**
     * @var string[]
     */
    public $urls;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'urls'              => 'urls',
    ];

    public function validate()
    {
        Model::validateRequired('urls', $this->urls, true);
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
        if (null !== $this->urls) {
            $res['urls'] = $this->urls;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryImageRequest
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
        if (isset($map['urls'])) {
            if (!empty($map['urls'])) {
                $model->urls = $map['urls'];
            }
        }

        return $model;
    }
}
