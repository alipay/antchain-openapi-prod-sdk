<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class UpdateSofamqAdmingroupRequest extends Model
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

    // 集群名
    /**
     * @var string
     */
    public $cluster;

    // group名
    /**
     * @var string
     */
    public $groupId;

    // 需创建的 Topic 所对应的实例 ID
    /**
     * @var string
     */
    public $instanceId;

    // 设置读消息开关
    /**
     * @var bool
     */
    public $readEnable;

    // 生效范围，三板斧使用
    /**
     * @var string
     */
    public $scope;

    // 重试队列读队列数
    /**
     * @var int
     */
    public $retryReadQueueNum;

    // 重试队列写队列数
    /**
     * @var int
     */
    public $retryWriteQueueNum;

    // 设置该重试队列的读写模式。取值说明：6：同时支持读写；4：禁写；2：禁读。
    /**
     * @var int
     */
    public $retryPerm;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'cluster'            => 'cluster',
        'groupId'            => 'group_id',
        'instanceId'         => 'instance_id',
        'readEnable'         => 'read_enable',
        'scope'              => 'scope',
        'retryReadQueueNum'  => 'retry_read_queue_num',
        'retryWriteQueueNum' => 'retry_write_queue_num',
        'retryPerm'          => 'retry_perm',
    ];

    public function validate()
    {
        Model::validateRequired('cluster', $this->cluster, true);
        Model::validateRequired('groupId', $this->groupId, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('readEnable', $this->readEnable, true);
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
        if (null !== $this->cluster) {
            $res['cluster'] = $this->cluster;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->readEnable) {
            $res['read_enable'] = $this->readEnable;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->retryReadQueueNum) {
            $res['retry_read_queue_num'] = $this->retryReadQueueNum;
        }
        if (null !== $this->retryWriteQueueNum) {
            $res['retry_write_queue_num'] = $this->retryWriteQueueNum;
        }
        if (null !== $this->retryPerm) {
            $res['retry_perm'] = $this->retryPerm;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateSofamqAdmingroupRequest
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
        if (isset($map['cluster'])) {
            $model->cluster = $map['cluster'];
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['read_enable'])) {
            $model->readEnable = $map['read_enable'];
        }
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
        }
        if (isset($map['retry_read_queue_num'])) {
            $model->retryReadQueueNum = $map['retry_read_queue_num'];
        }
        if (isset($map['retry_write_queue_num'])) {
            $model->retryWriteQueueNum = $map['retry_write_queue_num'];
        }
        if (isset($map['retry_perm'])) {
            $model->retryPerm = $map['retry_perm'];
        }

        return $model;
    }
}
