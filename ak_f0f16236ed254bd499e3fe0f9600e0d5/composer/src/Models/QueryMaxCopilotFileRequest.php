<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_f0f16236ed254bd499e3fe0f9600e0d5\Models;

use AlibabaCloud\Tea\Model;

class QueryMaxCopilotFileRequest extends Model
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

    // 用户id
    /**
     * @var string
     */
    public $userId;

    // 用户问题
    /**
     * @var string
     */
    public $question;

    // 报告类型
    /**
     * @var string
     */
    public $fileType;

    // 文件id列表
    /**
     * @var string[]
     */
    public $fileIds;

    // 网页地址列表
    /**
     * @var string[]
     */
    public $urls;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userId'            => 'user_id',
        'question'          => 'question',
        'fileType'          => 'file_type',
        'fileIds'           => 'file_ids',
        'urls'              => 'urls',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('question', $this->question, true);
        Model::validateRequired('fileType', $this->fileType, true);
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->question) {
            $res['question'] = $this->question;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->fileIds) {
            $res['file_ids'] = $this->fileIds;
        }
        if (null !== $this->urls) {
            $res['urls'] = $this->urls;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMaxCopilotFileRequest
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
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['question'])) {
            $model->question = $map['question'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['file_ids'])) {
            if (!empty($map['file_ids'])) {
                $model->fileIds = $map['file_ids'];
            }
        }
        if (isset($map['urls'])) {
            if (!empty($map['urls'])) {
                $model->urls = $map['urls'];
            }
        }

        return $model;
    }
}
