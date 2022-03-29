<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ListSofamqRouterRequest extends Model
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

    // 目标单元
    /**
     * @var string
     */
    public $destinationCell;

    // 目标实例 ID
    /**
     * @var string
     */
    public $destinationInstanceId;

    // 目标 Topic
    /**
     * @var string
     */
    public $destinationTopic;

    // 实例 ID
    /**
     * @var string
     */
    public $instanceId;

    // 页码
    /**
     * @var int
     */
    public $pageNum;

    // 每页显示条数
    /**
     * @var int
     */
    public $pageSize;

    // 源单元
    /**
     * @var string
     */
    public $sourceCell;

    // 源实例 ID
    /**
     * @var string
     */
    public $sourceInstanceId;

    // 源 Topic
    /**
     * @var string
     */
    public $sourceTopic;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'destinationCell'       => 'destination_cell',
        'destinationInstanceId' => 'destination_instance_id',
        'destinationTopic'      => 'destination_topic',
        'instanceId'            => 'instance_id',
        'pageNum'               => 'page_num',
        'pageSize'              => 'page_size',
        'sourceCell'            => 'source_cell',
        'sourceInstanceId'      => 'source_instance_id',
        'sourceTopic'           => 'source_topic',
    ];

    public function validate()
    {
        Model::validateRequired('destinationInstanceId', $this->destinationInstanceId, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('pageNum', $this->pageNum, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('sourceInstanceId', $this->sourceInstanceId, true);
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
        if (null !== $this->destinationCell) {
            $res['destination_cell'] = $this->destinationCell;
        }
        if (null !== $this->destinationInstanceId) {
            $res['destination_instance_id'] = $this->destinationInstanceId;
        }
        if (null !== $this->destinationTopic) {
            $res['destination_topic'] = $this->destinationTopic;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->sourceCell) {
            $res['source_cell'] = $this->sourceCell;
        }
        if (null !== $this->sourceInstanceId) {
            $res['source_instance_id'] = $this->sourceInstanceId;
        }
        if (null !== $this->sourceTopic) {
            $res['source_topic'] = $this->sourceTopic;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListSofamqRouterRequest
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
        if (isset($map['destination_cell'])) {
            $model->destinationCell = $map['destination_cell'];
        }
        if (isset($map['destination_instance_id'])) {
            $model->destinationInstanceId = $map['destination_instance_id'];
        }
        if (isset($map['destination_topic'])) {
            $model->destinationTopic = $map['destination_topic'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['source_cell'])) {
            $model->sourceCell = $map['source_cell'];
        }
        if (isset($map['source_instance_id'])) {
            $model->sourceInstanceId = $map['source_instance_id'];
        }
        if (isset($map['source_topic'])) {
            $model->sourceTopic = $map['source_topic'];
        }

        return $model;
    }
}
