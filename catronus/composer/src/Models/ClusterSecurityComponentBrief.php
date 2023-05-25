<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class ClusterSecurityComponentBrief extends Model
{
    // 风险项数量
    /**
     * @example
     *
     * @var int
     */
    public $cnt;

    // 组件名称
    /**
     * @example prod
     *
     * @var string
     */
    public $component;

    // 描述
    /**
     * @example prod
     *
     * @var string
     */
    public $content;

    // 日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $date;
    protected $_name = [
        'cnt'       => 'cnt',
        'component' => 'component',
        'content'   => 'content',
        'date'      => 'date',
    ];

    public function validate()
    {
        Model::validatePattern('date', $this->date, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cnt) {
            $res['cnt'] = $this->cnt;
        }
        if (null !== $this->component) {
            $res['component'] = $this->component;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ClusterSecurityComponentBrief
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cnt'])) {
            $model->cnt = $map['cnt'];
        }
        if (isset($map['component'])) {
            $model->component = $map['component'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['date'])) {
            $model->date = $map['date'];
        }

        return $model;
    }
}
