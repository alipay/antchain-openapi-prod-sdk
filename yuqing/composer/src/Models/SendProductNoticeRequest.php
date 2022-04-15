<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class SendProductNoticeRequest extends Model
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

    // 提醒类型
    /**
     * @var string
     */
    public $noticeType;

    // 钉钉结构体
    /**
     * @var DingTalkContent
     */
    public $dingTalkContent;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'noticeType'        => 'notice_type',
        'dingTalkContent'   => 'ding_talk_content',
    ];

    public function validate()
    {
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
        if (null !== $this->noticeType) {
            $res['notice_type'] = $this->noticeType;
        }
        if (null !== $this->dingTalkContent) {
            $res['ding_talk_content'] = null !== $this->dingTalkContent ? $this->dingTalkContent->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendProductNoticeRequest
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
        if (isset($map['notice_type'])) {
            $model->noticeType = $map['notice_type'];
        }
        if (isset($map['ding_talk_content'])) {
            $model->dingTalkContent = DingTalkContent::fromMap($map['ding_talk_content']);
        }

        return $model;
    }
}
