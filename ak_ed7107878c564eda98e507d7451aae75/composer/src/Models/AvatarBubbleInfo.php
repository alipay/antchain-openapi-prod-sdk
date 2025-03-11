<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models;

use AlibabaCloud\Tea\Model;

class AvatarBubbleInfo extends Model
{
    // 气泡标题
    /**
     * @example 点我
     *
     * @var string
     */
    public $title;

    // 气泡类型
    /**
     * @example KNOWLEDGE,LINK,TEL,OUT_BIZ_ID
     *
     * @var string
     */
    public $type;

    // 知识点id
    /**
     * @example 72300001
     *
     * @var string
     */
    public $knowId;

    // 电话号码
    /**
     * @example 13260088903
     *
     * @var string
     */
    public $tel;

    // 外部链接
    /**
     * @example www.123.com
     *
     * @var string
     */
    public $link;
    protected $_name = [
        'title'  => 'title',
        'type'   => 'type',
        'knowId' => 'know_id',
        'tel'    => 'tel',
        'link'   => 'link',
    ];

    public function validate()
    {
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->knowId) {
            $res['know_id'] = $this->knowId;
        }
        if (null !== $this->tel) {
            $res['tel'] = $this->tel;
        }
        if (null !== $this->link) {
            $res['link'] = $this->link;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AvatarBubbleInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['know_id'])) {
            $model->knowId = $map['know_id'];
        }
        if (isset($map['tel'])) {
            $model->tel = $map['tel'];
        }
        if (isset($map['link'])) {
            $model->link = $map['link'];
        }

        return $model;
    }
}
