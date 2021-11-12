<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ProdPreviewTasks extends Model
{
    // 应用是否需要部署
    /**
     * @example [{"appName":"xxx","needDeploy":true}]
     *
     * @var AppPreviewTask[]
     */
    public $appPreviewTasks;
    protected $_name = [
        'appPreviewTasks' => 'app_preview_tasks',
    ];

    public function validate()
    {
        Model::validateRequired('appPreviewTasks', $this->appPreviewTasks, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appPreviewTasks) {
            $res['app_preview_tasks'] = [];
            if (null !== $this->appPreviewTasks && \is_array($this->appPreviewTasks)) {
                $n = 0;
                foreach ($this->appPreviewTasks as $item) {
                    $res['app_preview_tasks'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProdPreviewTasks
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_preview_tasks'])) {
            if (!empty($map['app_preview_tasks'])) {
                $model->appPreviewTasks = [];
                $n                      = 0;
                foreach ($map['app_preview_tasks'] as $item) {
                    $model->appPreviewTasks[$n++] = null !== $item ? AppPreviewTask::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
