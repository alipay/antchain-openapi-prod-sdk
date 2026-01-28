<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class ProduceFeatureResultObj extends Model
{
    // projectId
    /**
     * @example projectId
     *
     * @var string
     */
    public $projectId;

    // taskId
    /**
     * @example taskId
     *
     * @var string
     */
    public $taskId;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // publishId
    /**
     * @example publishId
     *
     * @var string
     */
    public $publishId;

    // supplementId
    /**
     * @example supplementId
     *
     * @var string
     */
    public $supplementId;

    // fileKey
    /**
     * @example fileKey
     *
     * @var string
     */
    public $fileKey;

    // guid
    /**
     * @example guid
     *
     * @var string
     */
    public $guid;

    // partition
    /**
     * @example partition
     *
     * @var string
     */
    public $partition;
    protected $_name = [
        'projectId'    => 'project_id',
        'taskId'       => 'task_id',
        'status'       => 'status',
        'publishId'    => 'publish_id',
        'supplementId' => 'supplement_id',
        'fileKey'      => 'file_key',
        'guid'         => 'guid',
        'partition'    => 'partition',
    ];

    public function validate()
    {
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->publishId) {
            $res['publish_id'] = $this->publishId;
        }
        if (null !== $this->supplementId) {
            $res['supplement_id'] = $this->supplementId;
        }
        if (null !== $this->fileKey) {
            $res['file_key'] = $this->fileKey;
        }
        if (null !== $this->guid) {
            $res['guid'] = $this->guid;
        }
        if (null !== $this->partition) {
            $res['partition'] = $this->partition;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProduceFeatureResultObj
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['publish_id'])) {
            $model->publishId = $map['publish_id'];
        }
        if (isset($map['supplement_id'])) {
            $model->supplementId = $map['supplement_id'];
        }
        if (isset($map['file_key'])) {
            $model->fileKey = $map['file_key'];
        }
        if (isset($map['guid'])) {
            $model->guid = $map['guid'];
        }
        if (isset($map['partition'])) {
            $model->partition = $map['partition'];
        }

        return $model;
    }
}
