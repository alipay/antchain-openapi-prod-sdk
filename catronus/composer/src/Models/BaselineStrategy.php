<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class BaselineStrategy extends Model
{
    // 框架列表
    /**
     * @example
     *
     * @var Framework[]
     */
    public $frameworks;

    // cronjob
    /**
     * @example
     *
     * @var Cronjob
     */
    public $cronjob;

    // 额外配置
    /**
     * @example "{}"
     *
     * @var string
     */
    public $extended;
    protected $_name = [
        'frameworks' => 'frameworks',
        'cronjob'    => 'cronjob',
        'extended'   => 'extended',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->frameworks) {
            $res['frameworks'] = [];
            if (null !== $this->frameworks && \is_array($this->frameworks)) {
                $n = 0;
                foreach ($this->frameworks as $item) {
                    $res['frameworks'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->cronjob) {
            $res['cronjob'] = null !== $this->cronjob ? $this->cronjob->toMap() : null;
        }
        if (null !== $this->extended) {
            $res['extended'] = $this->extended;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaselineStrategy
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['frameworks'])) {
            if (!empty($map['frameworks'])) {
                $model->frameworks = [];
                $n                 = 0;
                foreach ($map['frameworks'] as $item) {
                    $model->frameworks[$n++] = null !== $item ? Framework::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['cronjob'])) {
            $model->cronjob = Cronjob::fromMap($map['cronjob']);
        }
        if (isset($map['extended'])) {
            $model->extended = $map['extended'];
        }

        return $model;
    }
}
