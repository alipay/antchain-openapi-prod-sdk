<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_b08c548e3a88469c89fe27adc3d0b925\Models;

use AlibabaCloud\Tea\Model;

class QueryBlockchainAppexSolutionFastnotaryRequest extends Model
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

    // 应用did
    //
    /**
     * @var string
     */
    public $appDid;

    // 索引字段的值
    //
    /**
     * @var string
     */
    public $bizIndexKeyValue;

    // 名称
    /**
     * @var string
     */
    public $schemaName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appDid'            => 'app_did',
        'bizIndexKeyValue'  => 'biz_index_key_value',
        'schemaName'        => 'schema_name',
    ];

    public function validate()
    {
        Model::validateRequired('appDid', $this->appDid, true);
        Model::validateRequired('bizIndexKeyValue', $this->bizIndexKeyValue, true);
        Model::validateRequired('schemaName', $this->schemaName, true);
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
        if (null !== $this->bizIndexKeyValue) {
            $res['biz_index_key_value'] = $this->bizIndexKeyValue;
        }
        if (null !== $this->schemaName) {
            $res['schema_name'] = $this->schemaName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBlockchainAppexSolutionFastnotaryRequest
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
        if (isset($map['biz_index_key_value'])) {
            $model->bizIndexKeyValue = $map['biz_index_key_value'];
        }
        if (isset($map['schema_name'])) {
            $model->schemaName = $map['schema_name'];
        }

        return $model;
    }
}
