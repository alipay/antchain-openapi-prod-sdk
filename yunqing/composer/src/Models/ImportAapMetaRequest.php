<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ImportAapMetaRequest extends Model
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

    // yaml的string格式
    /**
     * @var string
     */
    public $metaContext;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'metaContext'       => 'meta_context',
    ];

    public function validate()
    {
        Model::validateRequired('metaContext', $this->metaContext, true);
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
        if (null !== $this->metaContext) {
            $res['meta_context'] = $this->metaContext;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportAapMetaRequest
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
        if (isset($map['meta_context'])) {
            $model->metaContext = $map['meta_context'];
        }

        return $model;
    }
}
