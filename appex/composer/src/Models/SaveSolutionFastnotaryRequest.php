<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class SaveSolutionFastnotaryRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 应用did
    //
    /**
     * @var string
     */
    public $appDid;

    // 表名
    /**
     * @var string
     */
    public $schemaName;

    // 存证数据
    /**
     * @var NameValuePair[]
     */
    public $attributes;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appDid'            => 'app_did',
        'schemaName'        => 'schema_name',
        'attributes'        => 'attributes',
    ];

    public function validate()
    {
        Model::validateRequired('appDid', $this->appDid, true);
        Model::validateRequired('schemaName', $this->schemaName, true);
        Model::validateRequired('attributes', $this->attributes, true);
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
        if (null !== $this->appDid) {
            $res['app_did'] = $this->appDid;
        }
        if (null !== $this->schemaName) {
            $res['schema_name'] = $this->schemaName;
        }
        if (null !== $this->attributes) {
            $res['attributes'] = [];
            if (null !== $this->attributes && \is_array($this->attributes)) {
                $n = 0;
                foreach ($this->attributes as $item) {
                    $res['attributes'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveSolutionFastnotaryRequest
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
        if (isset($map['app_did'])) {
            $model->appDid = $map['app_did'];
        }
        if (isset($map['schema_name'])) {
            $model->schemaName = $map['schema_name'];
        }
        if (isset($map['attributes'])) {
            if (!empty($map['attributes'])) {
                $model->attributes = [];
                $n                 = 0;
                foreach ($map['attributes'] as $item) {
                    $model->attributes[$n++] = null !== $item ? NameValuePair::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
