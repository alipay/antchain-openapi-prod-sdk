<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class ListLibraryTaskRequest extends Model
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

    // 知识库ID
    /**
     * @var int
     */
    public $libraryId;

    // 任务类型列表
    /**
     * @var string[]
     */
    public $taskType;

    // 任务ID
    /**
     * @var int
     */
    public $taskId;

    // 页码
    /**
     * @var string
     */
    public $pageNum;

    // 分页大小
    /**
     * @var string
     */
    public $pageSize;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'libraryId'         => 'library_id',
        'taskType'          => 'task_type',
        'taskId'            => 'task_id',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('libraryId', $this->libraryId, true);
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
        if (null !== $this->libraryId) {
            $res['library_id'] = $this->libraryId;
        }
        if (null !== $this->taskType) {
            $res['task_type'] = $this->taskType;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListLibraryTaskRequest
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
        if (isset($map['library_id'])) {
            $model->libraryId = $map['library_id'];
        }
        if (isset($map['task_type'])) {
            if (!empty($map['task_type'])) {
                $model->taskType = $map['task_type'];
            }
        }
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
