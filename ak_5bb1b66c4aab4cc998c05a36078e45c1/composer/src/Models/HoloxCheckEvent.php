<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5bb1b66c4aab4cc998c05a36078e45c1\Models;

use AlibabaCloud\Tea\Model;

class HoloxCheckEvent extends Model
{
    // 是否成功
    /**
     * @example true, false
     *
     * @var bool
     */
    public $sucess;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $id;

    // 12
    /**
     * @example 12
     *
     * @var string
     */
    public $appCode;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $sceneCode;

    // 12
    /**
     * @example 12
     *
     * @var string
     */
    public $productCode;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $channel;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $appSceneDataId;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $accountType;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $userId;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $recieverId;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $publishDate;

    // 123
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isTest;

    // 123
    /**
     * @example 123
     *
     * @var bool
     */
    public $isLoadTest;

    // 123
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isFusing;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $sceneType;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $contentData;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $eventData;
    protected $_name = [
        'sucess'         => 'sucess',
        'id'             => 'id',
        'appCode'        => 'app_code',
        'sceneCode'      => 'scene_code',
        'productCode'    => 'product_code',
        'channel'        => 'channel',
        'appSceneDataId' => 'app_scene_data_id',
        'accountType'    => 'account_type',
        'userId'         => 'user_id',
        'recieverId'     => 'reciever_id',
        'publishDate'    => 'publish_date',
        'isTest'         => 'is_test',
        'isLoadTest'     => 'is_load_test',
        'isFusing'       => 'is_fusing',
        'sceneType'      => 'scene_type',
        'contentData'    => 'content_data',
        'eventData'      => 'event_data',
    ];

    public function validate()
    {
        Model::validateRequired('sucess', $this->sucess, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('appCode', $this->appCode, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('channel', $this->channel, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('recieverId', $this->recieverId, true);
        Model::validateRequired('publishDate', $this->publishDate, true);
        Model::validateRequired('isTest', $this->isTest, true);
        Model::validateRequired('isLoadTest', $this->isLoadTest, true);
        Model::validateRequired('isFusing', $this->isFusing, true);
        Model::validateRequired('sceneType', $this->sceneType, true);
        Model::validateRequired('contentData', $this->contentData, true);
        Model::validateRequired('eventData', $this->eventData, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sucess) {
            $res['sucess'] = $this->sucess;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->appCode) {
            $res['app_code'] = $this->appCode;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->appSceneDataId) {
            $res['app_scene_data_id'] = $this->appSceneDataId;
        }
        if (null !== $this->accountType) {
            $res['account_type'] = $this->accountType;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->recieverId) {
            $res['reciever_id'] = $this->recieverId;
        }
        if (null !== $this->publishDate) {
            $res['publish_date'] = $this->publishDate;
        }
        if (null !== $this->isTest) {
            $res['is_test'] = $this->isTest;
        }
        if (null !== $this->isLoadTest) {
            $res['is_load_test'] = $this->isLoadTest;
        }
        if (null !== $this->isFusing) {
            $res['is_fusing'] = $this->isFusing;
        }
        if (null !== $this->sceneType) {
            $res['scene_type'] = $this->sceneType;
        }
        if (null !== $this->contentData) {
            $res['content_data'] = $this->contentData;
        }
        if (null !== $this->eventData) {
            $res['event_data'] = $this->eventData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HoloxCheckEvent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sucess'])) {
            $model->sucess = $map['sucess'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['app_code'])) {
            $model->appCode = $map['app_code'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['app_scene_data_id'])) {
            $model->appSceneDataId = $map['app_scene_data_id'];
        }
        if (isset($map['account_type'])) {
            $model->accountType = $map['account_type'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['reciever_id'])) {
            $model->recieverId = $map['reciever_id'];
        }
        if (isset($map['publish_date'])) {
            $model->publishDate = $map['publish_date'];
        }
        if (isset($map['is_test'])) {
            $model->isTest = $map['is_test'];
        }
        if (isset($map['is_load_test'])) {
            $model->isLoadTest = $map['is_load_test'];
        }
        if (isset($map['is_fusing'])) {
            $model->isFusing = $map['is_fusing'];
        }
        if (isset($map['scene_type'])) {
            $model->sceneType = $map['scene_type'];
        }
        if (isset($map['content_data'])) {
            $model->contentData = $map['content_data'];
        }
        if (isset($map['event_data'])) {
            $model->eventData = $map['event_data'];
        }

        return $model;
    }
}
