<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class GetMessageRequest extends Model
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

    // 请求ID
    /**
     * @var string
     */
    public $requestId;

    // team_hash_id
    /**
     * @var string
     */
    public $teamHashId;

    // 文档唯一ID
    /**
     * @var string
     */
    public $docId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'requestId'         => 'request_id',
        'teamHashId'        => 'team_hash_id',
        'docId'             => 'doc_id',
    ];

    public function validate()
    {
        Model::validateRequired('docId', $this->docId, true);
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
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->teamHashId) {
            $res['team_hash_id'] = $this->teamHashId;
        }
        if (null !== $this->docId) {
            $res['doc_id'] = $this->docId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetMessageRequest
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
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['team_hash_id'])) {
            $model->teamHashId = $map['team_hash_id'];
        }
        if (isset($map['doc_id'])) {
            $model->docId = $map['doc_id'];
        }

        return $model;
    }
}
