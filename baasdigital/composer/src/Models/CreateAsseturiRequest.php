<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDIGITAL\Models;

use AlibabaCloud\Tea\Model;

class CreateAsseturiRequest extends Model
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

    // 链ID
    /**
     * @var string
     */
    public $bizid;

    // 数字权证asset uri定义
    /**
     * @var AssetUriDefinition
     */
    public $assetUriDefinition;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'bizid'              => 'bizid',
        'assetUriDefinition' => 'asset_uri_definition',
    ];

    public function validate()
    {
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('assetUriDefinition', $this->assetUriDefinition, true);
        Model::validateMinLength('bizid', $this->bizid, 1);
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
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->assetUriDefinition) {
            $res['asset_uri_definition'] = null !== $this->assetUriDefinition ? $this->assetUriDefinition->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAsseturiRequest
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
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['asset_uri_definition'])) {
            $model->assetUriDefinition = AssetUriDefinition::fromMap($map['asset_uri_definition']);
        }

        return $model;
    }
}
