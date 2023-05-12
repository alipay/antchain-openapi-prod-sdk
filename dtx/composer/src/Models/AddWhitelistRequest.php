<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class AddWhitelistRequest extends Model
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

    // app_name
    /**
     * @var string
     */
    public $appName;

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

    // 数据源名称
    /**
     * @var string
     */
    public $logicalDsName;

    // 业务类型
    /**
     * @var string
     */
    public $businessType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appName'           => 'app_name',
        'instanceId'        => 'instance_id',
        'isElastic'         => 'is_elastic',
        'logicalDsName'     => 'logical_ds_name',
        'businessType'      => 'business_type',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('isElastic', $this->isElastic, true);
        Model::validateRequired('logicalDsName', $this->logicalDsName, true);
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->isElastic) {
            $res['is_elastic'] = $this->isElastic;
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
     * @return AddWhitelistRequest
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['is_elastic'])) {
            $model->isElastic = $map['is_elastic'];
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
