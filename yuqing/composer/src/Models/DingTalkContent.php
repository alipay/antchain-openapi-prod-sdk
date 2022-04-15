<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class DingTalkContent extends Model
{
    // webHook
    /**
     * @example webHook
     *
     * @var string
     */
    public $webHook;

    // 消息类型
    /**
     * @example 消息类型
     *
     * @var string
     */
    public $msgtype;

    // 文字
    /**
     * @example 文字
     *
     * @var Text
     */
    public $text;

    // 链接
    /**
     * @example 链接
     *
     * @var Link
     */
    public $link;

    // markdown
    /**
     * @example markdown
     *
     * @var Markdown
     */
    public $markdown;

    // actionCard
    /**
     * @example actionCard
     *
     * @var ActionCard
     */
    public $actionCard;

    // feedCard
    /**
     * @example feedCard
     *
     * @var FeedCard
     */
    public $feedCard;

    // at
    /**
     * @example at
     *
     * @var At
     */
    public $at;
    protected $_name = [
        'webHook'    => 'web_hook',
        'msgtype'    => 'msgtype',
        'text'       => 'text',
        'link'       => 'link',
        'markdown'   => 'markdown',
        'actionCard' => 'action_card',
        'feedCard'   => 'feed_card',
        'at'         => 'at',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->webHook) {
            $res['web_hook'] = $this->webHook;
        }
        if (null !== $this->msgtype) {
            $res['msgtype'] = $this->msgtype;
        }
        if (null !== $this->text) {
            $res['text'] = null !== $this->text ? $this->text->toMap() : null;
        }
        if (null !== $this->link) {
            $res['link'] = null !== $this->link ? $this->link->toMap() : null;
        }
        if (null !== $this->markdown) {
            $res['markdown'] = null !== $this->markdown ? $this->markdown->toMap() : null;
        }
        if (null !== $this->actionCard) {
            $res['action_card'] = null !== $this->actionCard ? $this->actionCard->toMap() : null;
        }
        if (null !== $this->feedCard) {
            $res['feed_card'] = null !== $this->feedCard ? $this->feedCard->toMap() : null;
        }
        if (null !== $this->at) {
            $res['at'] = null !== $this->at ? $this->at->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DingTalkContent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['web_hook'])) {
            $model->webHook = $map['web_hook'];
        }
        if (isset($map['msgtype'])) {
            $model->msgtype = $map['msgtype'];
        }
        if (isset($map['text'])) {
            $model->text = Text::fromMap($map['text']);
        }
        if (isset($map['link'])) {
            $model->link = Link::fromMap($map['link']);
        }
        if (isset($map['markdown'])) {
            $model->markdown = Markdown::fromMap($map['markdown']);
        }
        if (isset($map['action_card'])) {
            $model->actionCard = ActionCard::fromMap($map['action_card']);
        }
        if (isset($map['feed_card'])) {
            $model->feedCard = FeedCard::fromMap($map['feed_card']);
        }
        if (isset($map['at'])) {
            $model->at = At::fromMap($map['at']);
        }

        return $model;
    }
}
