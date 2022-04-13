<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class PushRuleResult extends Model
{
    // site名字
    /**
     * @example my-site
     *
     * @var string
     */
    public $name;

    // site描述
    /**
     * @example test
     *
     * @var string
     */
    public $desc;

    // 推送成功的zone
    /**
     * @example
     *
     * @var string[]
     */
    public $succeedList;

    // 推送失败的zone
    /**
     * @example
     *
     * @var string[]
     */
    public $failedList;
    protected $_name = [
        'name'        => 'name',
        'desc'        => 'desc',
        'succeedList' => 'succeed_list',
        'failedList'  => 'failed_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->succeedList) {
            $res['succeed_list'] = $this->succeedList;
        }
        if (null !== $this->failedList) {
            $res['failed_list'] = $this->failedList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushRuleResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['succeed_list'])) {
            if (!empty($map['succeed_list'])) {
                $model->succeedList = $map['succeed_list'];
            }
        }
        if (isset($map['failed_list'])) {
            if (!empty($map['failed_list'])) {
                $model->failedList = $map['failed_list'];
            }
        }

        return $model;
    }
}
