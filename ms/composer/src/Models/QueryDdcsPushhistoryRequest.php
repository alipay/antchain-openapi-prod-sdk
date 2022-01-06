<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class QueryDdcsPushhistoryRequest extends Model
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

    // 需要查询的 dataId，可不填。
    /**
     * @var string
     */
    public $dataId;

    // 查询的推送记录的介绍时间，值为 1970到现在的毫秒数，用毫秒数为了避免时区问题
    /**
     * @var int
     */
    public $endTime;

    // instance id
    /**
     * @var string
     */
    public $instanceId;

    // 限时返回条数
    /**
     * @var int
     */
    public $size;

    // 从哪个id开始查询，不建议使用
    /**
     * @var int
     */
    public $startId;

    // 查询的开始时间，值为 1970到现在的毫秒数，用毫秒数为了避免时区问题
    /**
     * @var int
     */
    public $startTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dataId'            => 'data_id',
        'endTime'           => 'end_time',
        'instanceId'        => 'instance_id',
        'size'              => 'size',
        'startId'           => 'start_id',
        'startTime'         => 'start_time',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
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
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->size) {
            $res['size'] = $this->size;
        }
        if (null !== $this->startId) {
            $res['start_id'] = $this->startId;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDdcsPushhistoryRequest
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
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['size'])) {
            $model->size = $map['size'];
        }
        if (isset($map['start_id'])) {
            $model->startId = $map['start_id'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }

        return $model;
    }
}
