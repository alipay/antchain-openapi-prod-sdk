<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class RecognizeCctAnalyzeRequest extends Model
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

    // channel
    /**
     * @var string
     */
    public $channel;

    // content_type
    /**
     * @var string
     */
    public $contentType;

    // user_id
    /**
     * @var string
     */
    public $userId;

    // request_id
    /**
     * @var string
     */
    public $requestId;

    // data_map
    /**
     * @var CctDataMap
     */
    public $dataMap;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'channel'           => 'channel',
        'contentType'       => 'content_type',
        'userId'            => 'user_id',
        'requestId'         => 'request_id',
        'dataMap'           => 'data_map',
    ];

    public function validate()
    {
        Model::validateRequired('channel', $this->channel, true);
        Model::validateRequired('contentType', $this->contentType, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('dataMap', $this->dataMap, true);
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
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->contentType) {
            $res['content_type'] = $this->contentType;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->dataMap) {
            $res['data_map'] = null !== $this->dataMap ? $this->dataMap->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RecognizeCctAnalyzeRequest
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
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['content_type'])) {
            $model->contentType = $map['content_type'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['data_map'])) {
            $model->dataMap = CctDataMap::fromMap($map['data_map']);
        }

        return $model;
    }
}
