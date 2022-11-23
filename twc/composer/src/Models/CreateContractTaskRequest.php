<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateContractTaskRequest extends Model
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

    // 任务类型枚举值
    // 文件解密上传任务，FILE_DECRYPT_ESIGN_UPLOAD
    /**
     * @var string
     */
    public $taskType;

    // 文件内容文件解密上传任务时，为原始文件id
    /**
     * @var string
     */
    public $taskContent;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'taskType'          => 'task_type',
        'taskContent'       => 'task_content',
    ];

    public function validate()
    {
        Model::validateRequired('taskType', $this->taskType, true);
        Model::validateRequired('taskContent', $this->taskContent, true);
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
        if (null !== $this->taskType) {
            $res['task_type'] = $this->taskType;
        }
        if (null !== $this->taskContent) {
            $res['task_content'] = $this->taskContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateContractTaskRequest
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
        if (isset($map['task_type'])) {
            $model->taskType = $map['task_type'];
        }
        if (isset($map['task_content'])) {
            $model->taskContent = $map['task_content'];
        }

        return $model;
    }
}
