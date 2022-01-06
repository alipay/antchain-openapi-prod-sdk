<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class SyncSgServicepublishersRequest extends Model
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

    // 应用名称
    /**
     * @var string
     */
    public $appName;

    // 服务发布数据
    /**
     * @var string
     */
    public $data;

    // 服务唯一ID
    /**
     * @var string
     */
    public $dataId;

    // 分组
    /**
     * @var string
     */
    public $group;

    // 金融云实例ID
    /**
     * @var string
     */
    public $instanceId;

    // 发布者IP
    /**
     * @var string
     */
    public $ip;

    // 进程ID
    /**
     * @var string
     */
    public $processId;

    // 数据产生时间戳
    /**
     * @var int
     */
    public $timestamp;

    // 逻辑机房
    /**
     * @var string
     */
    public $zone;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appName'           => 'app_name',
        'data'              => 'data',
        'dataId'            => 'data_id',
        'group'             => 'group',
        'instanceId'        => 'instance_id',
        'ip'                => 'ip',
        'processId'         => 'process_id',
        'timestamp'         => 'timestamp',
        'zone'              => 'zone',
    ];

    public function validate()
    {
        Model::validateRequired('dataId', $this->dataId, true);
        Model::validateRequired('processId', $this->processId, true);
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
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->group) {
            $res['group'] = $this->group;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->processId) {
            $res['process_id'] = $this->processId;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->zone) {
            $res['zone'] = $this->zone;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncSgServicepublishersRequest
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
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['group'])) {
            $model->group = $map['group'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['process_id'])) {
            $model->processId = $map['process_id'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['zone'])) {
            $model->zone = $map['zone'];
        }

        return $model;
    }
}
