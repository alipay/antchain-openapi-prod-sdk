<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class InitContentriskInternalRequest extends Model
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

    // 进行识别的音频地址
    /**
     * @var string
     */
    public $audioUrls;

    // 内部字段
    /**
     * @var BizInfo
     */
    public $bizInfo;

    // 待校验连接
    /**
     * @var string
     */
    public $linkUrls;

    // 图片连接
    /**
     * @var string
     */
    public $pictureUrls;

    // 场景码
    /**
     * @var string
     */
    public $sceneCode;

    // 待校验文本
    /**
     * @var string
     */
    public $text;

    // 进行识别的视频地址
    /**
     * @var string
     */
    public $videoUrls;

    // 用户id
    /**
     * @var string
     */
    public $accountId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'audioUrls'         => 'audio_urls',
        'bizInfo'           => 'biz_info',
        'linkUrls'          => 'link_urls',
        'pictureUrls'       => 'picture_urls',
        'sceneCode'         => 'scene_code',
        'text'              => 'text',
        'videoUrls'         => 'video_urls',
        'accountId'         => 'account_id',
    ];

    public function validate()
    {
        Model::validateRequired('bizInfo', $this->bizInfo, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
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
        if (null !== $this->audioUrls) {
            $res['audio_urls'] = $this->audioUrls;
        }
        if (null !== $this->bizInfo) {
            $res['biz_info'] = null !== $this->bizInfo ? $this->bizInfo->toMap() : null;
        }
        if (null !== $this->linkUrls) {
            $res['link_urls'] = $this->linkUrls;
        }
        if (null !== $this->pictureUrls) {
            $res['picture_urls'] = $this->pictureUrls;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->text) {
            $res['text'] = $this->text;
        }
        if (null !== $this->videoUrls) {
            $res['video_urls'] = $this->videoUrls;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitContentriskInternalRequest
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
        if (isset($map['audio_urls'])) {
            $model->audioUrls = $map['audio_urls'];
        }
        if (isset($map['biz_info'])) {
            $model->bizInfo = BizInfo::fromMap($map['biz_info']);
        }
        if (isset($map['link_urls'])) {
            $model->linkUrls = $map['link_urls'];
        }
        if (isset($map['picture_urls'])) {
            $model->pictureUrls = $map['picture_urls'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['text'])) {
            $model->text = $map['text'];
        }
        if (isset($map['video_urls'])) {
            $model->videoUrls = $map['video_urls'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }

        return $model;
    }
}
