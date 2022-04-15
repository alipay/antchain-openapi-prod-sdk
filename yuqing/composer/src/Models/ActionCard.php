<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class ActionCard extends Model
{
    // 标题
    /**
     * @example 标题
     *
     * @var string
     */
    public $title;

    // 内容
    /**
     * @example 内容
     *
     * @var string
     */
    public $text;

    // btn_orientation
    /**
     * @example btn_orientation
     *
     * @var string
     */
    public $btnOrientation;

    // 简单标题
    /**
     * @example 简单标题
     *
     * @var string
     */
    public $singleTitle;

    // 简单地址
    /**
     * @example 简单地址
     *
     * @var string
     */
    public $singleUrl;

    // 点击
    /**
     * @example 点击
     *
     * @var Btn[]
     */
    public $btns;
    protected $_name = [
        'title'          => 'title',
        'text'           => 'text',
        'btnOrientation' => 'btn_orientation',
        'singleTitle'    => 'single_title',
        'singleUrl'      => 'single_url',
        'btns'           => 'btns',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->text) {
            $res['text'] = $this->text;
        }
        if (null !== $this->btnOrientation) {
            $res['btn_orientation'] = $this->btnOrientation;
        }
        if (null !== $this->singleTitle) {
            $res['single_title'] = $this->singleTitle;
        }
        if (null !== $this->singleUrl) {
            $res['single_url'] = $this->singleUrl;
        }
        if (null !== $this->btns) {
            $res['btns'] = [];
            if (null !== $this->btns && \is_array($this->btns)) {
                $n = 0;
                foreach ($this->btns as $item) {
                    $res['btns'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ActionCard
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['text'])) {
            $model->text = $map['text'];
        }
        if (isset($map['btn_orientation'])) {
            $model->btnOrientation = $map['btn_orientation'];
        }
        if (isset($map['single_title'])) {
            $model->singleTitle = $map['single_title'];
        }
        if (isset($map['single_url'])) {
            $model->singleUrl = $map['single_url'];
        }
        if (isset($map['btns'])) {
            if (!empty($map['btns'])) {
                $model->btns = [];
                $n           = 0;
                foreach ($map['btns'] as $item) {
                    $model->btns[$n++] = null !== $item ? Btn::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
