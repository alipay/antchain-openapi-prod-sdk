<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class UpdateWhitelistRequest extends Model
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

    // 应用名
    /**
     * @var string
     */
    public $appName;

    // id
    /**
     * @var int
     */
    public $id;

    // instance_id
    /**
     * @var string
     */
    public $instanceId;

    // 0非弹机房，1弹性机房；
    /**
     * @var int
     */
    public $isElastic;

    // 0正常流量，1影子流量；
    /**
     * @var int
     */
    public $isLoadTest;

    // 数据源名称
    /**
     * @var string
     */
    public $logicalDsName;

    // business_type
    /**
     * @var string
     */
    public $businessType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appName'           => 'app_name',
        'id'                => 'id',
        'instanceId'        => 'instance_id',
        'isElastic'         => 'is_elastic',
        'isLoadTest'        => 'is_load_test',
        'logicalDsName'     => 'logical_ds_name',
        'businessType'      => 'business_type',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('isElastic', $this->isElastic, true);
        Model::validateRequired('isLoadTest', $this->isLoadTest, true);
        Model::validateRequired('logicalDsName', $this->logicalDsName, true);
        Model::validateRequired('businessType', $this->businessType, true);
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->isElastic) {
            $res['is_elastic'] = $this->isElastic;
        }
        if (null !== $this->isLoadTest) {
            $res['is_load_test'] = $this->isLoadTest;
        }
        if (null !== $this->logicalDsName) {
            $res['logical_ds_name'] = $this->logicalDsName;
        }
        if (null !== $this->businessType) {
            $res['business_type'] = $this->businessType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateWhitelistRequest
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
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['is_elastic'])) {
            $model->isElastic = $map['is_elastic'];
        }
        if (isset($map['is_load_test'])) {
            $model->isLoadTest = $map['is_load_test'];
        }
        if (isset($map['logical_ds_name'])) {
            $model->logicalDsName = $map['logical_ds_name'];
        }
        if (isset($map['business_type'])) {
            $model->businessType = $map['business_type'];
        }

        return $model;
    }
}
