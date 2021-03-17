<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class SignTaskProfile extends Model
{
    // 签署任务列表
    /**
     * @example
     *
     * @var SignTask[]
     */
    public $signTaskList;
    protected $_name = [
        'signTaskList' => 'sign_task_list',
    ];

    public function validate()
    {
        Model::validateRequired('signTaskList', $this->signTaskList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->signTaskList) {
            $res['sign_task_list'] = [];
            if (null !== $this->signTaskList && \is_array($this->signTaskList)) {
                $n = 0;
                foreach ($this->signTaskList as $item) {
                    $res['sign_task_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SignTaskProfile
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sign_task_list'])) {
            if (!empty($map['sign_task_list'])) {
                $model->signTaskList = [];
                $n                   = 0;
                foreach ($map['sign_task_list'] as $item) {
                    $model->signTaskList[$n++] = null !== $item ? SignTask::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
